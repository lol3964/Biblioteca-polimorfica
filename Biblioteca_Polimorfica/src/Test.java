package Biblioteca;

import clases_especiales.CP;
import clases_especiales.ES;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        LinkedList<Publicacion> ListaPublicacion = new LinkedList();
        LinkedList<Usuario> ListaUsuario = new LinkedList();
        LinkedList<Autor> ListaAutor = new LinkedList();
        Iterator<Usuario> iterador = ListaUsuario.iterator(); //Evitamos con este iterador el ConcurrentModificationException al añadir objeto.

        ES es = new ES();
        CP cp = new CP();
        Admin admin = new Admin("Manuel", "Lorenzo", "12345678L");
        ListaUsuario.addLast(admin);

        long id;
        long fecha_nac;
        long fecha_mue;
        long npaginas;
        int edad;
        int ncanciones;
        int eleccion;
        String nombre;
        String apellidos;
        String dni;
        String editorial;
        String tipo;
        String nombre_publi;
        String nick;
        String discografia;
        boolean comprobacion;
        boolean comprobacion_u = false;
        boolean respuesta;
        boolean comprobacion_p;

        do {
            System.out.println("Bienvenido a la Biblioteca."
                    + "\n1)Login"
                    + "\n2)Lista de usuarios"
                    + "\n3)Salir del programa");
            eleccion = (int) es.leeEnteroLargoMinMax(1, 3, "¿Qué acción le gustaría realizar?");
            switch (eleccion) {
                case 1:
                    id = es.leeEnteroLargoMin(0, "Introduzca el id del usuario");
                    for (Usuario s : (LinkedList<Usuario>) ListaUsuario.clone()) {
                        if (s.getID() == id) {
                            comprobacion_u = true;
                            if (s instanceof Admin) {
                                do {
                                    System.out.println("Bienvenido Administrador " + s.getNombre()
                                            + "\n1)Añadir socio"
                                            + "\n2)Borrar socio"
                                            + "\n3)Añadir publicación"
                                            + "\n4)Borrar publicacion"
                                            + "\n5)Volver al menú anterior");
                                    eleccion = (int) es.leeEnteroLargoMinMax(1, 5, "¿Qué acción le gustaría realizar?");
                                    switch (eleccion) {
                                        case 1:
                                            nick = es.leerString("Introduzca el nick del usuario");
                                            edad = (int) es.leeEnteroLargoMin(0, "Introduzca la edad");
                                            nombre = es.leerString("Introduzca el nombre");
                                            apellidos = es.leerString("Introduzca los apellidos");
                                            do {
                                                dni = es.leerString("Introduzca el dni");
                                                comprobacion = cp.comprobarNif(dni);
                                                if (comprobacion == false) {
                                                    System.out.println("DNI no válido");
                                                }
                                            } while (comprobacion != true);
                                            ((Admin) s).añadirSocio(new Socio(nick, edad, nombre, apellidos, dni), ListaUsuario);
                                            System.out.println("Usuario creado con estos datos: ");
                                            ListaUsuario.getLast().toString();
                                            break;

                                        case 2:
                                            id = es.leeEnteroLargoMin(0, "Introduzca el id del usuario a borrar");
                                            comprobacion_u = false;
                                            for (Usuario u : (LinkedList<Usuario>) ListaUsuario.clone()) {
                                                if (u.getID() == id) {
                                                    comprobacion_u = true;
                                                    ListaUsuario.remove(u);
                                                    System.out.println("Usuario removido correctamente");
                                                }
                                            }
                                            if (comprobacion_u == false) {
                                                System.out.println("El id del usuario no existe");
                                            }
                                            break;

                                        case 3:
                                            do {
                                                tipo = es.leerString("¿DVD o libro");
                                                if (tipo.equalsIgnoreCase("DVD")) {
                                                    nombre_publi = es.leerString("Introduzca el nombre del DVD");
                                                    ncanciones = (int) es.leeEnteroLargoMin(0, "Introduzca el número de canciones");
                                                    discografia = es.leerString("Introduzca la discografía");
                                                    nombre = es.leerString("Introduzca el nombre del autor");
                                                    apellidos = es.leerString("Introduzca los apellidos");
                                                    comprobacion_u = false;
                                                    for (Autor a : (LinkedList<Autor>) ListaAutor.clone()) {
                                                        if (a.getNombre().equals(nombre) && apellidos.equals(nombre)) {
                                                            comprobacion_u = true;
                                                            ListaPublicacion.addLast(new Dvd(nombre_publi, a, ncanciones, discografia));
                                                            System.out.println("DVD creado correctamente");
                                                            break;
                                                        }
                                                    }
                                                    if (comprobacion_u == false) {
                                                        System.out.println("El autor no está registrado. Se va a registrar al autor.");
                                                        fecha_nac = es.leeEnteroLargoMinMax(0, 2017, "Introduzca la fecha de nacimiento");
                                                        fecha_mue = es.leeEnteroLargoMinMax(0, 2017, "Introduzca la fecha de fallecimiento");
                                                        ListaAutor.addLast(new Autor(nombre, apellidos, fecha_nac, fecha_mue));
                                                        ListaPublicacion.addLast(new Dvd(nombre, ListaAutor.getLast(), ncanciones, discografia));
                                                        System.out.println("Autor y DVD añadidos correctamente");
                                                    }
                                                } else if (tipo.equalsIgnoreCase("LIBRO")) {
                                                    nombre_publi = es.leerString("Introduzca el nombre del Libro");
                                                    npaginas = es.leeEnteroLargoMin(0, "Introduzca el número de páginas");
                                                    editorial = es.leerString("Introduzca la editorial");
                                                    nombre = es.leerString("Introduzca el nombre del autor");
                                                    apellidos = es.leerString("Introduzca los apellidos");
                                                    comprobacion_u = false;
                                                    for (Autor a : (LinkedList<Autor>) ListaAutor.clone()) {
                                                        if (a.getNombre().equals(nombre) && apellidos.equals(nombre)) {
                                                            comprobacion_u = true;
                                                            ListaPublicacion.addLast(new Libro(nombre_publi, a, npaginas, editorial));
                                                            System.out.println("Libro creado correctamente");
                                                            break;
                                                        }
                                                    }
                                                    if (comprobacion_u == false) {
                                                        System.out.println("El autor no está registrado. Se va a registrar al autor.");
                                                        fecha_nac = es.leeEnteroLargoMinMax(0, 2017, "Introduzca la fecha de nacimiento");
                                                        fecha_mue = es.leeEnteroLargoMinMax(0, 2017, "Introduzca la fecha de fallecimiento");
                                                        ListaAutor.addLast(new Autor(nombre, apellidos, fecha_nac, fecha_mue));
                                                        ListaPublicacion.addLast(new Libro(nombre, ListaAutor.getLast(), npaginas, editorial));
                                                        System.out.println("Autor y libro añadidos correctamente");
                                                    }
                                                } else {
                                                    System.out.println("Respuesta inválida");
                                                }
                                            } while (tipo.equalsIgnoreCase("DVD") || tipo.equalsIgnoreCase("LIBRO"));
                                            break;
                                        case 4:
                                            do {
                                                tipo = es.leerString("¿DVD o Libro");
                                                nombre_publi = es.leerString("Introduzca el nombre de la publicación");
                                                nombre = es.leerString("Introduzca el nombre del autor");
                                                apellidos = es.leerString("Introduzca los apellidos del autor");
                                                comprobacion = false;
                                                if (tipo.equalsIgnoreCase("DVD")) {
                                                    for (Publicacion p : (LinkedList<Publicacion>) ListaPublicacion.clone()) {
                                                        if (p instanceof Dvd) {
                                                            if (p.getAutor().getNombre().equalsIgnoreCase(nombre)
                                                                    && p.getAutor().getApellidos().equalsIgnoreCase(apellidos)
                                                                    && p.getNombre().equalsIgnoreCase(nombre_publi)) {
                                                                comprobacion_u = true;
                                                                ListaPublicacion.remove(p);
                                                            }
                                                        }
                                                    }
                                                } else if (tipo.equalsIgnoreCase("LIBRO")) {
                                                    for (Publicacion p : (LinkedList<Publicacion>) ListaPublicacion.clone()) {
                                                        if (p instanceof Libro) {
                                                            if (p.getAutor().getNombre().equalsIgnoreCase(nombre)
                                                                    && p.getAutor().getApellidos().equalsIgnoreCase(apellidos)
                                                                    && p.getNombre().equalsIgnoreCase(nombre_publi)) {
                                                                comprobacion_u = true;
                                                                ListaPublicacion.remove(p);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("Respuesta inválida");
                                                }
                                                if (comprobacion_u == false) {
                                                    System.out.println("No existe la publicación a borrar");
                                                }
                                            } while (tipo.equalsIgnoreCase("DVD") || tipo.equalsIgnoreCase("LIBRO"));
                                            break;
                                        case 5:
                                            break;
                                    }
                                    respuesta = es.leerRespuesta("¿Desea salir? (S/N)");
                                } while (respuesta != true);
                            } else {
                                System.out.println("Bienvenido Socio " + s.getNombre()
                                        + "\n1)Préstamo de una publicación"
                                        + "\n2)Devolución de una publicación"
                                        + "\n3)Volver al menú anterior");
                                eleccion = (int) es.leeEnteroLargoMinMax(1, 3, "¿Qué acción le gustaría realizar?");
                                switch (eleccion) {
                                    case 1:
                                        do {
                                            tipo = es.leerString("¿DVD o Libro");
                                            nombre_publi = es.leerString("Introduzca el nombre de la publicación");
                                            nombre = es.leerString("Introduzca el nombre del autor");
                                            apellidos = es.leerString("Introduzca los apellidos del autor");
                                            comprobacion_u = false;
                                            comprobacion_p = false;
                                            if (tipo.equalsIgnoreCase("DVD")) {
                                                for (Publicacion p : (LinkedList<Publicacion>) ListaPublicacion.clone()) {
                                                    if (p instanceof Dvd) {
                                                        if (p.getAutor().getNombre().equalsIgnoreCase(nombre)
                                                                && p.getAutor().getApellidos().equalsIgnoreCase(apellidos)
                                                                && p.getNombre().equalsIgnoreCase(nombre_publi)) {
                                                            comprobacion_u = true;
                                                            if (p.isPrestado() == false) {
                                                                comprobacion_p = true;
                                                                p.prestar((Socio) s);
                                                                System.out.println("DVD prestado correctamente");
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (tipo.equalsIgnoreCase("LIBRO")) {
                                                for (Publicacion p : (LinkedList<Publicacion>) ListaPublicacion.clone()) {
                                                    if (p instanceof Libro) {
                                                        if (p.getAutor().getNombre().equalsIgnoreCase(nombre)
                                                                && p.getAutor().getApellidos().equalsIgnoreCase(apellidos)
                                                                && p.getNombre().equalsIgnoreCase(nombre_publi)) {
                                                            comprobacion_u = true;
                                                            if (p.isPrestado() == false) {
                                                                comprobacion_p = true;
                                                                p.prestar((Socio) s);
                                                                System.out.println("Libro prestado correctamente");
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                System.out.println("Respuesta inválida");
                                            }
                                            if (comprobacion_u == false) {
                                                System.out.println("La publicación no existe");
                                            } else if (comprobacion_p == false) {
                                                System.out.println("La publicación ya está prestada");
                                            }
                                        } while (tipo.equalsIgnoreCase("DVD") || tipo.equalsIgnoreCase("LIBRO"));
                                        break;

                                    case 2:
                                        tipo = es.leerString("¿DVD o Libro");
                                        nombre_publi = es.leerString("Introduzca el nombre de la publicación");
                                        nombre = es.leerString("Introduzca el nombre del autor");
                                        apellidos = es.leerString("Introduzca los apellidos del autor");
                                        comprobacion_u = false;
                                        comprobacion_p = false;
                                        if (tipo.equalsIgnoreCase("DVD")) {
                                            for (Publicacion p : (LinkedList<Publicacion>) ListaPublicacion.clone()) {
                                                if (p instanceof Dvd) {
                                                    if (p.getAutor().getNombre().equalsIgnoreCase(nombre)
                                                            && p.getAutor().getApellidos().equalsIgnoreCase(apellidos)
                                                            && p.getNombre().equalsIgnoreCase(nombre_publi)) {
                                                        comprobacion_u = true;
                                                        if (p.isPrestado() == true && p.getLastPrestado().equals(s)) {
                                                            comprobacion_p = true;
                                                            p.devolver();
                                                            System.out.println("DVD devuelto correctamente");
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (tipo.equalsIgnoreCase("LIBRO")) {
                                            for (Publicacion p : (LinkedList<Publicacion>) ListaPublicacion.clone()) {
                                                if (p instanceof Libro) {
                                                    if (p.getAutor().getNombre().equalsIgnoreCase(nombre)
                                                            && p.getAutor().getApellidos().equalsIgnoreCase(apellidos)
                                                            && p.getNombre().equalsIgnoreCase(nombre_publi)) {
                                                        comprobacion_u = true;
                                                        if (p.isPrestado() == true && p.getLastPrestado().equals(s)) {
                                                            comprobacion_p = true;
                                                            p.devolver();
                                                            System.out.println("Libro devuelto correctamente");
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("Respuesta inválida");
                                        }
                                        if (comprobacion_u == false) {
                                            System.out.println("La publicación no existe");
                                        } else if (comprobacion_p == false) {
                                            System.out.println("La publicación no está prestada a usted");
                                        }
                                    case 3:
                                        break;
                                }

                            }
                        } else {
                            comprobacion_u = false;
                        }
                    }
                    if (comprobacion_u == false) {
                        System.out.println("El id del usuario introducido no existe");
                    }
                    break;

                case 2:
            for (Usuario s : ListaUsuario) {
                System.out.println(s.toString());
                System.out.println("-----------------");
            }
            }
            respuesta = es.leerRespuesta("¿Desea salir? (S/N)");
        } while (respuesta
                != true);
    }

}
