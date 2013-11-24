/**
 * 
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelServicios extends JPanel implements ActionListener{
	
	private VentanaPrincipal ventanaPrincipal;
	
	public static final String HACER = "Hacer Reserva";
	
	public static final String ELIMINAR = "Eliminar Reserva";
	
	public static final String CHECKIN = "Hacer Check-In";
	
	public static final String CHECKOUT = "Hacer Check-Out";
	
	public static final String CONSUMO = "Registrar Consumo";
	
	private JButton btnHacerReserva;
	
	private JButton btnEliminarReserva;
	
	private JButton btnCheckIn;
	
	private JButton btnCheckOut;
	
	private JButton btnConsumo;

	/**
	 * 
	 */
	public PanelServicios(VentanaPrincipal ventanaPrincipal) {
		this.setBorder(new TitledBorder(""));
		this.setLayout(null);	
		
		this.ventanaPrincipal = ventanaPrincipal;
		
		this.btnHacerReserva = new JButton(HACER);
		this.btnHacerReserva.setActionCommand(HACER);
		this.btnHacerReserva.addActionListener(this);
		this.btnHacerReserva.setBounds(10, 10, 140, 30);
		
		this.btnEliminarReserva = new JButton(ELIMINAR);
		this.btnEliminarReserva.setActionCommand(ELIMINAR);
		this.btnEliminarReserva.addActionListener(this);
		this.btnEliminarReserva.setBounds(160, 10, 140, 30);
		
		this.btnCheckIn = new JButton(CHECKIN);
		this.btnCheckIn.setActionCommand(CHECKIN);
		this.btnCheckIn.addActionListener(this);
		this.btnCheckIn.setBounds(310, 10, 140, 30);
		
		this.btnCheckOut = new JButton(CHECKOUT);
		this.btnCheckOut.setActionCommand(CHECKOUT);
		this.btnCheckOut.addActionListener(this);
		this.btnCheckOut.setBounds(460, 10, 140, 30);
		
		this.btnConsumo = new JButton(CONSUMO);
		this.btnConsumo.setActionCommand(CONSUMO);
		this.btnConsumo.addActionListener(this);
		this.btnConsumo.setBounds(610, 10, 140, 30);
		
		this.add(btnHacerReserva);
		this.add(btnEliminarReserva);
		this.add(btnCheckIn);
		this.add(btnCheckOut);
		this.add(btnConsumo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
