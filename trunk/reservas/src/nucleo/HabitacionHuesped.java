package nucleo;

public class HabitacionHuesped implements AccesoaDatos {

	private Huesped huesped;

	private HabitacionOcupada habitacionOcupada;
	
	public Huesped getHuesped() {
		return huesped;
	}


	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}


	public HabitacionOcupada getHabitacionOcupada() {
		return habitacionOcupada;
	}


	public void setHabitacionOcupada(HabitacionOcupada habitacionOcupada) {
		this.habitacionOcupada = habitacionOcupada;
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
