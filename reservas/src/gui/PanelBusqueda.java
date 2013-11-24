/**
 * 
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelBusqueda extends JPanel implements ActionListener{
	
	public static final String BUSCAR = "Buscar";
	
	private JLabel lblBusqueda;
	
	private JLabel lblFiltro;
	
	private JTextField txtBusqueda;
	
	private JComboBox cbxFiltro1;
	
	private JComboBox cbxFiltro2;
	
	private JButton btnBuscar;
	
	private String[] filtros1;
	
	private String[] filtros2;
	
	/**
	 * 
	 */
	public PanelBusqueda() {
		this.setBorder(new TitledBorder(""));
		this.setLayout(null);
		
		filtros1 = new String[]{"HABITACIÓN", "RESERVA"};
		
		filtros2 = new String[]{"DISPONIBILIDAD", "HUESPED"};		
		
		this.lblBusqueda = new JLabel("BUSQUEDA: ");
		this.lblBusqueda.setBounds(20, 10, 150, 25);
		
		this.lblFiltro = new JLabel("FILTRAR BUSQUEDA POR: ");
		this.lblFiltro.setBounds(20, 40, 150, 25);
		
		this.txtBusqueda = new JTextField();
		this.txtBusqueda.setBounds(180, 10, 460, 25);
		
		this.cbxFiltro1 = new JComboBox(filtros1);
		this.cbxFiltro1.setBounds(180, 40, 300, 25);
		
		this.cbxFiltro2 = new JComboBox(filtros2);
		this.cbxFiltro2.setBounds(490, 40, 260, 25);
		
		this.btnBuscar = new JButton(BUSCAR);
		this.btnBuscar.setActionCommand(BUSCAR);
		this.btnBuscar.addActionListener(this);
		this.btnBuscar.setBounds(650, 10, 100, 25);
		
		this.add(lblBusqueda);
		this.add(lblFiltro);
		this.add(txtBusqueda);
		this.add(btnBuscar);
		this.add(cbxFiltro1);
		this.add(cbxFiltro2);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
