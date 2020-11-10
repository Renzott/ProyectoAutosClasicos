package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.TipoAutoDTO;
import edu.cibertec.interfaces.TipoAutoDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLTipoAutoDAO implements TipoAutoDAO {

	@Override
	public ArrayList<TipoAutoDTO> ListadoTipoAuto() {
		
		
		ArrayList<TipoAutoDTO> lista = new ArrayList<TipoAutoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				
				TipoAutoDTO ta = new TipoAutoDTO();
				
				ta.setCodigoTipoAuto(rs.getString(1));
				ta.setNombreTipoAuto(rs.getString(2));
						
				lista.add(ta);
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
