package conector;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class AdminConexion {
	
	private BufferedReader acceso;
	private ArrayList<String> datos;
	private Conector conexion;
	private String linea;

	public AdminConexion(String archivo) {
		try {
			acceso = new BufferedReader(new FileReader("./data/" + archivo));
		} catch(Exception ex) {
			acceso = null;
		}
	}
	
	public Conector generarConexion() {
		if (acceso!=null) {
			try {
				datos = new ArrayList<String>();
				
				while((linea = acceso.readLine())!=null) {
					datos.add(linea);
				}
				acceso.close();
				conexion = new Conector(datos.get(0), datos.get(1), datos.get(2), datos.get(3));
			} catch (Exception e) {
				conexion = null;
			}
		} else {
			conexion = null;
		}
		return conexion;
	}

}
