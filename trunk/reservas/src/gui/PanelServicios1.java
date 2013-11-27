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
	
	private VentanaPrincipal ventanaPrincipal;
	
	public static final String CREAR = "Crear Habitaci�n";
	
	public static final String CONSUMO = "Registrar Consumo";
	
	private JButton btnCrear;
	
	private JButton btnConsumo;

	/**
	 * 
	 */
	public PanelServicios1(VentanaPrincipal ventanaPrincipal) {
		this.setBorder(new TitledBorder(""));
		this.setLayout(null);	
		
		this.ventanaPrincipal = ventanaPrincipal;
		
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
			ventanaPrincipal.eCrearHabitacion();
		}
		if(e.getActionCommand().equals(CONSUMO)){
			ventanaPrincipal.eRegistrarConsumo();
		}
	}

}