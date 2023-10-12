package miprimercrud1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Tabla.Pokemon;
import Tabla.Tabla1;

public class PantallaAlumno {

	private JFrame frmRegistroPokemon;
	JTextField txtId;
	private JLabel lblNPokemon_1;
	private JTextField txtNumeroControl;
	private JButton btnBorrar;
	private JButton btnAgregar;
	public DefaultTableModel modelo = new DefaultTableModel();

	private JScrollPane scrollPane;
	private JTable tblAlumnos;
	public ArrayList<Pokemon> listaPokemones = new ArrayList<Pokemon>();
	private JLabel lblNPokemon_2;
	private JLabel lblNPokemon_3;
	private JLabel lblNPokemon_4;
	private JTextField txtApellidoP;
	private JTextField txtNomrbe;
	private JTextField txtApellidoM;
	private JLabel lblNPokemon;
	private JLabel lblNPokemon_5;
	private JLabel lblNPokemon_6;
	private JLabel lblNPokemon_8;
	private JTextField txtCurp;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtGrupo;
	private JTextField txtCarrera;
	private JTextField txtFechaNac;

	public static void main(String[] args) {

		PantallaAlumno x = new PantallaAlumno();
		x.frmRegistroPokemon.setVisible(true);
	}

	public PantallaAlumno() {
		crearInterfaz();
	}
public void actualizarTabla() {
	while (modelo.getRowCount() > 0) {
		modelo.removeRow(0);
	}
	for (Alumno alumno : listaPokemones) {
		Object o[] = new Object[12];
		o[0] = alumno.getId();
		o[1] = alumno.getNombre();
		o[2] = pokemon.getColor();
		o[3] = pokemon.getTextura();
		o[4] = pokemon.getProcesador();

		modelo.addRow(o);
	}
}
	
	

	public void borrarTabla1() {
		listaPokemones.clear();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void crearInterfaz() {
		frmRegistroPokemon = new JFrame();
		frmRegistroPokemon.setTitle("Tabla");
		frmRegistroPokemon.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmRegistroPokemon.getContentPane().setForeground(Color.LIGHT_GRAY);
		frmRegistroPokemon.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Downloads\\6.png"));
		frmRegistroPokemon.setBounds(100, 100, 1051, 538);
		frmRegistroPokemon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistroPokemon.setLocationRelativeTo(null);
		frmRegistroPokemon.getContentPane().setLayout(null);

		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 16, 139, 14);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmRegistroPokemon.getContentPane().add(lblId);

		txtId = new JTextField();
		txtId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtId.getText().length()>=30) {
					e.consume();
				}
			}
		});
		txtId.setBounds(159, 10, 129, 20);
		
		frmRegistroPokemon.getContentPane().add(txtId);
		txtId.setColumns(10);

		lblNPokemon_1 = new JLabel("Numero Control");
		lblNPokemon_1.setBounds(10, 47, 139, 14);
		lblNPokemon_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmRegistroPokemon.getContentPane().add(lblNPokemon_1);

		txtNumeroControl = new JTextField();
		txtNumeroControl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtNumeroControl.getText().length()>=14) {
					e.consume();
				}
			}
		});
		
			
		txtNumeroControl.setBounds(159, 41, 129, 20);
		txtNumeroControl.setColumns(10);
		frmRegistroPokemon.getContentPane().add(txtNumeroControl);
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alumno alumno = new Alumno();
				alumno.setId(txtId.getText());
				alumno.setNumControl(txtNumeroControl.getText());
				alumno.setNombre(txtApellidoP.getText());
				alumno.setApellidoP(txtNomrbe.getText());
				alumno.setApellidoM(txtApellidoM.getText());
				alumno.setCurp(txtCurp.getText());
				alumno.setDireccion(txtDireccion.getText());
				alumno.setTelefono(txtTelefono.getText());
				alumno.setCorreo(txtCorreo.getText());
				alumno.setGrupo(txtGrupo.getText());
				alumno.setCarrera(txtCarrera.getText());
				alumno.setFecha(txtFechaNac.getText());
				if(alumno.insertarAlumno()) {
					
				}
				
			}
		});
		
		btnAgregar.setBounds(10, 341, 89, 23);
		
		frmRegistroPokemon.getContentPane().add(btnAgregar);

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtId.setText("");
				txtNumeroControl.setText("");
				txtApellidoP.setText("");
				txtNomrbe.setText("");
				txtApellidoM.setText("");
				txtCurp.setText("");
				txtDireccion.setText("");
				txtTelefono.setText("");
				txtCorreo.setText("");
				txtGrupo.setText("");
				txtFechaNac.setText("");
			}
		});
		
			
		btnBorrar.setBounds(109, 341, 89, 23);
		frmRegistroPokemon.getContentPane().add(btnBorrar);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(300, 16, 725, 472);
		frmRegistroPokemon.getContentPane().add(scrollPane);

		tblAlumnos = new JTable();

		scrollPane.setViewportView(tblAlumnos);
		modelo.addColumn("Id");
		modelo.addColumn("Numero ctr");
		modelo.addColumn("Nombre");
		modelo.addColumn("ApellidoP");
		modelo.addColumn("ApellidoM");
		modelo.addColumn("Curp");
		modelo.addColumn("Direccion");
		modelo.addColumn("telefono");
		modelo.addColumn("Correo");
		modelo.addColumn("Grupo");
		modelo.addColumn("Carrera");
		modelo.addColumn("Fecha nacimiento");
		tblAlumnos.setModel(modelo);
		lblNPokemon_2 = new JLabel("Nombre");
		lblNPokemon_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNPokemon_2.setBounds(10, 72, 139, 14);
		frmRegistroPokemon.getContentPane().add(lblNPokemon_2);
		lblNPokemon_3 = new JLabel("Apellido Paterno");
		lblNPokemon_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNPokemon_3.setBounds(10, 97, 139, 14);
		frmRegistroPokemon.getContentPane().add(lblNPokemon_3);
		lblNPokemon_4 = new JLabel("Apellido Materno");
		lblNPokemon_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNPokemon_4.setBounds(10, 135, 139, 14);
		frmRegistroPokemon.getContentPane().add(lblNPokemon_4);
		txtApellidoP = new JTextField();
		txtApellidoP.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtNomrbe.getText().length()>=30) {
					e.consume();
				}
			}
		});
	
				
		txtApellidoP.setColumns(10);
		txtApellidoP.setBounds(159, 103, 129, 20);
		frmRegistroPokemon.getContentPane().add(txtApellidoP);
		txtNomrbe = new JTextField();
		txtNomrbe.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtApellidoP.getText().length()>=30) {
					e.consume();
				}
			}
		});
		
		txtNomrbe.setColumns(10);
		txtNomrbe.setBounds(159, 72, 129, 20);
		frmRegistroPokemon.getContentPane().add(txtNomrbe);
		txtApellidoM = new JTextField();
		txtApellidoM.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtApellidoM.getText().length()>=30) {
					e.consume();
				}
			}
		});
		
		
		txtApellidoM.setColumns(10);
		txtApellidoM.setBounds(159, 134, 129, 20);
		frmRegistroPokemon.getContentPane().add(txtApellidoM);
		
		JLabel lblNPokemon_4_1 = new JLabel("Curp");
		lblNPokemon_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNPokemon_4_1.setBounds(10, 166, 139, 14);
		frmRegistroPokemon.getContentPane().add(lblNPokemon_4_1);
		
		JLabel lblNPokemon_4_2 = new JLabel("Direccion");
		lblNPokemon_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNPokemon_4_2.setBounds(10, 191, 139, 14);
		frmRegistroPokemon.getContentPane().add(lblNPokemon_4_2);
		
		JLabel lblNPokemon_4_3 = new JLabel("Telefono");
		lblNPokemon_4_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNPokemon_4_3.setBounds(10, 216, 139, 14);
		frmRegistroPokemon.getContentPane().add(lblNPokemon_4_3);
		
		lblNPokemon = new JLabel("Correo");
		lblNPokemon.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNPokemon.setBounds(10, 241, 139, 14);
		frmRegistroPokemon.getContentPane().add(lblNPokemon);
		
		lblNPokemon_5 = new JLabel("Grupo");
		lblNPokemon_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNPokemon_5.setBounds(10, 266, 139, 14);
		frmRegistroPokemon.getContentPane().add(lblNPokemon_5);
		
		lblNPokemon_6 = new JLabel("Carrera");
		lblNPokemon_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNPokemon_6.setBounds(10, 291, 139, 14);
		frmRegistroPokemon.getContentPane().add(lblNPokemon_6);
		
		lblNPokemon_8 = new JLabel("Fecha Nacimiento ");
		lblNPokemon_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNPokemon_8.setBounds(10, 316, 139, 14);
		frmRegistroPokemon.getContentPane().add(lblNPokemon_8);
		
		txtCurp = new JTextField();
		txtCurp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtCurp.getText().length()>=18) {
					e.consume();
				}
			}
		});
		txtCurp.setColumns(10);
		txtCurp.setBounds(159, 165, 129, 20);
		frmRegistroPokemon.getContentPane().add(txtCurp);
		
		txtDireccion = new JTextField();
		txtDireccion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtDireccion.getText().length()>=50) {
					e.consume();
				}
			}
		});
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(159, 190, 129, 20);
		frmRegistroPokemon.getContentPane().add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtTelefono.getText().length()>=10) {
					e.consume();
				}
			}
		});
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(159, 215, 129, 20);
		frmRegistroPokemon.getContentPane().add(txtTelefono);
		
		txtCorreo = new JTextField();
		txtCorreo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(txtCorreo.getText().length()>=100) {
					e.consume();
				}
			}
		});
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(159, 240, 129, 20);
		frmRegistroPokemon.getContentPane().add(txtCorreo);
		
		txtGrupo = new JTextField();
		txtGrupo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtGrupo.getText().length()>=30) {
					e.consume();
				}
			}
		});
		txtGrupo.setColumns(10);
		txtGrupo.setBounds(159, 265, 129, 20);
		frmRegistroPokemon.getContentPane().add(txtGrupo);
		
		txtCarrera = new JTextField();
		txtCarrera.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtCarrera.getText().length()>=30) {
					e.consume();
				}
			}
		});
		txtCarrera.setColumns(10);
		txtCarrera.setBounds(159, 290, 129, 20);
		frmRegistroPokemon.getContentPane().add(txtCarrera);
		
		txtFechaNac = new JTextField();
		txtFechaNac.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtFechaNac.getText().length()>=100) {
					e.consume();
				}
			}
		});
		txtFechaNac.setColumns(10);
		txtFechaNac.setBounds(159, 315, 129, 20);
		frmRegistroPokemon.getContentPane().add(txtFechaNac);

			}
		}
	
