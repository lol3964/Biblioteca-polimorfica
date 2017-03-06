package Biblioteca;

public class Admin extends Usuario {
    
    public Admin(String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
    }
    
    public void añadirLibro(Libro libro){
        biblioteca.ListaPublicacion.add(libro);
    }
    
    public boolean borrarLibro(String nlibro){
        for(Publicacion li : biblioteca.ListaPublicacion){
            return false;
        }
        return true;
    }
}
