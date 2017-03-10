package Biblioteca;

/**
 * Clase que define los metodos para poder modificar la
 * informacion referente a un libro.
 * @author grupo 4
 *
 */
public class Libro extends Publicacion {

    private long npaginas;
    private String editorial;

    /**
     * Constructor de la clase.
     * @param nombre Titulo del libro.
     * @param autor Autor del libro.
     * @param npaginas Numero de paginas.
     * @param editorial Editorial del libro.
     */
    public Libro(String nombre, Autor autor, long npaginas, String editorial) {
        super(nombre, autor);
        this.npaginas = npaginas;
        this.editorial = editorial;
    }

    /**
     * Metodo que devuelve el numero de paginas del libro.
     * @return long correspondiente al numero de paginas del libro.
     */
    public long getNpaginas() {
        return npaginas;
    }

    /**
     * Establece el numero de paginas que tiene el libro.
     * @param npaginas Numero de paginas.
     */
    public void setNpaginas(long npaginas) {
        this.npaginas = npaginas;
    }

    /**
     * Devuelve la editorial.
     * @return String editorial.
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Establece la editorial a la que pertenece el libro.
     * @param editorial Nombre de la editorial.
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    /**
     * Metodo que establece el atributo prestado como true y añade un socio a la lista de prestados.
     */
    public void prestar(Socio socio) {
        super.setPrestado(true);
        super.ListaPrestados.add(socio);
        System.out.println("El período de devolución para un libro son: 2 meses");
    }

    @Override
    /**
     * Metodo que establece el atributo prestado como false y elimina un socio de la lista de prestados.
     */
    public void devolver() {
        super.setPrestado(false);
        System.out.println("El libro ha sido devuelto correctamente");
    }
    
    @Override
    /**
     * Metodo que devuelve un String con informacion.
     */
    public String datosBibli(){
        return "Este libro pertenece a la biblioteca Watchmen";
    }

}
