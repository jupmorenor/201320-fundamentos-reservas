package nucleo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Recaudo implements AccesoaDatos {

	private int idRecaudo;

	private int valorRecaudo;

	private String descripcion;

	private Date fechaPago;

	private HabitacionOcupada habitacionOcupada;
	
	private SimpleDateFormat formato = new SimpleDateFormat("dd-mm-yyyy");
	
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


	public String getFechaPago() {
		String fecha = "";
		if(fechaPago!=null) {
			fecha = this.formato.format(fechaPago);
		}
		return fecha;
	}


	public void setFechaPago(String fechaPago) {
		try {
			this.fechaPago = this.formato.parse(fechaPago);
		} catch(Exception pE) {
			this.fechaPago = null;
		}
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
