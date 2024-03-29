/**
 * 
 */
package gui;

import java.awt.BorderLayout;
import java.sql.ResultSet;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	
	private ResultSet consulta;

	/**
	 * 
	 */
	public PanelReserva() {
		this.setBorder(new TitledBorder("Informaci�n de la Reserva"));
		this.setLayout(new BorderLayout());	
		this.setLayout(null);
		
		this.lblNumero = new JLabel("N�mero");
		this.lblNumero.setBounds(20, 20, 100, 25);
		
		this.lblDiasReservados = new JLabel("Dias Reservados");
		this.lblDiasReservados.setBounds(20, 50, 100, 25);
		
		this.lblFechaInicio = new JLabel("nombre cliente");
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
	
	/**
	 * deshabilita los campos del panel
	 */
	public void deshabilitarCampos(){
		this.txtDiasReservados.setEditable(false);
		this.txtFechaInicio.setEditable(false);
		this.txtNumero.setEditable(false);
	}

	/**
	 * retorna el numero de la reserva
	 * @return
	 */
	public int getNumero() {
		return Integer.parseInt(txtNumero.getText());
	}

	/**
	 * establece el numero de la reserva para mostrar
	 * @param txtNumero
	 */
	public void setNumero(int numero) {
		this.txtNumero.setText("" + numero);
	}

	/**
	 * retorna la cantidad de dias reservados
	 * @return
	 */
	public int getDiasReservados() {
		return Integer.parseInt(txtDiasReservados.getText());
	}

	/**
	 * establece los dias reservados para mostrar
	 * @param txtDiasReservados
	 */
	public void setDiasReservados(int diasReservados) {
		this.txtDiasReservados.setText("" + diasReservados);;
	}

	/**
	 * retorna la fecha de inicio de la reserva
	 * @return
	 */
	public String getFechaInicio() {
		return txtFechaInicio.getText();
	}

	/**
	 * establece la fecha de inicio para mostrar
	 * @param txtFechaInicio
	 */
	public void setFechaInicio(String fechaInicio) {
		this.txtFechaInicio.setText(fechaInicio);
	}
	
	public void setConsulta(ResultSet consulta) {
		this.consulta = consulta;
		try {
			if(consulta.next()){
				this.setFechaInicio(consulta.getString("n_nombrecliente"));
				this.setNumero(consulta.getInt("k_idreservacion"));
				
			}
		}catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "No se encontraron datos", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}	
}
