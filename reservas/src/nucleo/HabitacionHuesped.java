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
		String cadena = "INSERT INTO habitacionocupadahuesped (k_numerohabitacion, k_consecutivo, k_identificacion) " +
				"VALUES (" + habitacionOcupada.getHabitacion().getNumHabitacion() + 
				",(SELECT COUNT(k_consecutivo) FROM habitacionocupada WHERE k_numerohabitacion = " + habitacionOcupada.getHabitacion().getNumHabitacion() +
				"),(SELECT H.k_identificacion FROM huesped H, habitacionocupadahuesped HOH, habitacionocupada HO, estadia E " +
				"WHERE H.k_identificacion = " + huesped.getIdHuesped() + " AND H.k_identificacion = HOH.k_identificacion " +
						"AND HO.k_numerohabitacion = HOH.k_numerohabitacion AND HO.k_idestadia = E.k_idestadia AND current_date > (E.f_fechainicio + E.q_nochesestadia)));";
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
		String cadena = "SELECT distinct HAB.k_numerohabitacion FROM habitacion HAB, habitacionocupada HO, " +
				"habitacionocupadahuesped HOHU, huesped HU, estadia E WHERE HU.n_nombre = UPPER('" + huesped.getNombreHuesped() + "') " +
						"AND HU.k_identificacion = HOHU.k_identificacion AND HOHU.k_numerohabitacion = HO.k_numerohabitacion " +
						"AND HOHU.k_consecutivo = (SELECT MAX(HO.k_consecutivo) FROM estadia E, habitacionocupada HO " +
						"WHERE E.k_idestadia = HO.k_idestadia AND current_date <= (E.f_fechainicio + E.q_nochesestadia)) " +
						"AND HOHU.k_consecutivo = HO.k_consecutivo AND HO.k_numerohabitacion = HAB.k_numerohabitacion;";
		return cadena;
	}

}
