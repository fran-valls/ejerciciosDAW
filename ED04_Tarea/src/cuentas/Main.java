package cuentas;

/**
 * Clase suministrada para hacer el ejercicio 4 de ED. Contiene el método main, y otro método
 * que controla la operativa de la clase CCuenta. Se hacen las modificaciones que se piden.
 * @author Francisco Javier Valls Abad
 *
 */
public class Main {
	
    /**
	 * Método principal del programa. Sin método main, no puede iniciarse un programa, pues es el primer
	 * método que se ejecuta.
	 * @param args array de String, que se puede pasar al ejecutar el programa. En nuestro caso no se utiliza.
	 */ 
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 0);
    }
  
	/**
	 * Método para la gestión operativa de una cuenta.
	 * @param cuenta1 un objeto cuenta.
	 * @param cuenta un float.
	 */
    private static void operativa_cuenta(CCuenta cuenta1, float cuenta) {
		try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
