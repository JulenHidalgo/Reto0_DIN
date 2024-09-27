package dataAccessTier;

import java.util.ResourceBundle;
import model.User;

/**
 * Clase creada para acceder y recoger los datos de Usuario desde el ficehro de propiedades
 * implementando la interfaz DataAccesible
 * @author 2dam
 */
public class FileUserDataAccesor implements DataAccesible{
    
    /**
    * Método para recoger los datos guardados en el fichero de propiedades
    * @return Un objeto de la clase User con los datos del fichero
    * @throws Exception Si ocurre un problema en la recogida de datos
    */
    @Override
    public User getUsuario() throws Exception{
        
        try{
            User usuario = new User();

            usuario.setDni(ResourceBundle.getBundle("dataAccessTier.fileUsuarios").getString("DNI"));
            usuario.setNombre(ResourceBundle.getBundle("dataAccessTier.fileUsuarios").getString("NOMBRE"));
            usuario.setApellido(ResourceBundle.getBundle("dataAccessTier.fileUsuarios").getString("APELLIDO"));
            usuario.setCodPostal(ResourceBundle.getBundle("dataAccessTier.fileUsuarios").getString("COD_POSTAL"));

            return usuario;
        }catch(Exception e){
            throw e;
        }
        
        
    
    }
    
}
