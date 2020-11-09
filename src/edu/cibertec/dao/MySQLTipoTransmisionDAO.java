package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.TipoTransmisionDTO;
import edu.cibertec.interfaces.TipoTransmisionDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLTipoTransmisionDAO implements TipoTransmisionDAO {

	@Override
	public ArrayList<TipoTransmisionDTO> ListadoTipoTransmision() {
		
		ArrayList<TipoTransmisionDTO> lista = new ArrayList<TipoTransmisionDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL SPAL_Listar_TipoTransmision";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				TipoTransmisionDTO tt = new TipoTransmisionDTO();
				
				tt.setCodigoTipoTransmision(rs.getString(1));
				tt.setNombreTipoTransmision(rs.getString(2));
						
				lista.add(tt);
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
	public TipoTransmisionDTO ListadoTipoTransmisionxCodigo(String codigo) {
		TipoTransmisionDTO tipoTransmision = null;
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL SPAL_Listar_TipoTransmisionxCodigo(?)";
					
			pst = con.prepareStatement(sql);

			pst.setString(1, codigo);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				TipoTransmisionDTO tt = new TipoTransmisionDTO();
				
				tt.setCodigoTipoTransmision(rs.getString(1));
				tt.setNombreTipoTransmision(rs.getString(2));
						
				tipoTransmision = tt;
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
		
		return tipoTransmision;
	}

}
