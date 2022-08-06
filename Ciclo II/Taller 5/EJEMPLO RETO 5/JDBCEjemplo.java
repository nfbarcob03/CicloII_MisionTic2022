package jdbcejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEjemplo {

    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/tiendaJuguetes";
        String username = "root";
        String password = "administrator"; // conectar
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conectado");
                //consulta

                String consultar = "select * from juguete";
                
                //ejecutar una sentencia en SQL
                Statement sentenciaSQL = conn.createStatement();
                
                ResultSet resultado = sentenciaSQL.executeQuery(consultar);

                while (resultado.next()) {
                    String nombreJuguete = resultado.getString(2);
                    String precioJuguete = resultado.getString(3);

                    System.out.println("Nombre juguete: "
                            + nombreJuguete + "Precio Juguete: " + precioJuguete);

                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }

}
