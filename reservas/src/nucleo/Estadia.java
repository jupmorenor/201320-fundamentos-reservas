package nucleo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Estadia implements AccesoaDatos {

	private int idEstadia;

	private Date fechaInicio;

	private int nochesEstadia;
	
	private SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");

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
		String cadena = "INSERT INTO estadia (k_idestadia, f_fechainicio, q_nochesestadia) " +
				"VALUES (((SELECT COUNT(k_idestadia) FROM estadia) + 1), '" + getFechaInicio() + 
				"', " + getNochesEstadia() + ");";
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
		return null;
	}

}
