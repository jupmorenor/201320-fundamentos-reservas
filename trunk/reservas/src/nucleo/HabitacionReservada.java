package nucleo;

public class HabitacionReservada implements AccesoaDatos {

	private Reservacion reservacion;

	private Habitacion habitacion;
	
	public Reservacion getReservacion() {
		return reservacion;
	}


	public void setReservacion(Reservacion reservacion) {
		this.reservacion = reservacion;
	}


	public Habitacion getHabitacion() {
		return habitacion;
	}


	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}


	/**
	 * @see nucleo.AccesoaDatos#guardarDatos()
	 */
	public String guardarDatos() {
		String cadena = "INSERT INTO habitacionreservada (k_idreservacion, k_numerohabitacion) " +
				"VALUES ((select count(k_idreservacion) from reservacion)," + habitacion.getNumHabitacion() + ");";
		return cadena;
	}


	/**
	 * @see nucleo.AccesoaDatos#modificarDatos()
	 */
	public String modificarDatos() {
		String cadena = "UPDATE reservacion SET k_idestado = '" + Reservacion.CONFIRMADA + "' " +
				"WHERE k_idreservacion = (SELECT HR.k_idreservacion FROM habitacionreservada HR, reservacion R " +
				"WHERE HR.k_numerohabitacion = " + habitacion.getNumHabitacion() + " AND R.k_idreservacion = HR.k_idreservacion " +
						"AND R.k_idestado = '" + Reservacion.RADICADA + "' );";
		return cadena;
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
		String cadena = "SELECT COUNT(HR.k_numerohabitacion) FROM habitacionreservada HR, reservacion R " +
				"WHERE HR.k_numerohabitacion = " + habitacion.getNumHabitacion() + " AND R.k_idreservacion = HR.k_idreservacion " +
						"AND (R.k_idestado = '" + Reservacion.RADICADA + "' OR R.k_idestado = '" + Reservacion.CONFIRMADA + "');";
		return cadena;
	}

}
