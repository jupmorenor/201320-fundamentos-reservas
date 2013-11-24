package Negocio;

import java.util.Date;

public class Reservacion implements AccesoaDatos {

	private int idReservacion;

	private int diasReservados;

	private Date fechaInicio;

	private Habitacion habitacion;

	private Cliente cliente;
	
	public int getIdReservacion() {
		return idReservacion;
	}

	public void setIdReservacion(int idReservacion) {
		this.idReservacion = idReservacion;
	}

	public int getDiasReservados() {
		return diasReservados;
	}

	public void setDiasReservados(int diasReservados) {
		this.diasReservados = diasReservados;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
