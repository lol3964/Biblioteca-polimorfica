package Biblioteca;

import java.util.LinkedList;

/**
 * Clase abstracta que define los metodos para poder modificar la
 * informacion referente a una publicacion.
 * @author grupo 4
 *
 */
public abstract class Publicacion implements datosBiblioteca{

    private String nombre;
    private Autor autor;
    private boolean prestado;
    
    LinkedList<Usuario> ListaPrestados = new LinkedList();
    
    /**
     * Constructor de la clase.
     * @param nombre Nombre de la publicacion.
     * @param autor Autor de la publicacion.
     */
    public Publicacion(String nombre, Autor autor) {
        this.nombre = nombre;
        this.autor = autor;
        this.prestado = false;
    }

    /**
     * Devuelve el nombre.
     * @return String nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre.
     * @param nombre Nombre de la publicacion.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve un boolean dependiendo de si el libro esta prestado o no.
     * @return boolean true-prestado false-noPrestado
     */
    public boolean isPrestado() {
        return prestado;
    }

    /**
     * Establece si el libro esta prestado o no.
     * @param prestado boolean true o false si la publicacion esta prestada o no respectivamente.
     */
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    /**
     * Devuelve el ultimo usuario que figura en la lista de usuarios a los que ha sido prestada
     * la publicacion.
     * @return objeto Usuario.
     */
    public Usuario getLastPrestado(){
		return ListaPrestados.getLast();
    }
    
    /**
     * Devuelve el autor de publicacion.
     * @return Objeto Autor.
     */
    public Autor getAutor() {
        return autor;
    }
    
    /**
     * Metodo abstracto que presta la publicacion a un usuario.
     * @param socio objeto Socio.
     */
    public abstract void prestar(Socio socio);
    
    /**
     * Metodo abstracto que deja de prestar la publicacion.
     */
    public abstract void devolver();
}
