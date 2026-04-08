import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData; // <-- ¡Nueva importación crucial!
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // 1. Configuración de conexión
        String url = "jdbc:mysql://localhost:3306/northwind";
        String usuario = "root";
        String password = "root";

        // 2. Define qué tabla quieres leer (puedes cambiar "customers" por "orders", "employees", etc.)
        String nombreTabla = "employees";
        String query = "SELECT * FROM " + nombreTabla;

        try (Connection conexion = DriverManager.getConnection(url, usuario, password);
             Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            System.out.println("¡Conexión exitosa!");
            System.out.println("--- Mostrando datos de la tabla: " + nombreTabla + " ---");

            // 3. Obtener los "metadatos" (la estructura de la tabla)
            ResultSetMetaData metaData = resultSet.getMetaData();
            int cantidadColumnas = metaData.getColumnCount();

            // 4. Imprimir los nombres de las columnas (como un encabezado)
            for (int i = 1; i <= cantidadColumnas; i++) {
                System.out.print(metaData.getColumnName(i) + " | ");
            }
            System.out.println("\n-------------------------------------------------------------");

            // 5. Iterar sobre las filas y extraer cada columna dinámicamente
            while (resultSet.next()) {
                for (int i = 1; i <= cantidadColumnas; i++) {
                    // getString(i) lee cualquier tipo de dato (texto, número, fecha) y lo convierte a texto para imprimirlo
                    System.out.print(resultSet.getString(i) + " | ");
                }
                System.out.println(); // Salto de línea al terminar la fila para pasar al siguiente registro
            }

        } catch (Exception e) {
            System.out.println("Hubo un error al ejecutar la consulta dinámica:");
            e.printStackTrace();
        }
    }
}