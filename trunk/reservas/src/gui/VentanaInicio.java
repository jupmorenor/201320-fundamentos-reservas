package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import autenticacion.Usuario;
import autenticacion.UsuarioExistente;

import conector.AdminConexion;
import conector.Conector;

public class VentanaInicio extends JFrame implements ActionListener{
	
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JButton btnIngresar;
	private JButton btnRegistrarse;
	
	private ResultSet consulta;
	private AdminConexion conector;
	private Conector conexion;
	private Usuario usuario;
	private VentanaAdministrador principal;
	
	private static final String INGRESAR = "Ingresar";
	private static final String REGISTRARSE = "Registrarse";

	public VentanaInicio()  {
		super("Sistema de Gestión Hotelera");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null);
        this.setSize(365, 175);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
        this.lblUsuario = new JLabel("Usuario");
        this.lblUsuario.setBounds(30, 10, 130, 30);
        
        this.lblPassword = new JLabel("Contraseña");
        this.lblPassword.setBounds(30, 50, 130, 30);
        
        this.txtUsuario = new JTextField();
        this.txtUsuario.setBounds(170, 10, 160, 30);
        
        this.txtPassword = new JPasswordField();
        this.txtPassword.setBounds(170, 50, 160, 30);
        
        this.btnIngresar = new JButton(INGRESAR);
        this.btnIngresar.addActionListener(this);
        this.btnIngresar.setActionCommand(INGRESAR);
        this.btnIngresar.setBounds(30, 105, 145, 30);
        
        this.btnRegistrarse = new JButton(REGISTRARSE);
        this.btnRegistrarse.addActionListener(this);
        this.btnRegistrarse.setActionCommand(REGISTRARSE);
        this.btnRegistrarse.setBounds(185, 105, 145, 30);
        
        this.add(this.lblUsuario);
        this.add(this.txtUsuario);
        this.add(this.lblPassword);
        this.add(this.txtPassword);
        this.add(this.btnIngresar);
        this.add(this.btnRegistrarse);   
	}

	public static void main(String[] args) {
		new VentanaInicio().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		
		case INGRESAR:
			try {
				conector = new AdminConexion("datos1.jaa");
				conexion = conector.generarConexion();
				if (conexion!=null) {
					usuario = new UsuarioExistente();
					usuario.setIdusuario(Integer.parseInt(txtUsuario.getText()));
					usuario.setPassword(txtPassword.getText());
					conexion.SetCadena(usuario.consultarUsuario());
					consulta = conexion.Consultar();
					if(consulta.next()) {
						if (usuario.getPassword().equals(consulta.getString("k_passusuario"))) {	
							switch (consulta.getString("o_descripcion")) {
							case "ADMINISTRADOR":
								principal = new VentanaAdministrador();
								principal.setVisible(true);
								this.setVisible(false);
								break;
							case "CLIENTE":
								//TODO acceder a la interfaz que permite al cliente manipular reservas
								break;
							}
						} else {
							JOptionPane.showMessageDialog(this, "Contraseña incorrecta", "Error de acceso", JOptionPane.ERROR_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(this, "Usuario '" + usuario.getIdusuario() + "' no encontrado", "No encontrado", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this, "No se encuentran los datos de conexion", "Error de conexion", JOptionPane.ERROR_MESSAGE);
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "No se encuentran los datos de conexion", "Error de conexion", JOptionPane.ERROR_MESSAGE);
			}	
			break;
			
		case REGISTRARSE:
			VentanaRegistroUsuario registro = new VentanaRegistroUsuario();
			registro.setVisible(true);
			break;
		}
	}
}