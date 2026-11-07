package pe.edu.pucp.iweb.lab8.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pe.edu.pucp.iweb.lab8.beans.Genero;

public class GeneroDao extends BaseDao { // TODO: heredar de BaseDao

    /**
     * Ejercicio 2: todos los géneros ordenados por nombre.
     */
    public ArrayList<Genero> listar() throws SQLException {
        // TODO

        ArrayList<Genero> lista = new ArrayList<>();

        Connection conexion = getConnection();
        String sql = """
                SELECT *
                FROM genero
                ORDER BY nombre;
                """;

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idGenero = rs.getInt("idgenero");
                String nombre = rs.getString("nombre");
                Genero genero = new Genero(idGenero, nombre);
                lista.add(genero);
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
        return lista;

    }
}
