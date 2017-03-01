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

    public Dvd(int ncanciones, String discografia, String nombre, Autor autor) {
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
    
    
}
