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
public class PanelConsumo extends JPanel{

	private JLabel lblHabitacion;
	
	private JLabel lblNombre;
	
	private JLabel lblValor;	
	
	private JLabel lblCantidad;	
	
	private JTextField txtCodigo;
	
	private JTextField txtNombre;
	
	private JTextField txtValor;	
	
	private JTextField txtCantidad;
	
	/**
	 * 
	 */
	public PanelConsumo() {
		this.setBorder(new TitledBorder("Información del Servicio"));
		this.setLayout(new BorderLayout());	
		this.setLayout(null);
		
		this.lblHabitacion = new JLabel("Habitación");
		this.lblHabitacion.setBounds(20, 20, 100, 25);
		
		this.lblNombre = new JLabel("Nombre");
		this.lblNombre.setBounds(20, 50, 100, 25);
		
		this.lblValor = new JLabel("Valor");
		this.lblValor.setBounds(20, 80, 100, 25);
		
		this.lblCantidad = new JLabel("Cantidad");
		this.lblCantidad.setBounds(20, 110, 100, 25);
				
		this.txtCodigo = new JTextField();
		this.txtCodigo.setBounds(160, 20, 200, 25);
		
		this.txtNombre = new JTextField();
		this.txtNombre.setBounds(160, 50, 200, 25);
		
		this.txtValor = new JTextField();
		this.txtValor.setBounds(160, 80, 200, 25);
		
		this.txtCantidad = new JTextField();
		this.txtCantidad.setBounds(160, 110, 200, 25);
		
		this.add(lblCantidad);
		this.add(lblNombre);
		this.add(lblValor);
		this.add(lblHabitacion);
		this.add(txtCodigo);
		this.add(txtCantidad);
		this.add(txtNombre);
		this.add(txtValor);
	}

}
