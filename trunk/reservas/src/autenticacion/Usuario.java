package autenticacion;

public abstract class Usuario {
	
	/**
	 * Nombre ingresado por el usuario
	 */
	protected int idUsuario;
	
	/**
	 * Contraseña del usuario
	 */
	protected String password;
	
	/**
	 * Indica el tipo de usuario
	 */
	protected int tipoUsuario;
	
	/**
	 * Devuelve el nombre del usuario
	 * @return nombre del usuario
	 */
	public int getIdusuario() {
		return idUsuario;
	}

	/**
	 * Establece el nombre del usuario
	 * @param usuario nombre del usuario
	 */
	public void setIdusuario(int usuario) {
		this.idUsuario = usuario;
	}

	/**
	 * Devuelve la contraseña del usuario
	 * @return contraseña del usuario
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Establece la contraseña del usuario
	 * @param password contraseña del usuario
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Devuelve el tipo de usuario
	 * @return tipo de usuario
	 */
	public int getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * Establece el tipo de usuario
	 * @param tipoUsuario tipo de usuario
	 */
	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	/**
	 * Comando de MySQL que verifica que el usuario se encuentre registrado en la BD
	 * @return cadena de texto
	 */
	public abstract String consultarUsuario();
	
	/**
	 * Comando de MySQL que modifica un registro en la base de datos
	 * @return cadena de texto
	 */
	public abstract String modificarRegistro();
	
}
