package com.eduit.laboratorio.java.web.repositories;

import com.eduit.laboratorio.java.web.connectors.ConnectorJDBC;
import com.eduit.laboratorio.java.web.entities.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlumnoRepository {
    private Connection conn;

    public AlumnoRepository() {
        conn=new ConnectorJDBC().getConnection();
    }
    public void save(Alumno alumno){
        if(alumno==null) return;
        try (PreparedStatement ps = conn.prepareStatement(
        "insert into alumnos (nombre,apellido,correo,password,numeroAlumno) values (?,?,?,?,?)", 
        PreparedStatement.RETURN_GENERATED_KEYS)){
        ps.setString(1, alumno.getNombre());
        ps.setString(2, alumno.getApellido());
        ps.setString(3, alumno.getCorreo());
        ps.setString(4, alumno.getPassword());
        ps.setInt(5, alumno.getNumeroAlumno());
        ps.execute();
        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next()) alumno.setId(rs.getInt(1));
        }catch (Exception e) {e.printStackTrace();}
    }
    public List<Alumno>getAll(){
        List<Alumno>list=new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery("select * from alumnos")){
            while(rs.next()){
                list.add(new Alumno(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("correo"),
                    rs.getString("password"),
                    rs.getInt("numeroAlumno")
                ));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
