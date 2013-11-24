package Negocio;

public class Habitacion implements AccesoaDatos {

	private int numHabitacion;

	private int precioNoche;

	private String tipoHabitacion;

	private boolean estadoReserva;

	private Reservacion reservacion;

	private Hospedaje hospedaje;
	
	public int getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	public int getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(int precioNoche) {
		this.precioNoche = precioNoche;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public boolean isEstadoReserva() {
		return estadoReserva;
	}

	public void setEstadoReserva(boolean estadoReserva) {
		this.estadoReserva = estadoReserva;
	}

	public Reservacion getReservacion() {
		return reservacion;
	}

	public void setReservacion(Reservacion reservacion) {
		this.reservacion = reservacion;
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
