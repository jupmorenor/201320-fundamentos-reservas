package nucleo;

public class Huesped implements AccesoaDatos {

	private int idHuesped;

	private String nombreHuesped;

	private int edad;

	private String direccion;

	private int telefono;
	
	public int getIdHuesped() {
		return idHuesped;
	}


	public void setIdHuesped(int idHuesped) {
		this.idHuesped = idHuesped;
	}


	public String getNombreHuesped() {
		return nombreHuesped;
	}


	public void setNombreHuesped(String nombreHuesped) {
		this.nombreHuesped = nombreHuesped;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	/**
	 * @see nucleo.AccesoaDatos#guardarDatos()
	 */
	public String guardarDatos() {
		String cadena = "INSERT INTO huesped (k_identificacion, n_nombre, v_edad, o_direccion, o_telefono) " +
				"VALUES (" + getIdHuesped() + "," +
						"UPPER('" + getNombreHuesped() + "')," + getEdad() + 
						",'" + getDireccion() + "'," + getTelefono() + ");";
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
		String cadena = "SELECT * FROM huesped WHERE k_identificacion = " + getIdHuesped() + ";";
		return cadena;
	}

}
