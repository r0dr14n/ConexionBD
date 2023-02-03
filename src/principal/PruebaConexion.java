package principal;

import java.sql.Connection;

import utilidades.ConexionBD;

public class PruebaConexion {
	
	public static void main(String[] args) {
		
		ConexionBD conexionBD = new ConexionBD();
		
		System.out.println("Conectando a la base de datos...");
		Connection conexion = conexionBD.getConexion();
		
		
		
		
		
		
		
	}
}
