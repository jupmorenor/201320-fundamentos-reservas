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
		String cadena = "INSERT INTO habitacionocupada (k_numerohabitacion, k_consecutivo, k_idestadia)	" +
				"VALUES (" + habitacion.getNumHabitacion() + "," +
						"((SELECT COUNT(k_consecutivo) FROM habitacionocupada WHERE k_numerohabitacion = " + habitacion.getNumHabitacion() + ") + 1)," +
								"(SELECT R.k_idestadia	FROM reservacion R, habitacionreservada HR " +
								"WHERE HR.k_numerohabitacion = " + habitacion.getNumHabitacion() + 
								" AND HR.k_idreservacion = R.k_idreservacion AND R.k_idestado = '" + Reservacion.RADICADA + "' ));";
		return cadena;
	}
	
	public String guardarSinReserva() {
		String cadena = "INSERT INTO habitacionocupada (k_numerohabitacion, k_consecutivo, k_idestadia) " +
				"VALUES (" + habitacion.getNumHabitacion() + ",((SELECT COUNT(k_consecutivo) " +
						"FROM habitacionocupada WHERE k_numerohabitacion = " + habitacion.getNumHabitacion() + 
						") + 1),(SELECT COUNT(k_idestadia) FROM estadia));";
		return cadena;
	}


	/**
	 * @see nucleo.AccesoaDatos#modificarDatos()
	 */
	public String modificarDatos() {
		String cadena = "";
		return cadena;
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
		String cadena = "SELECT COUNT(k_numerohabitacion) FROM habitacionocupada " +
				"WHERE k_numerohabitacion = " + habitacion.getNumHabitacion() + 
				" AND k_consecutivo = (SELECT COUNT(HO.k_consecutivo) FROM estadia E, habitacionocupada HO " +
				"WHERE E.k_idestadia = HO.k_idestadia AND current_date <= (E.f_fechainicio + E.q_nochesestadia));";
		return cadena;
	}

}
