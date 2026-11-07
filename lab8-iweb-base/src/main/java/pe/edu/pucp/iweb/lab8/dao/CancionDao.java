package pe.edu.pucp.iweb.lab8.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pe.edu.pucp.iweb.lab8.beans.Cancion;

public class CancionDao extends BaseDao { // TODO: heredar de BaseDao

    /**
     * Ejercicio 2: todas las canciones (con el nombre de su género, JOIN),
     * ordenadas por título. Use PreparedStatement.
     */
    public ArrayList<Cancion> listar() throws SQLException {
        // TODO

        ArrayList<Cancion> listaCancion = new ArrayList<>();
        Connection conexion = getConnection();

        String sql = """
                SELECT g.nombre, c.titulo
                FROM genero g\s
                INNER JOIN cancion c ON g.idgenero = c.idgenero
                ORDER BY c.titulo
                """;

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String nombreGenero = rs.getString("nombre");
                String titulo = rs.getString("titulo");

                Cancion cancion = new Cancion(nombreGenero,titulo);
                listaCancion.add(cancion);

            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
        return listaCancion;

    }

    /**
     * Ejercicio 2: la canción con ese id, o null si no existe.
     */
    public Cancion buscarPorId(int idCancion) {
        // TODO

        Cancion cancion = null;
        return cancion;
    }

    /**
     * Ejercicio 2: INSERT de una canción nueva (PreparedStatement).
     */
    public void crear(Cancion cancion) {
        // TODO
    }

    /**
     * Ejercicio 2: UPDATE de una canción existente (PreparedStatement).
     */
    public void actualizar(Cancion cancion) {
        // TODO
    }

    /**
     * Ejercicio 3: DELETE por id (PreparedStatement).
     */
    public void eliminar(int idCancion) {
        // TODO
    }
}
