/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Clase que representa un elemento User con atributos como DNI, Nombre, 
 * Apellido y CódigoPostal
 * 
 * @author 2dam
 */
public class User {
    
    private String Dni;
    private String Nombre;
    private String Apellido;
    private String CodPostal;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getCodPostal() {
        return CodPostal;
    }

    public void setCodPostal(String CodPostal) {
        this.CodPostal = CodPostal;
    }
    
    
    
}
