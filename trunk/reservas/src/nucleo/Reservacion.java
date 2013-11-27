package nucleo;

public class Reservacion implements AccesoaDatos {

	private int idReservacion;

	private final String CONFIRMADA = "CO";

	private final String RADICADA = "RA";

	private final String CANCELADA = "CA";

	private Cliente cliente;

	private Estadia estadia;
	
	public int getIdReservacion() {
		return idReservacion;
	}


	public void setIdReservacion(int idReservacion) {
		this.idReservacion = idReservacion;
	}

	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Estadia getEstadia() {
		return estadia;
	}


	public void setEstadia(Estadia estadia) {
		this.estadia = estadia;
	}


	/**
	 * @see nucleo.AccesoaDatos#guardarDatos()
	 */
	public String guardarDatos() {
		return null;
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
