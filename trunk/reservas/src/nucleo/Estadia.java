package nucleo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Estadia implements AccesoaDatos {

	private int idEstadia;

	private Date fechaInicio;

	private int nochesEstadia;
	
	private SimpleDateFormat formato = new SimpleDateFormat("dd-mm-yyyy");

	public int getIdEstadia() {
		return idEstadia;
	}


	public void setIdEstadia(int idEstadia) {
		this.idEstadia = idEstadia;
	}


	public String getFechaInicio() {
		String fecha = "";
		if(fechaInicio!=null) {
			fecha = this.formato.format(fechaInicio);
		}
		return fecha;
	}


	public void setFechaInicio(String fechaInicio) {
		try {
			this.fechaInicio = this.formato.parse(fechaInicio);
		} catch(Exception pE) {
			this.fechaInicio = null;
		}
	}


	public int getNochesEstadia() {
		return nochesEstadia;
	}


	public void setNochesEstadia(int nochesEstadia) {
		this.nochesEstadia = nochesEstadia;
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
