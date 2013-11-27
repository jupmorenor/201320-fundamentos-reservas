package nucleo;

public interface AccesoaDatos {

	/**
	 * Retorna una cadena SQL que realiza la insercion de datos en la BD
	 * @return cadena
	 */
	public abstract String guardarDatos();

	/**
	 * Retorna una cadena SQL que realiza la modificacion de datos en la BD
	 * @return
	 */
	public abstract String modificarDatos();

	/**
	 * Retorna una cadena SQL que realiza la eliminacion de datos en la BD
	 * @return
	 */
	public abstract String eliminarDatos();

	/**
	 * Retorna una cadena SQL que realiza la consulta de datos en la BD
	 * @return
	 */
	public abstract String consultarDatos();

}
