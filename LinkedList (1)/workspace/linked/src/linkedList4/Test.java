package linkedList4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* Disponemos de una clase que representa una biblioteca. Dicha clase consta de la
 * lista de libros que hay en la biblioteca, y de la lista de socios que pertenecen
 * a ella. Cada elemento de la lista de libros consta de título, autor y una variable
 * que da acceso al socio que lo tiene en su poder. Cada elemento de la lista de socios
 * consta de nombre, número de carnet y la lista de préstamos del socio (libros que ha
 * sacado de la biblioteca). Cada elemento de una lista de préstamos consta de una variable
 * al libro en cuestión (al elemento de la lista de libros).
 * Se pide:
 * a) Las clases necesarias para recoger la especificación definida.
 * b) Se deben insertar libros y socios.
 * c) El diseño e implementación en Java del método atenderPetición de la clase Biblioteca,
 * 	  tal que dado el carnet de un socio y el título de un libro atienda la petición de préstamo
 * 	  de la siguiente forma:
 * 		 Si el libro no estuviera en la biblioteca, escribir un mensaje en la salida estándar
 * 			notificando el error (la biblioteca puede no tener libros).
 * 		 Si el libro ya estuviera prestado, escribir un mensaje en la salida estándar dando el
 * 			nombre de la persona que lo tuviera.
 * 		 Si el libro no estuviera prestado, entonces actualizar la biblioteca reflejando que ese
 * 			libro se va a prestar y a quién.
 * d) El diseño e implementación en Java del método borrarSocio de la clase Biblioteca, tal que dado
 * 	  el carnet de un socio realiza la siguiente operación:
 * 		 Si el socio no está en la lista de socios, se genera el siguiente mensaje (este socio no existe).
 * 		 Si el socio está, primero devuelve los libros que tuviera prestados (los pone como NO prestados) y
			segundo, borra el socio de la lista de socios.*/

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		Socio a = new Socio("Enrique");
		Socio b = new Socio("Enriqu");
		Biblioteca bib = new Biblioteca();
		Libro j = new Libro("Libro1", "qwe", b);
		Libro j2 = new Libro("Libro2", "qwe");
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		//int=Integer.parseInt(teclado.readLine());
		
		b.addPrestamo(j);
		bib.addSocio(a);
		bib.addSocio(b);
		a.printSocio();
		b.printSocio();
		bib.addLibro(j);
		bib.addLibro(j2);
		String entrada=teclado.readLine();
		bib.atenderPeticion(1, entrada);
		a.printSocio();
		b.printSocio();
	}

}
