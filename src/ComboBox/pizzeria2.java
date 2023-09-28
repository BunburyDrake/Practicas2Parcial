package ComboBox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class pizzeria2 {

	private JFrame frame;
	private JLabel lblDimadon;
	private JRadioButton radJr;
	private JRadioButton radEstandar;
	private JComboBox cmbEspecialidad;
	private JSlider slider;
	private JRadioButton radDecente;
	private JRadioButton radBatman;
	private JCheckBox chkPapasFrancesa;
	private JCheckBox chkDonas;
	private JCheckBox chkPalitosQueso;
	private JCheckBox chkPaluitosCebolla;
	private JLabel lblPrecio;
	private JButton btnBorrar;
String tamaño="";
int precioPizza=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pizzeria2 window = new pizzeria2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pizzeria2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 813, 642);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblDimadon = new JLabel("");
		lblDimadon.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\dondiamdon.jpeg"));
		lblDimadon.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDimadon.setBounds(372, 0, 425, 484);
		frame.getContentPane().add(lblDimadon);
		
		cmbEspecialidad = new JComboBox();
		cmbEspecialidad.setModel(new DefaultComboBoxModel(new String[] {"chorizo", "longaniza", "extra queso", "3 quesos", "carpincho"}));
		cmbEspecialidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		cmbEspecialidad.setBounds(35, 217, 222, 22);
		frame.getContentPane().add(cmbEspecialidad);
		
		slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				orden();
			}
		});
		slider.setValue(1);
		slider.setBounds(57, 75, 200, 26);
		frame.getContentPane().add(slider);
		
		JLabel Cantidad = new JLabel("New label");
		Cantidad.setBounds(57, 50, 105, 14);
		frame.getContentPane().add(Cantidad);
		
		radJr = new JRadioButton("PizzaJr");
		radJr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radJr.isSelected()) {
					tamaño="Jumbo";
				}
				orden();
			}
		});
		radJr.setBounds(57, 267, 109, 23);
		frame.getContentPane().add(radJr);
		
		radDecente = new JRadioButton("Decente");
		radDecente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radDecente.isSelected()) {
					tamaño="Familiar";
				}
				orden();
			}
		});
		radDecente.setBounds(53, 318, 109, 23);
		frame.getContentPane().add(radDecente);
		
		radBatman = new JRadioButton("Batman");
		radBatman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radBatman.isSelected()) {
					tamaño="Grande";
				}
				orden();
			}
		});
		radBatman.setBounds(57, 344, 109, 23);
		frame.getContentPane().add(radBatman);
		
		radEstandar = new JRadioButton("Estandar");
		radEstandar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radEstandar.isSelected()) {
					tamaño="Individual";
				}
				orden();
			}
		});
		radEstandar.setBounds(57, 292, 109, 23);
		frame.getContentPane().add(radEstandar);
		
		chkDonas = new JCheckBox("Donas");
		chkDonas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orden();
			}
		});
		chkDonas.setBounds(57, 424, 97, 23);
		frame.getContentPane().add(chkDonas);
		
		chkPapasFrancesa = new JCheckBox("Papas Francesa");
		chkPapasFrancesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 orden();
			}
		});
		chkPapasFrancesa.setBounds(57, 392, 97, 23);
		frame.getContentPane().add(chkPapasFrancesa);
		
		chkPalitosQueso = new JCheckBox("Palitos de Queso}");
		chkPalitosQueso.setBounds(57, 461, 97, 23);
		frame.getContentPane().add(chkPalitosQueso);
		
		chkPaluitosCebolla = new JCheckBox("Palitos de cebolla");
		chkPaluitosCebolla.setBounds(57, 487, 97, 23);
		frame.getContentPane().add(chkPaluitosCebolla);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(219, 278, 89, 23);
		frame.getContentPane().add(btnBorrar);
		
		lblPrecio = new JLabel("precio");
		lblPrecio.setBounds(340, 507, 243, 61);
		frame.getContentPane().add(lblPrecio);
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(radJr);
		grupo.add(radEstandar);
		grupo.add(radDecente);
		grupo.add(radBatman);
		
	}
	public void orden() {
		int cp=slider.getValue();
		switch(tamaño) {
		case "Jumbo":precioPizza=150;break;
		case "Familiar":precioPizza=120;break;
		case "Grande":precioPizza=100;break;
		case "Individual":precioPizza=30;break;
		}
		int total=cp*precioPizza;
		lblPrecio.setText("el total es:"+total);
	 }
}
