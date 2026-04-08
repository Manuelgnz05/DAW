-- 1- Sobre la base northwind cree un procedimiento que muestre la suma de los primeros n números enteros, siendo n
-- un parámetro de entrada.

DELIMITER $$;
DROP PROCEDURE IF EXISTS suma_n $$;
CREATE PROCEDURE suma_n(IN num INT, OUT res INT)
BEGIN
    DECLARE contador INT DEFAULT 0;
    SET res = 0;
    mi_loop: LOOP
		SET contador = contador + 1;
		SET res = res + contador;
        select res;
        IF contador >= num THEN
            LEAVE mi_loop; 
        END IF;
    END LOOP mi_loop;
END $$;
DELIMITER ;

set @num1 = 3;
set @num2 = 0;
CALL suma_n(@num1, @num2);

-- 2- Haga un procedimiento que muestre la suma de los términos 1/n con n entre 1 y m. es decir 1/2+1/3+ ... 1/m
-- siendo m el parámetro de entrada. Tenga en cuenta que m no puede ser cero.

DELIMITER $$;
DROP PROCEDURE IF EXISTS suma_1_n $$;
CREATE PROCEDURE suma_1_n(IN num INT, OUT res float)
BEGIN
    DECLARE contador INT DEFAULT 1;
    SET res = 0;
    mi_loop: LOOP
		SET res = res + 1/contador;
        SET contador = contador + 1;
        select res;
        IF contador > num THEN
            LEAVE mi_loop; 
        END IF;
    END LOOP mi_loop;
END $$;
DELIMITER ;

call suma_1_n(@num1, @num2); 

-- 3- Cree una función que determine si un número es primo devolviendo 0 ó 1.

DELIMITER $$;
DROP FUNCTION IF EXISTS es_primo$$;
CREATE FUNCTION es_primo(num int)
	RETURNS INT
DETERMINISTIC
BEGIN
	DECLARE contador INT DEFAULT num;
    DECLARE res int default 0;
    mi_loop: LOOP
		if num%contador = 0 then
			set res = res + 1;
		end if;
        SET contador = contador - 1;
        IF contador = 0 THEN
			if res > 2 then
				return 0;
			else 
				return 1;
			END IF;
			LEAVE mi_loop; 
        END IF; 
    END LOOP mi_loop;
END$$;
DELIMITER ;

set @num = 4;
select es_primo(@num);

-- 4- Usando la función anterior cree otra que calcule la suma de los primeros m números primos empezando en el 1.

DELIMITER $$;
DROP FUNCTION IF EXISTS suma_m_primos$$;
CREATE FUNCTION suma_m_primos(num int)
	RETURNS INT
DETERMINISTIC
BEGIN
	DECLARE contador INT DEFAULT 1;
    DECLARE primos int default 0;
    DECLARE res int default 0;
	mi_loop: LOOP
    if es_primo(contador) = 1 then
		set res = res + contador;
        set primos = primos + 1;
	end if;
	set contador = contador + 1;
    if primos = num then
		return res;
		LEAVE mi_loop; 
	end if;
    END LOOP mi_loop;
END$$;
DELIMITER ;

set @numer = 4;
select suma_m_primos(@numer);