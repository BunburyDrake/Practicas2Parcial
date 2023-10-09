package Scroll;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import java.awt.BorderLayout;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class scroll {

	private JFrame frmScroll;
	private JLabel lblAlto;
	private JScrollBar srcAlto;
	private JLabel lblAncho;
	private JLabel lblN;
	private JScrollBar srcAncho;
	int widith=0;
	int heigth=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scroll window = new scroll();
					window.frmScroll.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public scroll() {
		initialize();
	}
	public void cambiarImagen() {
		 widith = srcAncho.getValue();
		 heigth = srcAlto.getValue();
		 lblN.setBounds(24,165,widith,heigth);
		ImageIcon imagenOriginal=new ImageIcon(getClass().getResource("/Scroll/chicha.jpg"));
		Image imagenNueva=imagenOriginal.getImage().getScaledInstance(lblN.getWidth(),
		lblN.getHeight(),Image.SCALE_SMOOTH);
		lblN.setIcon(new ImageIcon(imagenNueva));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScroll = new JFrame();
		frmScroll.setTitle("Scroll");
		frmScroll.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Downloads\\6.png"));
		frmScroll.setBounds(100, 100, 771, 404);
		frmScroll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmScroll.setLocationRelativeTo(null);
		frmScroll.getContentPane().setLayout(null);
		lblN = new JLabel("");
		lblN.setIcon(new ImageIcon(scroll.class.getResource("/Scroll/chicha.jpg")));
		lblN.setBounds(10, 94, 735, 260);
		frmScroll.getContentPane().add(lblN);
		srcAlto = new JScrollBar();
		srcAlto.setMinimum(10);
		srcAlto.setMaximum(700);
		srcAlto.setOrientation(JScrollBar.HORIZONTAL);
		srcAlto.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				cambiarImagen();
			}
		});
		srcAlto.setBounds(10, 35, 188, 48);
		frmScroll.getContentPane().add(srcAlto);
		
		lblAlto = new JLabel("alto");
		lblAlto.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblAlto.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		lblAlto.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlto.setBounds(10, 0, 104, 24);
		frmScroll.getContentPane().add(lblAlto);
		
		lblAncho = new JLabel("Ancho");
		lblAncho.setHorizontalAlignment(SwingConstants.CENTER);
		lblAncho.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblAncho.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		lblAncho.setBounds(320, 0, 104, 24);
		frmScroll.getContentPane().add(lblAncho);
		
		srcAncho = new JScrollBar();
		srcAncho.setMinimum(10);
		srcAncho.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				cambiarImagen();
			}
		});
		srcAncho.setOrientation(JScrollBar.HORIZONTAL);
		srcAncho.setMaximum(700);
		srcAncho.setBounds(236, 35, 188, 48);
		frmScroll.getContentPane().add(srcAncho);
		
		
	}
}
