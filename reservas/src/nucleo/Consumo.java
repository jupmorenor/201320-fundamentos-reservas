package nucleo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Consumo implements AccesoaDatos {

	private int cantidad;

	private Date fechaConsumo;

	private Servicio servicio;

	private HabitacionOcupada habitacionOcupada;
	
	private SimpleDateFormat formato = new SimpleDateFormat("dd-mm-yyyy");

	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public String getFechaConsumo() {
		String fecha = "";
		if(fechaConsumo!=null) {
			fecha = this.formato.format(fechaConsumo);
		}
		return fecha;
	}


	public void setFechaConsumo(String fechaConsumo) {
		try {
			this.fechaConsumo = this.formato.parse(fechaConsumo);
		} catch(Exception pE) {
			this.fechaConsumo = null;
		}
	}


	public Servicio getServicio() {
		return servicio;
	}


	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
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
