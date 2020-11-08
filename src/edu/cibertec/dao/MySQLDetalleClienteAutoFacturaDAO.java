package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.DetalleClienteAutoFacturaDTO;
import edu.cibertec.interfaces.DetalleClienteAutoFacturaDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLDetalleClienteAutoFacturaDAO implements DetalleClienteAutoFacturaDAO {

	
	@Override
	public int RegistrarDetalleClienteAutoFactura(DetalleClienteAutoFacturaDTO det) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "INSERT INTO tb_jugador VALUES(?,?)";
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, det.getCodigoAuto());
			pst.setInt(2, det.getCodigoCliente());
			pst.setInt(3, det.getNroFactura());
			pst.setDouble(4, det.getPrecioVentaDetalleClienteAutoFactura());

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
	/*----------------------------------------------------------*/
	

	@Override
	public int ActualizarDetalleClienteAutoFactura(DetalleClienteAutoFacturaDTO det) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "";
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, det.getCodigoAuto());
			pst.setInt(2, det.getCodigoCliente());
			pst.setInt(3, det.getNroFactura());
			pst.setDouble(4, det.getPrecioVentaDetalleClienteAutoFactura());

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
	/*----------------------------------------------------------*/
	

	@Override
	public int EliminarDetalleClienteAutoFactura(DetalleClienteAutoFacturaDTO det) {
		
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		
		try{
			
			con = MySQLConexion.getConexion();
			
			String sql = "";
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, det.getCodigoAuto());
			pst.setInt(2, det.getCodigoCliente());
			pst.setInt(3, det.getNroFactura());

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
	/*----------------------------------------------------------*/
	

	@Override
	public ArrayList<DetalleClienteAutoFacturaDTO> ListadoDetalleClienteAutoFactura() {
		
		
		ArrayList<DetalleClienteAutoFacturaDTO> lista = new ArrayList<DetalleClienteAutoFacturaDTO>();
		
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				DetalleClienteAutoFacturaDTO d = new DetalleClienteAutoFacturaDTO();
				
				
				d.setCodigoAuto(rs.getString(1));
				d.setCodigoCliente(rs.getInt(2));
				d.setNroFactura(rs.getInt(3));
				d.setPrecioVentaDetalleClienteAutoFactura(rs.getDouble(4));

				lista.add(d);
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
