public class Libro extends Publicacion {
    private long npaginas;
    private String editorial;

    public Libro(long npaginas, String editorial, String nombre, Autor autor) {
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


}
