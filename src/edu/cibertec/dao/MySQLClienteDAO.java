package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.ClienteDTO;
import edu.cibertec.interfaces.ClienteDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLClienteDAO implements ClienteDAO {

	
	@Override
	public int RegistrarCliente(ClienteDTO clie) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "CALL SPAL_RegistrarCliente(?,?,?,?,?,?,?,?)";
			
			pst = con.prepareStatement(sql);
			
			
			pst.setString(1, clie.getNroDocumentoCliente());
			pst.setString(2, clie.getNombresCliente());
			pst.setString(3, clie.getApellidosCliente());
			pst.setString(4, clie.getFechaNacimientoCliente());
			pst.setString(5, clie.getCorreoCliente());
			pst.setString(6, clie.getContrasenaCliente());
			pst.setInt(7, clie.getTelefonoCliente());
			pst.setString(8, clie.getCodigoAuto());


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
	/*----------------------------------------------------------------------------------------------*/
	
	

	@Override
	public int ActualizarCliente(ClienteDTO clie) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "SPAL_ActualizarCliente";
			
			pst = con.prepareStatement(sql);

			pst.setInt(1, clie.getCodigoCliente());
			pst.setString(2, clie.getNroDocumentoCliente());
			pst.setString(3, clie.getNombresCliente());
			pst.setString(4, clie.getApellidosCliente());
			pst.setString(5, clie.getFechaNacimientoCliente());
			pst.setString(6, clie.getCorreoCliente());
			pst.setString(7, clie.getContrasenaCliente());
			pst.setInt(8, clie.getTelefonoCliente());
			pst.setString(9, clie.getCodigoAuto());


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
	/*----------------------------------------------------------------------------------------------*/
	

	@Override
	public int EliminarCliente(ClienteDTO clie) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "SPAL_EliminarCliente";
			
			pst = con.prepareStatement(sql);
			
			
			pst.setInt(1, clie.getCodigoCliente());


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
	/*----------------------------------------------------------------------------------------------*/
	
	

	@Override
	public ArrayList<ClienteDTO> ListadoClientes() {
		
		ArrayList<ClienteDTO> lista = new ArrayList<ClienteDTO>();
		
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "SPAL_ListarCliente";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				ClienteDTO clien = new ClienteDTO();
				
				clien.setCodigoCliente(rs.getInt(1));
				clien.setNroDocumentoCliente(rs.getString(2));
				clien.setNombresCliente(rs.getString(3));
				clien.setApellidosCliente(rs.getString(4));
				clien.setFechaNacimientoCliente(rs.getString(5));
				clien.setCorreoCliente(rs.getString(6));
				clien.setContrasenaCliente(rs.getString(7));
				clien.setTelefonoCliente(rs.getInt(8));
				clien.setCodigoAuto(rs.getString(9));
				
				lista.add(clien);
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
	/*----------------------------------------------------------------------------------------------*/
	
	

	@Override
	public ArrayList<ClienteDTO> ListadoClientesPorCodigoAuto(String CodAuto) {
		
		ArrayList<ClienteDTO> lista = new ArrayList<ClienteDTO>();
		
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "SPAL_ListarClientexCodigo";
					
			pst = con.prepareStatement(sql);
			pst.setString(1, CodAuto);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				ClienteDTO clien = new ClienteDTO();
				
				clien.setCodigoCliente(rs.getInt(1));
				clien.setNroDocumentoCliente(rs.getString(2));
				clien.setNombresCliente(rs.getString(3));
				clien.setApellidosCliente(rs.getString(4));
				clien.setFechaNacimientoCliente(rs.getString(5));
				clien.setCorreoCliente(rs.getString(6));
				clien.setContrasenaCliente(rs.getString(7));
				clien.setTelefonoCliente(rs.getInt(8));
				clien.setCodigoAuto(rs.getString(9));
				
				lista.add(clien);
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
