package cuentas;

/**
 * Clase CCuenta, diseñada para hacer un ejercicio con una clase. Sirve para una cuenta bancaria
 * con atributos como nombre, cuenta, saldo y tipo de interes.
 * @author Francisco Javier Valls Abad
 *
 */
public class CCuenta {

	// Atributos
	/**
	 * String con el nombre.
	 */
    private String nombre;
    
    /**
     * String con la cuenta.
     */
    private String cuenta;
    
    /**
     * double con el saldo.
     */
    private double saldo;
    
    /**
     * double con el tipo de interés.
     */
    private double tipoInterés;

    /**
     * Constructor vacío.
     */
  
    // Constructores
    public CCuenta()
    {
    }

    /**
     * Constructor que recíbe los parámetros para inicializar los atributos.
     * @param nom String que recibe el nombre.
     * @param cue String que recibe la cuenta.
     * @param sal double que recibe el saldo.
     * @param tipo double que recibe el tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    // Getters and Setters
    /**
     * getter del nombre.
     * @return nombre.
     */
    public String getNombre() {
		return nombre;
	}
    
	/**
	 * getter de la cuenta
	 * @return cuenta.
	 */
    public String getCuenta() {
		return cuenta;
	}
    
    /**
     * getter del saldo
     * @return saldo.
     */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * getter del tipo de interés.
	 * @return tipoInterés.
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * setter para modificar nombre.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * setter para modificar cuenta.
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * setter para modificar el saldo
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * setter para modificar el tipo de interes.
	 * @param tipoInterés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Método que devuelve el saldo.
	 * @return saldo.
	 */
	public double estado()
    {
        return saldo;
    }
	
	/**
	 * Método que recibe una cantidad para ingresar al saldo.
	 * @param cantidad cantidad a ingresar.
	 * @throws Exception se lanza una excepción si intentamos ingresar una cantidad negativa.
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar una cantidad del saldo.
     * @param cantidad cantidad a retirar.
     * @throws Exception se lanza una excepción si se intenta retirar una cantidad
     * negativa o cero, y otra si el saldo es menor que la cantidad a retirar.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
