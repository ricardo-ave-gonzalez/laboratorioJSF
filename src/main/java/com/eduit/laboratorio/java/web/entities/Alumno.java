package com.eduit.laboratorio.java.web.entities;

public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private Integer numeroAlumno;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String correo, String password, Integer numeroAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.numeroAlumno = numeroAlumno;
    }

    public Alumno(int id, String nombre, String apellido, String correo, String password, Integer numeroAlumno) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.numeroAlumno = numeroAlumno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getNumeroAlumno() {
        return numeroAlumno;
    }

    public void setNumeroAlumno(Integer numeroAlumno) {
        this.numeroAlumno = numeroAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", password=" + password + ", numeroAlumno=" + numeroAlumno + '}';
    }

}
