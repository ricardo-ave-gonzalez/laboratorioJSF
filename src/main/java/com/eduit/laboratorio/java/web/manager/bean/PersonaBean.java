package com.eduit.laboratorio.java.web.manager.bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("PersonaBean")
@SessionScoped
public class PersonaBean implements Serializable{
    private String nombre; 
    private String apellido;
    
    
    public String insertaPersona(){
        System.out.println("LLego");
        return "insertaPersona";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
