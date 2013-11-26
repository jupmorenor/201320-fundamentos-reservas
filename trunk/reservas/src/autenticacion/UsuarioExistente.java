package autenticacion;

public class UsuarioExistente  extends Usuario{
	
	@Override
	public String consultarUsuario() {
		String cadena = "select k_idusuario, k_passusuario, o_descripcion from usuarios where(k_idusuario='" 
				+ this.getIdusuario() + "' and k_passusuario='" + this.getPassword() + "' and k_tipousuario=k_idtipousuario);";
		return cadena;
	}

	@Override
	public String modificarRegistro() {
		String cadena = "update usuario set k_passusuario='" + this.getPassword() 
				+ "' where(k_idusuario=" + this.getIdusuario() + ");";
		return cadena;
	}
	
}
