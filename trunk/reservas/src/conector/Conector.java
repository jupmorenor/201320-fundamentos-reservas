package conector;

import java.sql.*;

/**
 * Clase que realiza la conexion con la base de datos
 * @author Adriana Maritza Montejo
 */
public class Conector 
{
	//declaracion de atributos
	private Connection dbConexion;
	private String cadenaSql;

	/**
	 * El constructor de la clase crea la conexion con la base de datos
	 * @param pNombreServidor nombre del servidor
	 * @param pNombreBD nombre de la base de datos
	 * @param pLogin nombre del usuario de postgreSQL
	 * @param pPassword contraseña de ingreso de postgreSQL
	 */
	public Conector(String pNombreServidor, String pNombreBD, String pLogin, String pPassword)
	{
		try 
		{           
			Class.forName("org.postgresql.Driver").newInstance();
		}        
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		try
		{
			String conect = "jdbc:postgresql://"+pNombreServidor+"/"+pNombreBD+"?user="+pLogin+"&password="+pPassword;
			dbConexion = DriverManager.getConnection(conect);
		}      
		catch (SQLException sqlEx) 
		{
			sqlEx.printStackTrace();
		}
	}

	/**
	 * cargar consultas sql
	 * @param cadena comando de la consulta
	 */
	public void SetCadena(String cadena)
	{
		cadenaSql = cadena;
	}

	/**
	 * ejecutar transacciones (insertar, actualizar, eliminar)
	 * @return rta
	 */
	public String EjecutarSql()
	{
		String rta = "";
		try
		{
			Statement stmt = dbConexion.createStatement();
			rta += stmt.executeUpdate(cadenaSql);  			
			//dbConexion.close();

		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		} 
		return rta;
	}

	/**
	 * Ejecutar consultas
	 * @return tabla
	 */
	public ResultSet Consultar()
	{
		ResultSet tabla = null;
		try
		{
			Statement stmt = dbConexion.createStatement();
			tabla = stmt.executeQuery(cadenaSql);			
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		} 
		return tabla;
	}

	/**
	 * cerrar la base de datos despues de las consultas
	 */
	public void CerrarBase()
	{
		try
		{
			dbConexion.close();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		} 
	}
}