package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	// Parametros de la conexion
	
	private static String database = "sakila";
	private static String user = "user";
	private static String password = "123456";
	private static String url = "jdbc:mysql://localhost:3306/"+database;
	
	private Connection conexion = null;
	
	public Connection getConexion() {
		if (conexion!=null) {
			return this.conexion;
		}
		// No hay conexion
		try {
			// Registramos el driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Obtenemos una conexión desde el driver
			this.conexion = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("Error registrando el driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("No se ha podido conectar");
			e.printStackTrace();
		}
		System.out.println("Conexión establecida");
		return this.conexion;
	}
	
	
	
	
	
	
	
	
}
