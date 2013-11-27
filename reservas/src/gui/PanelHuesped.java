/**
 * 
 */
package gui;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * @author Jhamir
 *
 */
public class PanelHuesped extends JPanel{

	private JLabel lblId;
	
	private JLabel lblNombre;
	
	private JLabel lblEdad;	
	
	private JLabel lblTelefono;	
	
	private JLabel lblDireccion;
	
	private JTextField txtId;
	
	private JTextField txtNombre;
	
	private JTextField txtEdad;	
	
	private JTextField txtTelefono;
	
	private JTextField txtDireccion;
	
	/**
	 * 
	 */
	public PanelHuesped() {
		this.setName("panel_huesped");
		this.setBorder(new TitledBorder("Información del Huesped"));
		this.setLayout(new BorderLayout());	
		this.setLayout(null);
		
		this.lblId = new JLabel("Identificación");
		this.lblId.setBounds(20, 20, 100, 25);
		
		this.lblNombre = new JLabel("Nombre");
		this.lblNombre.setBounds(20, 50, 100, 25);
		
		this.lblEdad = new JLabel("Edad");
		this.lblEdad.setBounds(20, 80, 100, 25);
		
		this.lblTelefono = new JLabel("Telefono");
		this.lblTelefono.setBounds(20, 110, 100, 25);
		
		this.lblDireccion = new JLabel("Dirección");
		this.lblDireccion.setBounds(20, 140, 100, 25);
		
		this.txtId = new JTextField();
		this.txtId.setBounds(160, 20, 200, 25);
		
		this.txtNombre = new JTextField();
		this.txtNombre.setBounds(160, 50, 200, 25);
		
		this.txtEdad = new JTextField();
		this.txtEdad.setBounds(160, 80, 200, 25);
		
		this.txtTelefono = new JTextField();
		this.txtTelefono.setBounds(160, 110, 200, 25);
		
		this.txtDireccion = new JTextField();
		this.txtDireccion.setBounds(160, 140, 200, 25);
		
		this.add(lblDireccion);
		this.add(lblTelefono);
		this.add(lblNombre);
		this.add(lblEdad);
		this.add(lblId);
		this.add(txtDireccion);
		this.add(txtId);
		this.add(txtTelefono);
		this.add(txtNombre);
		this.add(txtEdad);
	}
	
	/**
	 * deshabilita los campos del panel
	 */
	public void deshabilitarCampos(){
		this.txtDireccion.setEditable(false);
		this.txtEdad.setEditable(false);
		this.txtId.setEditable(false);
		this.txtNombre.setEditable(false);
		this.txtTelefono.setEditable(false);
	}

	/**
	 * retorna la identificacion del huesped
	 * @return
	 */
	public String getId() {
		return txtId.getText();
	}

	/**
	 * establecer la identificacion del huesped para mostrar
	 * @param txtId
	 */
	public void setId(String id) {
		this.txtId.setText(id);
	}

	/**
	 * retorna el nombre del huesped
	 * @return
	 */
	public String getNombre() {
		return txtNombre.getText();
	}

	/**
	 * establece el nombre del huesped para mostrar
	 * @param txtNombre
	 */
	public void setTxtNombre(String nombre) {
		this.txtNombre.setText(nombre);
	}
	
	/**
	 * retorna la edad del huesped
	 * @return
	 */
	public int getEdad() {
		return Integer.parseInt(txtEdad.getText());
	}

	/**
	 * establecer la edad del beneficiario
	 * @param txtEdad
	 */
	public void setEdad(int edad) {
		this.txtEdad.setText("" + edad);
	}

	/**
	 * retorna el telefono del huesped
	 * @return
	 */
	public int getTelefono() {
		return Integer.parseInt(txtTelefono.getText());
	}

	/**
	 * establece el telefono del huesped para mostrar
	 * @param txtTelefono
	 */
	public void setTelefono(int telefono) {
		this.txtTelefono.setText("" + telefono);
	}

	/**
	 * retorna la direccion del huesped
	 * @return
	 */
	public String getDireccion() {
		return txtDireccion.getText();
	}

	/**
	 * establece la direccion del huesped para mostrar
	 * @param txtDireccion
	 */
	public void setDireccion(String direccion) {
		this.txtDireccion.setText(direccion);
	}

	
}
