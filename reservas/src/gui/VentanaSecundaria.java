/**
 * 
 */
package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Jhamir
 *
 */
public class VentanaSecundaria extends JFrame{
	
	private PanelOpciones panelOpciones;
	
	private JPanel panelPrincipal;
	
	private String titulo;
	/**
	 * 
	 */
	public VentanaSecundaria() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);        
        this.setSize(405, 290);
        this.setResizable(false);
        this.setLayout(null); 
        
        panelPrincipal = new JPanel();
                        
        panelOpciones = new PanelOpciones();
        panelOpciones.setBounds(10, 200, 380, 50);
        
        this.add(panelOpciones);
        
	}
	
	public void setPanel(JPanel panelPrincipal){
		this.remove(this.panelPrincipal);
		this.panelPrincipal = panelPrincipal;
        this.panelPrincipal.setBounds(10, 10, 380, 180);
        this.add(this.panelPrincipal);
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
		this.setTitle(titulo);
	}

}
