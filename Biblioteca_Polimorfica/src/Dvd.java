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
public class Dvd extends Publicacion{
    private int ncanciones;
    private String discografia;

    public Dvd(String nombre, Autor autor, int ncanciones, String discografia) {
        super(nombre, autor);
        this.ncanciones = ncanciones;
        this.discografia = discografia;
    }

    public int getNcanciones() {
        return ncanciones;
    }

    public void setNcanciones(int ncanciones) {
        this.ncanciones = ncanciones;
    }

    public String getDiscografia() {
        return discografia;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }
    
    @Override
    public void prestar(Socio socio) {
        super.setPrestado(true);
        super.ListaPrestados.add(socio);
        System.out.println("El per�odo de devoluci�n para un disco son: 2 semanas");
    }

    @Override
    public void devolver() {
        super.setPrestado(false);
        System.out.println("El disco ha sido devuelto correctamente");
    }
    @Override
    public String datosBibli(){
        return "Este DVD pertenece a la biblioteca Watchmen";
    }
}
