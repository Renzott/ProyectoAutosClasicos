package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.CarroceriaDTO;
import edu.cibertec.interfaces.CarroceriaDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLCarroceriaDAO implements CarroceriaDAO {

	@Override
	public ArrayList<CarroceriaDTO> ListadoCarroceria() {
		
		ArrayList<CarroceriaDTO> lista = new ArrayList<CarroceriaDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL SPAL_Listar_Carroceria";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				CarroceriaDTO c = new CarroceriaDTO();
				
				c.setCodigoCarroceria(rs.getString(1));
				c.setNombreCarroceria(rs.getString(2));
						
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
	public CarroceriaDTO ListadoCarroceriaxCodigo(String codigo) {
		CarroceriaDTO carroceria = null;
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL SPAL_Listar_CarroceriaxCodigo(?)";
					
			pst = con.prepareStatement(sql);

			pst.setString(1, codigo);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				CarroceriaDTO c = new CarroceriaDTO();
				
				c.setCodigoCarroceria(rs.getString(1));
				c.setNombreCarroceria(rs.getString(2));
				
				carroceria = c;
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
		

		return carroceria;
	}

}
