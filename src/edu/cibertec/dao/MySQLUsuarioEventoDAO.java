package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.UsuarioEventoDTO;
import edu.cibertec.interfaces.UsuarioEventoDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLUsuarioEventoDAO implements UsuarioEventoDAO {

	
	@Override
	public int RegistrarUsuarioEvento(UsuarioEventoDTO ue) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "Call {SPAL_RegistrarUsuarioEvento (?,?,?,?,?,?)}";
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, ue.getNroDocumentoUsuarioEvento());
			pst.setString(2, ue.getNombresUsuarioEvento());
			pst.setString(3, ue.getApellidosUsuarioEvento());
			pst.setString(4, ue.getFechaNacimientoUsuarioEvento());
			pst.setString(5, ue.getCorreoUsuarioEvento());
			pst.setString(6, ue.getCodigoEventos());
	
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
	/*-----------------------------------------------------------------------------*/

	@Override
	public int ActualizarUsuarioEvento(UsuarioEventoDTO ue) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "Call {SPAL_ActualizarUsuarioEvento (?,?,?,?,?,?,?)}";
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, ue.getNroDocumentoUsuarioEvento());
			pst.setString(2, ue.getNombresUsuarioEvento());
			pst.setString(3, ue.getApellidosUsuarioEvento());
			pst.setString(4, ue.getFechaNacimientoUsuarioEvento());
			pst.setString(5, ue.getCorreoUsuarioEvento());
			pst.setString(6, ue.getCodigoEventos());
			
			pst.setInt(7, ue.getCodigoUsuarioEvento());
	
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
	/*-----------------------------------------------------------------------------*/
	

	@Override
	public int EliminarUsuarioEvento(UsuarioEventoDTO ue) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "Call {SPAL_EliminarUsuarioEvento (?)}";
			
			pst = con.prepareStatement(sql);
			
			pst.setInt(1, ue.getCodigoUsuarioEvento());
	
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
	/*-----------------------------------------------------------------------------*/
	

	@Override
	public ArrayList<UsuarioEventoDTO> ListadoUsuarioEvento() {
		
		ArrayList<UsuarioEventoDTO> lista = new ArrayList<UsuarioEventoDTO>();
		
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL {SPAL_ListarUsuarioEvento}";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				UsuarioEventoDTO ue = new UsuarioEventoDTO();
				
				ue.setCodigoUsuarioEvento(rs.getInt(1));
				ue.setNroDocumentoUsuarioEvento(rs.getString(2));
				ue.setNombresUsuarioEvento(rs.getString(3));
				ue.setApellidosUsuarioEvento(rs.getString(4));
				ue.setFechaNacimientoUsuarioEvento(rs.getString(5));
				ue.setCorreoUsuarioEvento(rs.getString(6));
				ue.setCodigoEventos(rs.getString(7));
			
				lista.add(ue);
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
	/*-----------------------------------------------------------------------------*/
	
	
	@Override
	public ArrayList<UsuarioEventoDTO> ListadoUsuarioEventoPorCodigoEvento(String CodEventos) {
		
		
		ArrayList<UsuarioEventoDTO> lista = new ArrayList<UsuarioEventoDTO>();
		
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL {SPAL_ListarUsuarioEventoXCodEvento}";
					
			pst = con.prepareStatement(sql);
			
			pst.setString(1, CodEventos);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				UsuarioEventoDTO ue = new UsuarioEventoDTO();
				
				ue.setCodigoUsuarioEvento(rs.getInt(1));
				ue.setNroDocumentoUsuarioEvento(rs.getString(2));
				ue.setNombresUsuarioEvento(rs.getString(3));
				ue.setApellidosUsuarioEvento(rs.getString(4));
				ue.setFechaNacimientoUsuarioEvento(rs.getString(5));
				ue.setCorreoUsuarioEvento(rs.getString(6));
				ue.setCodigoEventos(rs.getString(7));
			
				lista.add(ue);
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
