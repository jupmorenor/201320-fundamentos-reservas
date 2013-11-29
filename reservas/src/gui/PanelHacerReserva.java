/**
 * 
 */
package gui;

import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JCalendar;

/**
 * @author Jhamir
 *
 */
public class PanelHacerReserva extends JPanel{
	
	private JLabel lblId;
	
	private JLabel lblNombre;
	
	private JLabel lblDias;
	
	private JTextField txtId;
	
	private JTextField txtNombre;
	
	private JTextField txtDias;	
	
	private JTextField txtFechaInicio;	
	
	private SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");

	/**
	 * 
	 */
	public PanelHacerReserva() {
		this.setName("panel_hacer_reserva");
		this.setBorder(new TitledBorder("Información del Cliente"));
		this.setLayout(new BorderLayout());	
		this.setLayout(null);
		
		this.lblId = new JLabel("Identificación");
		this.lblId.setBounds(20, 20, 100, 19);
		
		this.lblNombre = new JLabel("Nombre");
		this.lblNombre.setBounds(20, 40, 100, 19);
		
		this.lblDias = new JLabel("Dias Reservados");
		this.lblDias.setBounds(20, 60, 100, 19);
		
		this.txtId = new JTextField();
		this.txtId.setBounds(160, 20, 200, 19);
		
		this.txtNombre = new JTextField();
		this.txtNombre.setBounds(160, 40, 200, 19);
		
		this.txtDias = new JTextField();
		this.txtDias.setBounds(160, 60, 200, 19);
		
		this.txtFechaInicio = new JTextField();
		this.txtFechaInicio.setBorder(new TitledBorder("Fecha de Inicio"));
		this.txtFechaInicio.setBounds(20, 85, 340, 40);
	
		this.add(lblId);
		this.add(txtId);
		this.add(lblNombre);
		this.add(txtNombre);
		this.add(lblDias);
		this.add(txtDias);
		this.add(txtFechaInicio);
	}

	/**
	 * retorna el numero de identificacion del cliente
	 * @return
	 */
	public int getId() {
		return Integer.parseInt(txtId.getText());
	}

	/**
	 * retorn el nombre del cliente
	 * @return
	 */
	public String getNombre() {
		return txtNombre.getText();
	}

	/**
	 * retorna el numero de dias
	 * @return
	 */
	public int getDias() {
		return Integer.parseInt(txtDias.getText());
	}

	/**
	 * retorn la fecha de inicio ( TIPO Date )
	 * @return
	 */
	public String getFechaInicio() {
		return txtFechaInicio.getText();
	}
	
}
