package Biblioteca;



/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private String dni;
    private static long ID = 0;

    public Usuario(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
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

    public static long getID() {
        return ID;
    }

    public static void setID(long ID) {
        Usuario.ID = ID;
    }
}
