package nucleo;

public class HabitacionOcupada implements AccesoaDatos {

	private int consecutivo;

	private int totalConsumo;

	private Habitacion habitacion;

	private Estadia estadia;

	public int getConsecutivo() {
		return consecutivo;
	}


	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}


	public int getTotalConsumo() {
		return totalConsumo;
	}


	public void setTotalConsumo(int totalConsumo) {
		this.totalConsumo = totalConsumo;
	}


	public Habitacion getHabitacion() {
		return habitacion;
	}


	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
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
