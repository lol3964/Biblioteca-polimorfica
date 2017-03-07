package Biblioteca;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		
		LinkedList<Publicacion> ListaPublicacion = new LinkedList();
	    LinkedList<Usuario> ListaSocio = new LinkedList();
	    
	    Publicacion a = new Libro("a", null, 0, null);
	    Publicacion b = new Libro("b", null, 0, null);
	    Publicacion c = new Libro("c", null, 0, null);
	    Publicacion d = new Dvd("d", null, 0, null);
	    Socio socio = new Socio("nombre", 0, null, null, null);
	    
	    Admin admin = new Admin("admin", null, null);

	    admin.añadirPublicacion(a, ListaPublicacion);
	    admin.añadirPublicacion(b, ListaPublicacion);
	    admin.añadirPublicacion(c, ListaPublicacion);
	    
	    System.out.println(ListaPublicacion);
	    System.out.println(ListaPublicacion.getLast().getNombre());
	    
	    
	    
	}

}
