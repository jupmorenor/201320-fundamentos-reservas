/**
 * 
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JCalendar;

public class PanelBusquedaHabitacion extends JPanel implements ActionListener{
	
	public static final String CI = "CI";
	
	public static final String CO = "CO";
	
	public static final String BUSCARDISPONIBILIDAD = "Buscar";
	
	public static final String BUSCARHUESPED = "Buscar";
	
	private JLabel lblBuscar;
	
	private JLabel lblDisponibilidad;
		
	private JLabel lblTipo;
	
	private JLabel lblHuesped;
	
	private JLabel lblNombre;
		
	private JComboBox cbxTipo;
	
	private JTextField txtNombre;
	
	private JCalendar cldCheck;
	
	private JButton btnCheckIn;
	
	private JButton btnCheckOut;
	
	private JButton btnBuscarDisponibilidad;
	
	private JButton btnBuscarHuesped;

	private JLabel lblCheckIn;

	private JTextField txtCheckIn;

	private JLabel lblCheckOut;

	private JTextField txtCheckOut;
	
	private String[] tipos;
	
	/**
	 * 
	 */
	public PanelBusquedaHabitacion() {
		this.setBorder(new TitledBorder(""));
		this.setLayout(null);
		
		tipos = new String[]{"SIMPLE", "DOBLE", "TRIPLE"};
		
		this.lblBuscar = new JLabel("             BUSCAR HABITACIÓN");
		this.lblBuscar.setBorder(new TitledBorder(""));
		this.lblBuscar.setBounds(10, 10, 200, 20);
		
		this.lblDisponibilidad = new JLabel("----------- Por Disponibilidad ------------");
		this.lblDisponibilidad.setBounds(10, 40, 200, 20);
		
		this.lblCheckIn = new JLabel("Check In");
		this.lblCheckIn.setBounds(10, 70, 70, 20);
		
		this.txtCheckIn = new JTextField();
		this.txtCheckIn.setBounds(90, 70, 100, 20);
		
		this.btnCheckIn = new JButton(new ImageIcon("data/calendar20x20.jpg"));
		this.btnCheckIn.setActionCommand(CI);
		this.btnCheckIn.addActionListener(this);
		this.btnCheckIn.setBounds(190, 70, 20, 20);
				
		this.lblCheckOut = new JLabel("Check Out");
		this.lblCheckOut.setBounds(10, 95, 100, 20);
		
		this.txtCheckOut = new JTextField();
		this.txtCheckOut.setBounds(90, 95, 100, 20);
		
		this.btnCheckOut = new JButton(new ImageIcon("data/calendar20x20.jpg"));
		this.btnCheckOut.setActionCommand(CO);
		this.btnCheckOut.addActionListener(this);
		this.btnCheckOut.setBounds(190, 95, 20, 20);		
		
		this.cldCheck = new JCalendar();
		this.cldCheck.setBounds(10, 120, 200, 150);
		
		this.lblTipo = new JLabel("Tipo");
		this.lblTipo.setBounds(10, 270, 50, 20);
		
		this.cbxTipo = new JComboBox(tipos);
		this.cbxTipo.setBounds(70, 270, 140, 20);
		
		this.btnBuscarDisponibilidad = new JButton(BUSCARDISPONIBILIDAD);
		this.btnBuscarDisponibilidad.setActionCommand(BUSCARDISPONIBILIDAD);
		this.btnBuscarDisponibilidad.addActionListener(this);
		this.btnBuscarDisponibilidad.setBounds(10, 295, 200, 20);		
		
		this.lblHuesped = new JLabel("--------------- Por Huesped ---------------");
		this.lblHuesped.setBounds(10, 320, 200, 20);
		
		this.lblNombre = new JLabel("Nombre");
		this.lblNombre.setBounds(10, 345, 90, 20);
		
		this.txtNombre= new JTextField();
		this.txtNombre.setBounds(90, 345, 120, 20);
				
		this.btnBuscarHuesped = new JButton(BUSCARHUESPED);
		this.btnBuscarHuesped.setActionCommand(BUSCARHUESPED);
		this.btnBuscarHuesped.addActionListener(this);
		this.btnBuscarHuesped.setBounds(10, 370, 200, 20);	
		
		this.add(btnBuscarDisponibilidad);
		this.add(btnCheckIn);
		this.add(btnCheckOut);
		this.add(cldCheck);
		this.add(lblBuscar);
		this.add(lblCheckIn);
		this.add(lblCheckOut);
		this.add(lblDisponibilidad);
		this.add(lblTipo);
		this.add(cbxTipo);
		this.add(txtCheckIn);
		this.add(txtCheckOut);
		this.add(lblHuesped);
		this.add(lblNombre);
		this.add(txtNombre);
		this.add(btnBuscarHuesped);
			
		}		
		


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
