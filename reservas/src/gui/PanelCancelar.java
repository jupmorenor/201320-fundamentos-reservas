/**
 * 
 */
package gui;

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
public class PanelCancelar extends JPanel{
	
	private JLabel lblNombre;
	
	private JTextField txtNombre;
	
	private JTextField txtFechainicio;

	/**
	 * 
	 */
	public PanelCancelar() {
		this.setName("panel_cancelar");
		this.setBorder(new TitledBorder(""));
		this.setLayout(null);
		
		this.lblNombre = new JLabel("Nombre");
		this.lblNombre.setBounds(20, 10, 100, 25);
		
		this.txtNombre= new JTextField();
		this.txtNombre.setBounds(160, 10, 200, 25);
		
		this.txtFechainicio = new JTextField();
		this.txtFechainicio.setBorder(new TitledBorder("Fecha de Inicio"));
		this.txtFechainicio.setBounds(20, 60, 340, 40);
		
		this.add(lblNombre);
		this.add(txtNombre);
		this.add(txtFechainicio);
	}

	/**
	 * retorna el nombre del usuario
	 * @return
	 */
	public String getNombre() {
		return txtNombre.getText();
	}

	/**
	 * retorna la fecha de inicio (TIPO Date)
	 * @return
	 */
	public String getFechaInicio() {
		return txtFechainicio.getText();
	}
	
}
