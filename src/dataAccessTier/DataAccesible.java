/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccessTier;

import model.User;


/**
 * Interfaz que define los métodos necesarios para la recogida de datos
 * 
 * @author 2dam
 */
public interface DataAccesible {
    
    /**
     * Metodo que recoge los datos ya sea de la base de datos o del fichero
     * @return Un objeto de la clase User con los datos recogidos
     * @throws Exception Si sucede cualquier error
     */
    public User getUsuario() throws Exception;
    
}
