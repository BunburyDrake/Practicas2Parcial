package barraProgreso;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class HolaD {

	 JFrame frmHolaD;
String nombre="";
	
	public HolaD() {
		initialize();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHolaD = new JFrame();
		frmHolaD.setBounds(100, 100, 450, 300);
		frmHolaD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
