package nucleo;

public class Habitacion implements AccesoaDatos {

	private int numHabitacion;

	private int precioNoche;

	private String tipoHabitacion;

	private boolean estadoReserva;

	private final String SIMPLE = "S";

	private final String DOBLE = "D";

	private final String TRIPLE = "T";

	private Reservacion reservacion;
	
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


	/**
	 * @see nucleo.AccesoaDatos#guardarDatos()
	 */
	public String guardarDatos() {
		String cadena = "INSERT INTO habitacion (k_numerohabitacion, k_idtipohabitacion, v_precionoche) " +
				"VALUES (" + getNumHabitacion() + ", '" + getTipoHabitacion() + "', " + getPrecioNoche() + ");";
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
		String cadena = "";
		return cadena;
	}

}
