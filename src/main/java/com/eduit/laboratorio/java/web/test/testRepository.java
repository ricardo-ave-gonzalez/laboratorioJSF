package com.eduit.laboratorio.java.web.test;

import com.eduit.laboratorio.java.web.entities.Alumno;
import com.eduit.laboratorio.java.web.repositories.AlumnoRepository;

public class testRepository {
    public static void main(String[] args) {
        AlumnoRepository ar=new AlumnoRepository();
        //Alumno alumno=new Alumno("ricardo", "gonzalez", "ricardo@gmail.com", "1234", 1);
        Alumno alumno1=new Alumno("maximiliano", "pretty", "maxi@gmail.com", "1234", 5);
        Alumno alumno2=new Alumno("sofia", "sala", "sofi@gmail.com", "1234", 2);
        Alumno alumno3=new Alumno("osvaldo", "laport", "laport@gmail.com", "1234", 1);
        Alumno alumno4=new Alumno("carlos", "gomez", "carlos@gmail.com", "1234", 7);
        ar.save(alumno1);
        ar.save(alumno2);
        ar.save(alumno3);
        ar.save(alumno4);
        //testeamos el metodo getAll y nos retorna toda la lista de alumnos
        ar.getAll().forEach(System.out::println);
    }
}
