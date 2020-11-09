package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.KilometrajeDTO;
import edu.cibertec.interfaces.KilometrajeDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLKilometrajeDAO implements KilometrajeDAO {

	@Override
	public ArrayList<KilometrajeDTO> ListadoKilometraje() {
		
		ArrayList<KilometrajeDTO> lista = new ArrayList<KilometrajeDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL SPAL_Listar_Kilometraje";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				KilometrajeDTO k = new KilometrajeDTO();
				
				k.setCodigoKilometraje(rs.getString(1));
				k.setNombreKilometraje(rs.getString(2));
						
				lista.add(k);
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
	public KilometrajeDTO ListadoKilometrajexCodigo(String codigo) {
		KilometrajeDTO kilometraje = null;
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL SPAL_Listar_KilometrajexCodigo(?)";
					
			pst = con.prepareStatement(sql);

			pst.setString(1, codigo);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				KilometrajeDTO k = new KilometrajeDTO();
				
				k.setCodigoKilometraje(rs.getString(1));
				k.setNombreKilometraje(rs.getString(2));
						
				kilometraje = k;
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
		
		
		return kilometraje;
	}

}
