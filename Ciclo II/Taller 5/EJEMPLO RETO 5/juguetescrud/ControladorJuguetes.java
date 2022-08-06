package juguetescrud;

import java.util.ArrayList;
import java.sql.*;
import java.util.Arrays;

public class ControladorJuguetes {

    public static ArrayList<Juguete> juguetes = new ArrayList<>();
    public static ConexionBD conexion = new ConexionBD();
    public static Connection acceso = conexion.crearConexion();

    public static ArrayList<Juguete> consultarJuguetes() {
        Juguete jug;
        juguetes.clear();
        try {
            //2. crear el objeto statement
            Statement sentencia = acceso.createStatement();
            //3. ejecutar la sentencia
            ResultSet datos = sentencia.executeQuery("select * from juguete");
            // 4. recorrer los datos de la tabla virtual
            while (datos.next()) {
                jug = new Juguete(Integer.parseInt(datos.getString(1)), datos.getString(2), Integer.parseInt(datos.getString(3)));
                juguetes.add(jug);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return juguetes;
    }

    public static void crearJuguete(Juguete juguete) {
        juguetes.add(juguete);

        try {
            String sql = "INSERT INTO juguete (id_juguete,nombre_juguete, precio_juguete) VALUES (?,?,?)";
            PreparedStatement statement = acceso.prepareStatement(sql);
            statement.setString(1, Integer.toString(juguete.codigo));
            statement.setString(2, juguete.nombre);
            statement.setString(3, Integer.toString(juguete.precio));

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Registro exitoso");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void eliminarJuguete(Juguete jug) {
        try {
            String sql = "DELETE FROM estudiante WHERE id=?";
            PreparedStatement statement = acceso.prepareStatement(sql);
            statement.setInt(1, jug.codigo);
            statement.executeUpdate();
            System.out.println("Registro eliminado");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public static void actualizarJuguete(Juguete jug) {
        try {
            String sql = "UPDATE juguet SET nombre_juguete=?, precio_juguete=? WHERE id_juguete=?";
            PreparedStatement statement = acceso.prepareStatement(sql);
            statement.setString(1, jug.nombre);
            statement.setString(2, Integer.toString(jug.precio));
            statement.setInt(3, jug.codigo);
            statement.executeUpdate();
            System.out.println("Registro modificado");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}
