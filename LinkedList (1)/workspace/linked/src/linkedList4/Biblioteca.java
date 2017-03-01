package linkedList4;

import java.util.LinkedList;

public class Biblioteca {

	private Socio socio;
	private Libro libro;
	LinkedList<Socio> ListaSocios = new LinkedList<Socio> ();
	LinkedList<Libro> ListaLibros = new LinkedList<Libro> ();
	
	/*public Biblioteca(LinkedList ListaSocios, LinkedList ListaLibros){
		this.ListaSocios = ListaSocios;
		this.ListaLibros = ListaLibros;
	}*/
	
	
	
	public void addSocio(Socio a){
		ListaSocios.add(a);
	}
	
	public void addLibro(Libro a){
		ListaLibros.add(a);
	}
	
	public void atenderPeticion(int carnet, String titulo){
		int c1=0, c2=1;
		for (int i = 0; i < ListaLibros.size(); i++) {
			if (ListaLibros.get(i).getTitulo().equals(titulo)) {
				c1++;
				if (ListaLibros.get(i).getSocio()==false) {
					Socio socioP = null;
					for (int j = 0; j < ListaSocios.size(); j++) {
						if (ListaSocios.get(j).getCarnet()==carnet) {
							socioP = ListaSocios.get(j);
							ListaSocios.get(j).addPrestamo(ListaLibros.get(i));
							break;
						}
					}
				
					ListaLibros.get(i).setSocio(socioP);
					System.out.println("Libro prestado a "+socioP.getNombre());
				}else {
					c2--;
					
				}
			}
		}
		
		if (c1<=0 ) {
			System.out.println("Libro no existe");
		}else if(c2==0) {
			System.out.println("Libro ya prestado");
		}
	
	}
	
}
