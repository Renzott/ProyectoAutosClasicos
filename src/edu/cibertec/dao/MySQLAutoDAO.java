package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.AutoDTO;
import edu.cibertec.interfaces.AutoDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLAutoDAO implements AutoDAO {

	@Override
	public ArrayList<AutoDTO> ListadoAuto() {
		
		ArrayList<AutoDTO> lista = new ArrayList<AutoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "";
					
			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				AutoDTO au = new AutoDTO();
				
				au.setCodigoAuto(rs.getString(1));
				au.setModelooAuto(rs.getString(2));
				au.setDescripcionAuto(rs.getString(3));
				au.setAnoAuto(rs.getString(4));
				au.setPesoAuto(rs.getString(5));
				au.setPlacaAuto(rs.getString(6));
				au.setColorAuto(rs.getString(7));
				au.setPuertasAuto(rs.getInt(8));
				au.setCilindradaAuto(rs.getString(9));
				au.setPrecioAuto(rs.getDouble(10));
				au.setEstadoAuto(rs.getBoolean(11));
				au.setFotoAuto(rs.getString(12));
				
				au.setCodigoTipoAuto(rs.getString(13));
				au.setCodigoMarcaAuto(rs.getString(14));
				au.setCodigoCarroceria(rs.getString(15));
				au.setCodigoTipoTransmision(rs.getString(16));
				au.setCodigoCombustible(rs.getString(17));
				au.setCodigoKilometraje(rs.getString(18));
				
				lista.add(au);
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
	/*------------------------------------------------------------------*/
	

	@Override
	public ArrayList<AutoDTO> ListadoAutoPorCodigoTipoAuto(String CodTipoAuto) {
		
		ArrayList<AutoDTO> lista = new ArrayList<AutoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "";
					
			pst = con.prepareStatement(sql);
			
			pst.setString(1, CodTipoAuto);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				AutoDTO au = new AutoDTO();
				
				au.setCodigoAuto(rs.getString(1));
				au.setModelooAuto(rs.getString(2));
				au.setDescripcionAuto(rs.getString(3));
				au.setAnoAuto(rs.getString(4));
				au.setPesoAuto(rs.getString(5));
				au.setPlacaAuto(rs.getString(6));
				au.setColorAuto(rs.getString(7));
				au.setPuertasAuto(rs.getInt(8));
				au.setCilindradaAuto(rs.getString(9));
				au.setPrecioAuto(rs.getDouble(10));
				au.setEstadoAuto(rs.getBoolean(11));
				au.setFotoAuto(rs.getString(12));
				
				au.setCodigoTipoAuto(rs.getString(13));
				au.setCodigoMarcaAuto(rs.getString(14));
				au.setCodigoCarroceria(rs.getString(15));
				au.setCodigoTipoTransmision(rs.getString(16));
				au.setCodigoCombustible(rs.getString(17));
				au.setCodigoKilometraje(rs.getString(18));
				
				lista.add(au);
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
	/*------------------------------------------------------------------*/
	

	@Override
	public ArrayList<AutoDTO> ListadoAutoPorCodigoMarcaAuto(String CodMarcaAuto) {
		
		ArrayList<AutoDTO> lista = new ArrayList<AutoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "";
					
			pst = con.prepareStatement(sql);
			
			pst.setString(1, CodMarcaAuto);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				AutoDTO au = new AutoDTO();
				
				au.setCodigoAuto(rs.getString(1));
				au.setModelooAuto(rs.getString(2));
				au.setDescripcionAuto(rs.getString(3));
				au.setAnoAuto(rs.getString(4));
				au.setPesoAuto(rs.getString(5));
				au.setPlacaAuto(rs.getString(6));
				au.setColorAuto(rs.getString(7));
				au.setPuertasAuto(rs.getInt(8));
				au.setCilindradaAuto(rs.getString(9));
				au.setPrecioAuto(rs.getDouble(10));
				au.setEstadoAuto(rs.getBoolean(11));
				au.setFotoAuto(rs.getString(12));
				
				au.setCodigoTipoAuto(rs.getString(13));
				au.setCodigoMarcaAuto(rs.getString(14));
				au.setCodigoCarroceria(rs.getString(15));
				au.setCodigoTipoTransmision(rs.getString(16));
				au.setCodigoCombustible(rs.getString(17));
				au.setCodigoKilometraje(rs.getString(18));
				
				lista.add(au);
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
	/*------------------------------------------------------------------*/
	

	@Override
	public ArrayList<AutoDTO> ListadoAutoPorCodigoCarroceria(String CodCarroceria) {
		
		ArrayList<AutoDTO> lista = new ArrayList<AutoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "";
					
			pst = con.prepareStatement(sql);
			
			pst.setString(1, CodCarroceria);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				AutoDTO au = new AutoDTO();
				
				au.setCodigoAuto(rs.getString(1));
				au.setModelooAuto(rs.getString(2));
				au.setDescripcionAuto(rs.getString(3));
				au.setAnoAuto(rs.getString(4));
				au.setPesoAuto(rs.getString(5));
				au.setPlacaAuto(rs.getString(6));
				au.setColorAuto(rs.getString(7));
				au.setPuertasAuto(rs.getInt(8));
				au.setCilindradaAuto(rs.getString(9));
				au.setPrecioAuto(rs.getDouble(10));
				au.setEstadoAuto(rs.getBoolean(11));
				au.setFotoAuto(rs.getString(12));
				
				au.setCodigoTipoAuto(rs.getString(13));
				au.setCodigoMarcaAuto(rs.getString(14));
				au.setCodigoCarroceria(rs.getString(15));
				au.setCodigoTipoTransmision(rs.getString(16));
				au.setCodigoCombustible(rs.getString(17));
				au.setCodigoKilometraje(rs.getString(18));
				
				lista.add(au);
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
	/*------------------------------------------------------------------*/
	

	@Override
	public ArrayList<AutoDTO> ListadoAutoPorCodigoTipoTransmision(String CodTipoTransmision) {
		
		ArrayList<AutoDTO> lista = new ArrayList<AutoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "";
					
			pst = con.prepareStatement(sql);
			
			pst.setString(1, CodTipoTransmision);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				AutoDTO au = new AutoDTO();
				
				au.setCodigoAuto(rs.getString(1));
				au.setModelooAuto(rs.getString(2));
				au.setDescripcionAuto(rs.getString(3));
				au.setAnoAuto(rs.getString(4));
				au.setPesoAuto(rs.getString(5));
				au.setPlacaAuto(rs.getString(6));
				au.setColorAuto(rs.getString(7));
				au.setPuertasAuto(rs.getInt(8));
				au.setCilindradaAuto(rs.getString(9));
				au.setPrecioAuto(rs.getDouble(10));
				au.setEstadoAuto(rs.getBoolean(11));
				au.setFotoAuto(rs.getString(12));
				
				au.setCodigoTipoAuto(rs.getString(13));
				au.setCodigoMarcaAuto(rs.getString(14));
				au.setCodigoCarroceria(rs.getString(15));
				au.setCodigoTipoTransmision(rs.getString(16));
				au.setCodigoCombustible(rs.getString(17));
				au.setCodigoKilometraje(rs.getString(18));
				
				lista.add(au);
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
	/*------------------------------------------------------------------*/
	

	@Override
	public ArrayList<AutoDTO> ListadoAutoPorCodigoCombustible(String CodCombustible) {
		
		ArrayList<AutoDTO> lista = new ArrayList<AutoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "";
					
			pst = con.prepareStatement(sql);
			
			pst.setString(1, CodCombustible);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				AutoDTO au = new AutoDTO();
				
				au.setCodigoAuto(rs.getString(1));
				au.setModelooAuto(rs.getString(2));
				au.setDescripcionAuto(rs.getString(3));
				au.setAnoAuto(rs.getString(4));
				au.setPesoAuto(rs.getString(5));
				au.setPlacaAuto(rs.getString(6));
				au.setColorAuto(rs.getString(7));
				au.setPuertasAuto(rs.getInt(8));
				au.setCilindradaAuto(rs.getString(9));
				au.setPrecioAuto(rs.getDouble(10));
				au.setEstadoAuto(rs.getBoolean(11));
				au.setFotoAuto(rs.getString(12));
				
				au.setCodigoTipoAuto(rs.getString(13));
				au.setCodigoMarcaAuto(rs.getString(14));
				au.setCodigoCarroceria(rs.getString(15));
				au.setCodigoTipoTransmision(rs.getString(16));
				au.setCodigoCombustible(rs.getString(17));
				au.setCodigoKilometraje(rs.getString(18));
				
				lista.add(au);
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
	/*------------------------------------------------------------------*/
	

	@Override
	public ArrayList<AutoDTO> ListadoAutoPorCodigoKilometraje(String CodKilometraje) {
		
		ArrayList<AutoDTO> lista = new ArrayList<AutoDTO>();
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "";
					
			pst = con.prepareStatement(sql);
			
			pst.setString(1, CodKilometraje);
				
			rs = pst.executeQuery();
					
					
			while(rs.next()){
				
				AutoDTO au = new AutoDTO();
				
				au.setCodigoAuto(rs.getString(1));
				au.setModelooAuto(rs.getString(2));
				au.setDescripcionAuto(rs.getString(3));
				au.setAnoAuto(rs.getString(4));
				au.setPesoAuto(rs.getString(5));
				au.setPlacaAuto(rs.getString(6));
				au.setColorAuto(rs.getString(7));
				au.setPuertasAuto(rs.getInt(8));
				au.setCilindradaAuto(rs.getString(9));
				au.setPrecioAuto(rs.getDouble(10));
				au.setEstadoAuto(rs.getBoolean(11));
				au.setFotoAuto(rs.getString(12));
				
				au.setCodigoTipoAuto(rs.getString(13));
				au.setCodigoMarcaAuto(rs.getString(14));
				au.setCodigoCarroceria(rs.getString(15));
				au.setCodigoTipoTransmision(rs.getString(16));
				au.setCodigoCombustible(rs.getString(17));
				au.setCodigoKilometraje(rs.getString(18));
				
				lista.add(au);
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
