package Biblioteca;

import java.util.LinkedList;

/**
 * Clase Admin que contiene los metodos que posibilitan las
 * operaciones bascias de la biblioteca.
 * @author grupo 4
 *
 */

public class Admin extends Usuario {
    
	/**
	 * Constructor de la clase.
	 * @param nombre Nombre del administrador.
	 * @param apellidos Apellidos del administrador.
	 * @param dni DNI del administrador.
	 */
    public Admin(String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
    }
    
    /**
     * Metodo para añadir libros o dvds a la lista de publicaciones.
     * @param publicacion Objeto que se quiere añadir.
     * @param ListaPublicacion Lista a la que se quiere añadir.
     */
    public void añadirPublicacion(Publicacion publicacion, LinkedList ListaPublicacion){
        ListaPublicacion.add(publicacion);
    }
    
    /**
     * Metodo que borra un libro o dvd de la lista de publicaciones.
     * @param nombre Nombre del libro o dvd que se quiere eliminar.
     * @param ListaPublicacion Lista de la que se elimina.
     */
    public void borrarPublicacion(String nombre, LinkedList<Publicacion> ListaPublicacion){        
        
        boolean existe = true;

		for (Publicacion publicacion : ListaPublicacion) {
			if (publicacion.getNombre() != nombre) {
				existe = false;
			} else {
				existe = true;
				
				ListaPublicacion.remove(publicacion);
				break;
			}
			
		}
		
		if (existe == false) {
			System.out.println("Esta publicacion no existe");
		}
		
    }
    
    /**
     * Metodo para añadir un socio a la lista de socios.
     * @param socio Objeto que se quiere añadir.
     * @param ListaSocio Lista a la que se quiere añadir.
     */
    public void añadirSocio(Socio socio, LinkedList ListaSocio) {
    	ListaSocio.add(socio);
    }
    
    /**
     * Metodo que elimina a un socio de la lista de socios y establece que todas las
     * publicaciones que tuviese ese socio prestadas ya no lo esten al borrarlo.
     * @param id id del socio
     * @param ListaSocio lista en la que se encuentra el socio.
     * @param ListaPublicacion lista de publicaciones que podrian estar prestadas al socio.
     */
    public void borrarSocio(long id, LinkedList<Usuario> ListaSocio, LinkedList<Publicacion> ListaPublicacion) {

    	boolean existe = true;

		for (Usuario usuario : ListaSocio) {
			if (usuario.getID() != id) {
				existe = false;
			} else if (usuario instanceof Socio){
				existe = true;
				
				for (Publicacion publicacion : ListaPublicacion) {
					if (publicacion.isPrestado() == true & publicacion.getLastPrestado().equals(usuario)) {
						publicacion.setPrestado(false);
					}
					
				}
				
				ListaSocio.remove(usuario);
				break;
			}
			
		}
		
		if (existe == false) {
			System.out.println("Este socio no existe");
		}
    	
    	
    }
    
    @Override
    /**
     * Metodo toString que muestra los atributos de la clase como String.
     * @return String Admin.
     */
    public String toString() {
        return "Privilegios: Administrador" 
                + "\n" + super.toString();
    }

}
