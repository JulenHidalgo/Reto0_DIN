package dataAccessTier;

import static dataAccessTier.UserManagerFactory.LOGGER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import model.User;

/**
 * Clase creada para acceder y recoger los datos de Usuario desde la base de datos
 * implementando la interfaz DataAccesible
 * @author 2dam
 */
public class DBUserDataAccesor implements DataAccesible {
    private Connection conexion;
    private PreparedStatement declaracion;
    private final String SELECT_USER = "SELECT * FROM Usuario";


    /**
     * Método para abrir la conexión con la base de datos
     * 
     * @throws SQLException 
     */
    private void openConnection() throws SQLException {

        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios?serverTimezone=Europe/Madrid&useSSL=false", "root", "abcd*1234");

    }

    /**
     * Método para cerrar la conexión con la base de datos
     */
    private void closeConnection() {
        try {
            if (declaracion != null) {
                declaracion.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException evento) {
            LOGGER.severe("Error al cerrar la conexion con la BD");
            new Alert(Alert.AlertType.ERROR, "Error al cerrar la conexion con la BD", ButtonType.OK).showAndWait();
        }
    }

    /**
     * Método para recoger los datos guardados en la base de datos
     * @return Un objeto de la clase User con los datos de la base de datos
     * @throws Exception Si ocurre un problema en la consulta o conexión
     */
    @Override
    public User getUsuario() throws Exception{
        User usuario;
        ResultSet resultado;
        try {
            openConnection(); // Abre la conexión a la base de datos.
            declaracion = conexion.prepareStatement(SELECT_USER);

            resultado = declaracion.executeQuery();
            resultado.next();
            usuario = new User();
            usuario.setDni(resultado.getString("dni"));
            usuario.setNombre(resultado.getString("nombre"));
            usuario.setApellido(resultado.getString("apellido"));
            usuario.setCodPostal(resultado.getString("codPostal"));

            resultado.close();
            
            return usuario;
        } catch (SQLException e) {
            throw e;
        } finally {
            closeConnection();
        }
    }

}
