/**
 * 
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * @author Jhamir
 *
 */
public class PanelServicios1 extends JPanel implements ActionListener{
	
	private VentanaAdministrador ventanaAdministrador;
	
	public static final String CREAR = "Crear Habitación";
	
	public static final String CONSUMO = "Registrar Consumo";
	
	private JButton btnCrear;
	
	private JButton btnConsumo;

	/**
	 * en este panel estan los botones que manejan los servicios de crear habitacion y registrar consumo
	 */
	public PanelServicios1(VentanaAdministrador ventanaAdministrador) {
		this.setBorder(new TitledBorder(""));
		this.setLayout(null);	
		
		this.ventanaAdministrador = ventanaAdministrador;
		
		this.btnCrear = new JButton(CREAR);
		this.btnCrear.setActionCommand(CREAR);
		this.btnCrear.addActionListener(this);
		this.btnCrear.setBounds(10, 10, 175, 30);
		
		this.btnConsumo = new JButton(CONSUMO);
		this.btnConsumo.setActionCommand(CONSUMO);
		this.btnConsumo.addActionListener(this);
		this.btnConsumo.setBounds(195, 10, 175, 30);		
		
		this.add(btnCrear);
		this.add(btnConsumo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(CREAR)){
			ventanaAdministrador.eCrearHabitacion();
		}
		if(e.getActionCommand().equals(CONSUMO)){
			ventanaAdministrador.eRegistrarConsumo();
		}
	}

}
