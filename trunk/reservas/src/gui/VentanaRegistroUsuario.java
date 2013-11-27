package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import autenticacion.Usuario;
import autenticacion.UsuarioNuevo;
import conector.AdminConexion;
import conector.Conector;

public class VentanaRegistroUsuario extends JDialog implements ActionListener {
	
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JLabel lblPasswordConf;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JPasswordField txtPasswordConf;
	private JButton btnAceptar;
	private JButton btnCancelar;
	
	private AdminConexion conector;
	private Conector conexion;
	private Usuario usuario;
	private ResultSet consulta;
		
	private static final String ACEPTAR = "Aceptar";
	private static final String CANCELAR = "Cancelar";
	
	public VentanaRegistroUsuario() {
		this.setTitle("Registrar Nuevo Usuario");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);        
        this.setSize(365, 175);
        this.setResizable(false);
        this.setModalityType(DEFAULT_MODALITY_TYPE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
        lblUsuario = new JLabel("Documento");
        lblUsuario.setBounds(30, 10, 130, 25);
        
        lblPassword = new JLabel("Contraseña");
        lblPassword.setBounds(30, 40, 130, 25);
        
        lblPasswordConf = new JLabel("Confirmar Contraseña");
        lblPasswordConf.setBounds(30, 70, 130, 25);
        
        txtUsuario = new JTextField();
        txtUsuario.setBounds(170, 10, 160, 25);
        
        txtPassword = new JPasswordField();
        txtPassword.setBounds(170, 40, 160, 25);
        
        txtPasswordConf = new JPasswordField();
        txtPasswordConf.setBounds(170, 70, 160, 25);
        
        btnAceptar = new JButton(ACEPTAR);
        btnAceptar.addActionListener(this);
        btnAceptar.setActionCommand(ACEPTAR);
        btnAceptar.setBounds(30, 105, 145, 30);
        
        btnCancelar = new JButton(CANCELAR);
        btnCancelar.addActionListener(this);
        btnCancelar.setActionCommand(CANCELAR);
        btnCancelar.setBounds(185, 105, 145, 30);
        
        add(lblUsuario);
        add(lblPassword);
        add(lblPasswordConf);
        add(txtUsuario);
        add(txtPassword);
        add(txtPasswordConf);
        add(btnAceptar);
        add(btnCancelar);
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case ACEPTAR:
			try {
				conector = new AdminConexion("datos1.jaa");
				conexion = conector.generarConexion();
				if (conexion!=null) {
					if(txtPassword.getText().equals(txtPasswordConf.getText())) {
						usuario = new UsuarioNuevo();
						usuario.setIdusuario(Integer.parseInt(txtUsuario.getText()));
						conexion.SetCadena(usuario.consultarUsuario());
						consulta = conexion.Consultar();
						if(consulta.next()) {
							JOptionPane.showMessageDialog(this, "El usuario '" + usuario.getIdusuario() + "' ya existe.", "Usuario existe", JOptionPane.ERROR_MESSAGE);
						} else {
							usuario.setPassword(txtPasswordConf.getText());
							usuario.setTipoUsuario(2);
							conexion.SetCadena(usuario.modificarRegistro());
							conexion.EjecutarSql();
							JOptionPane.showMessageDialog(this, "Usuario registrado con exito", "Usuario registrado", JOptionPane.INFORMATION_MESSAGE);
							dispose();
						}
					} else {
						txtPassword.setText("");
						txtPasswordConf.setText("");
						JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error de contraseña", JOptionPane.ERROR_MESSAGE);
					}			
				} else {
					JOptionPane.showMessageDialog(this, "No se encuentran los datos de conexion", "Error de conexion", JOptionPane.ERROR_MESSAGE);
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "No se encuentran los datos de conexion", "Error de conexion", JOptionPane.ERROR_MESSAGE);
			}
			break;
			
		case CANCELAR:
			dispose();
			break;
		}

	}

}
