package Biblioteca;

import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public abstract class Publicacion {

    private String nombre;
    private Autor autor;
    private boolean prestado;
    
    LinkedList<Usuario> ListaPrestados = new LinkedList();
    
    public Publicacion(String nombre, Autor autor) {
        this.nombre = nombre;
        this.autor = autor;
        this.prestado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    public Usuario getLastPrestado(){
		return ListaPrestados.getLast();
    }
    
    public abstract void prestar(Socio socio);
    
    public abstract void devolver();
}
