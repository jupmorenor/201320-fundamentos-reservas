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
	
	private VentanaAdministrador ventanaAdministrador;
	
	public static final String HACER = "Hacer Reserva";
	
	public static final String CANCELAR = "Cancelar Reserva";
	
	public static final String CHECKIN = "Hacer Check-In";
	
	public static final String CHECKOUT = "Hacer Check-Out";

	private JButton btnHacerReserva;
	
	private JButton btnCancelarReserva;
	
	private JButton btnCheckIn;
	
	private JButton btnCheckOut;

	/**
	 * en este panel estan los botones que manejan los servicios de hacer reserva, cancelar reserva, hacer checkin y hacercheckout
	 */
	public PanelServicios2(VentanaAdministrador ventanaAdministrador) {
		this.setBorder(new TitledBorder(""));
		this.setLayout(null);	
		
		this.ventanaAdministrador = ventanaAdministrador;
		
		this.btnHacerReserva = new JButton(HACER);
		this.btnHacerReserva.setActionCommand(HACER);
		this.btnHacerReserva.addActionListener(this);
		this.btnHacerReserva.setBounds(10, 10, 140, 30);
		
		this.btnCancelarReserva = new JButton(CANCELAR);
		this.btnCancelarReserva.setActionCommand(CANCELAR);
		this.btnCancelarReserva.addActionListener(this);
		this.btnCancelarReserva.setBounds(160, 10, 140, 30);
		
		this.btnCheckIn = new JButton(CHECKIN);
		this.btnCheckIn.setActionCommand(CHECKIN);
		this.btnCheckIn.addActionListener(this);
		this.btnCheckIn.setBounds(310, 10, 140, 30);
		
		this.btnCheckOut = new JButton(CHECKOUT);
		this.btnCheckOut.setActionCommand(CHECKOUT);
		this.btnCheckOut.addActionListener(this);
		this.btnCheckOut.setBounds(460, 10, 140, 30);
		
		this.add(btnHacerReserva);
		this.add(btnCancelarReserva);
		this.add(btnCheckIn);
		this.add(btnCheckOut);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case HACER:
			ventanaAdministrador.eHacerReserva();
			break;
		case CANCELAR:
			ventanaAdministrador.eCancelarReserva();
			break;
		case CHECKIN:
			ventanaAdministrador.eCheckIn();
			break;
		case CHECKOUT:
			ventanaAdministrador.eCheckOut();
			break;
		}	
	}
}
