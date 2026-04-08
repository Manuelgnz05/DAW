DELIMITER $$; 
DROP PROCEDURE IF EXISTS rutina_incremento_precios $$; 
CREATE PROCEDURE rutina_incremento_precios (IN porcentaje INT, IN categoria INT, OUT prod_modif INT, OUT mensaje varchar(20)) 
	BEGIN 
    DECLARE cat_max INT DEFAULT 0;
    DECLARE esta bool DEFAULT false;
    DECLARE contador INT DEFAULT 0;
    SELECT max(CategoryID) INTO cat_max FROM categories;
    mi_loop: LOOP
        SET contador = contador + 1;
        IF contador > cat_max THEN
			set mensaje = "Categoria no válida";
            set prod_modif = 0;
            LEAVE mi_loop; 
		ELSEIF categoria = contador THEN
			set esta = true;
            LEAVE mi_loop;
        END IF;
    END LOOP mi_loop;
    
    IF esta = true THEN
		update products set UnitPrice = UnitPrice + UnitPrice*(porcentaje/100) where products.CategoryID = categoria;
        select count(*) into prod_modif from products where products.CategoryID = categoria;
    end if;
END $$; 
DELIMITER ;

set @porcentaje = 10;
set @categoria = 4;
set @prod_modif = 10;
set @mensaje = " ";
call rutina_incremento_precios(@porcentaje, @categoria, @prod_modif, @mensaje);
select @prod_modif;
select @mensaje;