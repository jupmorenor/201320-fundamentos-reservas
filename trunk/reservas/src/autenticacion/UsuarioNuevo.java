package autenticacion;

public class UsuarioNuevo extends Usuario {

	@Override
	public String consultarUsuario() {
		String cadena = "select * from usuario where(k_idusuario='" + this.getIdusuario() +");";
		return cadena;
	}
	
	@Override
	public String modificarRegistro() {
		String cadena = "insert into usuario values("+ this.getIdusuario() + ",'"
				+ this.getPassword() + "'," + this.getTipoUsuario() + ");";
		return cadena;
	}

}
