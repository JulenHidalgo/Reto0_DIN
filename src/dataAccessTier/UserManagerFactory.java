package dataAccessTier;

import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 * Factoría que crea las clases DBUserDataAccesor o FileUserDataAccesor dependiendo
 * de los datos guardados en el fichero propiedades.properties
 * 
 * @author 2dam
 */
public class UserManagerFactory {
    
    public static final Logger LOGGER = Logger.getLogger("dataAccessTier.data");
    
    /**
     * Método creado para leer el fichero propiedades.properties y en base a eso,
     * retornar un objeto de la clase DBUserDataAccesor o FileUserDataAccesor
     * 
     * @return Un objeto de la clase DBUserDataAccesor o FileUserDataAccesor
     */
    public static DataAccesible getDatos(){
        String acceso = ResourceBundle.getBundle("dataAccessTier.propiedades").getString("ACCESO");
        
        if(acceso.equals("DB")){
            return new DBUserDataAccesor();
            
        }else if(acceso.equals("FILE")){
            return new FileUserDataAccesor();
        }else{
            LOGGER.severe("Tipo de acceso no aceptado");
            new Alert(Alert.AlertType.ERROR, "Tipo de acceso no aceptado", ButtonType.OK).showAndWait();
            return null;
        }
        
           
    }
    
}
