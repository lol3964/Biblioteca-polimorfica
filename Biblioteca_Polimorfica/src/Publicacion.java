package Biblioteca;

import java.util.LinkedList;
/**
 *
 * @author Usuario
 */
public abstract class Publicacion implements datosBiblioteca {

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

    public Usuario getLastPrestado() {
        return ListaPrestados.getLast();
    }

    public Autor getAutor() {
        return autor;
    }
    
    public abstract void prestar(Socio socio);

    public abstract void devolver();
    
    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nAutor=" + autor + "\nEstado de préstamo: " + prestado;
    }

}
