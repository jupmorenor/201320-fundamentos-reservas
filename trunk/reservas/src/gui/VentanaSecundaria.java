/**
 * 
 */
package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import nucleo.Habitacion;

import conector.AdminConexion;
import conector.Conector;

/**
 * @author Jhamir
 *
 */
public class VentanaSecundaria extends JFrame{
	
	private PanelOpciones panelOpciones;
	
	private JPanel panelPrincipal;
	
	private Conector conexion;
	/**
	 * 
	 */
	public VentanaSecundaria() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        this.setLocationRelativeTo(null);
        this.setSize(405, 290);
        this.setResizable(false);
        this.setLayout(null); 
        
        panelPrincipal = new JPanel();
                        
        panelOpciones = new PanelOpciones(this);
        panelOpciones.setBounds(10, 200, 380, 50);
        
        this.add(panelOpciones);
        
	}
	
	/**
	 * establce el panel que se va a mostrar en la Ventana Secundaria
	 * @param panelPrincipal
	 */
	public void setPanel(JPanel panelPrincipal){
		this.remove(this.panelPrincipal);
		this.panelPrincipal = panelPrincipal;
        this.panelPrincipal.setBounds(10, 10, 380, 180);
        this.add(this.panelPrincipal);
	}
	
	/**
	 * establece el titulo del de la Ventana Secundaria
	 * @param titulo
	 */
	public void setTitulo(String titulo){
		this.setTitle(titulo);
	}
	
	/**
	 * define las acciones que se deben llevar a cabo para dar respuesta al evento del boton aceptar del panel de opciones...
	 */
	public void eAceptar(){
		switch (panelPrincipal.getName()) {
		
		//Define lo que ocurre cuando se la da aceptar a la ventana secundaria hacer reserva
		case "panel_hacer_reserva":
			PanelHacerReserva panelHacerReserva = (PanelHacerReserva) panelPrincipal;
			//TODO pasos para hacer una reserva			
			JOptionPane.showMessageDialog(null, "Ejemplo Prueba: Reserva Hecha Dias: " + panelHacerReserva.getDias());
			break;
			
		//Define lo que ocurre cuando se la da aceptar a la ventana secundaria cancelar reserva
		case "panel_cancelar":
			PanelCancelar panelCancelar = (PanelCancelar) panelPrincipal;
			//TODO pasos para cancelar una reserva
			JOptionPane.showMessageDialog(null, "Ejemplo Prueba: Reserva Cancelada Nombre: " + panelCancelar.getNombre() );
			break;
			
		//Define lo que ocurre cuando se la da aceptar a la ventana secundaria hacer check in
		case "panel_huesped":
			PanelHuesped panelHuesped = (PanelHuesped) panelPrincipal;
			//TODO pasos para hacer un check in
			JOptionPane.showMessageDialog(null, "Ejemplo Prueba: CheckIn Hecho Identi: " + panelHuesped.getId());
			break;
			
		//Define lo que ocurre cuando se la da aceptar a la ventana secundaria hacer check out	
		case "tabla_consumos":
			TablaConsumos tablaConsumos = (TablaConsumos) panelPrincipal;
			//TODO pasos para hacer un check out
			JOptionPane.showMessageDialog(null, "Ejemplo Prueba: CheckOut Hecho Recaudo: " + tablaConsumos.getTotal());
			break;
			
		//Define lo que ocurre cuando se la da aceptar a la ventana secundaria crear habitacion
		case "panel_habitacion":
			PanelHabitacion panelHabitacion = (PanelHabitacion) panelPrincipal;
			conexion = new AdminConexion("datos2.jaa").generarConexion();
			Habitacion hab = new Habitacion();
			hab.setNumHabitacion(panelHabitacion.getNumero());
			hab.setTipoHabitacion(panelHabitacion.getTipo());
			JOptionPane.showMessageDialog(null, "Ejemplo Prueba: Habitacion Creada Numero: " + panelHabitacion.getNumero());
			break;
		
			//Define lo que ocurre cuando se la da aceptar a la ventana secundaria registrar consumo
		case "panel_consumo":
			PanelConsumo panelConsumo = (PanelConsumo) panelPrincipal;
			//TODO pasos para registrar un consumo
			JOptionPane.showMessageDialog(null, "Ejemplo Prueba: Consumo Registrado Nombre: " + panelConsumo.getNombre());
			break;
		
		}
		this.dispose();
	}

}
