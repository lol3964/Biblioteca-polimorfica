/**
 * @version: 24/11/2016 0.1v
 */
package clases_especiales;

import java.util.Scanner;
// TODO: Auto-generated Javadoc

/**
 * The Class ES.
 */
public class ES {
	
	/** The success. */
	//Campos de clase
	boolean success;
	
	/**
	 * Instantiates a new es.
	 */
	public ES() {
	};
	
	/**
	 * lee entero largo.
	 *
	 * @return the long
	 */
	
	/**
	 * Método que lee un número entero de tipo "Long" (Largo) por teclado
	 * @return El número entero largo introducido por teclado
	 */
	long leeEnteroLargo() {
		long n_long = 0 ;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce un entero largo");
			try {
				n_long = sc.nextLong();
				success = true;
				return n_long;
			} catch (Exception e) {
				System.out.println("Valor inválido. Introduzcalo de nuevo");
				success = false;
				sc.next();
			}
		} while (success == false);
		return n_long;
	}

	
	/**
	 * lee real.
	 *
	 * @return the float
	 */
	public float leeReal() {
		float n_float = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce un número real");
			try {
				n_float = sc.nextFloat();
				success = true;
			} catch (Exception e) {
				System.out.println("Valor inválido. Introduzcalo de nuevo");
				success = false;
				sc.next();
			}
		} while (success == false);
		return n_float;
	}

	
	/**
	 * lee booleano.
	 *
	 * @return true, if successful
	 */
	boolean leeBooleano() {
		boolean n_boolean = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce un valor booleano");
			try {
				n_boolean = sc.nextBoolean();
				success = true;
			} catch (Exception e) {
				System.out.println("Valor inválido. Introduzcalo de nuevo");
				success = false;
			}
		} while (success == false);
		return n_boolean;
	}

	
	/**
	 * lee entero largo.
	 *
	 * @param mensaje_pantalla the mensaje pantalla
	 * @return the long
	 */
	public long leeEnteroLargo(String mensaje_pantalla) {
		long n_long = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(mensaje_pantalla);
			try {
				n_long = sc.nextLong();
				success = true;
			} catch (Exception e) {
				System.out.println("Valor inválido. Introduzcalo de nuevo");
				success = false;
				sc.next();
			}
		} while (success == false);
		return n_long;
	}

	
	/**
	 * lee real.
	 *
	 * @param mensaje_pantalla the mensaje pantalla
	 * @return the float
	 */
	public float leeReal(String mensaje_pantalla) {
		float n_float = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(mensaje_pantalla);
			try {
				n_float = sc.nextFloat();
				success = true;
			} catch (Exception e) {
				System.out.println("Valor inválido. Introduzcalo de nuevo");
				success = false;
				sc.next();
			}
		} while (success == false);
		return n_float;
	}
	
    /**
     *
     * @param mensaje_pantalla
     * @return
     */
    public double leerDouble(String mensaje_pantalla) {
		double n_double = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(mensaje_pantalla);
			try {
				n_double = sc.nextDouble();
				success = true;
			} catch (Exception e) {
				System.out.println("Valor inválido. Introduzcalo de nuevo");
				success = false;
				sc.next();
			}
		} while (success == false);
		return n_double;
	}
	
	/**
	 * lee booleano.
	 *
	 * @param mensaje_pantalla the mensaje pantalla
	 * @return true, if successful
	 */
	boolean leeBooleano(String mensaje_pantalla) {
		boolean n_boolean = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(mensaje_pantalla);
			try {
				n_boolean = sc.nextBoolean();
				success = true;
			} catch (Exception e) {
				System.out.println("Valor inválido. Introduzcalo de nuevo");
				success = false;
			}
		} while (success == false);
		return n_boolean;
	}
	


	/**
	 * lee entero largo min max.
	 *
	 * @param minimo the minimo
	 * @param maximo the maximo
	 * @return the long
	 */
	long leeEnteroLargoMinMax(long minimo, long maximo) {
		long n_long = 0;
		long m = 0;
		Scanner sc = new Scanner(System.in);
		if(minimo > maximo){
			m = maximo;
			maximo = minimo;
			minimo = m;
		}
		do {
			System.out.println("Introduce un entero largo");
			try {
				n_long = sc.nextLong();
				if (n_long > maximo) {
					System.out.println("El valor es superior al máximo establecido");
					success = false;
				} else if (n_long < minimo) {
					System.out.println("El valor es inferior al mínimo establecido");
					success = false;
				} else {
					success = true;
				}
			} catch (Exception e) {
				System.out.println("Valor inválido. Introduzcalo de nuevo");
				success = false;
				sc.next();
			}
		} while (success == false);
		return n_long;
	}


	/**
	 * leer real min max.
	 *
	 * @param minimo the minimo
	 * @param maximo the maximo
	 * @return the float
	 */
	float leerRealMinMax(float minimo, float maximo) {
		float n_float = 0;
		float m = 0;
		Scanner sc = new Scanner(System.in);
		if(minimo > maximo){
			m = maximo;
			maximo = minimo;
			minimo = m;
		}
		do {
			System.out.println("Introduce un número real");
			try {
				n_float = sc.nextFloat();
				if (n_float > maximo) {
					System.out.println("El valor es superior al máximo establecido"); 
					success = false;
				} else if (n_float < minimo) {
					System.out.println("El valor es inferior al mínimo establecido"); 
					success = false;
				} else {
					success = true;
				}
			} catch (Exception e) {
				System.out.println("Valor inválido. Introduzcalo de nuevo");
				success = false;
				sc.next();
			}
		} while (success == false);
		return n_float;
	}


	/**
	 * lee entero largo min.
	 *
	 * @param minimo the minimo
	 * @param mensaje_pantalla the mensaje pantalla
	 * @return the long
	 */
	public long leeEnteroLargoMin(long minimo, String mensaje_pantalla) {
		long n_long = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(mensaje_pantalla);
			try {
				n_long = sc.nextLong();
				if (n_long < minimo) {
					System.out.println("El valor es inferior al mínimo establecido por la biblioteca"); //El valor es inferior al mínimo establecido
					success = false;
				} else {
					success = true;
				}
			} catch (Exception e) {
				System.out.println("Valor inválido. Introduzcalo de nuevo");
				success = false;
				sc.next();
			}
		} while (success == false);
		return n_long;
	}


	/**
	 * leer real min.
	 *
	 * @param minimo the minimo
	 * @param mensaje_pantalla the mensaje pantalla
	 * @return the float
	 */
	float leerRealMin(float minimo, String mensaje_pantalla) {
		float n_float = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(mensaje_pantalla);
			try {
				n_float = sc.nextFloat();
				if (n_float < minimo) {
					System.out.println("El valor es inferior al mínimo establecido");
					success = false;
				} else {
					success = true;
				}
			} catch (Exception e) {
				System.out.println("Valor inválido. Introduzcalo de nuevo");
				success = false;
				sc.next();
			}
		} while (success == false);
		return n_float;
	}


	/**
	 * leer respuesta.
	 *
	 * @param mensaje the mensaje
	 * @return true, if successful
	 */
	public boolean leerRespuesta(String mensaje) {
		Scanner sc = new Scanner(System.in);
		String eleccion;
		boolean aceptado = false;
		do {
			System.out.println(mensaje);
				eleccion = sc.next();
				if ((eleccion.toLowerCase().equals("si")) || (eleccion.toLowerCase().equals("sí"))) {
					System.out.println("Has aceptado"); //Has aceptado
					success = true;
					aceptado = true;
				} else if ((eleccion.toLowerCase().equals("no"))) {
					System.out.println("Has rechazado");
					success = true;
					aceptado = false;
				}else if ((eleccion.toLowerCase().equals("n"))){
					System.out.println("Has rechazado");
					success = true;
					aceptado = false;
				}else if ((eleccion.toLowerCase().equals("s"))){
					System.out.println("Has aceptado");//Has aceptado
					success = true;
					aceptado = true;
				}else {
					System.out.println("Respuesta inválida");
					success = false;
				}
		} while (success == false);
		return aceptado;
	}

	
	/**
	 * leer respuesta ingles.
	 *
	 * @param mensaje the mensaje
	 * @return true, if successful
	 */
	boolean leerRespuestaIngles(String mensaje) {
		Scanner sc = new Scanner(System.in);
		String eleccion;
		boolean aceptado = false;
		do {
			System.out.println(mensaje);
				eleccion = sc.next();
				if ((eleccion.toLowerCase().equals("yes"))) {
					System.out.println("Has aceptado");
					success = true;
					aceptado = true;
				} else if ((eleccion.toLowerCase().equals("no"))) {
					System.out.println("Has rechazado");
					success = true;
					aceptado = true;
				}else if ((eleccion.toLowerCase().equals("n"))){
					System.out.println("Has rechazado");
					success = true;
				}else if ((eleccion.toLowerCase().equals("y"))){
					System.out.println("Has aceptado");
					success = true;
					aceptado = true;
				}else {
					System.out.println("Respuesta inválida");
					success = false;
				}
		} while (success == false);
		return aceptado;
	}

	
	/**
	 * leer string.
	 *
	 * @param mensaje the mensaje
	 * @return the string
	 */
	public String leerString(String mensaje) {
		Scanner sc = new Scanner(System.in);
		String eleccion;
		System.out.println(mensaje);
		eleccion = sc.nextLine();
		return eleccion;
	}

	/**
	 * lee entero largo min max.
	 *
	 * @param minimo the minimo
	 * @param maximo the maximo
	 * @param mensaje_pantalla the mensaje pantalla
	 * @return the long
	 */
	public long leeEnteroLargoMinMax(long minimo, long maximo, String mensaje_pantalla) {
		long n_long = 0;
		long m = 0;
		Scanner sc = new Scanner(System.in);
		if(minimo > maximo){
			m = maximo;
			maximo = minimo;
			minimo = m;
		}
		do {
			System.out.println(mensaje_pantalla);
			try {
				n_long = sc.nextLong();
				if (n_long > maximo) {
					System.out.println("El número introducido no corresponde a ninguna acción"); //El valor es superior al máximo establecido
					success = false;
				} else if (n_long < minimo) {
					System.out.println("El número introducido no corresponde a ninguna acción");//El valor es inferior al mínimo establecido
					success = false;
				} else {
					success = true;
				}
			} catch (Exception e) {
				System.out.println("Valor inválido. Introduzca un valor válido");//Valor inválido. Introduzcalo de nuevo
				success = false;
				sc.next();
			}
		} while (success == false);
		return n_long;
	}
	

	
	/**
	 * leer real min max.
	 *
	 * @param minimo the minimo
	 * @param maximo the maximo
	 * @param mensaje_pantalla the mensaje pantalla
	 * @return the float
	 */
	float leerRealMinMax(float minimo, float maximo, String mensaje_pantalla) {
		float n_float = 0;
		float m = 0;
		Scanner sc = new Scanner(System.in);
		if(minimo > maximo){
			m = maximo;
			maximo = minimo;
			minimo = m;
		}
		do {
			System.out.println(mensaje_pantalla);
			try {
				n_float = sc.nextFloat();
				if (n_float > maximo) {
					System.out.println("El valor es superior al máximo establecido");
					success = false;
				} else if (n_float < minimo) {
					System.out.println("El valor es inferior al mínimo establecido");
					success = false;
				} else {
					success = true;
				}
			} catch (Exception e) {
				System.out.println("Valor inválido. Introduzcalo de nuevo");
				success = false;
				sc.next();
			}
		} while (success == false);
		return n_float;
        }

    /**
     *
     */
    public void pauseScreen() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Pulsa una tecla para continuar");
            sc.nextLine();
	}
}