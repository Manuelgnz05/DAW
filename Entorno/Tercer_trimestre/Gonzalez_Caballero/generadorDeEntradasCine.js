/*
Crea un programa en JavaScript que simule la compra de ENTRADAS DE CINE y genere
un ticket final en texto, usando solo lo visto hasta ahora.

El programa debe definir al principio como variables los datos del cliente y la compra,
validar la información con condicionales y calcular el precio final aplicando IVA,
descuentos y recargos según reglas.

Validaciones obligatorias (con if/else) (1 punto)

- nombreCliente (string)
- edad (number)
- pelicula (string)
- precioBaseEntrada (number) → precio por entrada sin impuestos
- cantidad (number) → nº de entradas (entero, sin arrays)
- diaSemana (string: "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO")
- tipoSala (string: "2D" o "3D")
- tienePromo (string: "SI" o "NO")
- codigoPromo (string) → puede ser "" si no hay promo
- metodoPago (string: "TARJETA" o "EFECTIVO")
*/

let nombreCliente = "manuel"
let edad = 21
let pelicula = "Star Wars: El despertar de la fuerza"
let precioBaseEntrada = 6.5
let cantidad = 1
let diaSemana = "martes"
let tipoSala = "2D"
let tienePromo = "si"
let codigoPromo = "joven"
let metodoPago = "efectivo"

//Ponemos los strings necesarios en mayusculas para que las validaciones sean mas faciles de realizar

diaSemana = diaSemana.toUpperCase()
tipoSala = tipoSala.toUpperCase()
tienePromo = tienePromo.toUpperCase()
codigoPromo = codigoPromo.toUpperCase()
metodoPago = metodoPago.toUpperCase()

// Creamos la variable esValido para en caso de que alguna variable no pase el filtro no realizar el recibo.
// En cuanto a las validaciones vamos a validar que sea del tipo que deseamos y que se cumplan la condiciones logicas.

let esValido = true

if (typeof nombreCliente !== "string" || nombreCliente.length === 0){
    esValido = false
    console.log("El nombre tiene que ser una cadena y no puede estar vacio.")
}

if (typeof edad !== "number" || edad <= 0 || edad%1 != 0){
    esValido = false
    console.log("La edad tiene que ser un numero entero positivo.")
}

if (typeof pelicula !== "string" || pelicula.length === 0){
    esValido = false
    console.log("El nombre de la pelicula tiene que ser una cadena y no puede estar vacio.")
}

if (typeof precioBaseEntrada !== "number" || precioBaseEntrada <= 0){
    esValido = false
    console.log("El precio de la entrada tiene que ser un numero positivo.")
}

if (typeof cantidad !== "number" || cantidad <= 0 || cantidad % 1 != 0){
    esValido = false
    console.log("La cantidad de entradas tiene que ser un numero entero positivo.")
}

if (typeof diaSemana !== "string" || (diaSemana !== "LUNES" && diaSemana !== "MARTES" && diaSemana !== "MIERCOLES" && diaSemana !== "JUEVES" && diaSemana !== "VIERNES" && diaSemana !== "SABADO" && diaSemana !== "DOMINGO")){
    esValido = false
    console.log("El dia de la semana no puede estar vacio, y solo puede tomar los valores lunes, martes, miercoles, jueves, viernes, sabado o domingo")
}

if (typeof tipoSala !== "string" || (tipoSala !== "2D" && tipoSala !== "3D")){
    esValido = false
    console.log("El tipo de sala no puede estar vacio y solo puede tomar los valores 2D o 3D.")
}

if (typeof tienePromo !== "string" || (tienePromo !== "SI" && tienePromo !== "NO")){
    esValido = false
    console.log("El valor de tiene cupon no puede estar vacio y solo puede tener los valores SI o NO.")
}

if (typeof codigoPromo !== "string" || (tienePromo === "SI" && codigoPromo.length === 0)){
    esValido = false
    console.log("El codigo de la promocion tiene que ser una cadena y tiene que estar relleno si el usuario marca que tiene una promo.")
}

if (typeof metodoPago !== "string" || (metodoPago !== "TARJETA" && metodoPago !== "EFECTIVO")){
    esValido = false
    console.log("El metodo de pago no puede estar vacio, tiene que ser una cadena y solo puede tomar los valores TARJETA o EFECTIVO.")
}

/*
Reglas de cálculo

1. subtotal = precioBaseEntrada * cantidad
2. Descuento por día:
- Si diaSemana es "MARTES" → descuentoDia = 20% del subtotal
- Si no → descuentoDia = 0
3. Promo (solo si tienePromo es "SI"):
- Código "CINE5" → 5 € de descuento fijo, pero solo si subtotal >= 25
- Código "JOVEN" → 10% del subtotal, pero solo si edad <= 25
- Cualquier otro código → no descuento y mostrar aviso
4. Recargo por sala:
- "2D" → 0 €
- "3D" → 2 € por entrada
5. Base imponible = subtotal - descuentoDia - descuentoPromo + recargoSala
6. IVA:
- Si edad < 18 → IVA = 0%
- Si no → IVA = 10%
7. Recargo por pago:
- "TARJETA" → 1.5% sobre (baseImponible + IVA)
- "EFECTIVO" → 0 €
8. total = baseImponible + iva + recargoPago

Salida: Imprime un “ticket” bien formateado usando concatenación:(0.5 puntos)
*/

//Solo realizamos el recibo si todas las validaciones se han completado.

if (esValido){
    let subtotal = precioBaseEntrada * cantidad

    let descuentoDia = 0
    if (diaSemana === "MARTES"){
        descuentoDia = subtotal * 0.20
    }

    let descuentoPromo = 0
    if (tienePromo === "SI"){
        if (codigoPromo === "CINE5"){
            if (subtotal >= 25){
                descuentoPromo = 5
            }else{
                console.log("El código no es aplicable debido a que es menor de 25 años.")
            }
            
        }else if (codigoPromo === "JOVEN"){
            if (edad <= 25){
                descuentoPromo = subtotal * 0.1
            }else{
                console.log("El código no es aplicable debido a que es mayor o igual a 25 años.")
            }

        }else{
            console.log("Código invalido")
        }
    }

    let recargoSala = 0
    if (tipoSala === "3D"){
        recargoSala = 2
    }

    let baseImponible = subtotal - descuentoDia - descuentoPromo + recargoSala

    let iva = 0
    let ivaPorcentaje = 0
    if (edad >= 18){
        iva = baseImponible * 0.1
        ivaPorcentaje = 10
    }

    let recargoPago = 0
    if (metodoPago === "TARJETA"){
        recargoPago = (baseImponible + iva) * 0.015
    }

    let total = baseImponible + iva + recargoPago

    /*
    Cliente, película, cantidad (0.5 puntos)
    Subtotal (0.5 puntos)
    Descuento por día (1 punto)
    Descuento promo (y motivo) (1 punto)
    Recargo por sala (1 punto)
    Base imponible (0.5 punto)
    IVA aplicado (% y €) (1 puntos)
    Recargo por pago (1 punto)
    TOTAL (0.5 puntos)
    */

    /*
    Extra de strings (obligatorio)

    - Muestra el nombre del cliente con la primera letra en mayúscula. (0.5 puntos)
    - Si la película contiene la palabra "saga" (ignorando mayúsculas/minúsculas),
    muestra un mensaje especial. (1 punto)
    */

    nombreCliente = nombreCliente[0].toUpperCase() + nombreCliente.slice(1)


    console.log("Cliente: " + nombreCliente + " /Película: " + pelicula + " /Cantidad de entradas: " + cantidad 
        + "\nSubtotal: " + subtotal.toFixed(2)
        + "\nDescuento por dia: " + descuentoDia.toFixed(2)
        + "\nDescuento por promo: " + descuentoPromo.toFixed(2) + " motivo del descuento: " + codigoPromo
        + "\nRecargo por sala: " + recargoSala.toFixed(2)
        + "\nBase imponible: " + baseImponible.toFixed(2)
        + "\nIVA aplicado: " + iva.toFixed(2) + "€ " + ivaPorcentaje + "%"
        + "\nRecargo por pago: " + recargoPago.toFixed(2)
        + "\nTotal a pagar: " + total.toFixed(2))

        if (pelicula.toUpperCase().includes("SAGA")){
            console.log("--- Esta pelicula pertenece a una saga ---")
        }

}


