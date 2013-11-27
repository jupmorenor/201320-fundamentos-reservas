/**
 * 
 */
package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Jhamir
 *
 */
public class VentanaSecundaria extends JFrame{
	
	private PanelOpciones panelOpciones;
	
	private JPanel panelPrincipal;
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
		//Define lo que ocurre cuando se la da aceptar a la ventana secundaria hacer reserva
		if(panelPrincipal.getName().equals("panel_hacer_reserva")){	
			PanelHacerReserva panelHacerReserva = (PanelHacerReserva) panelPrincipal;
			//TODO pasos para hacer una reserva			
			JOptionPane.showMessageDialog(null, "Ejemplo Prueba: Reserva Hecha Dias: " + panelHacerReserva.getDias());
		}
		
		//Define lo que ocurre cuando se la da aceptar a la ventana secundaria cancelar reserva
		if(panelPrincipal.getName().equals("panel_cancelar")){
			PanelCancelar panelCancelar = (PanelCancelar) panelPrincipal;
			//TODO pasos para cancelar una reserva
			JOptionPane.showMessageDialog(null, "Ejemplo Prueba: Reserva Cancelada Nombre: " + panelCancelar.getNombre() );
		}
		
		//Define lo que ocurre cuando se la da aceptar a la ventana secundaria hacer check in
		if(panelPrincipal.getName().equals("panel_huesped")){
			PanelHuesped panelHuesped = (PanelHuesped) panelPrincipal;
			//TODO pasos para hacer un check in
			JOptionPane.showMessageDialog(null, "Ejemplo Prueba: CheckIn Hecho Identi: " + panelHuesped.getId());
		}
		
		//Define lo que ocurre cuando se la da aceptar a la ventana secundaria hacer check out
		if(panelPrincipal.getName().equals("tabla_consumos")){
			TablaConsumos tablaConsumos = (TablaConsumos) panelPrincipal;
			//TODO pasos para hacer un check out
			JOptionPane.showMessageDialog(null, "Ejemplo Prueba: CheckOut Hecho Recaudo: " + tablaConsumos.getTotal());
		}
		
		//Define lo que ocurre cuando se la da aceptar a la ventana secundaria crear habitacion
		if(panelPrincipal.getName().equals("panel_habitacion")){
			PanelHabitacion panelHabitacion = (PanelHabitacion) panelPrincipal;
			//TODO pasos para crear una habitacion
			JOptionPane.showMessageDialog(null, "Ejemplo Prueba: Habitacion Creada Numero: " + panelHabitacion.getNumero());
		}
		
		//Define lo que ocurre cuando se la da aceptar a la ventana secundaria registrar consumo
		if(panelPrincipal.getName().equals("panel_consumo")){
			PanelConsumo panelConsumo = (PanelConsumo) panelPrincipal;
			//TODO pasos para registrar un consumo
			JOptionPane.showMessageDialog(null, "Ejemplo Prueba: Consumo Registrado Nombre: " + panelConsumo.getNombre());
		}
		this.dispose();
	}

}
