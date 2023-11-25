package InmueblesITSAplicacion;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.border.MatteBorder;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.CardLayout;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import InmueblesITSDatos.Datos;
import InmueblesITSNegocios.BaseDeDatos;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;

public class login extends JFrame {
	public static login frame;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField Contraseña;
	private JPanel PanelOpciones;
	private JPanel LoginAPK;
	private JButton btnRegistrarCliente;
	private JButton btnModificarClienteeInmuebles;
	private JButton btnBajaCliente;
	private JButton btnConfirmarContrato;
	private JButton btnModificarPrecios;
	private JButton btnNewButton_1_3_1_1_4;
	private JButton btnCrearUsuario;
	private JPanel Presentacion;
	private JPanel PanelGestionUsuario;
	private JPanel ContenedorPanel;
	private JButton btnConsultarClienteeInmuebles;
	private JPanel PanelModificarPrecio;
	private JPanel PanelGestionDeContrato;
	private JPanel PanelDarBajaCliente;
	private JPanel PanelRegistrarCliente;
	private JPanel PanelModificarDatos;
	private JPanel PanelConsultarDatos;
	private JTextField txtModificarPrecioPadronInmueble;
	private JTextField txtModificarPrecioInmueble;
	private JTabbedPane tabbedPane;
	private JTextField txtDarBajaClienteCedula;
	private JTextField txtDarBajaClientePadron;
	private JPanel PanelRegistrarDatosCliente1;
	private JPanel PanelRegistrarDatosCliente2;
	private JPanel PanelContenedorRegistroCliente;
	private JTabbedPane tabbedPane_1;
	private JTextField txtRegistrarClienteCedula;
	private JTextField txtRegistrarClienteNombre;
	private JTextField txtRegistrarClienteAnio;
	private JTextField txtRegistrarClienteEmail;
	private JTextField txtRegistrarClienteTelefono;
	private JTextField txtRegistrarInmueblePadron;
	private JTextField txtRegistrarInmuebleDepartamento;
	private JTextField txtRegistrarInmuebleCalle;
	private JTextField txtRegistrarInmuebleCalleNPuerta;
	private JTextField txtRegistrarInmuebleValorDolares;
	private JTextField txtRegistrarInmuebleTamanio;
	private JPanel PanelContenedorRegistroInmuebles;
	private JPanel PanelDatosRegistrarInmueble1;
	private JPanel PanelDatosRegistrarInmueble2;
	private JPanel PanelDatosRegistrarInmueble3;
	private JRadioButton btnRegistroInmuebleTerreno;
	private JRadioButton btnRegistroInmuebleHabitable;
	private JPanel PanelDatosRegistrarInmueble4;
	private JTextField txtRegistrarClienteApellido;
	private JLabel lblPresentacion;
	private JTextField txtNombreConsultarCliente;
	private JTable TablaConsultarCliente;
	private JTextField txtPadronConsultarHabitable;
	private JTable TablaConsultarHabitable;
	private JTextField txtRegistrarClienteMes;
	private JTextField txtRegistrarClienteDia;
	private JRadioButton rdbtnRegistroApartamento;
	private JRadioButton rdbtnRegistroMejora;
	private JRadioButton rdbtnRegistroCasa;
	private JTextField txtConsultarTerreno;
	private JTable tablaConsultarTerreno;
	private JTextField txtNombreUsuario;
	private JPasswordField pswrdUsuario1;
	private JPasswordField pswrdUsuario2;
	private JTextField txtNombreEliminarUsuario;
	private JRadioButton RbtnGerenteCrearUsuario;
	private JRadioButton RbtnCEOCrearUsuario;
	private JRadioButton RbtnAdministrativoCrearUsuario;
	private JTextPane textPane_3;
	private JTextField txtCedulaDuenioInmueble;
	private JCheckBox chckbxAlcantarillado;
	private JCheckBox chckbxTelecomunicaciones;
	private JCheckBox chckbxUTE;
	private JCheckBox chckbxUteOSE;
	private JLabel lblNewLabel_3_2_2_4_2_2;
	private JSpinner spinnerBanios;
	private JSpinner spinnerCuartos;
	private JTextField txtRegistrarInmuebleComodidades;
	private JTextField txtRegistrarInmuebleHabitaciones;
	private JLabel mostrarPrecioInmueble;
	private JTextField txtCedulaModificarCliente;
	private JTextField txtNombreModificar;
	private JTextField txtApellidoModificar;
	private JTextField txtAnioModificar;
	private JTextField txtMesModificar;
	private JTextField txtDiaModificar;
	private JTextField txtEmailModificarUsuario;
	private JTextField txtTelefonoModificarUsuario;
	private JPanel ContenedroModificarDatosCliente;
	private JPanel ModificarDatoCliente1;
	private JPanel ModificarDatoCliente2;
	private JPanel ContenedorModificarDatosInmueble;
	private JPanel ModificarDatosCliente1;
	private JTextField txtDepartamentoModificarInmueble;
	private JTextField txtCalleModificarInmueble;
	private JTextField txtPuertaModificarInmueble;
	private JTextField txtPadronModificarInmueble;
	private JTextField txtPadronInmuebleContrato;
	private JTextField txtCedulaDelInteresado;
	private JPanel ContenedorCreaconContrato;
	private JButton btnSiguienteGestionContrato;
	private JPanel CrearContrato1;
	private JPanel CrearContrato2;
	private JTextField anioInicioRenta;
	private JTextField mesInicioRenta;
	private JTextField diaInicioRenta;
	private JTextField anioFinalRenta;
	private JTextField mesFinalRenta;
	private JTextField diaFinalRenta;
	private JTextField montoDeRenta;
	private JTextField textField_7;
	private JRadioButton btnAlquilerContrato;
	private JRadioButton btnCompraContrato;
	private JPanel CrearContrato3;
	private JTextField CodigoContratoCompra;
	private JTextField AnioContratoCompra;
	private JTextField mesContratoCompra;
	private JTextField diaContratoCompra;
	private JTextField codigoContratoAlquiler;
	private JTextField txtDescripcionContratoCompra;
	private JTextField txtGarantia;
	private JPanel panelGestionContratoCompra;
	private JPanel panelGestionContratoAlquiler;
	private JTextField consultarCodigoContratoCompra;
	private JTable tablaCodigoContratoCompra;
	private JTextField CodigoContratoAlquiler;
	private JTable tablaContratoAlquiler;
	private JButton btnSiguienteGestionContrato_1;
	private JButton btnAceptar;
	private JButton btnSiguienteGestionContrato_1_1;
	private JButton btnAceptar_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				  //Llamamos al metodo para validar los drivers
					if(BaseDeDatos.validarDriver()==true) {
						login frame = new login();
						frame.setVisible(true);
					}
						
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setTitle("Inmobiliaria ITS");
		ArrayList <String> habitaciones = new ArrayList<String>();
	    ArrayList <String> comodidades = new  ArrayList<String>();
		ButtonGroup tipoDeContrato = new ButtonGroup();
	    ButtonGroup RegistroInmuebleHabitable = new ButtonGroup();
		ButtonGroup RegistroInmueble = new ButtonGroup();
		ButtonGroup rango = new ButtonGroup();
		setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/ImagenesDelAPK/Icono Aplicacion.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1250, 575);
		setLocation(300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		LoginAPK = new JPanel();
		LoginAPK.setLayout(null);
		LoginAPK.setBackground(Color.WHITE);
		contentPane.add(LoginAPK, "name_6460994482900");

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(413, 29, 411, 460);
		LoginAPK.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Nombre de Usuario");
		lblNewLabel_3.setBounds(32, 162, 299, 27);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3.setBorder(null);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(37, 194, 299, 57);
		panel.add(txtUsuario);
		txtUsuario.setForeground(new Color(128, 128, 128));
		txtUsuario.setFont(new Font("Arial", Font.BOLD, 15));
		txtUsuario.setColumns(10);
		txtUsuario.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		JLabel lblNewLabel_3_1 = new JLabel("Contraseñas");
		lblNewLabel_3_1.setBounds(37, 265, 299, 57);
		panel.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 15));
		Contraseña = new JPasswordField();
		Contraseña.setBounds(37, 310, 299, 50);
		panel.add(Contraseña);
		Contraseña.setForeground(Color.GRAY);
		Contraseña.setFont(new Font("Arial", Font.BOLD, 15));
		Contraseña.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));

		JButton btnNewButton = new JButton("Iniciar Sesion");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(86, 381, 225, 57);
		panel.add(btnNewButton);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(0, 64, 128));

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/Loging/ImagenUsuario (2).png")));
		lblNewLabel_1.setBounds(28, 82, 67, 72);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/LogoITS.png")));
		lblNewLabel.setBounds(0, 0, 411, 80);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/Loging/FondoLoginn.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1224, 537);
		LoginAPK.add(lblNewLabel_2);

		PanelOpciones = new JPanel();
		PanelOpciones.setBackground(new Color(255, 255, 255));
		contentPane.add(PanelOpciones, "name_5904436466000");
		PanelOpciones.setLayout(null);

		JPanel PanelIzquierda = new JPanel();
		PanelIzquierda.setBackground(new Color(0, 64, 128));
		PanelIzquierda.setForeground(new Color(255, 255, 255));
		PanelIzquierda.setBounds(0, 0, 259, 526);
		PanelOpciones.add(PanelIzquierda);
		PanelIzquierda.setLayout(null);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 52, 242, 2);
		separator_1.setBackground(new Color(255, 255, 255));
		PanelIzquierda.add(separator_1);

		btnConfirmarContrato = new JButton("Gestion De Contrato");
		btnConfirmarContrato.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnConfirmarContrato.setBackground(new Color(0, 64, 128));
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnConfirmarContrato.setBackground(new Color(0, 44, 108));
			}
		});
		btnConfirmarContrato.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfirmarContrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos.cambiarJPanel(ContenedorPanel, PanelGestionDeContrato);
				BaseDeDatos.contratoCompra(tablaCodigoContratoCompra);
				BaseDeDatos.contratoAlquiler(tablaContratoAlquiler);
			}
		});
		btnConfirmarContrato.setBounds(10, 283, 242, 40);
		btnConfirmarContrato.setForeground(Color.WHITE);
		btnConfirmarContrato.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfirmarContrato.setBorder(null);
		btnConfirmarContrato.setBackground(new Color(0, 64, 128));
		PanelIzquierda.add(btnConfirmarContrato);

		btnModificarPrecios = new JButton("Modificar Precios de Inmueble");
		btnModificarPrecios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnModificarPrecios.setBackground(new Color(0, 44, 108));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnModificarPrecios.setBackground(new Color(0, 64, 128));
			}
		});
		btnModificarPrecios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnModificarPrecios.setBounds(10, 334, 242, 40);
		btnModificarPrecios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos.cambiarJPanel(ContenedorPanel, PanelModificarPrecio);
			}
		});
		btnModificarPrecios.setForeground(Color.WHITE);
		btnModificarPrecios.setFont(new Font("Arial", Font.BOLD, 15));
		btnModificarPrecios.setBorder(null);
		btnModificarPrecios.setBackground(new Color(0, 64, 128));
		PanelIzquierda.add(btnModificarPrecios);

		btnBajaCliente = new JButton("Dar de baja Cliente/Inmueble");
		btnBajaCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBajaCliente.setBackground(new Color(0, 44, 108));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnBajaCliente.setBackground(new Color(0, 64, 128));
			}
		});
		btnBajaCliente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBajaCliente.setBounds(10, 232, 242, 40);
		btnBajaCliente.setBackground(new Color(0, 64, 128));
		btnBajaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos.cambiarJPanel(ContenedorPanel, PanelDarBajaCliente);
			}
		});
		btnBajaCliente.setForeground(Color.WHITE);
		btnBajaCliente.setFont(new Font("Arial", Font.BOLD, 15));
		btnBajaCliente.setBorder(null);
		btnBajaCliente.setBackground(new Color(0, 64, 128));
		PanelIzquierda.add(btnBajaCliente);

		btnRegistrarCliente = new JButton("Registrar Cliente/Inmuebles");
		btnRegistrarCliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRegistrarCliente.setBackground(new Color(0, 44, 108));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnRegistrarCliente.setBackground(new Color(0, 64, 128));
			}
		});
		btnRegistrarCliente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrarCliente.setBounds(10, 181, 242, 40);
		btnRegistrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos.cambiarJPanel(ContenedorPanel, PanelRegistrarCliente);
			}
		});
		btnRegistrarCliente.setForeground(Color.WHITE);
		btnRegistrarCliente.setFont(new Font("Arial", Font.BOLD, 15));
		btnRegistrarCliente.setBorder(null);
		btnRegistrarCliente.setBackground(new Color(0, 64, 128));
		PanelIzquierda.add(btnRegistrarCliente);

		btnNewButton_1_3_1_1_4 = new JButton("Cerrar Sesion");
		btnNewButton_1_3_1_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1_3_1_1_4.setBackground(new Color(0, 44, 108));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1_3_1_1_4.setBackground(new Color(0, 64, 128));
			}
		});
		btnNewButton_1_3_1_1_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_3_1_1_4.setBounds(10, 475, 242, 40);
		btnNewButton_1_3_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsuario.setText("");
				Contraseña.setText("");
				Datos.cambiarJPanel(contentPane, LoginAPK);
				btnCrearUsuario.setVisible(true);
				btnModificarPrecios.setVisible(true);
				btnConfirmarContrato.setVisible(true);
				btnBajaCliente.setVisible(true);	
				btnAceptar.setVisible(true);
				btnSiguienteGestionContrato_1.setVisible(true);
				btnSiguienteGestionContrato_1_1.setVisible(true);
				btnAceptar_1.setVisible(true);
				btnConfirmarContrato.setBounds(10, 284, 242, 40);
			}
		});
		btnNewButton_1_3_1_1_4.setForeground(Color.WHITE);
		btnNewButton_1_3_1_1_4.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_1_3_1_1_4.setBorder(null);
		btnNewButton_1_3_1_1_4.setBackground(new Color(0, 64, 128));
		PanelIzquierda.add(btnNewButton_1_3_1_1_4);

		JLabel MostrarNomUser = new JLabel("Inmuebles ITS");
		MostrarNomUser.setBounds(59, 11, 148, 30);
		MostrarNomUser.setForeground(new Color(255, 255, 255));
		MostrarNomUser.setFont(new Font("Arial", Font.BOLD, 20));
		PanelIzquierda.add(MostrarNomUser);

		btnModificarClienteeInmuebles = new JButton("Modificar Datos Clientes/Inmuebles");
		btnModificarClienteeInmuebles.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnModificarClienteeInmuebles.setBackground(new Color(0, 44, 108));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnModificarClienteeInmuebles.setBackground(new Color(0, 64, 128));
			}
		});
		btnModificarClienteeInmuebles.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnModificarClienteeInmuebles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos.cambiarJPanel(ContenedorPanel, PanelModificarDatos);
			}
		});
		btnModificarClienteeInmuebles.setBounds(10, 130, 242, 40);
		btnModificarClienteeInmuebles.setForeground(Color.WHITE);
		btnModificarClienteeInmuebles.setFont(new Font("Arial", Font.BOLD, 13));
		btnModificarClienteeInmuebles.setBorder(null);
		btnModificarClienteeInmuebles.setBackground(new Color(0, 64, 128));
		PanelIzquierda.add(btnModificarClienteeInmuebles);

		btnCrearUsuario = new JButton("Gestion de Usuario");
		btnCrearUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCrearUsuario.setBackground(new Color(0, 44, 108));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCrearUsuario.setBackground(new Color(0, 64, 128));
			}
		});
		btnCrearUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCrearUsuario.setBorderPainted(false);
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos.cambiarJPanel(ContenedorPanel, PanelGestionUsuario);
			}
		});
		btnCrearUsuario.setForeground(Color.WHITE);
		btnCrearUsuario.setFont(new Font("Arial", Font.BOLD, 15));
		btnCrearUsuario.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		btnCrearUsuario.setBackground(new Color(0, 64, 128));
		btnCrearUsuario.setBounds(10, 385, 242, 40);
		PanelIzquierda.add(btnCrearUsuario);

		btnConsultarClienteeInmuebles = new JButton("Consultar datos Clientes/Inmuebles");
		btnConsultarClienteeInmuebles.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnConsultarClienteeInmuebles.setBackground(new Color(0, 44, 108));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnConsultarClienteeInmuebles.setBackground(new Color(0, 64, 128));
			}
		});
		btnConsultarClienteeInmuebles.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultarClienteeInmuebles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos.cambiarJPanel(ContenedorPanel, PanelConsultarDatos);
				BaseDeDatos.verTablaClientes(TablaConsultarCliente);
				BaseDeDatos.verTablahabitable(TablaConsultarHabitable);
				BaseDeDatos.verTablaTerreno(tablaConsultarTerreno);
			}
		});
		btnConsultarClienteeInmuebles.setForeground(Color.WHITE);
		btnConsultarClienteeInmuebles.setFont(new Font("Arial", Font.BOLD, 13));
		btnConsultarClienteeInmuebles.setBorder(null);
		btnConsultarClienteeInmuebles.setBackground(new Color(0, 64, 128));
		btnConsultarClienteeInmuebles.setBounds(10, 88, 242, 40);
		PanelIzquierda.add(btnConsultarClienteeInmuebles);

		JPanel PanelSuperior = new JPanel();
		PanelSuperior.setForeground(Color.WHITE);
		PanelSuperior.setBackground(new Color(0, 64, 128));
		PanelSuperior.setBounds(258, 0, 966, 60);
		PanelOpciones.add(PanelSuperior);
		PanelSuperior.setLayout(null);

		ContenedorPanel = new JPanel();
		ContenedorPanel.setBackground(new Color(255, 255, 255));
		ContenedorPanel.setBounds(258, 60, 966, 466);
		PanelOpciones.add(ContenedorPanel);
		ContenedorPanel.setLayout(new CardLayout(0, 0));

		Presentacion = new JPanel();
		Presentacion.setBackground(new Color(255, 255, 255));
		ContenedorPanel.add(Presentacion, "name_18776612161800");
		Presentacion.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("Bienvenido a");
		lblNewLabel_6.setForeground(new Color(128, 0, 0));
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 40));
		lblNewLabel_6.setBounds(52, 11, 258, 87);
		Presentacion.add(lblNewLabel_6);

		JLabel lblNewLabel_6_1 = new JLabel("Inmobiliaria ITS");
		lblNewLabel_6_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_6_1.setFont(new Font("Arial", Font.BOLD, 40));
		lblNewLabel_6_1.setBounds(109, 81, 306, 87);
		Presentacion.add(lblNewLabel_6_1);

		JLabel lblNewLabel_6_1_1 = new JLabel("Inmuebles para Todas las Situaciones");
		lblNewLabel_6_1_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_6_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_6_1_1.setBounds(134, 152, 615, 87);
		Presentacion.add(lblNewLabel_6_1_1);

		JLabel lblNewLabel_6_2 = new JLabel("Bienvenido:");
		lblNewLabel_6_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_6_2.setBounds(134, 322, 178, 64);
		Presentacion.add(lblNewLabel_6_2);

		lblPresentacion = new JLabel("Nombre de Usuario");
		lblPresentacion.setForeground(Color.BLACK);
		lblPresentacion.setFont(new Font("Arial", Font.BOLD, 30));
		lblPresentacion.setBounds(311, 322, 281, 64);
		Presentacion.add(lblPresentacion);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(
				new ImageIcon("D:\\UTU\\UTU 2023-2BV\\ProyectoFinal\\Fotos\\VentaDeTerreno\\LogoInmueblesITS.jfif"));
		lblNewLabel_7.setBounds(530, 21, 426, 87);
		Presentacion.add(lblNewLabel_7);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(new Color(0, 0, 0));
		separator_1_1.setBounds(130, 396, 463, 2);
		Presentacion.add(separator_1_1);

		JLabel lblNewLabel_9_1 = new JLabel("");
		lblNewLabel_9_1.setIcon(
				new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/MujerSentadaPresentacion.jpg")));
		lblNewLabel_9_1.setBounds(681, 162, 258, 269);
		Presentacion.add(lblNewLabel_9_1);

		PanelGestionUsuario = new JPanel();
		PanelGestionUsuario.setBackground(new Color(255, 255, 255));
		ContenedorPanel.add(PanelGestionUsuario, "name_18776623392400");
		PanelGestionUsuario.setLayout(null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(10, 11, 946, 444);
		PanelGestionUsuario.add(tabbedPane_4);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 255));
		tabbedPane_4.addTab("Crear Usuario", null, panel_8, null);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_3_2 = new JLabel("Nombre del Usuario");
		lblNewLabel_3_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2.setBorder(null);
		lblNewLabel_3_2.setBounds(8, 22, 198, 57);
		panel_8.add(lblNewLabel_3_2);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setForeground(Color.BLACK);
		txtNombreUsuario.setFont(new Font("Arial", Font.BOLD, 20));
		txtNombreUsuario.setColumns(10);
		txtNombreUsuario.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtNombreUsuario.setBounds(8, 60, 543, 57);
		panel_8.add(txtNombreUsuario);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Contraseña");
		lblNewLabel_3_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(8, 128, 149, 57);
		panel_8.add(lblNewLabel_3_1_1);
		
		pswrdUsuario1 = new JPasswordField();
		pswrdUsuario1.setForeground(Color.BLACK);
		pswrdUsuario1.setFont(new Font("Arial", Font.BOLD, 20));
		pswrdUsuario1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		pswrdUsuario1.setBounds(8, 172, 543, 50);
		panel_8.add(pswrdUsuario1);
		
		JLabel lblNewLabel_8 = new JLabel("Creacion de Usuarios");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_8.setBounds(-15, -50, 946, 57);
		panel_8.add(lblNewLabel_8);
		
		JButton btnConfirmarCrearUsuario = new JButton("Crear Usuario");
		btnConfirmarCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Datos.ValidarRegistroUsuario(txtNombreUsuario, pswrdUsuario1, pswrdUsuario2, RbtnCEOCrearUsuario, RbtnGerenteCrearUsuario, RbtnAdministrativoCrearUsuario)==true) {
					
					if(RbtnCEOCrearUsuario.isSelected()) {
						 BaseDeDatos.agregarUsuario(txtNombreUsuario,pswrdUsuario1,1);
					}else {
						if(RbtnGerenteCrearUsuario.isSelected()) {
							 BaseDeDatos.agregarUsuario(txtNombreUsuario, pswrdUsuario1,2);
						}else {
							 BaseDeDatos.agregarUsuario(txtNombreUsuario, pswrdUsuario1,3);
						}
					}
                
					
				}
				
				txtNombreUsuario.setText("");
				pswrdUsuario1.setText("");
				pswrdUsuario2.setText("");
				
			}
		});
		btnConfirmarCrearUsuario.setForeground(Color.WHITE);
		btnConfirmarCrearUsuario.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfirmarCrearUsuario.setBorderPainted(false);
		btnConfirmarCrearUsuario.setBackground(new Color(0, 64, 128));
		btnConfirmarCrearUsuario.setBounds(651, 330, 214, 57);
		panel_8.add(btnConfirmarCrearUsuario);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Selects the Range:");
		lblNewLabel_3_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_1_1_1.setBounds(8, 348, 178, 57);
		panel_8.add(lblNewLabel_3_1_1_1);
		
		RbtnCEOCrearUsuario = new JRadioButton("CEO");
		RbtnCEOCrearUsuario.setFont(new Font("Arial", Font.BOLD, 18));
		RbtnCEOCrearUsuario.setBorder(null);
		RbtnCEOCrearUsuario.setBackground(Color.WHITE);
		RbtnCEOCrearUsuario.setBounds(207, 364, 59, 23);
		panel_8.add(RbtnCEOCrearUsuario);
		
		RbtnGerenteCrearUsuario = new JRadioButton("Gerente");
		RbtnGerenteCrearUsuario.setFont(new Font("Arial", Font.BOLD, 18));
		RbtnGerenteCrearUsuario.setBorder(null);
		RbtnGerenteCrearUsuario.setBackground(Color.WHITE);
		RbtnGerenteCrearUsuario.setBounds(287, 364, 97, 23);
		panel_8.add(RbtnGerenteCrearUsuario);
		
		RbtnAdministrativoCrearUsuario = new JRadioButton("Administrativo");
		RbtnAdministrativoCrearUsuario.setFont(new Font("Arial", Font.BOLD, 18));
		RbtnAdministrativoCrearUsuario.setBorder(null);
		RbtnAdministrativoCrearUsuario.setBackground(Color.WHITE);
		RbtnAdministrativoCrearUsuario.setBounds(400, 363, 161, 23);
		panel_8.add(RbtnAdministrativoCrearUsuario);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Confirmar Contraseña");
		lblNewLabel_3_1_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_1_1_2.setBounds(8, 243, 241, 57);
		panel_8.add(lblNewLabel_3_1_1_2);
		
		pswrdUsuario2 = new JPasswordField();
		pswrdUsuario2.setForeground(Color.BLACK);
		pswrdUsuario2.setFont(new Font("Arial", Font.BOLD, 20));
		pswrdUsuario2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		pswrdUsuario2.setBounds(8, 287, 543, 50);
		panel_8.add(pswrdUsuario2);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/ImagenModificarUsuario.png")));
		lblNewLabel_9.setBounds(651, 43, 265, 257);
		panel_8.add(lblNewLabel_9);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 255));
		tabbedPane_4.addTab("Eliminar Usuario", null, panel_9, null);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_9_2 = new JLabel("");
		lblNewLabel_9_2.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/EliminarUsuario.png")));
		lblNewLabel_9_2.setBounds(653, 34, 265, 257);
		panel_9.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_3_2_5 = new JLabel("Nombre de Usuario");
		lblNewLabel_3_2_5.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_5.setBorder(null);
		lblNewLabel_3_2_5.setBounds(10, 22, 214, 57);
		panel_9.add(lblNewLabel_3_2_5);
		
		txtNombreEliminarUsuario = new JTextField();
		txtNombreEliminarUsuario.setForeground(Color.BLACK);
		txtNombreEliminarUsuario.setFont(new Font("Arial", Font.BOLD, 20));
		txtNombreEliminarUsuario.setColumns(10);
		txtNombreEliminarUsuario.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtNombreEliminarUsuario.setBounds(10, 60, 543, 57);
		panel_9.add(txtNombreEliminarUsuario);
		
		JLabel lblNewLabel_3_1_1_3 = new JLabel("");
		lblNewLabel_3_1_1_3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_1_1_3.setBounds(10, 128, 149, 57);
		panel_9.add(lblNewLabel_3_1_1_3);
		
		JButton btnEliminarUsuario = new JButton("Eliminar Usuario");
		btnEliminarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Datos.validarTextFieldVacio(txtNombreEliminarUsuario)== true){
					BaseDeDatos.eliminarUsuario(txtNombreEliminarUsuario);
					txtNombreEliminarUsuario.setText("");
					textPane_3.setText("");
				}
			}
		});
		btnEliminarUsuario.setForeground(Color.WHITE);
		btnEliminarUsuario.setFont(new Font("Arial", Font.BOLD, 15));
		btnEliminarUsuario.setBorderPainted(false);
		btnEliminarUsuario.setBackground(new Color(0, 64, 128));
		btnEliminarUsuario.setBounds(653, 330, 214, 57);
		panel_9.add(btnEliminarUsuario);
		
		JLabel lblNewLabel_8_2_1_2_1_1_2 = new JLabel("Motivo de la baja");
		lblNewLabel_8_2_1_2_1_1_2.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_8_2_1_2_1_1_2.setBounds(10, 133, 202, 30);
		panel_9.add(lblNewLabel_8_2_1_2_1_1_2);
		
		textPane_3 = new JTextPane();
		textPane_3.setForeground(Color.BLACK);
		textPane_3.setFont(new Font("Arial", Font.PLAIN, 20));
		textPane_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_3.setBounds(10, 201, 472, 162);
		panel_9.add(textPane_3);

		PanelModificarPrecio = new JPanel();
		PanelModificarPrecio.setFont(new Font("Arial", Font.BOLD, 20));
		PanelModificarPrecio.setBackground(new Color(255, 255, 255));
		ContenedorPanel.add(PanelModificarPrecio, "name_18776635556600");
		PanelModificarPrecio.setLayout(null);

		JLabel lblNewLabel_8_2 = new JLabel("Modificar Precio");
		lblNewLabel_8_2.setBounds(10, 0, 946, 57);
		lblNewLabel_8_2.setFont(new Font("Arial", Font.BOLD, 30));
		PanelModificarPrecio.add(lblNewLabel_8_2);

		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(10, 62, 946, 2);
		separator_2_1.setBackground(new Color(0, 64, 128));
		PanelModificarPrecio.add(separator_2_1);

		txtModificarPrecioPadronInmueble = new JTextField();
		txtModificarPrecioPadronInmueble.setForeground(new Color(0, 0, 0));
		txtModificarPrecioPadronInmueble.setFont(new Font("Arial", Font.BOLD, 20));
		txtModificarPrecioPadronInmueble.setColumns(10);
		txtModificarPrecioPadronInmueble.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtModificarPrecioPadronInmueble.setBounds(30, 117, 533, 57);
		PanelModificarPrecio.add(txtModificarPrecioPadronInmueble);

		JButton btnConfirmarCrearUsuario_1 = new JButton("Buscar");
		btnConfirmarCrearUsuario_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Datos.validarModificacionPrecio(txtModificarPrecioPadronInmueble)==true) {
					
				mostrarPrecioInmueble.setText(String.valueOf(BaseDeDatos.buscarPrecioInmueble(txtModificarPrecioPadronInmueble)));	
					
					
				}
			}
		});
		btnConfirmarCrearUsuario_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfirmarCrearUsuario_1.setForeground(Color.WHITE);
		btnConfirmarCrearUsuario_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfirmarCrearUsuario_1.setBorderPainted(false);
		btnConfirmarCrearUsuario_1.setBackground(new Color(0, 64, 128));
		btnConfirmarCrearUsuario_1.setBounds(46, 398, 225, 57);
		PanelModificarPrecio.add(btnConfirmarCrearUsuario_1);

		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setForeground(new Color(0, 0, 0));
		separator_2_1_1.setBackground(new Color(0, 0, 0));
		separator_2_1_1.setBounds(30, 272, 533, 2);
		PanelModificarPrecio.add(separator_2_1_1);

		txtModificarPrecioInmueble = new JTextField();
		txtModificarPrecioInmueble.setForeground(Color.BLACK);
		txtModificarPrecioInmueble.setFont(new Font("Arial", Font.BOLD, 20));
		txtModificarPrecioInmueble.setColumns(10);
		txtModificarPrecioInmueble.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtModificarPrecioInmueble.setBounds(30, 319, 533, 57);
		PanelModificarPrecio.add(txtModificarPrecioInmueble);

		JLabel lblNewLabel_3_2_1 = new JLabel("Padron del Inmueble");
		lblNewLabel_3_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_1.setBorder(null);
		lblNewLabel_3_2_1.setBounds(30, 81, 287, 57);
		PanelModificarPrecio.add(lblNewLabel_3_2_1);

		JLabel lblNewLabel_3_2_1_1 = new JLabel("Precio del Inmueble");
		lblNewLabel_3_2_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_1_1.setBorder(null);
		lblNewLabel_3_2_1_1.setBounds(30, 185, 287, 57);
		PanelModificarPrecio.add(lblNewLabel_3_2_1_1);

		JLabel lblNewLabel_3_2_1_1_1 = new JLabel("Cambiar precio del Inmueble");
		lblNewLabel_3_2_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_1_1_1.setBorder(null);
		lblNewLabel_3_2_1_1_1.setBounds(30, 285, 287, 57);
		PanelModificarPrecio.add(lblNewLabel_3_2_1_1_1);

		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(
				new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/ImagenModificarPrecio.png")));
		lblNewLabel_10.setBounds(655, 79, 281, 335);
		PanelModificarPrecio.add(lblNewLabel_10);

		JButton btnConfirmarCrearUsuario_1_1 = new JButton("Aceptar");
		btnConfirmarCrearUsuario_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					if(txtModificarPrecioPadronInmueble.getText().length()<=10) {
						if(Integer.parseInt(mostrarPrecioInmueble.getText())>0) {
						BaseDeDatos.modificarPrecioInmueble(txtModificarPrecioPadronInmueble, txtModificarPrecioInmueble);
					}
				}else {
					JOptionPane.showMessageDialog(null,"Aviso,El padron superar el maximo permitido:10","Aviso",JOptionPane.WARNING_MESSAGE);
				}
				txtModificarPrecioPadronInmueble.setText("");
				mostrarPrecioInmueble.setText("");
				txtModificarPrecioInmueble.setText("");
				
			}
		});
		btnConfirmarCrearUsuario_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfirmarCrearUsuario_1_1.setForeground(Color.WHITE);
		btnConfirmarCrearUsuario_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfirmarCrearUsuario_1_1.setBorderPainted(false);
		btnConfirmarCrearUsuario_1_1.setBackground(new Color(0, 64, 128));
		btnConfirmarCrearUsuario_1_1.setBounds(338, 398, 225, 57);
		PanelModificarPrecio.add(btnConfirmarCrearUsuario_1_1);
		
		mostrarPrecioInmueble = new JLabel("");
		mostrarPrecioInmueble.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		mostrarPrecioInmueble.setBorder(null);
		mostrarPrecioInmueble.setBounds(30, 231, 287, 57);
		PanelModificarPrecio.add(mostrarPrecioInmueble);

		PanelGestionDeContrato = new JPanel();
		PanelGestionDeContrato.setBackground(new Color(255, 255, 255));
		ContenedorPanel.add(PanelGestionDeContrato, "name_18776648325400");
		PanelGestionDeContrato.setLayout(null);

		JLabel lblNewLabel_8_2_1 = new JLabel("Gestion De Contrato");
		lblNewLabel_8_2_1.setBounds(8, 2, 946, 57);
		lblNewLabel_8_2_1.setFont(new Font("Arial", Font.BOLD, 30));
		PanelGestionDeContrato.add(lblNewLabel_8_2_1);

		JSeparator separator_2_1_2 = new JSeparator();
		separator_2_1_2.setBounds(8, 48, 946, 2);
		separator_2_1_2.setBackground(new Color(0, 64, 128));
		PanelGestionDeContrato.add(separator_2_1_2);
		
		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_5.setBounds(10, 54, 944, 401);
		PanelGestionDeContrato.add(tabbedPane_5);
		
		ContenedorCreaconContrato = new JPanel();
		ContenedorCreaconContrato.setBackground(new Color(255, 255, 255));
		tabbedPane_5.addTab("Crear Contrato", null, ContenedorCreaconContrato, null);
		ContenedorCreaconContrato.setLayout(new CardLayout(0, 0));
		
		CrearContrato1 = new JPanel();
		CrearContrato1.setBackground(new Color(255, 255, 255));
		ContenedorCreaconContrato.add(CrearContrato1, "name_16792316462800");
		CrearContrato1.setLayout(null);
		
		JLabel lblNewLabel_3_2_2_5 = new JLabel("Padron del Inmueble");
		lblNewLabel_3_2_2_5.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5.setBorder(null);
		lblNewLabel_3_2_2_5.setBounds(10, 11, 234, 57);
		CrearContrato1.add(lblNewLabel_3_2_2_5);
		
		txtPadronInmuebleContrato = new JTextField();
		txtPadronInmuebleContrato.setForeground(Color.BLACK);
		txtPadronInmuebleContrato.setFont(new Font("Arial", Font.BOLD, 20));
		txtPadronInmuebleContrato.setColumns(10);
		txtPadronInmuebleContrato.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtPadronInmuebleContrato.setBounds(10, 49, 426, 57);
		CrearContrato1.add(txtPadronInmuebleContrato);
		
		JLabel lblNewLabel_3_2_2_5_1 = new JLabel("Cedula del Interesado");
		lblNewLabel_3_2_2_5_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_1.setBorder(null);
		lblNewLabel_3_2_2_5_1.setBounds(10, 117, 234, 57);
		CrearContrato1.add(lblNewLabel_3_2_2_5_1);
		
		txtCedulaDelInteresado = new JTextField();
		txtCedulaDelInteresado.setForeground(Color.BLACK);
		txtCedulaDelInteresado.setFont(new Font("Arial", Font.BOLD, 20));
		txtCedulaDelInteresado.setColumns(10);
		txtCedulaDelInteresado.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtCedulaDelInteresado.setBounds(10, 155, 426, 57);
		CrearContrato1.add(txtCedulaDelInteresado);
		
		JLabel lblNewLabel_3_2_2_3_1_1 = new JLabel("Tipo de Contrato");
		lblNewLabel_3_2_2_3_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_3_1_1.setBorder(null);
		lblNewLabel_3_2_2_3_1_1.setBounds(10, 223, 234, 57);
		CrearContrato1.add(lblNewLabel_3_2_2_3_1_1);
		
		panelGestionContratoCompra = new JPanel();
		panelGestionContratoCompra.setBackground(new Color(255, 255, 255));
		tabbedPane_5.addTab("Contrato Compra", null, panelGestionContratoCompra, null);
		panelGestionContratoCompra.setLayout(null);
		
		JLabel lblNewLabel_3_2_2_5_3 = new JLabel("Codigo de contrato");
		lblNewLabel_3_2_2_5_3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_3.setBorder(null);
		lblNewLabel_3_2_2_5_3.setBounds(10, 13, 204, 38);
		panelGestionContratoCompra.add(lblNewLabel_3_2_2_5_3);
		
		consultarCodigoContratoCompra = new JTextField();
		consultarCodigoContratoCompra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(!consultarCodigoContratoCompra.getText().isEmpty()) {
					if(consultarCodigoContratoCompra.getText().matches("[0-9]*")) {
						if(consultarCodigoContratoCompra.getText().length()<=8) {
							BaseDeDatos.cargarJTableContratoCompra(tablaCodigoContratoCompra,consultarCodigoContratoCompra);
						}else {
							JOptionPane.showMessageDialog(null, "Aviso, Supero el maximo de caracteres permitido","Aviso",JOptionPane.WARNING_MESSAGE);
							consultarCodigoContratoCompra.setText("");
						}
						
					}
				}else {
					BaseDeDatos.contratoCompra(tablaCodigoContratoCompra);
				}
				
			}
		});
		consultarCodigoContratoCompra.setForeground(Color.BLACK);
		consultarCodigoContratoCompra.setFont(new Font("Arial", Font.BOLD, 20));
		consultarCodigoContratoCompra.setColumns(10);
		consultarCodigoContratoCompra.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		consultarCodigoContratoCompra.setBounds(220, 11, 329, 38);
		panelGestionContratoCompra.add(consultarCodigoContratoCompra);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 71, 919, 291);
		panelGestionContratoCompra.add(scrollPane);
		
		tablaCodigoContratoCompra = new JTable();
		tablaCodigoContratoCompra.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"Codigo Contrato", "Padron", "Cedula Del Comprador", "Fecha Del Contrato", "Descripcion", "Estado"
			}
		));
		scrollPane.setViewportView(tablaCodigoContratoCompra);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!consultarCodigoContratoCompra.getText().isEmpty()) {
					BaseDeDatos.confirmarContrato(2,consultarCodigoContratoCompra);
					BaseDeDatos.contratoCompra(tablaCodigoContratoCompra);
					consultarCodigoContratoCompra.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "Aviso, El codigo del contrato no peude estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		btnAceptar.setForeground(Color.WHITE);
		btnAceptar.setFont(new Font("Arial", Font.BOLD, 15));
		btnAceptar.setBorderPainted(false);
		btnAceptar.setBackground(new Color(0, 64, 128));
		btnAceptar.setBounds(760, 13, 169, 45);
		panelGestionContratoCompra.add(btnAceptar);
		
		btnSiguienteGestionContrato_1 = new JButton("Rechazar");
		btnSiguienteGestionContrato_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!consultarCodigoContratoCompra.getText().isEmpty()) {
					BaseDeDatos.rechazarContrato(2,consultarCodigoContratoCompra);
					BaseDeDatos.contratoCompra(tablaCodigoContratoCompra);
					consultarCodigoContratoCompra.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "Aviso, El codigo del contrato no peude estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnSiguienteGestionContrato_1.setForeground(Color.WHITE);
		btnSiguienteGestionContrato_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnSiguienteGestionContrato_1.setBorderPainted(false);
		btnSiguienteGestionContrato_1.setBackground(new Color(0, 64, 128));
		btnSiguienteGestionContrato_1.setBounds(581, 13, 169, 45);
		panelGestionContratoCompra.add(btnSiguienteGestionContrato_1);
		
		panelGestionContratoAlquiler = new JPanel();
		panelGestionContratoAlquiler.setBackground(new Color(255, 255, 255));
		tabbedPane_5.addTab("Contrato Alquiler", null, panelGestionContratoAlquiler, null);
		panelGestionContratoAlquiler.setLayout(null);
		
		JLabel lblNewLabel_3_2_2_5_3_1 = new JLabel("Codigo de contrato");
		lblNewLabel_3_2_2_5_3_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_3_1.setBorder(null);
		lblNewLabel_3_2_2_5_3_1.setBounds(10, 24, 204, 38);
		panelGestionContratoAlquiler.add(lblNewLabel_3_2_2_5_3_1);
		
		CodigoContratoAlquiler = new JTextField();
		CodigoContratoAlquiler.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(!CodigoContratoAlquiler.getText().isEmpty()) {
					if(CodigoContratoAlquiler.getText().matches("[0-9]*")) {
						if(CodigoContratoAlquiler.getText().length()<=8) {
							BaseDeDatos.cargarJTableContratoAlquiler(tablaContratoAlquiler,CodigoContratoAlquiler);
						}else {
							JOptionPane.showMessageDialog(null, "Aviso, Supero el maximo de caracteres permitido","Aviso",JOptionPane.WARNING_MESSAGE);
							CodigoContratoAlquiler.setText("");
						}						
					}
				}else {
					BaseDeDatos.contratoAlquiler(tablaContratoAlquiler);
				}
			}
		});
		CodigoContratoAlquiler.setForeground(Color.BLACK);
		CodigoContratoAlquiler.setFont(new Font("Arial", Font.BOLD, 20));
		CodigoContratoAlquiler.setColumns(10);
		CodigoContratoAlquiler.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		CodigoContratoAlquiler.setBounds(220, 22, 329, 38);
		panelGestionContratoAlquiler.add(CodigoContratoAlquiler);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 82, 919, 291);
		panelGestionContratoAlquiler.add(scrollPane_1);
		
		tablaContratoAlquiler = new JTable();
		tablaContratoAlquiler.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Codigo Contrato", "Padron", "CI Inquilino", "Precio Mensual", "Garantia", "fecha inicio", "fecha fin", "Estado"
			}
		));
		scrollPane_1.setViewportView(tablaContratoAlquiler);
		
		btnAceptar_1 = new JButton("Aceptar");
		btnAceptar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!CodigoContratoAlquiler.getText().isEmpty()) {
					BaseDeDatos.confirmarContrato(1,CodigoContratoAlquiler);
					BaseDeDatos.contratoAlquiler(tablaContratoAlquiler);
					CodigoContratoAlquiler.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "Aviso, El codigo del contrato no peude estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
				}
				
				
				
			}
		});
		btnAceptar_1.setForeground(Color.WHITE);
		btnAceptar_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnAceptar_1.setBorderPainted(false);
		btnAceptar_1.setBackground(new Color(0, 64, 128));
		btnAceptar_1.setBounds(760, 24, 169, 45);
		panelGestionContratoAlquiler.add(btnAceptar_1);
		
		btnSiguienteGestionContrato_1_1 = new JButton("Rechazar");
		btnSiguienteGestionContrato_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!CodigoContratoAlquiler.getText().isEmpty()) {
                 BaseDeDatos.rechazarContrato(1,CodigoContratoAlquiler);
                 BaseDeDatos.contratoAlquiler(tablaContratoAlquiler);
                 CodigoContratoAlquiler.setText("");
                 
				}else {
					JOptionPane.showMessageDialog(null, "Aviso, El codigo del contrato no peude estar vacio","Aviso",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		btnSiguienteGestionContrato_1_1.setForeground(Color.WHITE);
		btnSiguienteGestionContrato_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnSiguienteGestionContrato_1_1.setBorderPainted(false);
		btnSiguienteGestionContrato_1_1.setBackground(new Color(0, 64, 128));
		btnSiguienteGestionContrato_1_1.setBounds(581, 24, 169, 45);
		panelGestionContratoAlquiler.add(btnSiguienteGestionContrato_1_1);

		PanelDarBajaCliente = new JPanel();
		PanelDarBajaCliente.setBackground(new Color(255, 255, 255));
		ContenedorPanel.add(PanelDarBajaCliente, "name_18784245400100");
		PanelDarBajaCliente.setLayout(null);

		JLabel lblNewLabel_8_2_1_2 = new JLabel("Dar de baja Cliente/Inmueble");
		lblNewLabel_8_2_1_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_8_2_1_2.setBounds(10, 0, 946, 57);
		PanelDarBajaCliente.add(lblNewLabel_8_2_1_2);

		JSeparator separator_2_1_2_1 = new JSeparator();
		separator_2_1_2_1.setBackground(new Color(0, 64, 128));
		separator_2_1_2_1.setBounds(10, 62, 946, 2);
		PanelDarBajaCliente.add(separator_2_1_2_1);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Arial", Font.BOLD, 15));
		tabbedPane.setBounds(10, 68, 946, 387);
		PanelDarBajaCliente.add(tabbedPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setFont(new Font("Arial", Font.BOLD, 15));
		tabbedPane.addTab("Cliente", (Icon) null, panel_1, null);
		panel_1.setLayout(null);

		JLabel lblNewLabel_8_2_1_2_1 = new JLabel("Cedula del Cliente");
		lblNewLabel_8_2_1_2_1.setBounds(10, 5, 216, 30);
		lblNewLabel_8_2_1_2_1.setFont(new Font("Arial", Font.BOLD, 25));
		panel_1.add(lblNewLabel_8_2_1_2_1);

		txtDarBajaClienteCedula = new JTextField();
		txtDarBajaClienteCedula.setBounds(10, 31, 472, 46);
		txtDarBajaClienteCedula.setForeground(Color.BLACK);
		txtDarBajaClienteCedula.setFont(new Font("Arial", Font.BOLD, 25));
		txtDarBajaClienteCedula.setColumns(10);
		txtDarBajaClienteCedula.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_1.add(txtDarBajaClienteCedula);

		JLabel lblNewLabel_8_2_1_2_1_1 = new JLabel("Motivo de la baja");
		lblNewLabel_8_2_1_2_1_1.setBounds(10, 88, 202, 30);
		lblNewLabel_8_2_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		panel_1.add(lblNewLabel_8_2_1_2_1_1);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 129, 472, 162);
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Arial", Font.PLAIN, 20));
		textPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(textPane);

		JButton btnConfirmarCrearUsuario_1_2 = new JButton("Confirmar");
		btnConfirmarCrearUsuario_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Datos.validaraDarBajaCliente(txtDarBajaClienteCedula)==true) {
					if(txtDarBajaClienteCedula.getText().length()<=10) {
						BaseDeDatos.eliminarCliente(txtDarBajaClienteCedula);		
					}else {
						JOptionPane.showMessageDialog(null,"Aviso,La cedula no puede superar el maximo permitido","Aviso",JOptionPane.WARNING_MESSAGE);
						txtDarBajaClienteCedula.setText("");
					}
								
				}
				
				txtDarBajaClienteCedula.setText("");
			}
		});
		btnConfirmarCrearUsuario_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfirmarCrearUsuario_1_2.setBounds(10, 302, 216, 42);
		btnConfirmarCrearUsuario_1_2.setForeground(Color.WHITE);
		btnConfirmarCrearUsuario_1_2.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfirmarCrearUsuario_1_2.setBorderPainted(false);
		btnConfirmarCrearUsuario_1_2.setBackground(new Color(0, 64, 128));
		panel_1.add(btnConfirmarCrearUsuario_1_2);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/IMGdarDeBaaja.png")));
		lblNewLabel_4.setBounds(596, 31, 300, 279);
		panel_1.add(lblNewLabel_4);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Inmueble", (Icon) null, panel_2, null);
		panel_2.setLayout(null);

		JLabel lblNewLabel_8_2_1_2_1_2 = new JLabel("Padron del Inmueble");
		lblNewLabel_8_2_1_2_1_2.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_8_2_1_2_1_2.setBounds(10, 5, 251, 30);
		panel_2.add(lblNewLabel_8_2_1_2_1_2);

		txtDarBajaClientePadron = new JTextField();
		txtDarBajaClientePadron.setForeground(Color.BLACK);
		txtDarBajaClientePadron.setFont(new Font("Arial", Font.BOLD, 25));
		txtDarBajaClientePadron.setColumns(10);
		txtDarBajaClientePadron.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtDarBajaClientePadron.setBounds(10, 45, 472, 32);
		panel_2.add(txtDarBajaClientePadron);

		JLabel lblNewLabel_8_2_1_2_1_1_1 = new JLabel("Motivo de la baja");
		lblNewLabel_8_2_1_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_8_2_1_2_1_1_1.setBounds(10, 88, 202, 30);
		panel_2.add(lblNewLabel_8_2_1_2_1_1_1);

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Arial", Font.PLAIN, 20));
		textPane_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		textPane_1.setBounds(10, 129, 472, 162);
		panel_2.add(textPane_1);

		JButton btnConfirmarCrearUsuario_1_2_1 = new JButton("Confirmar");
		btnConfirmarCrearUsuario_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            if(Datos.validarDarBajaInmueble(txtDarBajaClientePadron)==true) {
            	BaseDeDatos.eliminarInmueble(txtDarBajaClientePadron);
            }
            txtDarBajaClientePadron.setText("");
			}
		});
		btnConfirmarCrearUsuario_1_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfirmarCrearUsuario_1_2_1.setForeground(Color.WHITE);
		btnConfirmarCrearUsuario_1_2_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfirmarCrearUsuario_1_2_1.setBorderPainted(false);
		btnConfirmarCrearUsuario_1_2_1.setBackground(new Color(0, 64, 128));
		btnConfirmarCrearUsuario_1_2_1.setBounds(10, 302, 216, 42);
		panel_2.add(btnConfirmarCrearUsuario_1_2_1);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(
				new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/IconoEliminarInmueble.png")));
		lblNewLabel_5.setBounds(616, 11, 271, 333);
		panel_2.add(lblNewLabel_5);

		PanelRegistrarCliente = new JPanel();
		PanelRegistrarCliente.setBackground(new Color(255, 255, 255));
		ContenedorPanel.add(PanelRegistrarCliente, "name_18791401132700");
		PanelRegistrarCliente.setLayout(null);

		JLabel lblNewLabel_8_2_1_2_2 = new JLabel("Registrar Cliente/Inmueble");
		lblNewLabel_8_2_1_2_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_8_2_1_2_2.setBounds(10, 0, 946, 57);
		PanelRegistrarCliente.add(lblNewLabel_8_2_1_2_2);

		JSeparator separator_2_1_2_1_1 = new JSeparator();
		separator_2_1_2_1_1.setBackground(new Color(0, 64, 128));
		separator_2_1_2_1_1.setBounds(10, 62, 946, 2);
		PanelRegistrarCliente.add(separator_2_1_2_1_1);

		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setFont(new Font("Arial", Font.BOLD, 15));
		tabbedPane_1.setBounds(10, 68, 946, 387);
		PanelRegistrarCliente.add(tabbedPane_1);

		PanelContenedorRegistroCliente = new JPanel();
		PanelContenedorRegistroCliente.setBackground(new Color(255, 255, 255));
		tabbedPane_1.addTab("Cliente", null, PanelContenedorRegistroCliente, null);
		PanelContenedorRegistroCliente.setLayout(new CardLayout(0, 0));

		PanelRegistrarDatosCliente1 = new JPanel();
		PanelRegistrarDatosCliente1.setBackground(new Color(255, 255, 255));
		PanelContenedorRegistroCliente.add(PanelRegistrarDatosCliente1, "name_14750880554200");
		PanelRegistrarDatosCliente1.setLayout(null);

		JLabel lblNewLabel_3_2_2 = new JLabel("Cedula de Identidad");
		lblNewLabel_3_2_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2.setBorder(null);
		lblNewLabel_3_2_2.setBounds(10, 11, 234, 57);
		PanelRegistrarDatosCliente1.add(lblNewLabel_3_2_2);

		txtRegistrarClienteCedula = new JTextField();
		txtRegistrarClienteCedula.setForeground(Color.BLACK);
		txtRegistrarClienteCedula.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarClienteCedula.setColumns(10);
		txtRegistrarClienteCedula.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarClienteCedula.setBounds(10, 49, 522, 57);
		PanelRegistrarDatosCliente1.add(txtRegistrarClienteCedula);

		JLabel lblNewLabel_3_2_3 = new JLabel("Nombre");
		lblNewLabel_3_2_3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_3.setBorder(null);
		lblNewLabel_3_2_3.setBounds(10, 113, 90, 57);
		PanelRegistrarDatosCliente1.add(lblNewLabel_3_2_3);

		txtRegistrarClienteNombre = new JTextField();
		txtRegistrarClienteNombre.setForeground(Color.BLACK);
		txtRegistrarClienteNombre.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarClienteNombre.setColumns(10);
		txtRegistrarClienteNombre.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarClienteNombre.setBounds(10, 158, 234, 42);
		PanelRegistrarDatosCliente1.add(txtRegistrarClienteNombre);

		JLabel lblNewLabel_3_2_4 = new JLabel("Fecha de Nacimiento");
		lblNewLabel_3_2_4.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_4.setBorder(null);
		lblNewLabel_3_2_4.setBounds(10, 211, 215, 35);
		PanelRegistrarDatosCliente1.add(lblNewLabel_3_2_4);

		txtRegistrarClienteAnio = new JTextField();
		txtRegistrarClienteAnio.setForeground(Color.BLACK);
		txtRegistrarClienteAnio.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarClienteAnio.setColumns(10);
		txtRegistrarClienteAnio.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarClienteAnio.setBounds(21, 297, 99, 42);
		PanelRegistrarDatosCliente1.add(txtRegistrarClienteAnio);

		JButton bntSiguienteRegistrarCliente1 = new JButton("Siguiente");
		bntSiguienteRegistrarCliente1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                   if(txtRegistrarClienteCedula.getText().length()>=7) {
                	   if (Datos.ValidarCreacionUsuario1(txtRegistrarClienteCedula, txtRegistrarClienteNombre,
       						txtRegistrarClienteApellido, txtRegistrarClienteAnio, txtRegistrarClienteMes,
       						txtRegistrarClienteDia) == true) {
       					if(txtRegistrarClienteCedula.getText().length()<=10) {
       						Datos.cambiarJPanel(PanelContenedorRegistroCliente, PanelRegistrarDatosCliente2);
       					}else {
       						JOptionPane.showMessageDialog(null, "Aviso, La cedula del cliente supera el maximo permitido","Aviso",JOptionPane.WARNING_MESSAGE);
       					}
       					
       				}
                   }else {
                	   JOptionPane.showMessageDialog(null, "Aviso, La cedula del cliente no es valida","Aviso",JOptionPane.WARNING_MESSAGE);
                   }
				

			}
		});
		bntSiguienteRegistrarCliente1.setForeground(Color.WHITE);
		bntSiguienteRegistrarCliente1.setFont(new Font("Arial", Font.BOLD, 15));
		bntSiguienteRegistrarCliente1.setBorderPainted(false);
		bntSiguienteRegistrarCliente1.setBackground(new Color(0, 64, 128));
		bntSiguienteRegistrarCliente1.setBounds(642, 298, 216, 42);
		PanelRegistrarDatosCliente1.add(bntSiguienteRegistrarCliente1);

		JLabel lblNewLabel_3_2_2_4_2_2_2 = new JLabel("1/2");
		lblNewLabel_3_2_2_4_2_2_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2_2_2.setBorder(null);
		lblNewLabel_3_2_2_4_2_2_2.setBounds(914, 0, 27, 35);
		PanelRegistrarDatosCliente1.add(lblNewLabel_3_2_2_4_2_2_2);

		JLabel lblNewLabel_3_2_3_1 = new JLabel("Apellido");
		lblNewLabel_3_2_3_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_3_1.setBorder(null);
		lblNewLabel_3_2_3_1.setBounds(299, 113, 90, 57);
		PanelRegistrarDatosCliente1.add(lblNewLabel_3_2_3_1);

		txtRegistrarClienteApellido = new JTextField();
		txtRegistrarClienteApellido.setForeground(Color.BLACK);
		txtRegistrarClienteApellido.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarClienteApellido.setColumns(10);
		txtRegistrarClienteApellido.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarClienteApellido.setBounds(298, 158, 234, 42);
		PanelRegistrarDatosCliente1.add(txtRegistrarClienteApellido);

		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(
				new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/ImagenRegistrarCliente.png")));
		lblNewLabel_11.setBounds(624, 29, 261, 218);
		PanelRegistrarDatosCliente1.add(lblNewLabel_11);

		txtRegistrarClienteMes = new JTextField();
		txtRegistrarClienteMes.setForeground(Color.BLACK);
		txtRegistrarClienteMes.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarClienteMes.setColumns(10);
		txtRegistrarClienteMes.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarClienteMes.setBounds(171, 297, 99, 42);
		PanelRegistrarDatosCliente1.add(txtRegistrarClienteMes);

		txtRegistrarClienteDia = new JTextField();
		txtRegistrarClienteDia.setForeground(Color.BLACK);
		txtRegistrarClienteDia.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarClienteDia.setColumns(10);
		txtRegistrarClienteDia.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarClienteDia.setBounds(328, 297, 99, 42);
		PanelRegistrarDatosCliente1.add(txtRegistrarClienteDia);

		JLabel lblNewLabel_3_2_4_1 = new JLabel("/");
		lblNewLabel_3_2_4_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_4_1.setBorder(null);
		lblNewLabel_3_2_4_1.setBounds(138, 313, 17, 42);
		PanelRegistrarDatosCliente1.add(lblNewLabel_3_2_4_1);

		JLabel lblNewLabel_3_2_4_1_1 = new JLabel("/");
		lblNewLabel_3_2_4_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_4_1_1.setBorder(null);
		lblNewLabel_3_2_4_1_1.setBounds(292, 313, 17, 42);
		PanelRegistrarDatosCliente1.add(lblNewLabel_3_2_4_1_1);

		JLabel lblNewLabel_3_2_4_2 = new JLabel("Dia");
		lblNewLabel_3_2_4_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_4_2.setBorder(null);
		lblNewLabel_3_2_4_2.setBounds(328, 257, 31, 35);
		PanelRegistrarDatosCliente1.add(lblNewLabel_3_2_4_2);

		JLabel lblNewLabel_3_2_4_2_1 = new JLabel("Mes");
		lblNewLabel_3_2_4_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_4_2_1.setBorder(null);
		lblNewLabel_3_2_4_2_1.setBounds(175, 257, 50, 35);
		PanelRegistrarDatosCliente1.add(lblNewLabel_3_2_4_2_1);

		JLabel lblNewLabel_3_2_4_2_1_1 = new JLabel("Año");
		lblNewLabel_3_2_4_2_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_4_2_1_1.setBorder(null);
		lblNewLabel_3_2_4_2_1_1.setBounds(10, 257, 50, 35);
		PanelRegistrarDatosCliente1.add(lblNewLabel_3_2_4_2_1_1);

		PanelRegistrarDatosCliente2 = new JPanel();
		PanelRegistrarDatosCliente2.setBackground(new Color(255, 255, 255));
		PanelContenedorRegistroCliente.add(PanelRegistrarDatosCliente2, "name_14777485257300");
		PanelRegistrarDatosCliente2.setLayout(null);

		JLabel lblNewLabel_3_2_2_1 = new JLabel("Email");
		lblNewLabel_3_2_2_1.setBounds(10, 11, 234, 57);
		lblNewLabel_3_2_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_1.setBorder(null);
		PanelRegistrarDatosCliente2.add(lblNewLabel_3_2_2_1);

		txtRegistrarClienteEmail = new JTextField();
		txtRegistrarClienteEmail.setBounds(10, 49, 571, 57);
		txtRegistrarClienteEmail.setForeground(Color.BLACK);
		txtRegistrarClienteEmail.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarClienteEmail.setColumns(10);
		txtRegistrarClienteEmail.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		PanelRegistrarDatosCliente2.add(txtRegistrarClienteEmail);

		JLabel lblNewLabel_3_2_2_2 = new JLabel("Telefono");
		lblNewLabel_3_2_2_2.setBounds(10, 117, 234, 57);
		lblNewLabel_3_2_2_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_2.setBorder(null);
		PanelRegistrarDatosCliente2.add(lblNewLabel_3_2_2_2);

		txtRegistrarClienteTelefono = new JTextField();
		txtRegistrarClienteTelefono.setBounds(10, 155, 571, 57);
		txtRegistrarClienteTelefono.setForeground(Color.BLACK);
		txtRegistrarClienteTelefono.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarClienteTelefono.setColumns(10);
		txtRegistrarClienteTelefono.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		PanelRegistrarDatosCliente2.add(txtRegistrarClienteTelefono);

		JButton btnAtrasRegistrarCliente2 = new JButton("Atras");
		btnAtrasRegistrarCliente2.setBounds(582, 289, 154, 42);
		btnAtrasRegistrarCliente2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos.cambiarJPanel(PanelContenedorRegistroCliente, PanelRegistrarDatosCliente1);
			}
		});
		btnAtrasRegistrarCliente2.setForeground(Color.WHITE);
		btnAtrasRegistrarCliente2.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasRegistrarCliente2.setBorderPainted(false);
		btnAtrasRegistrarCliente2.setBackground(new Color(0, 64, 128));
		PanelRegistrarDatosCliente2.add(btnAtrasRegistrarCliente2);

		JButton btnConfirmarCrearUsuario_1_2_2_2 = new JButton("Finalizar");
		btnConfirmarCrearUsuario_1_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Datos.ValidarCreacionUsuario2(txtRegistrarClienteEmail, txtRegistrarClienteTelefono) == true) {
					
					BaseDeDatos.crearCliente(txtRegistrarClienteCedula,txtRegistrarClienteNombre,txtRegistrarClienteApellido,txtRegistrarClienteAnio,txtRegistrarClienteMes,txtRegistrarClienteDia,txtRegistrarClienteEmail,txtRegistrarClienteTelefono);
					
					Datos.LimpiarTextos(txtRegistrarClienteCedula, txtRegistrarClienteNombre,
							txtRegistrarClienteApellido, txtRegistrarClienteAnio, txtRegistrarClienteMes,
							txtRegistrarClienteDia,txtRegistrarClienteEmail, txtRegistrarClienteTelefono);
				}
			}
		});
		btnConfirmarCrearUsuario_1_2_2_2.setBounds(764, 289, 154, 42);
		btnConfirmarCrearUsuario_1_2_2_2.setForeground(Color.WHITE);
		btnConfirmarCrearUsuario_1_2_2_2.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfirmarCrearUsuario_1_2_2_2.setBorderPainted(false);
		btnConfirmarCrearUsuario_1_2_2_2.setBackground(new Color(0, 64, 128));
		PanelRegistrarDatosCliente2.add(btnConfirmarCrearUsuario_1_2_2_2);

		JLabel lblNewLabel_3_2_2_4_2_2_2_1 = new JLabel("2/2");
		lblNewLabel_3_2_2_4_2_2_2_1.setBounds(911, 0, 30, 35);
		lblNewLabel_3_2_2_4_2_2_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2_2_2_1.setBorder(null);
		PanelRegistrarDatosCliente2.add(lblNewLabel_3_2_2_4_2_2_2_1);

		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(
				new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/ImagenRegistrarCliente.png")));
		lblNewLabel_12.setBounds(624, 29, 257, 225);
		PanelRegistrarDatosCliente2.add(lblNewLabel_12);

		PanelContenedorRegistroInmuebles = new JPanel();
		PanelContenedorRegistroInmuebles.setBackground(new Color(255, 255, 255));
		tabbedPane_1.addTab("Inmueble", null, PanelContenedorRegistroInmuebles, null);
		PanelContenedorRegistroInmuebles.setLayout(new CardLayout(0, 0));

		PanelDatosRegistrarInmueble1 = new JPanel();
		PanelDatosRegistrarInmueble1.setBackground(new Color(255, 255, 255));
		PanelContenedorRegistroInmuebles.add(PanelDatosRegistrarInmueble1, "name_2973916876800");
		PanelDatosRegistrarInmueble1.setLayout(null);

		JLabel lblNewLabel_3_2_2_4 = new JLabel("Numero de Padron");
		lblNewLabel_3_2_2_4.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4.setBorder(null);
		lblNewLabel_3_2_2_4.setBounds(10, 92, 234, 57);
		PanelDatosRegistrarInmueble1.add(lblNewLabel_3_2_2_4);

		txtRegistrarInmueblePadron = new JTextField();
		txtRegistrarInmueblePadron.setForeground(Color.BLACK);
		txtRegistrarInmueblePadron.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarInmueblePadron.setColumns(10);
		txtRegistrarInmueblePadron.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarInmueblePadron.setBounds(10, 132, 543, 42);
		PanelDatosRegistrarInmueble1.add(txtRegistrarInmueblePadron);

		JLabel lblNewLabel_3_2_2_4_1 = new JLabel("Ubicacion:");
		lblNewLabel_3_2_2_4_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_1.setBorder(null);
		lblNewLabel_3_2_2_4_1.setBounds(10, 167, 112, 57);
		PanelDatosRegistrarInmueble1.add(lblNewLabel_3_2_2_4_1);

		txtRegistrarInmuebleDepartamento = new JTextField();
		txtRegistrarInmuebleDepartamento.setForeground(Color.BLACK);
		txtRegistrarInmuebleDepartamento.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarInmuebleDepartamento.setColumns(10);
		txtRegistrarInmuebleDepartamento.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarInmuebleDepartamento.setBounds(10, 287, 163, 57);
		PanelDatosRegistrarInmueble1.add(txtRegistrarInmuebleDepartamento);

		JLabel lblNewLabel_3_2_2_4_1_1 = new JLabel("Departamento");
		lblNewLabel_3_2_2_4_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_1_1.setBorder(null);
		lblNewLabel_3_2_2_4_1_1.setBounds(10, 235, 163, 57);
		PanelDatosRegistrarInmueble1.add(lblNewLabel_3_2_2_4_1_1);

		JLabel lblNewLabel_3_2_2_4_1_1_1 = new JLabel("Calle");
		lblNewLabel_3_2_2_4_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_1_1_1.setBorder(null);
		lblNewLabel_3_2_2_4_1_1_1.setBounds(200, 235, 163, 57);
		PanelDatosRegistrarInmueble1.add(lblNewLabel_3_2_2_4_1_1_1);

		txtRegistrarInmuebleCalle = new JTextField();
		txtRegistrarInmuebleCalle.setForeground(Color.BLACK);
		txtRegistrarInmuebleCalle.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarInmuebleCalle.setColumns(10);
		txtRegistrarInmuebleCalle.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarInmuebleCalle.setBounds(200, 287, 163, 57);
		PanelDatosRegistrarInmueble1.add(txtRegistrarInmuebleCalle);

		JLabel lblNewLabel_3_2_2_4_1_1_1_1 = new JLabel("Numero de Puerta");
		lblNewLabel_3_2_2_4_1_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_1_1_1_1.setBorder(null);
		lblNewLabel_3_2_2_4_1_1_1_1.setBounds(390, 235, 175, 57);
		PanelDatosRegistrarInmueble1.add(lblNewLabel_3_2_2_4_1_1_1_1);

		txtRegistrarInmuebleCalleNPuerta = new JTextField();
		txtRegistrarInmuebleCalleNPuerta.setForeground(Color.BLACK);
		txtRegistrarInmuebleCalleNPuerta.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarInmuebleCalleNPuerta.setColumns(10);
		txtRegistrarInmuebleCalleNPuerta.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarInmuebleCalleNPuerta.setBounds(390, 287, 163, 57);
		PanelDatosRegistrarInmueble1.add(txtRegistrarInmuebleCalleNPuerta);

		JButton btnSiguienteRegistrarInmueble1 = new JButton("Siguiente");
		btnSiguienteRegistrarInmueble1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Datos.ValidarCreacionInmueble1(txtCedulaDuenioInmueble,txtRegistrarInmueblePadron, txtRegistrarInmuebleDepartamento, txtRegistrarInmuebleCalle, txtRegistrarInmuebleCalleNPuerta)==true) {
					if(txtCedulaDuenioInmueble.getText().length()<=10) {
						if(Datos.validarEnteroPadron(txtRegistrarInmueblePadron)==true) {
							Datos.cambiarJPanel(PanelContenedorRegistroInmuebles, PanelDatosRegistrarInmueble2);
						}
					}else {
						JOptionPane.showMessageDialog(null,"Aviso,La cedula no puede superar el maximo permitido","Aviso",JOptionPane.WARNING_MESSAGE);
						txtCedulaDuenioInmueble.setText("");
					}
					
				}
             
			}
		});
		btnSiguienteRegistrarInmueble1.setForeground(Color.WHITE);
		btnSiguienteRegistrarInmueble1.setFont(new Font("Arial", Font.BOLD, 15));
		btnSiguienteRegistrarInmueble1.setBorderPainted(false);
		btnSiguienteRegistrarInmueble1.setBackground(new Color(0, 64, 128));
		btnSiguienteRegistrarInmueble1.setBounds(685, 281, 216, 42);
		PanelDatosRegistrarInmueble1.add(btnSiguienteRegistrarInmueble1);

		JLabel lblNewLabel_3_2_2_4_2_2_2_1_1 = new JLabel("1/3");
		lblNewLabel_3_2_2_4_2_2_2_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2_2_2_1_1.setBorder(null);
		lblNewLabel_3_2_2_4_2_2_2_1_1.setBounds(911, 0, 30, 35);
		PanelDatosRegistrarInmueble1.add(lblNewLabel_3_2_2_4_2_2_2_1_1);

		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/ImagenCasa.png")));
		lblNewLabel_13.setBounds(651, 24, 256, 235);
		PanelDatosRegistrarInmueble1.add(lblNewLabel_13);
		
		txtCedulaDuenioInmueble = new JTextField();
		txtCedulaDuenioInmueble.setForeground(Color.BLACK);
		txtCedulaDuenioInmueble.setFont(new Font("Arial", Font.BOLD, 20));
		txtCedulaDuenioInmueble.setColumns(10);
		txtCedulaDuenioInmueble.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtCedulaDuenioInmueble.setBounds(10, 46, 543, 42);
		PanelDatosRegistrarInmueble1.add(txtCedulaDuenioInmueble);
		
		JLabel lblNewLabel_3_2_2_4_3 = new JLabel("Cedula Dueño");
		lblNewLabel_3_2_2_4_3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_3.setBorder(null);
		lblNewLabel_3_2_2_4_3.setBounds(10, 0, 234, 57);
		PanelDatosRegistrarInmueble1.add(lblNewLabel_3_2_2_4_3);

		PanelDatosRegistrarInmueble2 = new JPanel();
		PanelDatosRegistrarInmueble2.setBackground(new Color(255, 255, 255));
		PanelContenedorRegistroInmuebles.add(PanelDatosRegistrarInmueble2, "name_2973939465500");
		PanelDatosRegistrarInmueble2.setLayout(null);

		JLabel lblNewLabel_3_2_2_4_2 = new JLabel("Valor en dolares");
		lblNewLabel_3_2_2_4_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2.setBorder(null);
		lblNewLabel_3_2_2_4_2.setBounds(10, 11, 234, 57);
		PanelDatosRegistrarInmueble2.add(lblNewLabel_3_2_2_4_2);

		txtRegistrarInmuebleValorDolares = new JTextField();
		txtRegistrarInmuebleValorDolares.setForeground(Color.BLACK);
		txtRegistrarInmuebleValorDolares.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarInmuebleValorDolares.setColumns(10);
		txtRegistrarInmuebleValorDolares.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarInmuebleValorDolares.setBounds(10, 58, 550, 48);
		PanelDatosRegistrarInmueble2.add(txtRegistrarInmuebleValorDolares);

		JLabel lblNewLabel_3_2_2_3_1 = new JLabel("Tipo de Inmueble");
		lblNewLabel_3_2_2_3_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_3_1.setBorder(null);
		lblNewLabel_3_2_2_3_1.setBounds(10, 117, 234, 57);
		PanelDatosRegistrarInmueble2.add(lblNewLabel_3_2_2_3_1);

		btnRegistroInmuebleTerreno = new JRadioButton("Terreno");
		btnRegistroInmuebleTerreno.setFont(new Font("Arial", Font.BOLD, 18));
		btnRegistroInmuebleTerreno.setBorder(null);
		btnRegistroInmuebleTerreno.setBackground(Color.WHITE);
		btnRegistroInmuebleTerreno.setBounds(10, 172, 116, 23);
		PanelDatosRegistrarInmueble2.add(btnRegistroInmuebleTerreno);

		btnRegistroInmuebleHabitable = new JRadioButton("Habitable");
		btnRegistroInmuebleHabitable.setFont(new Font("Arial", Font.BOLD, 18));
		btnRegistroInmuebleHabitable.setBorder(null);
		btnRegistroInmuebleHabitable.setBackground(Color.WHITE);
		btnRegistroInmuebleHabitable.setBounds(126, 172, 145, 23);
		PanelDatosRegistrarInmueble2.add(btnRegistroInmuebleHabitable);

		JLabel lblNewLabel_3_2_2_4_2_1 = new JLabel("Tamaño en Mcuadrados");
		lblNewLabel_3_2_2_4_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2_1.setBorder(null);
		lblNewLabel_3_2_2_4_2_1.setBounds(10, 224, 234, 57);
		PanelDatosRegistrarInmueble2.add(lblNewLabel_3_2_2_4_2_1);

		txtRegistrarInmuebleTamanio = new JTextField();
		txtRegistrarInmuebleTamanio.setForeground(Color.BLACK);
		txtRegistrarInmuebleTamanio.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarInmuebleTamanio.setColumns(10);
		txtRegistrarInmuebleTamanio.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarInmuebleTamanio.setBounds(10, 262, 550, 57);
		PanelDatosRegistrarInmueble2.add(txtRegistrarInmuebleTamanio);

		JButton btnAtrasRegistrarInmueble2 = new JButton("Atras");
		btnAtrasRegistrarInmueble2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos.cambiarJPanel(PanelContenedorRegistroInmuebles, PanelDatosRegistrarInmueble1);
			}
		});
		btnAtrasRegistrarInmueble2.setForeground(Color.WHITE);
		btnAtrasRegistrarInmueble2.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasRegistrarInmueble2.setBorderPainted(false);
		btnAtrasRegistrarInmueble2.setBackground(new Color(0, 64, 128));
		btnAtrasRegistrarInmueble2.setBounds(595, 277, 154, 42);
		PanelDatosRegistrarInmueble2.add(btnAtrasRegistrarInmueble2);

		JButton btnSiguienteRegistrarInmueble2 = new JButton("Siguiente");
		btnSiguienteRegistrarInmueble2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 if(Datos.ValidarCreacionInmueble2(txtRegistrarInmuebleValorDolares,txtRegistrarInmuebleTamanio) == true) {
                	 if(btnRegistroInmuebleHabitable.isSelected()) {
                		 Datos.cambiarJPanel(PanelContenedorRegistroInmuebles, PanelDatosRegistrarInmueble4);
                	 }else {
                		 if(btnRegistroInmuebleTerreno.isSelected()) {
                			 Datos.cambiarJPanel(PanelContenedorRegistroInmuebles, PanelDatosRegistrarInmueble3);
                		 }else {
                			 JOptionPane.showMessageDialog(null, "Error, Debe seleccionar el tipo de Inmueble","Aviso",JOptionPane.WARNING_MESSAGE);
                		 }
                	 }
                		
                 }
			}
		});
		btnSiguienteRegistrarInmueble2.setForeground(Color.WHITE);
		btnSiguienteRegistrarInmueble2.setFont(new Font("Arial", Font.BOLD, 15));
		btnSiguienteRegistrarInmueble2.setBorderPainted(false);
		btnSiguienteRegistrarInmueble2.setBackground(new Color(0, 64, 128));
		btnSiguienteRegistrarInmueble2.setBounds(777, 277, 154, 42);
		PanelDatosRegistrarInmueble2.add(btnSiguienteRegistrarInmueble2);

		JLabel lblNewLabel_3_2_2_4_2_2_2_1_2 = new JLabel("2/3");
		lblNewLabel_3_2_2_4_2_2_2_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2_2_2_1_2.setBorder(null);
		lblNewLabel_3_2_2_4_2_2_2_1_2.setBounds(904, 0, 37, 35);
		PanelDatosRegistrarInmueble2.add(lblNewLabel_3_2_2_4_2_2_2_1_2);

		PanelDatosRegistrarInmueble3 = new JPanel();
		PanelDatosRegistrarInmueble3.setBackground(new Color(255, 255, 255));
		PanelContenedorRegistroInmuebles.add(PanelDatosRegistrarInmueble3, "name_2973964682000");
		PanelDatosRegistrarInmueble3.setLayout(null);

		lblNewLabel_3_2_2_4_2_2 = new JLabel("Servicios ");
		lblNewLabel_3_2_2_4_2_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2_2.setBorder(null);
		lblNewLabel_3_2_2_4_2_2.setBounds(25, 11, 234, 42);
		PanelDatosRegistrarInmueble3.add(lblNewLabel_3_2_2_4_2_2);

		chckbxUteOSE = new JCheckBox("OSE");
		chckbxUteOSE.setBackground(new Color(255, 255, 255));
		chckbxUteOSE.setFont(new Font("Arial", Font.BOLD, 18));
		chckbxUteOSE.setBounds(10, 60, 84, 23);
		PanelDatosRegistrarInmueble3.add(chckbxUteOSE);

		chckbxUTE = new JCheckBox("UTE");
		chckbxUTE.setBackground(new Color(255, 255, 255));
		chckbxUTE.setFont(new Font("Arial", Font.BOLD, 18));
		chckbxUTE.setBounds(130, 60, 63, 23);
		PanelDatosRegistrarInmueble3.add(chckbxUTE);

		chckbxTelecomunicaciones = new JCheckBox("Telecomunicaciones");
		chckbxTelecomunicaciones.setBackground(new Color(255, 255, 255));
		chckbxTelecomunicaciones.setFont(new Font("Arial", Font.BOLD, 18));
		chckbxTelecomunicaciones.setBounds(10, 101, 223, 23);
		PanelDatosRegistrarInmueble3.add(chckbxTelecomunicaciones);

		JButton btnAtrasRegistrarInmueble3 = new JButton("Atras");
		btnAtrasRegistrarInmueble3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos.cambiarJPanel(PanelContenedorRegistroInmuebles, PanelDatosRegistrarInmueble2);
			}
		});
		btnAtrasRegistrarInmueble3.setForeground(Color.WHITE);
		btnAtrasRegistrarInmueble3.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasRegistrarInmueble3.setBorderPainted(false);
		btnAtrasRegistrarInmueble3.setBackground(new Color(0, 64, 128));
		btnAtrasRegistrarInmueble3.setBounds(595, 277, 154, 42);
		PanelDatosRegistrarInmueble3.add(btnAtrasRegistrarInmueble3);

		JButton botonConfirmarCrearTerreno = new JButton("Confirmar");
		botonConfirmarCrearTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

            BaseDeDatos.ingresarInmueble(txtCedulaDuenioInmueble, txtRegistrarInmueblePadron,txtRegistrarInmuebleValorDolares, 
            		txtRegistrarInmuebleDepartamento, txtRegistrarInmuebleCalle, txtRegistrarInmuebleCalleNPuerta);
            BaseDeDatos.ingresarTerreno(txtRegistrarInmueblePadron, txtRegistrarInmuebleTamanio);
            
            	if(chckbxUteOSE.isSelected()) {
            		 BaseDeDatos.ingresarTerrenoServicios(txtRegistrarInmueblePadron, "OSE");
                   }
                   if(chckbxUTE.isSelected()) {
                	   BaseDeDatos.ingresarTerrenoServicios(txtRegistrarInmueblePadron, "UTE");
                   }
                   if(chckbxTelecomunicaciones.isSelected()) {
                	   BaseDeDatos.ingresarTerrenoServicios(txtRegistrarInmueblePadron, "Telecomunicaciones");
                 	   
                   }
                   if(chckbxAlcantarillado.isSelected()) {
                	   BaseDeDatos.ingresarTerrenoServicios(txtRegistrarInmueblePadron, "Alcantarillado");	    
            }
                   BaseDeDatos.ingresarTerrenoServicios(txtRegistrarInmueblePadron, "");
               Datos.LimpiarTextos(txtCedulaDuenioInmueble, txtRegistrarInmueblePadron, txtRegistrarInmuebleValorDolares,txtRegistrarInmuebleDepartamento, 
          txtRegistrarInmuebleCalle, txtRegistrarInmuebleCalleNPuerta, txtRegistrarClienteEmail, txtRegistrarInmuebleValorDolares);
				
			}
		});
		botonConfirmarCrearTerreno.setForeground(Color.WHITE);
		botonConfirmarCrearTerreno.setFont(new Font("Arial", Font.BOLD, 15));
		botonConfirmarCrearTerreno.setBorderPainted(false);
		botonConfirmarCrearTerreno.setBackground(new Color(0, 64, 128));
		botonConfirmarCrearTerreno.setBounds(777, 277, 154, 42);
		PanelDatosRegistrarInmueble3.add(botonConfirmarCrearTerreno);

		JLabel lblNewLabel_3_2_2_4_2_2_2_1_2_1 = new JLabel("3/3");
		lblNewLabel_3_2_2_4_2_2_2_1_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2_2_2_1_2_1.setBorder(null);
		lblNewLabel_3_2_2_4_2_2_2_1_2_1.setBounds(904, 0, 37, 35);
		PanelDatosRegistrarInmueble3.add(lblNewLabel_3_2_2_4_2_2_2_1_2_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("");
		lblNewLabel_14_1.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/ImagenCasa.png")));
		lblNewLabel_14_1.setBounds(632, 11, 248, 231);
		PanelDatosRegistrarInmueble3.add(lblNewLabel_14_1);
		
		chckbxAlcantarillado = new JCheckBox("Alcantarillado");
		chckbxAlcantarillado.setFont(new Font("Arial", Font.BOLD, 18));
		chckbxAlcantarillado.setBackground(Color.WHITE);
		chckbxAlcantarillado.setBounds(10, 142, 199, 23);
		PanelDatosRegistrarInmueble3.add(chckbxAlcantarillado);

		PanelModificarDatos = new JPanel();
		PanelModificarDatos.setBackground(new Color(255, 255, 255));
		ContenedorPanel.add(PanelModificarDatos, "name_18794656173800");
		PanelModificarDatos.setLayout(null);

		JLabel lblNewLabel_8_1 = new JLabel("Modificar datos del Cliente/Inmueble");
		lblNewLabel_8_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_8_1.setBounds(10, 0, 946, 57);
		PanelModificarDatos.add(lblNewLabel_8_1);

		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBackground(new Color(0, 64, 128));
		separator_2_2.setBounds(10, 62, 946, 2);
		PanelModificarDatos.add(separator_2_2);

		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(10, 68, 946, 387);
		PanelModificarDatos.add(tabbedPane_2);

		ContenedroModificarDatosCliente = new JPanel();
		ContenedroModificarDatosCliente.setBackground(new Color(255, 255, 255));
		tabbedPane_2.addTab("Cliente", null, ContenedroModificarDatosCliente, null);
		ContenedroModificarDatosCliente.setLayout(new CardLayout(0, 0));
		
		ModificarDatoCliente1 = new JPanel();
		ModificarDatoCliente1.setBackground(new Color(255, 255, 255));
		ContenedroModificarDatosCliente.add(ModificarDatoCliente1, "name_41537323900800");
		ModificarDatoCliente1.setLayout(null);
		
		JLabel lblNewLabel_3_2_2_3 = new JLabel("Cedula del Cliente a modificar");
		lblNewLabel_3_2_2_3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_3.setBorder(null);
		lblNewLabel_3_2_2_3.setBounds(15, 8, 295, 57);
		ModificarDatoCliente1.add(lblNewLabel_3_2_2_3);
		
		txtCedulaModificarCliente = new JTextField();
		txtCedulaModificarCliente.setForeground(Color.BLACK);
		txtCedulaModificarCliente.setFont(new Font("Arial", Font.BOLD, 20));
		txtCedulaModificarCliente.setColumns(10);
		txtCedulaModificarCliente.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtCedulaModificarCliente.setBounds(15, 46, 522, 57);
		ModificarDatoCliente1.add(txtCedulaModificarCliente);
		
		JLabel lblNewLabel_3_2_3_2 = new JLabel("Nombre");
		lblNewLabel_3_2_3_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_3_2.setBorder(null);
		lblNewLabel_3_2_3_2.setBounds(15, 110, 90, 57);
		ModificarDatoCliente1.add(lblNewLabel_3_2_3_2);
		
		txtNombreModificar = new JTextField();
		txtNombreModificar.setForeground(Color.BLACK);
		txtNombreModificar.setFont(new Font("Arial", Font.BOLD, 20));
		txtNombreModificar.setColumns(10);
		txtNombreModificar.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtNombreModificar.setBounds(15, 155, 234, 42);
		ModificarDatoCliente1.add(txtNombreModificar);
		
		JLabel lblNewLabel_3_2_4_3 = new JLabel("Fecha de Nacimiento");
		lblNewLabel_3_2_4_3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_4_3.setBorder(null);
		lblNewLabel_3_2_4_3.setBounds(15, 208, 215, 35);
		ModificarDatoCliente1.add(lblNewLabel_3_2_4_3);
		
		JLabel lblNewLabel_3_2_3_1_1 = new JLabel("Apellido");
		lblNewLabel_3_2_3_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_3_1_1.setBorder(null);
		lblNewLabel_3_2_3_1_1.setBounds(304, 110, 90, 57);
		ModificarDatoCliente1.add(lblNewLabel_3_2_3_1_1);
		
		txtApellidoModificar = new JTextField();
		txtApellidoModificar.setForeground(Color.BLACK);
		txtApellidoModificar.setFont(new Font("Arial", Font.BOLD, 20));
		txtApellidoModificar.setColumns(10);
		txtApellidoModificar.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtApellidoModificar.setBounds(303, 155, 234, 42);
		ModificarDatoCliente1.add(txtApellidoModificar);
		
		txtAnioModificar = new JTextField();
		txtAnioModificar.setForeground(Color.BLACK);
		txtAnioModificar.setFont(new Font("Arial", Font.BOLD, 20));
		txtAnioModificar.setColumns(10);
		txtAnioModificar.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtAnioModificar.setBounds(24, 290, 99, 42);
		ModificarDatoCliente1.add(txtAnioModificar);
		
		txtMesModificar = new JTextField();
		txtMesModificar.setForeground(Color.BLACK);
		txtMesModificar.setFont(new Font("Arial", Font.BOLD, 20));
		txtMesModificar.setColumns(10);
		txtMesModificar.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtMesModificar.setBounds(174, 290, 99, 42);
		ModificarDatoCliente1.add(txtMesModificar);
		
		txtDiaModificar = new JTextField();
		txtDiaModificar.setForeground(Color.BLACK);
		txtDiaModificar.setFont(new Font("Arial", Font.BOLD, 20));
		txtDiaModificar.setColumns(10);
		txtDiaModificar.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtDiaModificar.setBounds(331, 290, 99, 42);
		ModificarDatoCliente1.add(txtDiaModificar);
		
		JLabel lblNewLabel_3_2_4_1_2 = new JLabel("/");
		lblNewLabel_3_2_4_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_4_1_2.setBorder(null);
		lblNewLabel_3_2_4_1_2.setBounds(141, 306, 17, 42);
		ModificarDatoCliente1.add(lblNewLabel_3_2_4_1_2);
		
		JLabel lblNewLabel_3_2_4_1_1_1 = new JLabel("/");
		lblNewLabel_3_2_4_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_4_1_1_1.setBorder(null);
		lblNewLabel_3_2_4_1_1_1.setBounds(295, 306, 17, 42);
		ModificarDatoCliente1.add(lblNewLabel_3_2_4_1_1_1);
		
		JLabel lblNewLabel_3_2_4_2_2 = new JLabel("Dia");
		lblNewLabel_3_2_4_2_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_4_2_2.setBorder(null);
		lblNewLabel_3_2_4_2_2.setBounds(331, 250, 31, 35);
		ModificarDatoCliente1.add(lblNewLabel_3_2_4_2_2);
		
		JLabel lblNewLabel_3_2_4_2_1_2 = new JLabel("Mes");
		lblNewLabel_3_2_4_2_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_4_2_1_2.setBorder(null);
		lblNewLabel_3_2_4_2_1_2.setBounds(178, 250, 50, 35);
		ModificarDatoCliente1.add(lblNewLabel_3_2_4_2_1_2);
		
		JLabel lblNewLabel_3_2_4_2_1_1_1 = new JLabel("Año");
		lblNewLabel_3_2_4_2_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_4_2_1_1_1.setBorder(null);
		lblNewLabel_3_2_4_2_1_1_1.setBounds(25, 254, 50, 35);
		ModificarDatoCliente1.add(lblNewLabel_3_2_4_2_1_1_1);
		
		JButton bntSiguienteRegistrarCliente1_1 = new JButton("Siguiente");
		bntSiguienteRegistrarCliente1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            if(Datos.ValidarModificacionUsuarios(txtCedulaModificarCliente, txtNombreModificar, txtApellidoModificar, txtAnioModificar, txtMesModificar, txtDiaModificar)==true) {
            	if(txtCedulaModificarCliente.getText().length()<=10) {
            		 Datos.cambiarJPanel(ContenedroModificarDatosCliente, ModificarDatoCliente2);
            	}else {
            		JOptionPane.showMessageDialog(null,"Error, La cedula supera el maximo de caracteres permitidos","Aviso",JOptionPane.WARNING_MESSAGE);
            	}
              
            	
            }
			}
		});
		bntSiguienteRegistrarCliente1_1.setForeground(Color.WHITE);
		bntSiguienteRegistrarCliente1_1.setFont(new Font("Arial", Font.BOLD, 15));
		bntSiguienteRegistrarCliente1_1.setBorderPainted(false);
		bntSiguienteRegistrarCliente1_1.setBackground(new Color(0, 64, 128));
		bntSiguienteRegistrarCliente1_1.setBounds(651, 296, 216, 42);
		ModificarDatoCliente1.add(bntSiguienteRegistrarCliente1_1);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/ImagenRegistrarCliente.png")));
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_15.setBounds(631, 31, 266, 237);
		ModificarDatoCliente1.add(lblNewLabel_15);
		
		ModificarDatoCliente2 = new JPanel();
		ModificarDatoCliente2.setBackground(new Color(255, 255, 255));
		ContenedroModificarDatosCliente.add(ModificarDatoCliente2, "name_41548212931500");
		ModificarDatoCliente2.setLayout(null);
		
		JLabel lblNewLabel_3_2_2_1_1 = new JLabel("Email");
		lblNewLabel_3_2_2_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_1_1.setBorder(null);
		lblNewLabel_3_2_2_1_1.setBounds(9, 21, 234, 57);
		ModificarDatoCliente2.add(lblNewLabel_3_2_2_1_1);
		
		txtEmailModificarUsuario = new JTextField();
		txtEmailModificarUsuario.setForeground(Color.BLACK);
		txtEmailModificarUsuario.setFont(new Font("Arial", Font.BOLD, 20));
		txtEmailModificarUsuario.setColumns(10);
		txtEmailModificarUsuario.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtEmailModificarUsuario.setBounds(9, 59, 571, 57);
		ModificarDatoCliente2.add(txtEmailModificarUsuario);
		
		JLabel lblNewLabel_3_2_2_2_1 = new JLabel("Telefono");
		lblNewLabel_3_2_2_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_2_1.setBorder(null);
		lblNewLabel_3_2_2_2_1.setBounds(9, 127, 234, 57);
		ModificarDatoCliente2.add(lblNewLabel_3_2_2_2_1);
		
		txtTelefonoModificarUsuario = new JTextField();
		txtTelefonoModificarUsuario.setForeground(Color.BLACK);
		txtTelefonoModificarUsuario.setFont(new Font("Arial", Font.BOLD, 20));
		txtTelefonoModificarUsuario.setColumns(10);
		txtTelefonoModificarUsuario.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtTelefonoModificarUsuario.setBounds(9, 165, 571, 57);
		ModificarDatoCliente2.add(txtTelefonoModificarUsuario);
		
		JButton btnAtrasRegistrarCliente2_1 = new JButton("Atras");
		btnAtrasRegistrarCliente2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Datos.cambiarJPanel(ContenedroModificarDatosCliente, ModificarDatoCliente1);
				
			}
		});
		btnAtrasRegistrarCliente2_1.setForeground(Color.WHITE);
		btnAtrasRegistrarCliente2_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasRegistrarCliente2_1.setBorderPainted(false);
		btnAtrasRegistrarCliente2_1.setBackground(new Color(0, 64, 128));
		btnAtrasRegistrarCliente2_1.setBounds(588, 292, 154, 42);
		ModificarDatoCliente2.add(btnAtrasRegistrarCliente2_1);
		
		JButton btnConfirmarCrearUsuario_1_2_2_2_1 = new JButton("Finalizar");
		btnConfirmarCrearUsuario_1_2_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Datos.ValidarCreacionUsuario2(txtEmailModificarUsuario, txtTelefonoModificarUsuario)== true) {
					BaseDeDatos.modificarDatosUsuarios(txtCedulaModificarCliente, txtNombreModificar, txtApellidoModificar, txtAnioModificar, txtMesModificar, txtDiaModificar, txtEmailModificarUsuario, txtTelefonoModificarUsuario);
					Datos.LimpiarTextos(txtCedulaModificarCliente,txtNombreModificar,txtApellidoModificar,txtAnioModificar,txtMesModificar,txtDiaModificar,txtTelefonoModificarUsuario,txtEmailModificarUsuario);
				}
			}
		});
		btnConfirmarCrearUsuario_1_2_2_2_1.setForeground(Color.WHITE);
		btnConfirmarCrearUsuario_1_2_2_2_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfirmarCrearUsuario_1_2_2_2_1.setBorderPainted(false);
		btnConfirmarCrearUsuario_1_2_2_2_1.setBackground(new Color(0, 64, 128));
		btnConfirmarCrearUsuario_1_2_2_2_1.setBounds(770, 292, 154, 42);
		ModificarDatoCliente2.add(btnConfirmarCrearUsuario_1_2_2_2_1);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/ImagenRegistrarCliente.png")));
		lblNewLabel_17.setBounds(648, 11, 261, 258);
		ModificarDatoCliente2.add(lblNewLabel_17);

		ContenedorModificarDatosInmueble = new JPanel();
		ContenedorModificarDatosInmueble.setBackground(new Color(255, 255, 255));
		tabbedPane_2.addTab("Inmueble", null, ContenedorModificarDatosInmueble, null);
		ContenedorModificarDatosInmueble.setLayout(new CardLayout(0, 0));
		
		ModificarDatosCliente1 = new JPanel();
		ModificarDatosCliente1.setBackground(new Color(255, 255, 255));
		ContenedorModificarDatosInmueble.add(ModificarDatosCliente1, "name_42087466715700");
		ModificarDatosCliente1.setLayout(null);
		
		JLabel lblNewLabel_3_2_2_4_1_2 = new JLabel("Ubicacion:");
		lblNewLabel_3_2_2_4_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_1_2.setBorder(null);
		lblNewLabel_3_2_2_4_1_2.setBounds(10, 124, 112, 57);
		ModificarDatosCliente1.add(lblNewLabel_3_2_2_4_1_2);
		
		txtDepartamentoModificarInmueble = new JTextField();
		txtDepartamentoModificarInmueble.setForeground(Color.BLACK);
		txtDepartamentoModificarInmueble.setFont(new Font("Arial", Font.BOLD, 20));
		txtDepartamentoModificarInmueble.setColumns(10);
		txtDepartamentoModificarInmueble.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtDepartamentoModificarInmueble.setBounds(10, 244, 163, 57);
		ModificarDatosCliente1.add(txtDepartamentoModificarInmueble);
		
		JLabel lblNewLabel_3_2_2_4_1_1_2 = new JLabel("Departamento");
		lblNewLabel_3_2_2_4_1_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_1_1_2.setBorder(null);
		lblNewLabel_3_2_2_4_1_1_2.setBounds(10, 192, 163, 57);
		ModificarDatosCliente1.add(lblNewLabel_3_2_2_4_1_1_2);
		
		JLabel lblNewLabel_3_2_2_4_1_1_1_2 = new JLabel("Calle");
		lblNewLabel_3_2_2_4_1_1_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_1_1_1_2.setBorder(null);
		lblNewLabel_3_2_2_4_1_1_1_2.setBounds(200, 192, 163, 57);
		ModificarDatosCliente1.add(lblNewLabel_3_2_2_4_1_1_1_2);
		
		txtCalleModificarInmueble = new JTextField();
		txtCalleModificarInmueble.setForeground(Color.BLACK);
		txtCalleModificarInmueble.setFont(new Font("Arial", Font.BOLD, 20));
		txtCalleModificarInmueble.setColumns(10);
		txtCalleModificarInmueble.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtCalleModificarInmueble.setBounds(200, 244, 163, 57);
		ModificarDatosCliente1.add(txtCalleModificarInmueble);
		
		JLabel lblNewLabel_3_2_2_4_1_1_1_1_1 = new JLabel("Numero de Puerta");
		lblNewLabel_3_2_2_4_1_1_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_1_1_1_1_1.setBorder(null);
		lblNewLabel_3_2_2_4_1_1_1_1_1.setBounds(390, 192, 175, 57);
		ModificarDatosCliente1.add(lblNewLabel_3_2_2_4_1_1_1_1_1);
		
		txtPuertaModificarInmueble = new JTextField();
		txtPuertaModificarInmueble.setForeground(Color.BLACK);
		txtPuertaModificarInmueble.setFont(new Font("Arial", Font.BOLD, 20));
		txtPuertaModificarInmueble.setColumns(10);
		txtPuertaModificarInmueble.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtPuertaModificarInmueble.setBounds(390, 244, 163, 57);
		ModificarDatosCliente1.add(txtPuertaModificarInmueble);
		
		txtPadronModificarInmueble = new JTextField();
		txtPadronModificarInmueble.setForeground(Color.BLACK);
		txtPadronModificarInmueble.setFont(new Font("Arial", Font.BOLD, 20));
		txtPadronModificarInmueble.setColumns(10);
		txtPadronModificarInmueble.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtPadronModificarInmueble.setBounds(10, 53, 543, 42);
		ModificarDatosCliente1.add(txtPadronModificarInmueble);
		
		JLabel lblNewLabel_3_2_2_4_3_1 = new JLabel("Padron del inmueble a modificar");
		lblNewLabel_3_2_2_4_3_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_3_1.setBorder(null);
		lblNewLabel_3_2_2_4_3_1.setBounds(10, 7, 318, 57);
		ModificarDatosCliente1.add(lblNewLabel_3_2_2_4_3_1);
		
		JButton btnConfirmarCrearUsuario_1_2_2_2_1_1 = new JButton("Confirmar");
		btnConfirmarCrearUsuario_1_2_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if(Datos.validarModificacionInmueble(txtPadronModificarInmueble, txtDepartamentoModificarInmueble, txtCalleModificarInmueble, txtPuertaModificarInmueble) == true) {
					
					 BaseDeDatos.modificarDatosInmueble(txtDepartamentoModificarInmueble, txtCalleModificarInmueble, txtPuertaModificarInmueble, txtPadronModificarInmueble);
					 txtDepartamentoModificarInmueble.setText("");
					 txtCalleModificarInmueble.setText("");
					 txtPuertaModificarInmueble.setText("");
					 txtPadronModificarInmueble.setText("");
				 }
			}
		});
		btnConfirmarCrearUsuario_1_2_2_2_1_1.setForeground(Color.WHITE);
		btnConfirmarCrearUsuario_1_2_2_2_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfirmarCrearUsuario_1_2_2_2_1_1.setBorderPainted(false);
		btnConfirmarCrearUsuario_1_2_2_2_1_1.setBackground(new Color(0, 64, 128));
		btnConfirmarCrearUsuario_1_2_2_2_1_1.setBounds(656, 279, 230, 49);
		ModificarDatosCliente1.add(btnConfirmarCrearUsuario_1_2_2_2_1_1);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/ImagenCasa.png")));
		lblNewLabel_18.setBounds(647, 16, 256, 252);
		ModificarDatosCliente1.add(lblNewLabel_18);

		PanelConsultarDatos = new JPanel();
		PanelConsultarDatos.setBackground(new Color(255, 255, 255));
		ContenedorPanel.add(PanelConsultarDatos, "name_18800695730100");
		PanelConsultarDatos.setLayout(null);

		JLabel lblNewLabel_8_3 = new JLabel("Consultar datos del Cliente/Inmueble");
		lblNewLabel_8_3.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_8_3.setBounds(10, 0, 946, 57);
		PanelConsultarDatos.add(lblNewLabel_8_3);

		JSeparator separator_2_3 = new JSeparator();
		separator_2_3.setBackground(new Color(0, 64, 128));
		separator_2_3.setBounds(10, 62, 946, 2);
		PanelConsultarDatos.add(separator_2_3);

		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(10, 68, 946, 387);
		PanelConsultarDatos.add(tabbedPane_3);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		tabbedPane_3.addTab("Cliente", null, panel_5, null);
		panel_5.setLayout(null);

		JLabel lblNewLabel_8_2_1_2_1_3_1_1 = new JLabel("Nombre del Cliente");
		lblNewLabel_8_2_1_2_1_3_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_8_2_1_2_1_3_1_1.setBounds(0, 11, 232, 30);
		panel_5.add(lblNewLabel_8_2_1_2_1_3_1_1);

		txtNombreConsultarCliente = new JTextField();
		txtNombreConsultarCliente.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				  BaseDeDatos.cargarJTableCounsultaCliente(TablaConsultarCliente, txtNombreConsultarCliente);
				  if(txtNombreConsultarCliente.getText().isEmpty()) {
					  BaseDeDatos.verTablaClientes(TablaConsultarCliente);
				  }
			}
		});
		txtNombreConsultarCliente.setForeground(Color.BLACK);
		txtNombreConsultarCliente.setFont(new Font("Arial", Font.BOLD, 20));
		txtNombreConsultarCliente.setColumns(10);
		txtNombreConsultarCliente.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtNombreConsultarCliente.setBounds(237, 0, 517, 38);
		panel_5.add(txtNombreConsultarCliente);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 61, 941, 298);
		panel_5.add(scrollPane_3);

		TablaConsultarCliente = new JTable();
		TablaConsultarCliente.getTableHeader().setOpaque(false);
		TablaConsultarCliente.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "", null, null, null, null},
			},
			new String[] {
				"Cedula", "Nombre", "Apellido", "Fecha de Nacimiento", "Email", "Telefono"
			}
		));
		scrollPane_3.setViewportView(TablaConsultarCliente);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		tabbedPane_3.addTab("Habitable", null, panel_6, null);
		panel_6.setLayout(null);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 66, 941, 293);
		panel_6.add(scrollPane_4);

		TablaConsultarHabitable = new JTable();
		TablaConsultarHabitable.setFont(new Font("Tahoma", Font.PLAIN, 10));
		TablaConsultarHabitable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Padron ", "Tipo de Inmueble", "Tamanio", "Cuartos", "Banios", "Departamento", "Calle", "NPuerta", "Precio DLRS", "Otros Cuartos", "Comodidades"
			}
		));
		scrollPane_4.setViewportView(TablaConsultarHabitable);

		JLabel lblNewLabel_8_2_1_2_1_3_1_1_1 = new JLabel("Padron del Inmueble:");
		lblNewLabel_8_2_1_2_1_3_1_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_8_2_1_2_1_3_1_1_1.setBounds(10, 11, 254, 30);
		panel_6.add(lblNewLabel_8_2_1_2_1_3_1_1_1);

		txtPadronConsultarHabitable = new JTextField();
		txtPadronConsultarHabitable.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(txtPadronConsultarHabitable.getText().isEmpty()) {
					BaseDeDatos.verTablahabitable(TablaConsultarHabitable);
				}
				
				if(!txtPadronConsultarHabitable.getText().isEmpty()) {
					if(txtPadronConsultarHabitable.getText().matches("[0-9]*")) {
						if(txtPadronConsultarHabitable.getText().length() <= 10) {
							BaseDeDatos.cargarJTableConsultaHabitable(TablaConsultarHabitable,txtPadronConsultarHabitable);
                          
						}else {
						JOptionPane.showMessageDialog(null, "Error,El ingreo supera el maximo permitido","Error",JOptionPane.ERROR_MESSAGE);
						txtPadronConsultarHabitable.setText("");
						}
					}
				}
			}
		});
		txtPadronConsultarHabitable.setForeground(Color.BLACK);
		txtPadronConsultarHabitable.setFont(new Font("Arial", Font.BOLD, 20));
		txtPadronConsultarHabitable.setColumns(10);
		txtPadronConsultarHabitable.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtPadronConsultarHabitable.setBounds(260, 0, 500, 38);
		panel_6.add(txtPadronConsultarHabitable);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		tabbedPane_3.addTab("Terreno", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_8_2_1_2_1_3_1_1_1_1 = new JLabel("Padron del Terreno:");
		lblNewLabel_8_2_1_2_1_3_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_8_2_1_2_1_3_1_1_1_1.setBounds(22, 22, 254, 30);
		panel_7.add(lblNewLabel_8_2_1_2_1_3_1_1_1_1);
		
		txtConsultarTerreno = new JTextField();
		txtConsultarTerreno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtConsultarTerreno.getText().isEmpty()) {
					BaseDeDatos.verTablaTerreno(tablaConsultarTerreno);
				}
				if(!txtConsultarTerreno.getText().isEmpty()) {
					if(txtConsultarTerreno.getText().matches("[0-9]*")) {
						if(txtConsultarTerreno.getText().length() <= 10) {
							BaseDeDatos.cargarJTableConsultaTerreno( tablaConsultarTerreno,txtConsultarTerreno);
						}else {
							JOptionPane.showMessageDialog(null, "Error,El ingreo supera el maximo permitido","Error",JOptionPane.ERROR_MESSAGE);
							txtConsultarTerreno.setText("");
						}
						
					}
				}
			}
		});
		txtConsultarTerreno.setForeground(Color.BLACK);
		txtConsultarTerreno.setFont(new Font("Arial", Font.BOLD, 20));
		txtConsultarTerreno.setColumns(10);
		txtConsultarTerreno.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtConsultarTerreno.setBounds(272, 11, 500, 38);
		panel_7.add(txtConsultarTerreno);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 67, 921, 281);
		panel_7.add(scrollPane_5);
		
		tablaConsultarTerreno = new JTable();
		tablaConsultarTerreno.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Padron", "Departamento", "Calle", "Numero De Puerta", "Tamanio", "Valor DLRS", "Servicios"
			}
		));
		scrollPane_5.setViewportView(tablaConsultarTerreno);

		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/ImagenCasa.png")));
		lblNewLabel_14.setBounds(650, 22, 248, 231);
		PanelDatosRegistrarInmueble2.add(lblNewLabel_14);

		PanelDatosRegistrarInmueble4 = new JPanel();
		PanelDatosRegistrarInmueble4.setBackground(new Color(255, 255, 255));
		PanelContenedorRegistroInmuebles.add(PanelDatosRegistrarInmueble4, "name_2973985640600");
		PanelDatosRegistrarInmueble4.setLayout(null);

		JButton btnAtrasRegistrarInmueble4 = new JButton("Atras");
		btnAtrasRegistrarInmueble4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos.cambiarJPanel(PanelContenedorRegistroInmuebles, PanelDatosRegistrarInmueble2);
			}
		});
		btnAtrasRegistrarInmueble4.setForeground(Color.WHITE);
		btnAtrasRegistrarInmueble4.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasRegistrarInmueble4.setBorderPainted(false);
		btnAtrasRegistrarInmueble4.setBackground(new Color(0, 64, 128));
		btnAtrasRegistrarInmueble4.setBounds(595, 278, 154, 42);
		PanelDatosRegistrarInmueble4.add(btnAtrasRegistrarInmueble4);

		JButton btnConfirmarCrearUsuario_1_2_2_2_1_1_1 = new JButton("Confirmar");
		btnConfirmarCrearUsuario_1_2_2_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnRegistroCasa.isSelected()||rdbtnRegistroApartamento.isSelected()||rdbtnRegistroMejora.isSelected()) {
					
					BaseDeDatos.ingresarInmueble(txtCedulaDuenioInmueble, txtRegistrarInmueblePadron,txtRegistrarInmuebleValorDolares, 
		            		txtRegistrarInmuebleDepartamento, txtRegistrarInmuebleCalle, txtRegistrarInmuebleCalleNPuerta);
					
                    if(rdbtnRegistroCasa.isSelected()) {
                      BaseDeDatos.ingresarHabitable(txtRegistrarInmueblePadron,"Casa",txtRegistrarInmuebleTamanio,Integer.parseInt(String.valueOf(spinnerCuartos.getValue())),
                    		  Integer.parseInt(String.valueOf(spinnerBanios.getValue())));
                    }else {
                    	if(rdbtnRegistroApartamento.isSelected()) {
                    		BaseDeDatos.ingresarHabitable(txtRegistrarInmueblePadron,"Apartamento",txtRegistrarInmuebleTamanio,Integer.parseInt(String.valueOf(spinnerCuartos.getValue())),
                    				Integer.parseInt(String.valueOf(spinnerBanios.getValue())));
                    	}else {
                    		BaseDeDatos.ingresarHabitable(txtRegistrarInmueblePadron,"Mejoras",txtRegistrarInmuebleTamanio,Integer.parseInt(String.valueOf(spinnerCuartos.getValue())),
                    				Integer.parseInt(String.valueOf(spinnerBanios.getValue())));
                    	}
                    }				
				}else {
					JOptionPane.showMessageDialog(null, "Error, Debe seleccionar el tipo de inmueble","Aviso",JOptionPane.WARNING_MESSAGE);
				}
				for(int i=0 ; i < comodidades.size() ; i++) {
					BaseDeDatos.ingresarHabitableComodidades(txtRegistrarInmueblePadron, comodidades.get(i));
				}
				comodidades.removeAll(comodidades);
				
				for(int i=0; i<habitaciones.size(); i++) {
                 BaseDeDatos.ingresarHabitableOtrasHabitaciones(txtRegistrarInmueblePadron,habitaciones.get(i));
				}
				habitaciones.removeAll(habitaciones);
				
				Datos.LimpiarTextos(txtCedulaDuenioInmueble, txtRegistrarInmueblePadron, txtRegistrarInmuebleTamanio,txtRegistrarInmuebleDepartamento, 
				          txtRegistrarInmuebleCalle, txtRegistrarInmuebleCalleNPuerta, txtRegistrarClienteEmail, txtRegistrarInmuebleValorDolares);
			}
		});
		btnConfirmarCrearUsuario_1_2_2_2_1_1_1.setForeground(Color.WHITE);
		btnConfirmarCrearUsuario_1_2_2_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfirmarCrearUsuario_1_2_2_2_1_1_1.setBorderPainted(false);
		btnConfirmarCrearUsuario_1_2_2_2_1_1_1.setBackground(new Color(0, 64, 128));
		btnConfirmarCrearUsuario_1_2_2_2_1_1_1.setBounds(777, 278, 154, 42);
		PanelDatosRegistrarInmueble4.add(btnConfirmarCrearUsuario_1_2_2_2_1_1_1);

		JLabel lblNewLabel_3_2_2_4_2_2_1 = new JLabel("Tipo de Vivienda");
		lblNewLabel_3_2_2_4_2_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2_2_1.setBorder(null);
		lblNewLabel_3_2_2_4_2_2_1.setBounds(28, 18, 159, 34);
		PanelDatosRegistrarInmueble4.add(lblNewLabel_3_2_2_4_2_2_1);

		JLabel lblNewLabel_3_2_2_4_2_2_1_1_1 = new JLabel("Baños");
		lblNewLabel_3_2_2_4_2_2_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2_2_1_1_1.setBorder(null);
		lblNewLabel_3_2_2_4_2_2_1_1_1.setBounds(307, 204, 71, 34);
		PanelDatosRegistrarInmueble4.add(lblNewLabel_3_2_2_4_2_2_1_1_1);

		spinnerBanios = new JSpinner();
		spinnerBanios.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinnerBanios.setFont(new Font("Arial", Font.BOLD, 15));
		spinnerBanios.setBounds(307, 239, 58, 23);
		PanelDatosRegistrarInmueble4.add(spinnerBanios);

		JLabel lblNewLabel_3_2_2_4_2_2_1_1_1_1 = new JLabel("Cuartos");
		lblNewLabel_3_2_2_4_2_2_1_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2_2_1_1_1_1.setBorder(null);
		lblNewLabel_3_2_2_4_2_2_1_1_1_1.setBounds(434, 204, 91, 34);
		PanelDatosRegistrarInmueble4.add(lblNewLabel_3_2_2_4_2_2_1_1_1_1);

		spinnerCuartos = new JSpinner();
		spinnerCuartos.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinnerCuartos.setFont(new Font("Arial", Font.BOLD, 15));
		spinnerCuartos.setBounds(434, 239, 71, 23);
		PanelDatosRegistrarInmueble4.add(spinnerCuartos);

		JLabel lblNewLabel_3_2_2_4_2_2_1_1_2_1 = new JLabel("Otras Habitaciones");
		lblNewLabel_3_2_2_4_2_2_1_1_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2_2_1_1_2_1.setBorder(null);
		lblNewLabel_3_2_2_4_2_2_1_1_2_1.setBounds(28, 195, 190, 34);
		PanelDatosRegistrarInmueble4.add(lblNewLabel_3_2_2_4_2_2_1_1_2_1);

		JLabel lblNewLabel_3_2_2_4_2_2_1_1_2_1_1 = new JLabel("Comodidades");
		lblNewLabel_3_2_2_4_2_2_1_1_2_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2_2_1_1_2_1_1.setBorder(null);
		lblNewLabel_3_2_2_4_2_2_1_1_2_1_1.setBounds(336, 18, 137, 34);
		PanelDatosRegistrarInmueble4.add(lblNewLabel_3_2_2_4_2_2_1_1_2_1_1);

		JLabel lblNewLabel_3_2_2_4_2_2_2_1_2_1_1 = new JLabel("3/3");
		lblNewLabel_3_2_2_4_2_2_2_1_2_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_4_2_2_2_1_2_1_1.setBorder(null);
		lblNewLabel_3_2_2_4_2_2_2_1_2_1_1.setBounds(902, 2, 37, 35);
		PanelDatosRegistrarInmueble4.add(lblNewLabel_3_2_2_4_2_2_2_1_2_1_1);

		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/ImagenCasa.png")));
		lblNewLabel_16.setBounds(644, 14, 246, 249);
		PanelDatosRegistrarInmueble4.add(lblNewLabel_16);
		
		rdbtnRegistroCasa = new JRadioButton("Casa");
		rdbtnRegistroCasa.setBackground(new Color(255, 255, 255));
		rdbtnRegistroCasa.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnRegistroCasa.setBounds(28, 59, 74, 23);
		PanelDatosRegistrarInmueble4.add(rdbtnRegistroCasa);
		
		rdbtnRegistroApartamento = new JRadioButton("Apartamento");
		rdbtnRegistroApartamento.setBackground(new Color(255, 255, 255));
		rdbtnRegistroApartamento.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnRegistroApartamento.setBounds(28, 98, 138, 23);
		PanelDatosRegistrarInmueble4.add(rdbtnRegistroApartamento);
		
		rdbtnRegistroMejora = new JRadioButton("Mejora");
		rdbtnRegistroMejora.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnRegistroMejora.setBackground(new Color(255, 255, 255));
		rdbtnRegistroMejora.setBounds(104, 59, 80, 23);
		PanelDatosRegistrarInmueble4.add(rdbtnRegistroMejora);
		rango.add(RbtnCEOCrearUsuario);
		rango.add(RbtnGerenteCrearUsuario);
		rango.add(RbtnAdministrativoCrearUsuario);
		RegistroInmueble.add(btnRegistroInmuebleTerreno);
		RegistroInmueble.add(btnRegistroInmuebleHabitable);
		RegistroInmuebleHabitable.add(rdbtnRegistroCasa);
		RegistroInmuebleHabitable.add(rdbtnRegistroMejora);
		RegistroInmuebleHabitable.add(rdbtnRegistroApartamento);
		
		txtRegistrarInmuebleComodidades = new JTextField();
		txtRegistrarInmuebleComodidades.setForeground(Color.BLACK);
		txtRegistrarInmuebleComodidades.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarInmuebleComodidades.setColumns(10);
		txtRegistrarInmuebleComodidades.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarInmuebleComodidades.setBounds(319, 45, 170, 48);
		PanelDatosRegistrarInmueble4.add(txtRegistrarInmuebleComodidades);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comodidades.add(txtRegistrarInmuebleComodidades.getText());
				txtRegistrarInmuebleComodidades.setText("");
				
			}
		});
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setFont(new Font("Arial", Font.BOLD, 15));
		btnAgregar.setBorderPainted(false);
		btnAgregar.setBackground(new Color(0, 64, 128));
		btnAgregar.setBounds(357, 115, 91, 42);
		PanelDatosRegistrarInmueble4.add(btnAgregar);
		
		txtRegistrarInmuebleHabitaciones = new JTextField();
		txtRegistrarInmuebleHabitaciones.setForeground(Color.BLACK);
		txtRegistrarInmuebleHabitaciones.setFont(new Font("Arial", Font.BOLD, 20));
		txtRegistrarInmuebleHabitaciones.setColumns(10);
		txtRegistrarInmuebleHabitaciones.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtRegistrarInmuebleHabitaciones.setBounds(38, 232, 170, 48);
		PanelDatosRegistrarInmueble4.add(txtRegistrarInmuebleHabitaciones);
		
		JButton btnAgregar_1 = new JButton("Agregar");
		btnAgregar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    habitaciones.add(txtRegistrarInmuebleHabitaciones.getText());
			    txtRegistrarInmuebleHabitaciones.setText("");
				
			}
		});
		btnAgregar_1.setForeground(Color.WHITE);
		btnAgregar_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnAgregar_1.setBorderPainted(false);
		btnAgregar_1.setBackground(new Color(0, 64, 128));
		btnAgregar_1.setBounds(76, 302, 91, 42);
		PanelDatosRegistrarInmueble4.add(btnAgregar_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Datos.validarTextFieldVacio(txtUsuario) == true) {
					if (Datos.validarPasswordField(Contraseña) == true) {
						switch(BaseDeDatos.validarTipoUsuario(txtUsuario, Contraseña)) {
						case 1:
							Datos.cambiarJPanel(contentPane, PanelOpciones);
							lblPresentacion.setText(txtUsuario.getText());
							Datos.cambiarJPanel(ContenedorPanel, Presentacion);
							break;
						case 2:
							Datos.cambiarJPanel(contentPane, PanelOpciones);
							lblPresentacion.setText(txtUsuario.getText());
							Datos.cambiarJPanel(ContenedorPanel, Presentacion);
							btnCrearUsuario.setVisible(false);
							btnModificarPrecios.setVisible(false);
							btnConfirmarContrato.setBounds(10, 274, 242, 40);
							break;
						case 3:
							Datos.cambiarJPanel(contentPane, PanelOpciones);
							lblPresentacion.setText(txtUsuario.getText());
							Datos.cambiarJPanel(ContenedorPanel, Presentacion);
							btnCrearUsuario.setVisible(false);
							btnModificarPrecios.setVisible(false);
							btnBajaCliente.setVisible(false);
							btnAceptar.setVisible(false);
							btnSiguienteGestionContrato_1.setVisible(false);
							btnSiguienteGestionContrato_1_1.setVisible(false);
							btnAceptar_1.setVisible(false);
							btnConfirmarContrato.setBounds(10, 224, 242, 40);
							break;
							default:
							JOptionPane.showMessageDialog(null, "Error, El usuario o la contraseña no son correctos","Aviso",JOptionPane.WARNING_MESSAGE);;
								break;
						}
						
					}
				}
			}
		});
		
		btnSiguienteGestionContrato = new JButton("Siguiente");
		btnSiguienteGestionContrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtPadronInmuebleContrato.getText().length()<=10) {
					
				if(txtCedulaDelInteresado.getText().length()<=10) {
					if(Datos.validarContrato(txtPadronInmuebleContrato, txtCedulaDelInteresado)== true) {
						
						if(btnAlquilerContrato.isSelected()) {
							
							Datos.cambiarJPanel(ContenedorCreaconContrato, CrearContrato2);
						}
						if(btnCompraContrato.isSelected()) {
							Datos.cambiarJPanel(ContenedorCreaconContrato, CrearContrato3);
						}
						
					}
				}else {
					JOptionPane.showMessageDialog(null,"Aviso,La cedula supera el maximo permitido","Aviso",JOptionPane.WARNING_MESSAGE);
				}
				
			}else {
				JOptionPane.showMessageDialog(null,"Aviso,El padron del inmueble supera el maximo permitido 10","Aviso",JOptionPane.WARNING_MESSAGE);
			}
			}
		});
		btnSiguienteGestionContrato.setForeground(Color.WHITE);
		btnSiguienteGestionContrato.setFont(new Font("Arial", Font.BOLD, 15));
		btnSiguienteGestionContrato.setBorderPainted(false);
		btnSiguienteGestionContrato.setBackground(new Color(0, 64, 128));
		btnSiguienteGestionContrato.setBounds(636, 291, 169, 45);
		CrearContrato1.add(btnSiguienteGestionContrato);
		
		textField_7 = new JTextField();
		textField_7.setForeground(Color.BLACK);
		textField_7.setFont(new Font("Arial", Font.BOLD, 20));
		textField_7.setColumns(10);
		textField_7.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField_7.setBounds(10, 49, 426, 57);
		CrearContrato1.add(textField_7);
		
		btnCompraContrato = new JRadioButton("Compra");
		btnCompraContrato.setFont(new Font("Arial", Font.BOLD, 18));
		btnCompraContrato.setBorder(null);
		btnCompraContrato.setBackground(Color.WHITE);
		btnCompraContrato.setBounds(20, 291, 97, 23);
		CrearContrato1.add(btnCompraContrato);
		
		btnAlquilerContrato = new JRadioButton("Alquiler");
		btnAlquilerContrato.setFont(new Font("Arial", Font.BOLD, 18));
		btnAlquilerContrato.setBorder(null);
		btnAlquilerContrato.setBackground(Color.WHITE);
		btnAlquilerContrato.setBounds(162, 291, 97, 23);
		CrearContrato1.add(btnAlquilerContrato);
		
		CrearContrato2 = new JPanel();
		CrearContrato2.setBackground(new Color(255, 255, 255));
		ContenedorCreaconContrato.add(CrearContrato2, "name_16800068623899");
		CrearContrato2.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos.cambiarJPanel(ContenedorCreaconContrato, CrearContrato1);
			}
		});
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setFont(new Font("Arial", Font.BOLD, 15));
		btnVolver.setBorderPainted(false);
		btnVolver.setBackground(new Color(0, 64, 128));
		btnVolver.setBounds(557, 317, 169, 45);
		CrearContrato2.add(btnVolver);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(codigoContratoAlquiler.getText().length()<=10) {
				if(Datos.validarFecha(anioInicioRenta, mesInicioRenta, diaInicioRenta)== true) {
					if(Datos.validarFecha(anioFinalRenta, mesFinalRenta, diaFinalRenta)== true) {
                       if(!montoDeRenta.getText().isEmpty()) {
							if(montoDeRenta.getText().matches("[0-9]*")) {
								if(!codigoContratoAlquiler.getText().isEmpty()) {
									if(codigoContratoAlquiler.getText().matches("[0-9]*")) {
									if(!txtGarantia.getText().isEmpty()) {
										
										 BaseDeDatos.ingresarContratoAlquiler(codigoContratoAlquiler, txtPadronInmuebleContrato, txtCedulaDelInteresado, montoDeRenta,
	                                    		  txtGarantia, anioInicioRenta, mesInicioRenta, diaInicioRenta, anioFinalRenta, mesFinalRenta, diaFinalRenta);
										 
										 Datos.LimpiarTextos(codigoContratoAlquiler, txtPadronInmuebleContrato,
												 txtCedulaDelInteresado, montoDeRenta, txtGarantia,
												 anioInicioRenta,mesInicioRenta, diaInicioRenta);
										         anioFinalRenta.setText("");
										         mesFinalRenta.setText("");
										         diaFinalRenta.setText("");
									}else {
										JOptionPane.showMessageDialog(null, "Aviso, Debe ingresar alguna garantia ","Aviso",JOptionPane.WARNING_MESSAGE);
									}	
									}else {
										JOptionPane.showMessageDialog(null, "Aviso,El codigo de contrato debe ser numerico ","Aviso",JOptionPane.WARNING_MESSAGE);
									}
								}else {
									JOptionPane.showMessageDialog(null, "Aviso,El codigo del contrato no puede estar vacio ","Aviso",JOptionPane.WARNING_MESSAGE);
								}
							}else {
								JOptionPane.showMessageDialog(null, "Aviso, el monto de la renta debe ser numerico","Aviso",JOptionPane.WARNING_MESSAGE);
							}
						}else {
							JOptionPane.showMessageDialog(null, "Aviso,El monto mensula no puede estar vacion","Aviso",JOptionPane.WARNING_MESSAGE);
						}
					}
				}	
			}else {
				JOptionPane.showConfirmDialog(null, "Aviso,El numero de contrato supera el maximo permitido","Aviso",JOptionPane.WARNING_MESSAGE);
			}
				BaseDeDatos.contratoCompra(tablaCodigoContratoCompra);
				BaseDeDatos.contratoAlquiler(tablaContratoAlquiler);
			}
		});
		btnConfirmar.setForeground(Color.WHITE);
		btnConfirmar.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfirmar.setBorderPainted(false);
		btnConfirmar.setBackground(new Color(0, 64, 128));
		btnConfirmar.setBounds(760, 317, 169, 45);
		CrearContrato2.add(btnConfirmar);
		
		JLabel lblNewLabel_3_2_2_5_2 = new JLabel("Fecha de Inicio");
		lblNewLabel_3_2_2_5_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2.setBorder(null);
		lblNewLabel_3_2_2_5_2.setBounds(10, 11, 234, 57);
		CrearContrato2.add(lblNewLabel_3_2_2_5_2);
		
		anioInicioRenta = new JTextField();
		anioInicioRenta.setForeground(Color.BLACK);
		anioInicioRenta.setFont(new Font("Arial", Font.BOLD, 20));
		anioInicioRenta.setColumns(10);
		anioInicioRenta.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		anioInicioRenta.setBounds(10, 49, 58, 57);
		CrearContrato2.add(anioInicioRenta);
		
		mesInicioRenta = new JTextField();
		mesInicioRenta.setForeground(Color.BLACK);
		mesInicioRenta.setFont(new Font("Arial", Font.BOLD, 20));
		mesInicioRenta.setColumns(10);
		mesInicioRenta.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		mesInicioRenta.setBounds(106, 49, 58, 57);
		CrearContrato2.add(mesInicioRenta);
		
		diaInicioRenta = new JTextField();
		diaInicioRenta.setForeground(Color.BLACK);
		diaInicioRenta.setFont(new Font("Arial", Font.BOLD, 20));
		diaInicioRenta.setColumns(10);
		diaInicioRenta.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		diaInicioRenta.setBounds(197, 49, 58, 57);
		CrearContrato2.add(diaInicioRenta);
		
		JLabel lblNewLabel_3_2_2_5_2_1 = new JLabel("/");
		lblNewLabel_3_2_2_5_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_1.setBorder(null);
		lblNewLabel_3_2_2_5_2_1.setBounds(78, 67, 13, 57);
		CrearContrato2.add(lblNewLabel_3_2_2_5_2_1);
		
		JLabel lblNewLabel_3_2_2_5_2_1_1 = new JLabel("/");
		lblNewLabel_3_2_2_5_2_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_1_1.setBorder(null);
		lblNewLabel_3_2_2_5_2_1_1.setBounds(176, 67, 13, 57);
		CrearContrato2.add(lblNewLabel_3_2_2_5_2_1_1);
		
		JLabel lblNewLabel_3_2_2_5_2_2 = new JLabel("Fecha Fin");
		lblNewLabel_3_2_2_5_2_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_2.setBorder(null);
		lblNewLabel_3_2_2_5_2_2.setBounds(296, 11, 234, 57);
		CrearContrato2.add(lblNewLabel_3_2_2_5_2_2);
		
		anioFinalRenta = new JTextField();
		anioFinalRenta.setForeground(Color.BLACK);
		anioFinalRenta.setFont(new Font("Arial", Font.BOLD, 20));
		anioFinalRenta.setColumns(10);
		anioFinalRenta.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		anioFinalRenta.setBounds(284, 49, 58, 57);
		CrearContrato2.add(anioFinalRenta);
		
		mesFinalRenta = new JTextField();
		mesFinalRenta.setForeground(Color.BLACK);
		mesFinalRenta.setFont(new Font("Arial", Font.BOLD, 20));
		mesFinalRenta.setColumns(10);
		mesFinalRenta.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		mesFinalRenta.setBounds(380, 49, 58, 57);
		CrearContrato2.add(mesFinalRenta);
		
		diaFinalRenta = new JTextField();
		diaFinalRenta.setForeground(Color.BLACK);
		diaFinalRenta.setFont(new Font("Arial", Font.BOLD, 20));
		diaFinalRenta.setColumns(10);
		diaFinalRenta.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		diaFinalRenta.setBounds(471, 49, 58, 57);
		CrearContrato2.add(diaFinalRenta);
		
		JLabel lblNewLabel_3_2_2_5_2_1_2 = new JLabel("/");
		lblNewLabel_3_2_2_5_2_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_1_2.setBorder(null);
		lblNewLabel_3_2_2_5_2_1_2.setBounds(352, 67, 13, 57);
		CrearContrato2.add(lblNewLabel_3_2_2_5_2_1_2);
		
		JLabel lblNewLabel_3_2_2_5_2_1_1_1 = new JLabel("/");
		lblNewLabel_3_2_2_5_2_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_1_1_1.setBorder(null);
		lblNewLabel_3_2_2_5_2_1_1_1.setBounds(450, 67, 13, 57);
		CrearContrato2.add(lblNewLabel_3_2_2_5_2_1_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 128, 192));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(265, 11, 13, 113);
		CrearContrato2.add(separator);
		
		JLabel lblNewLabel_3_2_2_5_2_3 = new JLabel("Monto Mensual");
		lblNewLabel_3_2_2_5_2_3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_3.setBorder(null);
		lblNewLabel_3_2_2_5_2_3.setBounds(10, 117, 234, 57);
		CrearContrato2.add(lblNewLabel_3_2_2_5_2_3);
		
		montoDeRenta = new JTextField();
		montoDeRenta.setForeground(Color.BLACK);
		montoDeRenta.setFont(new Font("Arial", Font.BOLD, 20));
		montoDeRenta.setColumns(10);
		montoDeRenta.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		montoDeRenta.setBounds(10, 160, 520, 38);
		CrearContrato2.add(montoDeRenta);
		
		JLabel lblNewLabel_3_2_2_5_2_3_2 = new JLabel("Codigo del contrato");
		lblNewLabel_3_2_2_5_2_3_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_3_2.setBorder(null);
		lblNewLabel_3_2_2_5_2_3_2.setBounds(10, 197, 234, 57);
		CrearContrato2.add(lblNewLabel_3_2_2_5_2_3_2);
		
		codigoContratoAlquiler = new JTextField();
		codigoContratoAlquiler.setForeground(Color.BLACK);
		codigoContratoAlquiler.setFont(new Font("Arial", Font.BOLD, 20));
		codigoContratoAlquiler.setColumns(10);
		codigoContratoAlquiler.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		codigoContratoAlquiler.setBounds(10, 241, 520, 33);
		CrearContrato2.add(codigoContratoAlquiler);
		
		txtGarantia = new JTextField();
		txtGarantia.setForeground(Color.BLACK);
		txtGarantia.setFont(new Font("Arial", Font.BOLD, 20));
		txtGarantia.setColumns(10);
		txtGarantia.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtGarantia.setBounds(10, 313, 520, 33);
		CrearContrato2.add(txtGarantia);
		
		JLabel lblNewLabel_3_2_2_5_2_3_2_1 = new JLabel("Garantia");
		lblNewLabel_3_2_2_5_2_3_2_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_3_2_1.setBorder(null);
		lblNewLabel_3_2_2_5_2_3_2_1.setBounds(10, 285, 234, 38);
		CrearContrato2.add(lblNewLabel_3_2_2_5_2_3_2_1);
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/Contrato.png")));
		lblNewLabel_20.setBounds(610, 11, 272, 276);
		CrearContrato2.add(lblNewLabel_20);
		
		tipoDeContrato.add(btnCompraContrato);
		tipoDeContrato.add(btnAlquilerContrato);
		
		JLabel lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/Contrato.png")));
		lblNewLabel_19.setBounds(580, 11, 250, 269);
		CrearContrato1.add(lblNewLabel_19);
		
		CrearContrato3 = new JPanel();
		CrearContrato3.setBackground(new Color(255, 255, 255));
		ContenedorCreaconContrato.add(CrearContrato3, "name_18668155648300");
		CrearContrato3.setLayout(null);
		
		JButton btnVolver_1 = new JButton("Volver");
		btnVolver_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Datos.cambiarJPanel(ContenedorCreaconContrato, CrearContrato1);
			}
		});
		btnVolver_1.setForeground(Color.WHITE);
		btnVolver_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnVolver_1.setBorderPainted(false);
		btnVolver_1.setBackground(new Color(0, 64, 128));
		btnVolver_1.setBounds(548, 300, 169, 45);
		CrearContrato3.add(btnVolver_1);
		
		JButton btnConfirmar_1 = new JButton("Confirmar");
		btnConfirmar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((CodigoContratoCompra).getText().length()<=10) {
					if(Datos.validarContratoCompra2(CodigoContratoCompra, AnioContratoCompra, mesContratoCompra, diaContratoCompra)==true) {
						
		                 BaseDeDatos.ingresarContratoCompra(CodigoContratoCompra, txtPadronInmuebleContrato, txtCedulaDelInteresado, AnioContratoCompra,
		                		 mesContratoCompra, diaContratoCompra, txtDescripcionContratoCompra);
		                 
		                 Datos.LimpiarTextos(CodigoContratoCompra, txtPadronInmuebleContrato, txtCedulaDelInteresado, AnioContratoCompra, mesContratoCompra,
		                		 diaContratoCompra, txtDescripcionContratoCompra, txtRegistrarClienteTelefono);	
				
				
			}
				}else {
					JOptionPane.showMessageDialog(null, "Avis,El numero del contrato supera el maximo permitido","Aviso",JOptionPane.WARNING_MESSAGE);
			}
				BaseDeDatos.contratoCompra(tablaCodigoContratoCompra);
				BaseDeDatos.contratoAlquiler(tablaContratoAlquiler);
			}
		});
		btnConfirmar_1.setForeground(Color.WHITE);
		btnConfirmar_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnConfirmar_1.setBorderPainted(false);
		btnConfirmar_1.setBackground(new Color(0, 64, 128));
		btnConfirmar_1.setBounds(760, 300, 169, 45);
		CrearContrato3.add(btnConfirmar_1);
		
		JLabel lblNewLabel_3_2_2_5_2_3_1 = new JLabel("Codigo de Contrato");
		lblNewLabel_3_2_2_5_2_3_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_3_1.setBorder(null);
		lblNewLabel_3_2_2_5_2_3_1.setBounds(10, 0, 234, 57);
		CrearContrato3.add(lblNewLabel_3_2_2_5_2_3_1);
		
		CodigoContratoCompra = new JTextField();
		CodigoContratoCompra.setForeground(Color.BLACK);
		CodigoContratoCompra.setFont(new Font("Arial", Font.BOLD, 20));
		CodigoContratoCompra.setColumns(10);
		CodigoContratoCompra.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		CodigoContratoCompra.setBounds(10, 36, 520, 51);
		CrearContrato3.add(CodigoContratoCompra);
		
		JLabel lblNewLabel_3_2_2_5_2_3_1_1 = new JLabel("Fecha de Creacion de Contrato");
		lblNewLabel_3_2_2_5_2_3_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_3_1_1.setBorder(null);
		lblNewLabel_3_2_2_5_2_3_1_1.setBounds(10, 98, 343, 45);
		CrearContrato3.add(lblNewLabel_3_2_2_5_2_3_1_1);
		
		AnioContratoCompra = new JTextField();
		AnioContratoCompra.setForeground(Color.BLACK);
		AnioContratoCompra.setFont(new Font("Arial", Font.BOLD, 20));
		AnioContratoCompra.setColumns(10);
		AnioContratoCompra.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		AnioContratoCompra.setBounds(10, 185, 68, 51);
		CrearContrato3.add(AnioContratoCompra);
		
		mesContratoCompra = new JTextField();
		mesContratoCompra.setForeground(Color.BLACK);
		mesContratoCompra.setFont(new Font("Arial", Font.BOLD, 20));
		mesContratoCompra.setColumns(10);
		mesContratoCompra.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		mesContratoCompra.setBounds(125, 185, 68, 51);
		CrearContrato3.add(mesContratoCompra);
		
		diaContratoCompra = new JTextField();
		diaContratoCompra.setForeground(Color.BLACK);
		diaContratoCompra.setFont(new Font("Arial", Font.BOLD, 20));
		diaContratoCompra.setColumns(10);
		diaContratoCompra.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		diaContratoCompra.setBounds(239, 185, 68, 51);
		CrearContrato3.add(diaContratoCompra);
		
		JLabel lblNewLabel_3_2_2_5_2_3_1_1_1 = new JLabel("Anio");
		lblNewLabel_3_2_2_5_2_3_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_3_1_1_1.setBorder(null);
		lblNewLabel_3_2_2_5_2_3_1_1_1.setBounds(10, 154, 48, 34);
		CrearContrato3.add(lblNewLabel_3_2_2_5_2_3_1_1_1);
		
		JLabel lblNewLabel_3_2_2_5_2_3_1_1_1_1_2 = new JLabel("Mes");
		lblNewLabel_3_2_2_5_2_3_1_1_1_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_3_1_1_1_1_2.setBorder(null);
		lblNewLabel_3_2_2_5_2_3_1_1_1_1_2.setBounds(130, 143, 48, 57);
		CrearContrato3.add(lblNewLabel_3_2_2_5_2_3_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_2_5_2_3_1_1_1_1_1 = new JLabel("Dia");
		lblNewLabel_3_2_2_5_2_3_1_1_1_1_1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_3_1_1_1_1_1.setBorder(null);
		lblNewLabel_3_2_2_5_2_3_1_1_1_1_1.setBounds(240, 143, 48, 57);
		CrearContrato3.add(lblNewLabel_3_2_2_5_2_3_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_2_5_2_3_1_1_1_1_3 = new JLabel("/");
		lblNewLabel_3_2_2_5_2_3_1_1_1_1_3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_3_1_1_1_1_3.setBorder(null);
		lblNewLabel_3_2_2_5_2_3_1_1_1_1_3.setBounds(99, 185, 11, 57);
		CrearContrato3.add(lblNewLabel_3_2_2_5_2_3_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_2_5_2_3_1_1_1_1_4 = new JLabel("/");
		lblNewLabel_3_2_2_5_2_3_1_1_1_1_4.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_3_1_1_1_1_4.setBorder(null);
		lblNewLabel_3_2_2_5_2_3_1_1_1_1_4.setBounds(213, 185, 11, 57);
		CrearContrato3.add(lblNewLabel_3_2_2_5_2_3_1_1_1_1_4);
		
		txtDescripcionContratoCompra = new JTextField();
		txtDescripcionContratoCompra.setForeground(Color.BLACK);
		txtDescripcionContratoCompra.setFont(new Font("Arial", Font.BOLD, 20));
		txtDescripcionContratoCompra.setColumns(10);
		txtDescripcionContratoCompra.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtDescripcionContratoCompra.setBounds(10, 313, 520, 51);
		CrearContrato3.add(txtDescripcionContratoCompra);
		
		JLabel lblNewLabel_3_2_2_5_2_3_1_1_2 = new JLabel("Descripcion de Contrato");
		lblNewLabel_3_2_2_5_2_3_1_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		lblNewLabel_3_2_2_5_2_3_1_1_2.setBorder(null);
		lblNewLabel_3_2_2_5_2_3_1_1_2.setBounds(10, 257, 242, 45);
		CrearContrato3.add(lblNewLabel_3_2_2_5_2_3_1_1_2);
		
		JLabel lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(new ImageIcon(login.class.getResource("/ImagenesDelAPK/MenuOpciones/Contrato.png")));
		lblNewLabel_21.setBounds(609, 21, 304, 268);
		CrearContrato3.add(lblNewLabel_21);

	}
}
