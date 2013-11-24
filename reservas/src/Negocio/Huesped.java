package Negocio;

public class Huesped implements AccesoaDatos {

	private int idHuesped;

	private int edad;

	private String nombreHuesped;

	private String direccion;

	private int telefono;

	private Hospedaje hospedaje;
	
	public int getIdHuesped() {
		return idHuesped;
	}

	public void setIdHuesped(int idHuesped) {
		this.idHuesped = idHuesped;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombreHuesped() {
		return nombreHuesped;
	}

	public void setNombreHuesped(String nombreHuesped) {
		this.nombreHuesped = nombreHuesped;
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

	public Hospedaje getHospedaje() {
		return hospedaje;
	}

	public void setHospedaje(Hospedaje hospedaje) {
		this.hospedaje = hospedaje;
	}

	/**
	 * @see negocio.AccesoaDatos#guardarDatos()
	 */
	public String guardarDatos() {
		return null;
	}


	/**
	 * @see negocio.AccesoaDatos#modificarDatos()
	 */
	public String modificarDatos() {
		return null;
	}


	/**
	 * @see negocio.AccesoaDatos#eliminarDatos()
	 */
	public String eliminarDatos() {
		return null;
	}


	/**
	 * @see negocio.AccesoaDatos#consultarDatos()
	 */
	public String consultarDatos() {
		return null;
	}

}

