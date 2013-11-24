/**
 * 
 */
package gui;

import javax.swing.JFrame;


/**
 * @author Jhamir
 *
 */
public class VentanaPrincipal extends JFrame{
	
	private PanelServicios panelServicios;
	
	private PanelBusqueda panelBusqueda;
	
	private PanelHabitacion panelHabitacion;
	
	private PanelHuesped panelHuesped;
	
	private PanelReserva panelReserva;	
	
	/**
	 * 
	 */
	public VentanaPrincipal() {
		super("Sistema de Gestión Hotelera"); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);        
        this.setSize(785, 380);
        this.setResizable(false);
        this.setLayout(null);        
        
        panelBusqueda = new PanelBusqueda();
        panelBusqueda.setBounds(10, 10, 760, 75);
        
        panelHabitacion = new PanelHabitacion();
        panelHabitacion.setBounds(10, 100, 246, 180);
        
        panelHuesped = new PanelHuesped();
        panelHuesped.setBounds(268, 100, 246, 180);
        
        panelReserva = new PanelReserva();
        panelReserva.setBounds(525, 100, 246, 180);
        
        panelServicios = new PanelServicios(this);
        panelServicios.setBounds(10, 290, 760, 50);
        
        this.add(panelBusqueda); 
        this.add(panelHabitacion);
        this.add(panelHuesped);
        this.add(panelReserva);
        this.add(panelServicios);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VentanaPrincipal principal = new VentanaPrincipal();
		principal.setVisible(true);
	}

}
