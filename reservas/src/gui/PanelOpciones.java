/**
 * 
 */
package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * @author Jhamir
 *
 */
public class PanelOpciones extends JPanel implements ActionListener{

	private VentanaSecundaria ventanaSecundaria;
	
	public static final String ACEPTAR = "Aceptar";
	
	public static final String CANCELAR = "Cancelar";
	
	private JButton btnOpcion1;
	
	private JButton btnOpcion2;
	
	
	/**
	 * este es el panel de la ventana secundaria que tiene las opciones aceptar y cancelar
	 */
	public PanelOpciones(VentanaSecundaria ventanaSecundaria) {
		this.setBorder(new TitledBorder(""));
		this.setLayout(new BorderLayout());	
		this.setLayout(null);
		
		this.ventanaSecundaria = ventanaSecundaria;
				
		this.btnOpcion1 = new JButton(ACEPTAR);
		this.btnOpcion1.setActionCommand(ACEPTAR);
		this.btnOpcion1.addActionListener(this);
		this.btnOpcion1.setBounds(10, 10, 175, 30);
		
		this.btnOpcion2 = new JButton(CANCELAR);
		this.btnOpcion2.setActionCommand(CANCELAR);
		this.btnOpcion2.addActionListener(this);
		this.btnOpcion2.setBounds(195, 10, 175, 30);
		
		this.add(btnOpcion1);
		this.add(btnOpcion2);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case ACEPTAR:
			ventanaSecundaria.eAceptar();
			break;
		case CANCELAR:
			ventanaSecundaria.dispose();
		}
	}
}
