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
public class PanelHabitacion extends JPanel{
	
	private JLabel lblNumero;
	
	private JLabel lblTipo;
	
	private JLabel lblPrecioNoche;	
	
	private JLabel lblEstado;	
	
	private JTextField txtNumero;
	
	private JComboBox cbxTipo;
	
	private JTextField txtPrecioNoche;	
	
	private JTextField txtEstado;	
	
	private String[] filtros1;
	
	private String[] filtros2;

	/**
	 * 
	 */
	public PanelHabitacion() {
		this.setBorder(new TitledBorder("Información de la Habitación"));
		this.setLayout(new BorderLayout());	
		this.setLayout(null);
		
		filtros1 = new String[]{"SIMPLE", "DOBLE", "TRIPLE"};
				
		this.lblNumero = new JLabel("Número");
		this.lblNumero.setBounds(20, 20, 100, 25);
		
		this.lblTipo = new JLabel("Tipo");
		this.lblTipo.setBounds(20, 50, 100, 25);
		
		this.lblPrecioNoche = new JLabel("Precio Noche");
		this.lblPrecioNoche.setBounds(20, 80, 100, 25);
		
		this.lblEstado = new JLabel("Estado");
		this.lblEstado.setBounds(20, 110, 100, 25);
				
		this.txtNumero = new JTextField();
		this.txtNumero.setBounds(160, 20, 200, 25);
		
		this.cbxTipo = new JComboBox(filtros1);
		this.cbxTipo.setBounds(160, 50, 200, 25);
		
		this.txtPrecioNoche = new JTextField();
		this.txtPrecioNoche.setBounds(160, 80, 200, 25);
		
		this.txtEstado = new JTextField("DISPONIBLE");
		this.txtEstado.setBounds(160, 110, 200, 25);
		this.txtEstado.setEditable(false);
		
		this.add(lblEstado);
		this.add(lblTipo);
		this.add(lblPrecioNoche);
		this.add(lblNumero);
		this.add(txtNumero);
		this.add(txtEstado);
		this.add(cbxTipo);
		this.add(txtPrecioNoche);
	}

}
