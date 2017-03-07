package Biblioteca;

import java.util.LinkedList;

public class Admin extends Usuario {
    
    public Admin(String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
    }
    
    public void añadirPublicacion(Publicacion publicacion, LinkedList ListaPublicacion){
        ListaPublicacion.add(publicacion);
    }
    
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
    
    public void añadirSocio(Socio socio, LinkedList ListaSocio) {
    	ListaSocio.add(socio);
    }
    
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

}
