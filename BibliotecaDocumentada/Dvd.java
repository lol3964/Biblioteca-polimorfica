package Biblioteca;

/**
 * Clase que define los metodos para poder modificar la
 * informacion referente a un dvd.
 * @author grupo 4
 *
 */
public class Dvd extends Publicacion{
    private int ncanciones;
    private String discografia;

    /**
     * Constructor de la clase.
     * @param nombre Nombre del dvd.
     * @param autor Autor del dvd.
     * @param ncanciones Numero de canciones.
     * @param discografia Discografica a la que pertenece.
     */
    public Dvd(String nombre, Autor autor, int ncanciones, String discografia) {
        super(nombre, autor);
        this.ncanciones = ncanciones;
        this.discografia = discografia;
    }

    /**
     * Devuelve el numero de canciones.
     * @return int numero de canciones.
     */
    public int getNcanciones() {
        return ncanciones;
    }

    /**
     * Establece el numero de canciones.
     * @param ncanciones numero de canciones.
     */
    public void setNcanciones(int ncanciones) {
        this.ncanciones = ncanciones;
    }

    /**
     * Devuelve la discografica.
     * @return String discografica.
     */
    public String getDiscografia() {
        return discografia;
    }

    /**
     * Establece la discografica.
     * @param discografia Discografica a la que pertenece el disco.
     */
    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }
    
    @Override
    /**
     * Metodo que establece el atributo prestado como true y añade un socio a la lista de prestados.
     */
    public void prestar(Socio socio) {
        super.setPrestado(true);
        super.ListaPrestados.add(socio);
        System.out.println("El período de devolución para un disco son: 2 semanas");
    }

    @Override
    /**
     * Metodo que establece el atributo prestado como false y elimina un socio de la lista de prestados.
     */
    public void devolver() {
        super.setPrestado(false);
        System.out.println("El disco ha sido devuelto correctamente");
    }
    
    @Override
    /**
     * Metodo que devuelve un String con informacion.
     */
    public String datosBibli(){
        return "Este DVD pertenece a la biblioteca Watchmen";
    }
    
}
