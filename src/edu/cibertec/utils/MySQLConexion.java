package edu.cibertec.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConexion {
	
	
	public static Connection getConexion() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://den1.mysql1.gear.host/autosbd?characterEncoding=latin1&useConfigs=maxPerformance";
			String usr = "autosbd";
			String psw = "Pe8t-i1d-346";
			
			con = DriverManager.getConnection(url, usr, psw);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error >> Driver no Instalado!!");
		} catch (SQLException e) {
			System.out.println("Error >> de conexion con la BD");
		}
		
		return con;
	}
	
}
