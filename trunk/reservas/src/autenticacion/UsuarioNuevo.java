package autenticacion;

public class UsuarioNuevo extends Usuario {

	@Override
	public String consultarUsuario() {
		String cadena = "select * from usuarios where(usuario='" + this.getNombre()
				+ "');";
		return cadena;
	}
	
	/**
	 * Comando de MySQL que ingresa un nuevo registro a la base de datos de usuarios
	 * @return cadena
	 */
	@Override
	public String modificarRegistro() {
		String cadena = "insert into usuarios values('"+ this.getNombre() + "','"
				+ this.getPassword() + "','" + this.getTipoUsuario() + "');";
		return cadena;
	}

}
