package autenticacion;

public class UsuarioExistente  extends Usuario{
	
	@Override
	public String consultarUsuario() {
		String cadena = "select * from usuarios where(usuario='" 
				+ this.getNombre() + "' and password='" + this.getPassword() + "');";
		return cadena;
	}

	@Override
	public String modificarRegistro() {
		String cadena = "update usuarios set password='" + this.getPassword() 
				+ "' where(nombre='" + this.getNombre() + "');";
		return cadena;
	}
	
}
