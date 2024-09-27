package userInterfaceTier;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase desde donde se ejecuta el programa, recibe la informacion del fxml
 * 
 * @author 2dam
 */
public class Application extends javafx.application.Application {
    
    /**
     * Método que se ejecuta cuando se inicia el programa
     * 
     * @param stage
     * @throws Exception Se lanza cuando ocurre algun problema
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("vista.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Metodo para ejecutar el programa
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
