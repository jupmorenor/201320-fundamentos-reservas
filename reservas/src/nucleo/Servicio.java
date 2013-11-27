package nucleo;

public class Servicio implements AccesoaDatos {

	private int idServicio;

	private String nombreServicio;

	private int valorServicio;

	private String descripcion;

	public int getIdServicio() {
		return idServicio;
	}


	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}


	public String getNombreServicio() {
		return nombreServicio;
	}


	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}


	public int getValorServicio() {
		return valorServicio;
	}


	public void setValorServicio(int valorServicio) {
		this.valorServicio = valorServicio;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	/**
	 * @see nucleo.AccesoaDatos#guardarDatos()
	 */
	public String guardarDatos() {
		String cadena = "INSERT INTO servicio (k_idservicio, n_nombre, d_descservicio, v_valorservicio) " +
				"VALUES (((SELECT COUNT(k_idservicio) FROM servicio) + 1),'" + getNombreServicio() + "', '" + 
				getDescripcion() + "', " + getValorServicio() + ");";
		return cadena;
	}


	/**
	 * @see nucleo.AccesoaDatos#modificarDatos()
	 */
	public String modificarDatos() {
		return null;
	}


	/**
	 * @see nucleo.AccesoaDatos#eliminarDatos()
	 */
	public String eliminarDatos() {
		return null;
	}


	/**
	 * @see nucleo.AccesoaDatos#consultarDatos()
	 */
	public String consultarDatos() {
		return null;
	}

}
