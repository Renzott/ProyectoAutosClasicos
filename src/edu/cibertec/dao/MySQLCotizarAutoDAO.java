package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.CotizarAutoDTO;
import edu.cibertec.interfaces.CotizarAutoDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLCotizarAutoDAO implements CotizarAutoDAO {

	@Override
	public int RegistrarCotizarAuto(CotizarAutoDTO cot) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "CALL SPAL_RegistrarCotizarAuto(null,?,?,?,?,?,?,?,?)";
			
			pst = con.prepareStatement(sql);
			
			
			pst.setString(1, cot.getNroDocumentoCotizarAuto());
			pst.setString(2, cot.getNombresCotizarAuto());
			pst.setString(3, cot.getApellidosCotizarAuto());
			pst.setString(4, cot.getCorreoCotizarAuto());
			pst.setDouble(5, cot.getSumaAseguradoraDolarCotizarAuto());
			pst.setInt(6, cot.getTelefonoCotizarAuto());
			pst.setString(7, cot.getCodigoMarcaAuto());
			pst.setString(8, cot.getCodigoAuto());

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
	/*--------------------------------------------------------------------------------*/

	
	@Override
	public int ActualizarCotizarAuto(CotizarAutoDTO cot) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "CALL SPAL_ActualizarCotizarAuto(?,?,?,?,?,?,?,?,?)";
			
			pst = con.prepareStatement(sql);
			
			
			pst.setString(1, cot.getNroDocumentoCotizarAuto());
			pst.setString(2, cot.getNombresCotizarAuto());
			pst.setString(3, cot.getApellidosCotizarAuto());
			pst.setString(4, cot.getCorreoCotizarAuto());
			pst.setDouble(5, cot.getSumaAseguradoraDolarCotizarAuto());
			pst.setInt(6, cot.getTelefonoCotizarAuto());
			pst.setString(7, cot.getCodigoMarcaAuto());
			pst.setString(8, cot.getCodigoAuto());
			
			pst.setInt(9, cot.getCodigoCotizarAuto());

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
	/*--------------------------------------------------------------------------------*/
	

	@Override
	public int EliminarCotizarAuto(CotizarAutoDTO cot) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "CALL {SPAL_EliminarCotizarAuto(?)} ";
			
			pst = con.prepareStatement(sql);
			
			pst.setInt(1, cot.getCodigoCotizarAuto());

			rs = pst.executeUpdate();
					
		}catch(Exception e){
			
			System.out.println("ERROR EN LA SENTENCIA - REGISTRAR" + e.getMessage());
			
		}finally{
			try{
				con.close();
				pst.close();
			}catch(Exception e){
				System.out.println("ERROR AL CERRAR - ELIMINAR");
			}
		}
		
		return rs;
	}
	/*--------------------------------------------------------------------------------*/
	

	@Override
	public ArrayList<CotizarAutoDTO> ListadoCotizarAutos() {
		
		ArrayList<CotizarAutoDTO> lista = new ArrayList<CotizarAutoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL SPAL_Listar_CotizarAuto";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				CotizarAutoDTO ca = new CotizarAutoDTO();
				
				ca.setCodigoCotizarAuto(rs.getInt(1));
				ca.setNroDocumentoCotizarAuto(rs.getString(2));
				ca.setNombresCotizarAuto(rs.getString(3));
				ca.setApellidosCotizarAuto(rs.getString(4));
				ca.setCorreoCotizarAuto(rs.getString(5));
				ca.setSumaAseguradoraDolarCotizarAuto(rs.getDouble(6));
				ca.setTelefonoCotizarAuto(rs.getInt(7));
				ca.setCodigoMarcaAuto(rs.getString(8));
				ca.setCodigoAuto(rs.getString(9));
				
				lista.add(ca);
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
	/*--------------------------------------------------------------------------------*/
	

	@Override
	public ArrayList<CotizarAutoDTO> ListadoCotizarAutosPorCodigoMarcaAuto(String CodMarcaAuto) {
		
		ArrayList<CotizarAutoDTO> lista = new ArrayList<CotizarAutoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= " CALL SPAL_Listar_CotizarAutoxMarca(?)";
					
			pst = con.prepareStatement(sql);
			
			pst.setString(1, CodMarcaAuto);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				CotizarAutoDTO ca = new CotizarAutoDTO();
				
				ca.setCodigoCotizarAuto(rs.getInt(1));
				ca.setNroDocumentoCotizarAuto(rs.getString(2));
				ca.setNombresCotizarAuto(rs.getString(3));
				ca.setApellidosCotizarAuto(rs.getString(4));
				ca.setCorreoCotizarAuto(rs.getString(5));
				ca.setSumaAseguradoraDolarCotizarAuto(rs.getDouble(6));
				ca.setTelefonoCotizarAuto(rs.getInt(7));
				ca.setCodigoMarcaAuto(rs.getString(8));
				ca.setCodigoAuto(rs.getString(9));
				
				lista.add(ca);
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
	/*--------------------------------------------------------------------------------*/
	

	@Override
	public ArrayList<CotizarAutoDTO> ListadoCotizarAutosPorCodigoAuto(String CodAuto) {
		
		
		ArrayList<CotizarAutoDTO> lista = new ArrayList<CotizarAutoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= " CALL SPAL_Listar_CotizarAutoxCodigoAuto (?)";
					
			pst = con.prepareStatement(sql);
			
			pst.setString(1, CodAuto);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				CotizarAutoDTO ca = new CotizarAutoDTO();
				
				ca.setCodigoCotizarAuto(rs.getInt(1));
				ca.setNroDocumentoCotizarAuto(rs.getString(2));
				ca.setNombresCotizarAuto(rs.getString(3));
				ca.setApellidosCotizarAuto(rs.getString(4));
				ca.setCorreoCotizarAuto(rs.getString(5));
				ca.setSumaAseguradoraDolarCotizarAuto(rs.getDouble(6));
				ca.setTelefonoCotizarAuto(rs.getInt(7));
				ca.setCodigoMarcaAuto(rs.getString(8));
				ca.setCodigoAuto(rs.getString(9));
				
				lista.add(ca);
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
