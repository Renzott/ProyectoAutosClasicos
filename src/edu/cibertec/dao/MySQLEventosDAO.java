package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.EventosDTO;
import edu.cibertec.interfaces.EventosDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLEventosDAO implements EventosDAO {

	
	@Override
	public int RegistrarEventos(EventosDTO eve) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "CALL {SPAL_RegistrarEventos (?,?,?,?,?)}";
			
			pst = con.prepareStatement(sql);
			
			
			pst.setString(1, eve.getCodigoEventos());
			pst.setString(2, eve.getTituloEventos());
			pst.setString(3, eve.getFechaEventos());
			pst.setString(4, eve.getFotoEventos());
			pst.setString(5, eve.getCodigoAuto());

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
	/*-------------------------------------------------*/
	

	@Override
	public int ActualizarEventos(EventosDTO eve) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "CALL {SPAL_ActualizarEventos (?,?,?,?,?)}";
			
			pst = con.prepareStatement(sql);
			
			
			pst.setString(1, eve.getCodigoEventos());
			pst.setString(2, eve.getTituloEventos());
			pst.setString(3, eve.getFechaEventos());
			pst.setString(4, eve.getFotoEventos());
			pst.setString(5, eve.getCodigoAuto());

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
	/*-------------------------------------------------*/
	

	@Override
	public int EliminarEventos(EventosDTO eve) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "CALL {SPAL_EliminarEventos (?)}";
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, eve.getCodigoEventos());

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
	/*-------------------------------------------------*/
	
	

	@Override
	public ArrayList<EventosDTO> ListadoEventos() {
		
		ArrayList<EventosDTO> lista = new ArrayList<EventosDTO>();
		
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL {SPAL_Listar_Evento}";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				EventosDTO e = new EventosDTO();
				
				e.setCodigoEventos(rs.getString(1));
				e.setTituloEventos(rs.getString(2));
				e.setFechaEventos(rs.getString(3));
				e.setFotoEventos(rs.getString(4));
				e.setCodigoAuto(rs.getString(5));
				
				lista.add(e);
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
	/*-------------------------------------------------*/
	

	@Override
	public ArrayList<EventosDTO> ListadoEventosPorCodigoAuto(String CodAuto) {
		
		ArrayList<EventosDTO> lista = new ArrayList<EventosDTO>();
		
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL {SPAL_Listar_EventoxCodigo(?)}";
					
			pst = con.prepareStatement(sql);
			
			pst.setString(1, CodAuto);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				EventosDTO e = new EventosDTO();
				
				e.setCodigoEventos(rs.getString(1));
				e.setTituloEventos(rs.getString(2));
				e.setFechaEventos(rs.getString(3));
				e.setFotoEventos(rs.getString(4));
				e.setCodigoAuto(rs.getString(5));
				
				lista.add(e);
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
