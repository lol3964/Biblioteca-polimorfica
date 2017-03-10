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
	
    private String nombre, apellidos, fecha_nac, fecha_mue;

    /**
     * Constructor de la clase.
     * @param nombre Nombre del autor.
     * @param apellidos Apellidos del autor.
     * @param fecha_nac Fecha de nacimiento del autor.
     * @param fecha_mue Fecha de la muerte del autor.
     */
    public Autor(String nombre, String apellidos, String fecha_nac, String fecha_mue) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    	this.fecha_nac = fecha_nac;
        this.fecha_mue = fecha_mue;
    }

    /**
     * Devuelve el nombre de autor.
     * @return String nombre.
     */
    public String getNombre() {
		return nombre;
	}

    /**
     * Establece el nombre.
     * @param nombre nombre de autor.
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve los apellidos de autor.
	 * @return String apellidos.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Establece los apellidos.
	 * @param apellidos apellidos de autor.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
     * Devuelve la fecha de nacimiento del autor.
     * @return String fecha_nac.
     */
    public String getFecha_nac() {
        return fecha_nac;
    }

    /**
     * Establece la fecha de nacimiento.
     * @param fecha_nac fecha de nacimiento.
     */
    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    /**
     * Devuelve la fecha de la muerte del autor.
     * @return String fecha_mue.
     */
    public String getFecha_mue() {
        return fecha_mue;
    }

    /**
     * Establece la fecha de la muerte.
     * @param fecha_mue fecha de la muerte.
     */
    public void setFecha_mue(String fecha_mue) {
        this.fecha_mue = fecha_mue;
    }
    
    @Override
    /**
     * Metodo toString que muestra los atributos de la clase como String.
     * @return String Autor.
     */
    public String toString() {
        return "Autor \nNombre: " + nombre + "\nApellidos: " + apellidos + "Fecha nacimiento: " + fecha_nac + "Fecha muerte: " + fecha_mue;
    }
    
}
