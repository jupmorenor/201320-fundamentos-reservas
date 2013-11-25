/**
 * 
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelServicios2 extends JPanel implements ActionListener{
	
	private VentanaPrincipal ventanaPrincipal;
	
	public static final String HACER = "Hacer Reserva";
	
	public static final String CANCELAR = "Cancelar Reserva";
	
	public static final String CHECKIN = "Hacer Check-In";
	
	public static final String CHECKOUT = "Hacer Check-Out";
	
	private JButton btnHacerReserva;
	
	private JButton btnEliminarReserva;
	
	private JButton btnCheckIn;
	
	private JButton btnCheckOut;

	/**
	 * 
	 */
	public PanelServicios2(VentanaPrincipal ventanaPrincipal) {
		this.setBorder(new TitledBorder(""));
		this.setLayout(null);	
		
		this.ventanaPrincipal = ventanaPrincipal;
		
		this.btnHacerReserva = new JButton(HACER);
		this.btnHacerReserva.setActionCommand(HACER);
		this.btnHacerReserva.addActionListener(this);
		this.btnHacerReserva.setBounds(10, 10, 140, 30);
		
		this.btnEliminarReserva = new JButton(CANCELAR);
		this.btnEliminarReserva.setActionCommand(CANCELAR);
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
		
		this.add(btnHacerReserva);
		this.add(btnEliminarReserva);
		this.add(btnCheckIn);
		this.add(btnCheckOut);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(HACER)){
			ventanaPrincipal.eHacerReserva();
		}
		if(e.getActionCommand().equals(CANCELAR)){
			ventanaPrincipal.eCancelarReserva();
		}
		if(e.getActionCommand().equals(CHECKIN)){
			ventanaPrincipal.eCheckIn();
		}
		if(e.getActionCommand().equals(CHECKOUT)){
			ventanaPrincipal.eCheckOut();
		}
		
	}

}
