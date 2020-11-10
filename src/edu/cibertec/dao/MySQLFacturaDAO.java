package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import edu.cibertec.beans.FacturaDTO;
import edu.cibertec.interfaces.FacturaDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLFacturaDAO implements FacturaDAO {

	
	@Override
	public int RegistrarFactura(FacturaDTO fac) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "INSERT INTO tb_jugador VALUES(null,?)";
			
			pst = con.prepareStatement(sql);
			
			
			pst.setString(1, fac.getFechaFactura());

			rs = pst.executeUpdate();
					
		}catch(Exception e){
			
			System.out.println("ERROR EN LA SENTENCIA - REGISTRAR" + e.getMessage());
			
		}finally{
			try{
				con.close();
				pst.close();
			}catch(Exception e){
				System.out.println("ERROR AL CERRAR - REGISTRAR");
			}
		}
		
		return rs;
	}
	/*----------------------------------------------------------*/
	

	@Override
	public int ActualizarFactura(FacturaDTO fac) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "";
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, fac.getFechaFactura());
			
			pst.setInt(2, fac.getNroFactura());

			rs = pst.executeUpdate();
					
		}catch(Exception e){
			
			System.out.println("ERROR EN LA SENTENCIA - " + e.getMessage());
			
		}finally{
			try{
				con.close();
				pst.close();
			}catch(Exception e){
				System.out.println("ERROR AL CERRAR - ");
			}
		}
		
		return rs;
	}
	/*----------------------------------------------------------*/
	

	@Override
	public int EliminarFactura(FacturaDTO fac) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "";
			
			pst = con.prepareStatement(sql);
			
			pst.setInt(1, fac.getNroFactura());

			rs = pst.executeUpdate();
					
		}catch(Exception e){
			
			System.out.println("ERROR EN LA SENTENCIA - " + e.getMessage());
			
		}finally{
			try{
				con.close();
				pst.close();
			}catch(Exception e){
				System.out.println("ERROR AL CERRAR - ");
			}
		}
		
		return rs;	
	}
	/*----------------------------------------------------------*/

	@Override
	public ArrayList<FacturaDTO> ListadoFactura() {
		
		ArrayList<FacturaDTO> lista = new ArrayList<FacturaDTO>();
		
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				FacturaDTO fac = new FacturaDTO();
				
				fac.setNroFactura(rs.getInt(1));
				fac.setFechaFactura(rs.getString(2));

				lista.add(fac);
			}
					
		}catch(Exception e){
					
					System.out.println("ERROR EN LA SENTENCIA - LISTADO " + e.getMessage());		
		}finally{
			
			try{
				con.close();
				pst.close();
			}catch(Exception e){
					System.out.println("ERROR AL CERRAR - LISTADO");
			}
		}
		
		return lista;
	}

}
