/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.laboratorio.java.web.manager.bean;

import com.eduit.laboratorio.java.web.entities.Alumno;
import com.eduit.laboratorio.java.web.repositories.AlumnoRepository;
import java.io.Serializable;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author sf2
 */
@Named("alumnoMB")
@SessionScoped
public class AlumnoManagedBean implements Serializable {

    private AlumnoRepository ar = new AlumnoRepository();
    private Alumno alumno = new Alumno();
    private String mensaje = "";
    private String buscarNombre = "";
    private String buscarCorreo = "";

    public AlumnoManagedBean() {
    }

    public void save() {
        if (alumno.getNombre().length() < 3) {
            mensaje = "La longitud del nombre debe tener al menos 3 caracteres!";
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage("successfull", mensaje));
            return;
        }
        ar.save(alumno);
        if(alumno.getId()==0) mensaje="Ocurrio un error!";
        else mensaje="Se ingreso un alumno id:"+alumno.getId();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Successfull", mensaje));
        alumno=new Alumno();
    }
    public List<Alumno>getAll(){
        return ar.getAll();
    }
    

    public AlumnoRepository getAr() {
        return ar;
    }

    public void setAr(AlumnoRepository ar) {
        this.ar = ar;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getBuscarNombre() {
        return buscarNombre;
    }

    public void setBuscarNombre(String buscarNombre) {
        this.buscarNombre = buscarNombre;
    }

    public String getBuscarCorreo() {
        return buscarCorreo;
    }

    public void setBuscarCorreo(String buscarCorreo) {
        this.buscarCorreo = buscarCorreo;
    }

}
