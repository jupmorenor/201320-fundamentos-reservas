/**
 * 
 */
package gui;

import javax.swing.JFrame;


/**
 * @author Jhamir
 *
 */
public class VentanaAdministrador extends JFrame{
	
	private PanelServicios1 panelServicios1;
	
	private PanelServicios2 panelServicios2;
	
	private PanelBusquedaHabitacion panelBusquedaHabitacion;
	
	private PanelBusquedaReserva panelBusquedaReserva;
	
	private PanelHabitacion panelHabitacion;
	
	private PanelHuesped panelHuesped;
	
	private PanelReserva panelReserva;	
	
	private PanelConsumo panelConsumo;
	
	private PanelCancelar panelCancelar;
	
	private PanelMenu panelMenu;
	
	private VentanaSecundaria ventanaSecundaria;
	
	/**
	 * 
	 */
	public VentanaAdministrador() {
		super("Sistema de Gestión Hotelera"); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        this.setLocationRelativeTo(null);
        this.setSize(635, 510);
        this.setResizable(false);
        this.setLayout(null);        
        
        ventanaSecundaria = new VentanaSecundaria();
        
        panelBusquedaHabitacion = new PanelBusquedaHabitacion();
        panelBusquedaHabitacion.setBounds(10, 10, 220, 400);
        
        panelHabitacion = new PanelHabitacion();
        panelHabitacion.setBounds(240, 70, 380, 180);
        
        panelHuesped = new PanelHuesped();
        panelHuesped.setBounds(240, 70, 380, 180);
        
        panelReserva = new PanelReserva();
        panelReserva.setBounds(240, 70, 380, 180);
        
        panelServicios1 = new PanelServicios1(this);
        panelServicios1.setBounds(240, 10, 380, 50);
        
        panelServicios2 = new PanelServicios2(this);
        panelServicios2.setBounds(10, 420, 610, 50);
        
        panelMenu = new PanelMenu(this);
        panelMenu.setBounds(240, 250, 380, 30); 
        
        panelBusquedaReserva = new PanelBusquedaReserva();
        panelBusquedaReserva.setBounds(240, 310, 220, 100);
                     
        this.eVerHabitacion();
        
        this.add(panelBusquedaHabitacion); 
        this.add(panelHabitacion);
        this.add(panelHuesped);
        this.add(panelReserva);
        this.add(panelServicios1);
        this.add(panelServicios2);
        this.add(panelMenu);
        this.add(panelBusquedaReserva);
	}
	
	public void eHacerReserva(){
		
	}
	
	public void eCancelarReserva(){
		PanelCancelar panelCancelar = new PanelCancelar();
		ventanaSecundaria.setPanel(panelCancelar);
		ventanaSecundaria.setTitulo("Cancelar Reserva");
		ventanaSecundaria.setVisible(true);
	}
	
	public void eCheckIn(){ 
		PanelHuesped panelHuesped = new PanelHuesped();
		ventanaSecundaria.setPanel(panelHuesped);
		ventanaSecundaria.setTitulo("Hacer Check - In");
		ventanaSecundaria.setVisible(true);
	}
	
	public void eCheckOut(){
		
	}
	
	public void eRegistrarConsumo(){
		PanelConsumo panelConsumo = new PanelConsumo();
		ventanaSecundaria.setPanel(panelConsumo);
		ventanaSecundaria.setTitulo("Registrar Consumo");
		ventanaSecundaria.setVisible(true);
	}
	
	public void eCrearHabitacion(){
		PanelHabitacion panelHabitacion = new PanelHabitacion();
		ventanaSecundaria.setPanel(panelHabitacion);
		ventanaSecundaria.setTitulo("Crear Habitación");
		ventanaSecundaria.setVisible(true);
	}
	
	public void eVerHabitacion(){
		this.panelHabitacion.setVisible(true);
		this.panelHuesped.setVisible(false);
		this.panelReserva.setVisible(false);
	}
	
	public void eVerHuesped(){
		this.panelHabitacion.setVisible(false);
		this.panelHuesped.setVisible(true);
		this.panelReserva.setVisible(false);
	}
	
	public void eVerReserva(){
		this.panelHabitacion.setVisible(false);
		this.panelHuesped.setVisible(false);
		this.panelReserva.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VentanaAdministrador principal = new VentanaAdministrador();
		principal.setVisible(true);
	}

}
