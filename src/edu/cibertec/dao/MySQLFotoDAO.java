package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.FotoDTO;
import edu.cibertec.interfaces.FotoDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLFotoDAO implements FotoDAO {

	@Override
	public ArrayList<FotoDTO> ListadoFoto() {
		
		ArrayList<FotoDTO> lista = new ArrayList<FotoDTO>();
		
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL SPAL_Listar_Foto";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				FotoDTO f = new FotoDTO();
				
				f.setCodigoFoto(rs.getString(1));
				f.setNombreFoto(rs.getString(2));
						
				lista.add(f);
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
