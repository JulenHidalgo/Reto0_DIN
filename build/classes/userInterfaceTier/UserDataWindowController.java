/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterfaceTier;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.User;
import dataAccessTier.UserManagerFactory;
import static dataAccessTier.UserManagerFactory.LOGGER;
import javafx.scene.control.ButtonType;

/**
 * Clase que controla el fxml que maneja la informacion sobre la interfaz visual
 * y sus metodos.
 * 
 * @author 2dam
 */
public class UserDataWindowController implements Initializable {

    @FXML
    private TextField tf_nombre;

    @FXML
    private TextField tf_apellido;

    @FXML
    private TextField tf_dni;

    @FXML
    private TextField tf_cod;

    /**
     * Método para controlar los eventos que se ejecutan cuando el boton recibe 
     * una señal
     * 
     * @param event Los eventos recibidos por el boton
     */
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            User usuario = UserManagerFactory.getDatos().getUsuario();
            tf_nombre.setText(usuario.getNombre());
            tf_apellido.setText(usuario.getApellido());
            tf_dni.setText(usuario.getDni());
            tf_cod.setText(usuario.getCodPostal());
        }catch(Exception e){
            LOGGER.severe("Error en la recogida de datos");
            new Alert(Alert.AlertType.ERROR, "Error en la recogida de datos", ButtonType.OK).showAndWait();
        }

    }

    /**
     * Metodo que se ejecuta cuando se inicia el programa
     * @param url
     * @param rb 
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
