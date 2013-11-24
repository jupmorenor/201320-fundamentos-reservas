package Negocio;

import java.util.Date;

public class Recaudo implements AccesoaDatos {

	private int idRecaudo;

	private int valorRecaudo;

	private String descripcion;

	private Date fechaPago;

	private Hospedaje hospedaje;

	public int getIdRecaudo() {
		return idRecaudo;
	}

	public void setIdRecaudo(int idRecaudo) {
		this.idRecaudo = idRecaudo;
	}

	public int getValorRecaudo() {
		return valorRecaudo;
	}

	public void setValorRecaudo(int valorRecaudo) {
		this.valorRecaudo = valorRecaudo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
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
