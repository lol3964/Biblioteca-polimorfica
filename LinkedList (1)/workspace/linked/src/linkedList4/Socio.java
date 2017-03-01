package linkedList4;

import java.util.LinkedList;

public class Socio {
	
	private String nombre;
	private static int  numero;
	private int numeroc;
	
	LinkedList<Libro> ListaPrestamos = new LinkedList<Libro> ();
	
	public Socio(String nombre){
		this.nombre = nombre;
		numero++;
		numeroc=numero;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void addPrestamo(Libro libro){
		ListaPrestamos.add(libro);
	}
	
	public int getCarnet(){
		return numeroc;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void printSocio(){
		System.out.print(nombre);
		System.out.println("		Nº Carnet: "+numeroc+"\n");
		System.out.print("Lista de prestamos: ");
		for (int i = 0; i < ListaPrestamos.size(); i++) {
			System.out.print(ListaPrestamos.get(i).getTitulo());
			if (i<ListaPrestamos.size()-1) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}
		System.out.println("\n");

	}
	
}
