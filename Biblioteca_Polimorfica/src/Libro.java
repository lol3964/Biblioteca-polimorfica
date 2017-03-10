package Biblioteca;

public class Libro extends Publicacion {

    private long npaginas;
    private String editorial;

    public Libro(String nombre, Autor autor, long npaginas, String editorial) {
        super(nombre, autor);
        this.npaginas = npaginas;
        this.editorial = editorial;
    }

    public long getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(long npaginas) {
        this.npaginas = npaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public void prestar(Socio socio) {
        super.setPrestado(true);
        super.ListaPrestados.add(socio);
        System.out.println("El per�odo de devoluci�n para un libro son: 2 meses");
    }

    @Override
    public void devolver() {
        super.setPrestado(false);
        System.out.println("El libro ha sido devuelto correctamente");
    }
    
    @Override
    public String datosBibli(){
        return "Este libro pertenece a la biblioteca Watchmen";
    }

    @Override
    public String toString() {
        return "Tipo publicaci�n: Libro" +super.toString() + "\nN�mero de p�ginas: " + npaginas + "\nEditorial: " + editorial;
    }
    
    
}

