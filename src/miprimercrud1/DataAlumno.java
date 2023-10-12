package miprimercrud1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DataAlumno {
	Connection cx;
	public static void main (String[]ola) {
		DataAlumno da=new  DataAlumno();
		da.conectar();
	}
	public DataAlumno() {
		Connection cx;
	}
	public Connection conectar() {
		try {
			cx=DriverManager.getConnection("jdbc:mysql://localhost:3306/a303","root","");
			System.out.println("CONEXION EXITOSA");
		} catch (SQLException e) {
			System.out.println("FALLO CONEXION");
			e.printStackTrace();
		}
		return cx;
	}
	public boolean insertarAlumno(Alumno a) {
		try {
		PreparedStatement ps=conectar().prepareStatement("INSERT INFO ALUMNO VALUES(NULL,?,?,?,?,?,?,?,?,?,?,?");
		ps.setString(1, a.getNumControl());
		ps.setString(1, a.getNombre());
		ps.setString(1, a.getApellidoP());
		ps.setString(1, a.getApellidoM());
		ps.setString(1, a.getCurp());
		ps.setString(1, a.getDireccion());
		ps.setString(1, a.getTelefono());
		ps.setString(1, a.getCorreo());
		ps.setString(1, a.getGrupo());
		ps.setString(1, a.getCarrera());
		ps.setString(1, a.getFecha());
		}catch (exeption e2){
			
		}
	}
}
