package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.CombustibleDTO;
import edu.cibertec.interfaces.CombustibleDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLCombustibleDAO implements CombustibleDAO {

	@Override
	public ArrayList<CombustibleDTO> ListadoCombustible() {
		
		ArrayList<CombustibleDTO> lista = new ArrayList<CombustibleDTO>();
		
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL SPAL_Listar_Combustible";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				CombustibleDTO c = new CombustibleDTO();
				
				c.setCodigoCombustible(rs.getString(1));
				c.setNombreCombustible(rs.getString(2));
						
				lista.add(c);
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
	public CombustibleDTO ListadoCombustiblexCodigo(String codigo) {
		CombustibleDTO combustible = null;
		
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL SPAL_Listar_CombustiblexCodigo(?)";
					
			pst = con.prepareStatement(sql);

			pst.setString(1, codigo);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				CombustibleDTO c = new CombustibleDTO();
				
				c.setCodigoCombustible(rs.getString(1));
				c.setNombreCombustible(rs.getString(2));
						
				combustible = c;
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
		

		return combustible;
	}

}
