package Biblioteca;

/**
 * Clase que define los metodos para poder modificar la
 * informacion referente a un socio.
 * @author grupo 4
 *
 */
public class Socio extends Usuario {
    private String nick;
    private int edad;

    /**
     * Constructor de la clase.
     * @param nick nick del socio.
     * @param edad edad del socio.
     * @param nombre nombre del socio.
     * @param apellidos apellidos del socio.
     * @param dni dni del socio.
     */
    public Socio(String nick, int edad, String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
        this.nick = nick;
        this.edad = edad;
    }

    /**
     * Devuelve el nick del socio.
     * @return String nick.
     */
    public String getNick() {
        return nick;
    }

    /**
     * Establece el nick.
     * @param nick nick del socio.
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * Devuelve la edad del socio.
     * @return int edad.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad.
     * @param edad edad del socio.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    /**
     * Metodo toString que muestra los atributos de la clase como String.
     * @return String Socio.
     */
    public String toString() {
        return "Privilegios: Socio" 
                + "\nNick: " + nick 
                + "\nEdad:" + edad
                + "\n" + super.toString();
    }

}
