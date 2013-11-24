package Negocio;

public class Huesped {
	
	
	//Atributos
	
	private String nombre;
    private int edad;
    private String direccion;
    private int telefono;
    public int id;
    
    
    //Constructor
    public void inicializar( String hNombre, int hId, int hEdad, String hDireccion, int hTelefono)
    {
        nombre = hNombre;
        id= hId;
        edad = hEdad;
        direccion = hDireccion;
        telefono = hTelefono;
    }

  
    //Metodos
    public String darNombre( )
    {
        return nombre;
    }
    
     public int darId( )
    {
        return id;
    }
    

    public int darEdad( )
    {
        return edad;
    }

    public String darDireccion( )
    {
        return direccion;
    }
    
    public int darTelefono( )
    {
        return telefono;
    }
    
}
