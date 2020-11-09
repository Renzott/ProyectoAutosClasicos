package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.DetalleFotoDTO;
import edu.cibertec.interfaces.DetalleFotoDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLDetalleFotoDAO implements DetalleFotoDAO {

	
	@Override
	public ArrayList<DetalleFotoDTO> ListadoDetalleFoto() {
		
		ArrayList<DetalleFotoDTO> lista = new ArrayList<DetalleFotoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				DetalleFotoDTO df = new DetalleFotoDTO();
				
				df.setCodigoDetalleFoto(rs.getString(1));
				df.setCodigoFoto(rs.getString(2));
				df.setUrlDetalleFoto(rs.getString(3));
				
				lista.add(df);
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
	/*---------------------------------------------------------------*/
	
	
	

	@Override
	public ArrayList<DetalleFotoDTO> ListadoDetalleFotoPorCodigoFoto(String CodFoto) {
		
		ArrayList<DetalleFotoDTO> lista = new ArrayList<DetalleFotoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "SPAL_Listar_DetallexFoto";
					
			pst = con.prepareStatement(sql);
			
			pst.setString(1, CodFoto);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				DetalleFotoDTO df = new DetalleFotoDTO();
				
				df.setCodigoDetalleFoto(rs.getString(1));
				df.setCodigoFoto(rs.getString(2));
				df.setUrlDetalleFoto(rs.getString(3));
				
				lista.add(df);
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
