/**
 * 
 */
package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * @author Jhamir
 *
 */
public class PanelMenu extends JPanel implements ActionListener{
	
	private VentanaAdministrador ventanaAdministrador;
	
	public static final String HABITACION = "HABITACIÓN";
	
	public static final String HUESPED = "HUESPED";
	
	public static final String RESERVA = "RESERVA";
	
	private JButton btnHabitacion;
	
	private JButton btnHuesped;
	
	private JButton btnReserva;

	/**
	 * 
	 */
	public PanelMenu(VentanaAdministrador ventanaAdministrador) {
		this.setBorder(new TitledBorder(""));
		this.setLayout(new GridLayout(1, 3));	
		
		this.ventanaAdministrador = ventanaAdministrador;
		
		this.btnHabitacion = new JButton(HABITACION);
		this.btnHabitacion.setActionCommand(HABITACION);
		this.btnHabitacion.addActionListener(this);
		
		this.btnHuesped = new JButton(HUESPED);
		this.btnHuesped.setActionCommand(HUESPED);
		this.btnHuesped.addActionListener(this);
		
		this.btnReserva = new JButton(RESERVA);
		this.btnReserva.setActionCommand(RESERVA);
		this.btnReserva.addActionListener(this);
		
		this.add(btnHabitacion);
		this.add(btnHuesped);
		this.add(btnReserva);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case HABITACION:
			ventanaAdministrador.eVerHabitacion();
			break;
		case HUESPED:
			ventanaAdministrador.eVerHuesped();
			break;
		case RESERVA:
			ventanaAdministrador.eVerReserva();
			break;
		}
	}
}
