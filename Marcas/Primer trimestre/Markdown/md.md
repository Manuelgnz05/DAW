Ojo: para ver el markdown hay que instalar el package control de Markdown Preview. Y luego para visualizarlo 
Abre tu archivo .md en Sublime Text.

Vuelve a presionar Ctrl + Shift + P (o Cmd + Shift + P).

Escribe Markdown Preview y selecciona la opción:

Markdown Preview: Export and Show in Browser


# ✍️ SINTAXIS BÁSICA DE MARKDOWN

---

## 1. Encabezados (Títulos)

Se utilizan hasta seis niveles de títulos. El número de almohadillas (`#`) indica el nivel.

# Título de Nivel 1 (H1)
## Título de Nivel 2 (H2)
### Título de Nivel 3 (H3)
#### Título de Nivel 4 (H4)

---

## 2. Énfasis en el Texto

Se utiliza el asterisco (`*`) o el guion bajo (`_`) para aplicar formato.

* **Negrita:** Usar dos símbolos.
    `**Texto en Negrita**` o `__Texto en Negrita__`
    **Resultado:** **Texto en Negrita**

* *Itálica:* Usar un solo símbolo.
    `*Texto en Itálica*` o `_Texto en Itálica_`
    **Resultado:** *Texto en Itálica*

* ***Combinado:*** Usar tres símbolos.
    `***Negrita e Itálica***`
    **Resultado:** ***Negrita e Itálica***

* ~~Tachado:~~ Usar dos tildes (`~`).
    `~~Texto Tachado~~`
    **Resultado:** ~~Texto Tachado~~

---

## 3. Listas

### 3.1 Listas Desordenadas

Se utiliza el asterisco (`*`), el guion (`-`) o el signo de suma (`+`).

* Elemento uno
- Elemento dos
+ Elemento tres

### 3.2 Listas Ordenadas

Se utiliza un número seguido de un punto. No importa el número que uses, Markdown las numerará automáticamente.

1. Primer paso
1. Segundo paso (el número aquí no importa)
3. Tercer paso

### 3.3 Anidación de Listas

Para anidar, simplemente inserta **cuatro espacios** antes del símbolo de la lista.

* Tarea principal
    * Subtarea A
    * Subtarea B
* Tarea secundaria

---

## 4. Enlaces (Links) e Imágenes

### 4.1 Enlaces

La sintaxis es `[Texto Visible](URL)`.

`[Visita Google](https://www.google.com)`
**Resultado:** [Visita Google](https://www.google.com)

### 4.2 Imágenes

La sintaxis es similar a los enlaces, pero se añade un signo de exclamación `!` al principio: `![Texto Alternativo](URL de la imagen)`.

`![Logo de Markdown](https://upload.wikimedia.org/wikipedia/commons/4/48/Markdown-mark.svg)`
**Resultado:** ![Logo de Markdown](https://upload.wikimedia.org/wikipedia/commons/4/48/Markdown-mark.svg)

---

## 5. Bloques de Código

### 5.1 Código en Línea (Inline)

Se utiliza un acento grave simple (`` ` ``) para destacar código o comandos dentro de una línea de texto.

`El comando para instalar la librería es \`npm install\`.`
**Resultado:** El comando para instalar la librería es `npm install`.

### 5.2 Bloques de Código

Se utilizan tres acentos graves (`` ``` ``) al inicio y al final. Es muy recomendable especificar el lenguaje después de los tres primeros acentos para el *Syntax Highlighting* (resaltado de sintaxis).

\`\`\`python
def saludar(nombre):
    print(f"Hola, {nombre}")
\`\`\`

**Resultado (Renderizado):**
```python
def saludar(nombre):
    print(f"Hola, {nombre}")
```

## 6. Tablas
Utiliza el carácter de barra vertical (|) para separar las columnas y los guiones (-) para definir la línea de encabezado y separar las filas de la tabla. Por ejemplo

 | Encabezado 1 | Encabezado 2 | Encabezado 3 |
| ------------ | ------------ | ------------ |
| Dato 1      | Dato 2      | Dato 3      |
| Dato 4      | Dato 5      | Dato 6      |

Alineación de las columnas:
Puedes alinear el texto en las columnas utilizando dos puntos (:) antes o después del guion de separación. 
:--- alinea a la izquierda, ---: alinea a la derecha y :---: alinea al centro. Por ejemplo:


| Alineado a la izquierda | Alineado al centro | Alineado a la derecha |
| :--------------------- | :----------------: | -------------------: |
| Dato 1                 |      Dato 2        |             Dato 3   |
| Dato 4                 |      Dato 5        |             Dato 6   |


