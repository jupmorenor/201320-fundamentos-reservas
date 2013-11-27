package nucleo;

public class Cliente implements AccesoaDatos {

	private int idCliente;

	private String nombreCliente;

	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	/**
	 * @see nucleo.AccesoaDatos#guardarDatos()
	 */
	public String guardarDatos() {
		String cadena = "INSERT INTO cliente (k_idcliente, n_nombrecliente) " +
				"VALUES(" + getIdCliente() + ", UPPER('" + getNombreCliente() + "'));";
		return cadena;
	}


	/**
	 * @see nucleo.AccesoaDatos#modificarDatos()
	 */
	public String modificarDatos() {
		return null;
	}


	/**
	 * @see nucleo.AccesoaDatos#validarDatos()
	 */
	public String validarDatos() {
		return null;
	}


	/**
	 * @see nucleo.AccesoaDatos#consultarDatos()
	 */
	public String consultarDatos() {
		String cadena = "SELECT * FROM cliente WHERE k_idcliente = " + getIdCliente() + ";";
		return cadena;
	}

}
