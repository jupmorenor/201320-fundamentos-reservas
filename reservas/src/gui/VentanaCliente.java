/**
 * 
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Jhamir
 *
 */
public class VentanaCliente extends JFrame implements ActionListener{
	
	public static final String HACER = "Reservar";
	
	public static final String CANCELAR = "Cancelar";
	
	private PanelBusquedaHabitacion panelBusquedaHabitacion;
	
	private PanelBusquedaReserva panelBusquedaReserva;
	
	private PanelHabitacion panelHabitacion;
	
	private PanelHuesped panelHuesped;
	
	private PanelReserva panelReserva;
	
	private JButton btnHacerReserva;
	
	private JButton btnCancelarReserva;

	/**
	 * 
	 */
	public VentanaCliente() {
		super("Sistema de Gestión Hotelera"); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);   
        this.setLocationRelativeTo(null);
        this.setSize(635, 520);
        this.setResizable(false);
        this.setLayout(null);
        
        panelBusquedaHabitacion = new PanelBusquedaHabitacion();
        panelBusquedaHabitacion.setBounds(10, 10, 220, 325);
        
        panelHabitacion = new PanelHabitacion();
        panelHabitacion.setBounds(240, 10, 380, 150);
        
        panelHuesped = new PanelHuesped();
        panelHuesped.setBounds(240, 170, 380, 180);
        
        panelReserva = new PanelReserva();
        panelReserva.setBounds(240, 360, 380, 120);
        
        panelBusquedaReserva = new PanelBusquedaReserva();
        panelBusquedaReserva.setBounds(10, 340, 220, 100);
        
		this.btnHacerReserva = new JButton(HACER);
		this.btnHacerReserva.setActionCommand(HACER);
		this.btnHacerReserva.addActionListener(this);
		this.btnHacerReserva.setBounds(10, 445, 105, 30);
		
		this.btnCancelarReserva = new JButton(CANCELAR);
		this.btnCancelarReserva.setActionCommand(CANCELAR);
		this.btnCancelarReserva.addActionListener(this);
		this.btnCancelarReserva.setBounds(120, 445, 105, 30);
                
        this.add(panelBusquedaHabitacion); 
        this.add(panelHabitacion);
        this.add(panelHuesped);
        this.add(panelReserva);
        this.add(panelBusquedaReserva);
        this.add(btnHacerReserva);
		this.add(btnCancelarReserva);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new VentanaCliente().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
