/**
 * 
 */
package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JCalendar;

/**
 * @author Jhamir
 *
 */
public class PanelCancelar extends JPanel{
	
	private JLabel lblNombre;
	
	private JTextField txtNombre;
	
	private JCalendar cldFechaInicio;

	/**
	 * 
	 */
	public PanelCancelar() {
		this.setBorder(new TitledBorder(""));
		this.setLayout(null);
		
		this.lblNombre = new JLabel("Nombre");
		this.lblNombre.setBounds(20, 10, 100, 25);
		
		this.txtNombre= new JTextField();
		this.txtNombre.setBounds(160, 10, 200, 25);
		
		this.cldFechaInicio = new JCalendar();
		this.cldFechaInicio.setBorder(new TitledBorder("Fecha de Inicio"));
		this.cldFechaInicio.setBounds(20, 40, 340, 135);
		
		this.add(lblNombre);
		this.add(txtNombre);
		this.add(cldFechaInicio);
	}

}
