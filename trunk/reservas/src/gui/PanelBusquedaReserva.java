/**
 * 
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * @author Jhamir
 *
 */
public class PanelBusquedaReserva extends JPanel implements ActionListener{
	
	public static final String BUSCAR = "Buscar";
	
	private JLabel lblBuscar;
	
	private JLabel lblNombre;
	
	private JTextField txtNombre;
	
	private JButton btnBuscar;

	/**
	 * 
	 */
	public PanelBusquedaReserva() {
		this.setBorder(new TitledBorder(""));
		this.setLayout(null);
		
		this.lblBuscar = new JLabel("             BUSCAR RESERVA");
		this.lblBuscar.setBorder(new TitledBorder(""));
		this.lblBuscar.setBounds(10, 10, 200, 20);
		
		this.lblNombre = new JLabel("Nombre");
		this.lblNombre.setBounds(10, 40, 90, 20);
		
		this.txtNombre= new JTextField();
		this.txtNombre.setBounds(90, 40, 120, 20);
				
		this.btnBuscar = new JButton(BUSCAR);
		this.btnBuscar.setActionCommand(BUSCAR);
		this.btnBuscar.addActionListener(this);
		this.btnBuscar.setBounds(10, 70, 200, 20);
		
		this.add(lblBuscar);
		this.add(lblNombre);
		this.add(txtNombre);
		this.add(btnBuscar);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
