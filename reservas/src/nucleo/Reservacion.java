package nucleo;

public class Reservacion implements AccesoaDatos {

	private int idReservacion;
	
	private String estadoReservacion;

	public static final String CONFIRMADA = "CO";

	public static final String RADICADA = "RA";

	public static final String CANCELADA = "CA";

	private Cliente cliente;

	private Estadia estadia;
	
	public int getIdReservacion() {
		return idReservacion;
	}


	public void setIdReservacion(int idReservacion) {
		this.idReservacion = idReservacion;
	}

	public String getEstadoReservacion() {
		return estadoReservacion;
	}


	public void setEstadoReservacion(String estadoReservacion) {
		this.estadoReservacion = estadoReservacion;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
		String cadena = "INSERT INTO reservacion (k_idreservacion, k_idcliente, k_idestado, k_idestadia) " +
				"VALUES (((SELECT COUNT(k_idreservacion) FROM reservacion) + 1)," +
				cliente.getIdCliente() + ", '" + RADICADA + "', " +
				"(SELECT count(k_idestadia) from ESTADIA) );";
		return cadena;
	}


	/**
	 * @see nucleo.AccesoaDatos#modificarDatos()
	 */
	public String modificarDatos() {
		String cadena = "UPDATE reservacion SET k_idestado = '" + CANCELADA + 
				"' WHERE k_idreservacion = " + getIdReservacion() + ";";
		return cadena;
	}


	/**
	 * @see nucleo.AccesoaDatos#validarDatos()
	 */
	public String validarDatos() {
		String cadena = "SELECT R.k_idreservacion FROM reservacion R, cliente C " +
				"WHERE R.k_idcliente = C.k_idcliente AND " +
				"(C.n_nombrecliente LIKE UPPER('" + cliente.getNombreCliente() + "'));";
		return cadena;
	}


	/**
	 * @see nucleo.AccesoaDatos#consultarDatos()
	 */
	public String consultarDatos(String fecha) {
		String cadena = "SELECT R.k_idreservacion FROM reservacion R, cliente C, estadia E " +
				"WHERE C.n_nombrecliente = UPPER('" + cliente.getNombreCliente() + "') AND C.k_idcliente = R.k_idcliente " +
						"AND E.f_fechainicio = '" + fecha + "' AND E.k_idestadia = R.k_idestadia AND R.k_idestado = '" 
				+ RADICADA + "';";
		return cadena;
	}


	@Override
	public String consultarDatos() {
		String cadena = "SELECT R.k_idreservacion, C.n_nombrecliente FROM reservacion R, cliente C WHERE R.k_idcliente = C.k_idcliente AND (C.n_nombrecliente LIKE UPPER('%"+cliente.getNombreCliente()+"%')) AND R.k_idestado = 'RA';";
		return cadena;
	}

}
