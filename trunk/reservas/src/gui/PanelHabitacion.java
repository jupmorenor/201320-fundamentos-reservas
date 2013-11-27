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
	
	private JComboBox<String> cbxTipo;
	
	private JTextField txtPrecioNoche;	
	
	private JTextField txtEstado;	
	
	private String[] filtros1;

	/**
	 * 
	 */
	public PanelHabitacion() {
		this.setName("panel_habitacion");
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
		
		this.cbxTipo = new JComboBox<String>(filtros1);
		this.cbxTipo.setBounds(160, 50, 200, 25);
		
		this.txtPrecioNoche = new JTextField();
		this.txtPrecioNoche.setBounds(160, 80, 200, 25);
		
		this.txtEstado = new JTextField("DISPONIBLE");
		this.txtEstado.setBounds(160, 110, 200, 25);
		
		this.add(lblEstado);
		this.add(lblTipo);
		this.add(lblPrecioNoche);
		this.add(lblNumero);
		this.add(txtNumero);
		this.add(txtEstado);
		this.add(cbxTipo);
		this.add(txtPrecioNoche);
	}
	
	/**
	 * deshabilita los campos del panel
	 */
	public void deshabilitarCampos(){
		this.txtEstado.setEditable(false);
		this.txtNumero.setEditable(false);
		this.txtPrecioNoche.setEditable(false);
		this.cbxTipo.setEnabled(false);
	}

	/**
	 * retorna el numero de la habitacion tomado del campo de texto
	 * @return
	 */
	public int getNumero() {
		return Integer.parseInt(txtNumero.getText());
	}

	/**
	 * establece el numero de la habitacion en el campo de texto
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.txtNumero.setText("" + numero);
	}

	/**
	 * retorna el tipo de habitacion seleccionado
	 * @return
	 */
	public String getTipo() {
		return (String) cbxTipo.getSelectedItem();
	}

	/**
	 * establece el tipo de habitacion para mostrar
	 * @param cbxTipo
	 */
	public void setTipo(String tipo) {
		this.cbxTipo.setSelectedItem(tipo);
	}

	/**
	 * retorna el precio por noche tomado del campo de texto
	 * @return
	 */
	public double getPrecioNoche() {
		return Double.parseDouble(txtPrecioNoche.getText());
	}

	/**
	 * establece el precio noche para mostrar
	 * @param txtPrecioNoche
	 */
	public void setPrecioNoche(double precioNoche) {
		this.txtPrecioNoche.setText("" + precioNoche);;
	}

	/**
	 * retorna el estado de la habitacion
	 * @return
	 */
	public String getEstado() {
		return txtEstado.getText();
	}

	/**
	 * establece el estado para mostrar
	 * @param txtEstado
	 */
	public void setEstado(String estado) {
		this.txtEstado.setText(estado);
	}
	
	/**
	 * retorna el arreglo de filtros, tipos de habitaciones
	 * @return
	 */
	public String[] getFiltros1() {
		return filtros1;
	}

	/**
	 * establece el arreglo de el filtro de los tipod de habitaciones
	 * @param filtros1
	 */
	public void setFiltros1(String[] filtros1) {
		this.filtros1 = filtros1;
	}	

}
