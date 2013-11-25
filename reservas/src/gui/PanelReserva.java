/**
 * 
 */
package gui;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * @author Jhamir
 *
 */
public class PanelReserva extends JPanel{
	
	private JLabel lblNumero;
	
	private JLabel lblDiasReservados;
	
	private JLabel lblFechaInicio;
	
	private JTextField txtNumero;
	
	private JTextField txtDiasReservados;
	
	private JTextField txtFechaInicio;

	/**
	 * 
	 */
	public PanelReserva() {
		this.setBorder(new TitledBorder("Información de la Reserva"));
		this.setLayout(new BorderLayout());	
		this.setLayout(null);
		
		this.lblNumero = new JLabel("Número");
		this.lblNumero.setBounds(20, 20, 100, 25);
		
		this.lblDiasReservados = new JLabel("Dias Reservados");
		this.lblDiasReservados.setBounds(20, 50, 100, 25);
		
		this.lblFechaInicio = new JLabel("Fecha Inicio");
		this.lblFechaInicio.setBounds(20, 80, 100, 25);
		
		this.txtNumero = new JTextField();
		this.txtNumero.setBounds(160, 20, 200, 25);
		
		this.txtDiasReservados = new JTextField();
		this.txtDiasReservados.setBounds(160, 50, 200, 25);
		
		this.txtFechaInicio = new JTextField();
		this.txtFechaInicio.setBounds(160, 80, 200, 25);
		
		this.add(lblDiasReservados);
		this.add(lblFechaInicio);
		this.add(lblNumero);
		this.add(txtNumero);
		this.add(txtDiasReservados);
		this.add(txtFechaInicio);
	}

}
