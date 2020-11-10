package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.MarcaAutoDTO;
import edu.cibertec.interfaces.MarcaAutoDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLMarcaAutoDAO implements MarcaAutoDAO {

	@Override
	public ArrayList<MarcaAutoDTO> ListadoMarcaAuto() {
		
		
		ArrayList<MarcaAutoDTO> lista = new ArrayList<MarcaAutoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL SPAL_Listar_MarcaAuto";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				MarcaAutoDTO ma = new MarcaAutoDTO();
				
				ma.setCodigoMarcaAuto(rs.getString(1));
				ma.setNombreMarcaAuto(rs.getString(2));
						
				lista.add(ma);
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

	/*----------------------Alvaro------------------------*/
	
	@Override
	public MarcaAutoDTO ListadoMarcaAutoxCodigo(String codigo) {
		MarcaAutoDTO marcaAuto = null;
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL SPAL_Listar_MarcaAutoxCodigo(?)";
					
			pst = con.prepareStatement(sql);

			pst.setString(1, codigo);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				MarcaAutoDTO ma = new MarcaAutoDTO();
				
				ma.setCodigoMarcaAuto(rs.getString(1));
				ma.setNombreMarcaAuto(rs.getString(2));
						
				marcaAuto = ma;
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
		
		return marcaAuto;
	}

}
