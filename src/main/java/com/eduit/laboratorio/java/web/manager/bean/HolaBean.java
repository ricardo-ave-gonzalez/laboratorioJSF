package com.eduit.laboratorio.java.web.manager.bean;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("holaBean")
@SessionScoped
public class HolaBean implements Serializable{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
