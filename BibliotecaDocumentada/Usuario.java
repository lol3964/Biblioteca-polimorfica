package Biblioteca;

/**
 * Clase que define los metodos para poder modificar la
 * informacion referente a un usuario.
 * @author grupo 4
 *
 */
public class Usuario implements datosBiblioteca {
    private String nombre;
    private String apellidos;
    private String dni;
    private long id;
    private static long ID = 0;

    /**
     * Constructor de la clase con un id que se autoincrementa
     * cada vez que se crea un objeto de la clase Usuario.
     * @param nombre Nombre del usuario
     * @param apellidos Apellidos del usuario
     * @param dni Dni del usuario.
     */
    public Usuario(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.id = ID;
        Usuario.ID++;
    }

    /**
     * Devuelve el nombre del usuario
     * @return String nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre.
     * @param nombre nombre de usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Devuelve los apellidos del usuario
     * @return String apellidos.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos.
     * @param apellidos apellidos de usuario.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Devuelve el dni del usuario
     * @return String dni.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el dni.
     * @param dni dni de usuario.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Devuelve el id del usuario
     * @return long id.
     */
    public long getID() {
        return id;
    }
    
    @Override
    /**
     * Metodo toString que muestra los atributos de la clase como String.
     * @return String Usuario.
     */
    public String toString() {
        return "Nombre: " + nombre + 
                "\nApellidos: " + apellidos + 
                "\nDNI: " + dni + 
                "\nID: " + id;
    }
    
    @Override
    /**
     * Metodo que devuelve un String con informacion.
     */
    public String datosBibli(){
        return "Eres usuario de la biblioteca Watchmen";
    }
    
}
