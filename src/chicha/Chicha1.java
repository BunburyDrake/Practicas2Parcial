package chicha;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Chicha1 {
	private JFrame frmChicharronera;
	private JLabel lblResultado;
	private JSpinner spnC;
	private JSpinner spnA;
	private JSpinner spnB;
double x1=0,x2=0;
	

	

	public Chicha1() {
		crearInterfaz();
	}
	public void Calcular() {
		int a=Integer.parseInt(spnA.getValue().toString());
		int b=Integer.parseInt(spnB.getValue().toString());
		int c=Integer.parseInt(spnC.getValue().toString());
		DecimalFormat f= new DecimalFormat("##.00");
		double factor=(b*b)-(4*a*c);
		if(factor>0){
			x1=(-b+Math.sqrt(factor)/(2*a));
			x2=(-b-Math.sqrt(factor)/(2*a));
			lblResultado.setText("x1:"+f.format(x1)+" x2:"+f.format(x2));
		}else if(factor==0){
			x1=((-b)/(2*a));
			lblResultado.setText("x1"+f.format(x1));
		}else {
			lblResultado.setText("no hay solucion");
		}
		
				
				
	}

	private void crearInterfaz() {
		frmChicharronera = new JFrame();
		frmChicharronera.setTitle("chicharronera");
		frmChicharronera.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Downloads\\6.png"));
		frmChicharronera.setBounds(100, 100, 450, 300);
		frmChicharronera.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChicharronera.getContentPane().setLayout(null);
		frmChicharronera.setLocationRelativeTo(null);

		JLabel lblA = new JLabel("a");
		lblA.setFont(new Font("Arial", Font.BOLD, 24));
		lblA.setBounds(10, 21, 46, 14);
		frmChicharronera.getContentPane().add(lblA);

		JLabel lblB = new JLabel("b");
		lblB.setFont(new Font("Arial", Font.BOLD, 24));
		lblB.setBounds(10, 49, 46, 14);
		frmChicharronera.getContentPane().add(lblB);

		JLabel lblC = new JLabel("c");
		lblC.setFont(new Font("Arial", Font.BOLD, 24));
		lblC.setBounds(10, 74, 46, 14);
		frmChicharronera.getContentPane().add(lblC);

		lblResultado = new JLabel("Resultado");
		lblResultado.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblResultado.setFont(new Font("Arial Narrow", Font.BOLD, 27));
		lblResultado.setBounds(113, 133, 176, 69);
		frmChicharronera.getContentPane().add(lblResultado);

		JLabel lblImagen = new JLabel();
		lblImagen.setBounds(400,20,250,150);
		ImageIcon imagenOrginal=new ImageIcon(getClass().getResource("/chicha/chicha.jpg"));
		Image imagenNueva=imagenOrginal.getImage().getScaledInstance(lblImagen.getWidth(),
				lblImagen.getHeight(),Image.SCALE_SMOOTH);
		lblImagen.setIcon(new ImageIcon(imagenNueva));
		frmChicharronera.getContentPane().add(lblImagen);
		
		frmChicharronera.getContentPane().add(lblImagen);
		

		spnA = new JSpinner();
		spnA.setBounds(36, 22, 30, 20);
		frmChicharronera.getContentPane().add(spnA);
		spnA.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				
				Calcular();

			}
		});

		spnB = new JSpinner();
		spnB.setBounds(36, 46, 30, 20);
		frmChicharronera.getContentPane().add(spnB);
		spnB.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				
				Calcular();

			}
		});

		spnC = new JSpinner();
		spnC.setBounds(36, 74, 30, 20);
		frmChicharronera.getContentPane().add(spnC);
		spnC.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				
				Calcular();

			}
		});
	}

	public static void main(String[]cecylover) {
		Chicha1 x=new Chicha1();
		x.frmChicharronera.setVisible(true);
	}
}
