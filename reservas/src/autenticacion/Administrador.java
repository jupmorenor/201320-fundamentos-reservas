package autenticacion;

public class Administrador extends Usuario{

	@Override
	public String consultarUsuario() {
		String cadena = "Select * from usuarios";
		return cadena;
	}

	@Override
	public String modificarRegistro() {
		String cadena = "Delete from usuarios where(usuario='" + this.getNombre() +"');";
		return cadena;
	}
	
}
