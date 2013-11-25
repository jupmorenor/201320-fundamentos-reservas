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
	
	private VentanaPrincipal ventanaPrincipal;
	
	public static final String HABITACION = "HABITACIÓN";
	
	public static final String HUESPED = "HUESPED";
	
	public static final String RESERVA = "RESERVA";
	
	private JButton btnHabitacion;
	
	private JButton btnHuesped;
	
	private JButton btnReserva;

	/**
	 * 
	 */
	public PanelMenu(VentanaPrincipal ventanaPrincipal) {
		this.setBorder(new TitledBorder(""));
		this.setLayout(new GridLayout(1, 3));	
		
		this.ventanaPrincipal = ventanaPrincipal;
		
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
		if(e.getActionCommand().equals(HABITACION)){
			ventanaPrincipal.eVerHabitacion();
		}
		if(e.getActionCommand().equals(HUESPED)){
			ventanaPrincipal.eVerHuesped();
		}
		if(e.getActionCommand().equals(RESERVA)){
			ventanaPrincipal.eVerReserva();
		}
	}

}
