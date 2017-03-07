package Biblioteca;



/**
 *
 * @author Usuario
 */
public abstract class Usuario implements datosBiblioteca {
    private String nombre;
    private String apellidos;
    private String dni;
    private long id;
    private static long ID = 1;

    public Usuario(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.id = ID;
        Usuario.ID++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public long getID() {
        return id;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + 
                "\nApellidos: " + apellidos + 
                "\nDNI: " + dni + 
                "\nID: " + id;
    }
    
    @Override
    public String datosBibli(){
        return "Eres usuario de la biblioteca Watchmen";
    }
}
