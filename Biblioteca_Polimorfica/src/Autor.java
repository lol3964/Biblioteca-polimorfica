package Biblioteca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Autor {
    private String fecha_nac;
    private String fecha_mue;
    private String nombre;
    private String apellidos;

    public Autor(String nombre, String apellidos, String fecha_nac, String fecha_mue) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    	this.fecha_nac = fecha_nac;
        this.fecha_mue = fecha_mue;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getFecha_mue() {
        return fecha_mue;
    }

    public void setFecha_mue(String fecha_mue) {
        this.fecha_mue = fecha_mue;
    }


    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Autor \nNombre: " + nombre + "\nApellidos: " + apellidos + "\nFecha nacimiento: " + fecha_nac + "Fecha muerte: " + fecha_mue;
    }
    
}
