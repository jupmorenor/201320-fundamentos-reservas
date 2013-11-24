package Negocio;

public class Hospedaje implements AccesoaDatos {

	private int idHospedaje;

	private int totalConsumos;

	private int nochesEstadia;

	private Habitacion habitacion;

	private Servicio servicio;

	private Huesped huesped;

	private Recaudo recaudo;
	
	public int getIdHospedaje() {
		return idHospedaje;
	}

	public void setIdHospedaje(int idHospedaje) {
		this.idHospedaje = idHospedaje;
	}

	public int getTotalConsumos() {
		return totalConsumos;
	}

	public void setTotalConsumos(int totalConsumos) {
		this.totalConsumos = totalConsumos;
	}

	public int getNochesEstadia() {
		return nochesEstadia;
	}

	public void setNochesEstadia(int nochesEstadia) {
		this.nochesEstadia = nochesEstadia;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Huesped getHuesped() {
		return huesped;
	}

	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}

	public Recaudo getRecaudo() {
		return recaudo;
	}

	public void setRecaudo(Recaudo recaudo) {
		this.recaudo = recaudo;
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
