import sys
import mysql.connector
from mysql.connector import Error

# Forzar a la terminal a usar UTF-8 para evitar errores con tildes y símbolos raros
sys.stdout.reconfigure(encoding='utf-8')

def consultar_tabla_dinamica(nombre_tabla):
    try:
        # Configurar la conexión (¡Acuérdate de tu contraseña!)
        conexion = mysql.connector.connect(
            host='localhost',
            port=3306,
            database='northwind',
            user='root',
            password='root',
            charset='utf8mb4' # Asegura que MySQL nos mande caracteres universales
        )

        if conexion.is_connected():
            print("¡Conexión exitosa!")
            print(f"--- Mostrando datos de la tabla: {nombre_tabla} ---")

            cursor = conexion.cursor()
            
            query = f"SELECT * FROM {nombre_tabla}"
            cursor.execute(query)
            
            registros = cursor.fetchall()
            nombres_columnas = [desc[0] for desc in cursor.description]
            
            print(" | ".join(nombres_columnas))
            print("-" * 80)
            
            for fila in registros:
                # Convertimos cada valor a texto
                valores_texto = [str(valor) for valor in fila]
                print(" | ".join(valores_texto))

    except Error as e:
        print("Hubo un error al ejecutar la consulta dinámica:")
        print(e)
        
    finally:
        if 'conexion' in locals() and conexion.is_connected():
            cursor.close()
            conexion.close()
            print("\n--- Conexión cerrada ---")

if __name__ == '__main__':
    tabla_a_consultar = 'orders' 
    consultar_tabla_dinamica(tabla_a_consultar)