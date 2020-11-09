package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.beans.AutoDTO;
import edu.cibertec.beans.CarroceriaDTO;
import edu.cibertec.beans.CombustibleDTO;
import edu.cibertec.beans.KilometrajeDTO;
import edu.cibertec.beans.MarcaAutoDTO;
import edu.cibertec.beans.TipoAutoDTO;
import edu.cibertec.beans.TipoTransmisionDTO;
import edu.cibertec.interfaces.AutoDAO;
import edu.cibertec.service.CarroceriaService;
import edu.cibertec.service.CombustibleService;
import edu.cibertec.service.KilometrajeService;
import edu.cibertec.service.MarcaAutoService;
import edu.cibertec.service.TipoAutoService;
import edu.cibertec.service.TipoTransmisionService;
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
					
			String sql= "CALL SPAL_ListarAuto";
					
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

				TipoAutoService tipoAutoService = new TipoAutoService();
				TipoAutoDTO tipoAuto = tipoAutoService.ListadoTipoAutoxCodigo(rs.getString(13));
				au.setTipoAuto(tipoAuto);

				MarcaAutoService marcaAutoService = new MarcaAutoService();
				MarcaAutoDTO marcaAuto = marcaAutoService.ListadoMarcaAutoxCodigo(rs.getString(14));
				au.setMarcaAuto(marcaAuto);
				
				CarroceriaService carroceriaService = new CarroceriaService();
				CarroceriaDTO carroceria = carroceriaService.ListadoCarroceriaxCodigo(rs.getString(15));
				au.setCarroceria(carroceria);
				
				TipoTransmisionService tipoTransmisionService = new TipoTransmisionService();
				TipoTransmisionDTO tipoTransmision = tipoTransmisionService.ListadoTipoTransmisionxCodigo(rs.getString(16));
				au.setTipoTransmision(tipoTransmision);
					
				CombustibleService combustibleService = new CombustibleService();
				CombustibleDTO combustible = combustibleService.ListadoCombustiblexCodigo(rs.getString(17));
				au.setCombustible(combustible);

				KilometrajeService kilometrajeService = new KilometrajeService();
				KilometrajeDTO kilometraje = kilometrajeService.ListadoKilometrajexCodigo(rs.getString(18));
				au.setKilometraje(kilometraje);
				
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
	public AutoDTO ListadoAutoPorCodigo(String codigo) {
		AutoDTO auto = new AutoDTO();
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;
				
		try{
					
			con = MySQLConexion.getConexion();
					
			String sql= "CALL SPAL_ListarAutoxCodigo(?)";
					
			pst = con.prepareStatement(sql);
			
			pst.setString(1, codigo);
				
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
				
				TipoAutoService tipoAutoService = new TipoAutoService();
				TipoAutoDTO tipoAuto = tipoAutoService.ListadoTipoAutoxCodigo(rs.getString(13));
				au.setTipoAuto(tipoAuto);

				MarcaAutoService marcaAutoService = new MarcaAutoService();
				MarcaAutoDTO marcaAuto = marcaAutoService.ListadoMarcaAutoxCodigo(rs.getString(14));
				au.setMarcaAuto(marcaAuto);
				
				CarroceriaService carroceriaService = new CarroceriaService();
				CarroceriaDTO carroceria = carroceriaService.ListadoCarroceriaxCodigo(rs.getString(15));
				au.setCarroceria(carroceria);
				
				TipoTransmisionService tipoTransmisionService = new TipoTransmisionService();
				TipoTransmisionDTO tipoTransmision = tipoTransmisionService.ListadoTipoTransmisionxCodigo(rs.getString(16));
				au.setTipoTransmision(tipoTransmision);
					
				CombustibleService combustibleService = new CombustibleService();
				CombustibleDTO combustible = combustibleService.ListadoCombustiblexCodigo(rs.getString(17));
				au.setCombustible(combustible);

				KilometrajeService kilometrajeService = new KilometrajeService();
				KilometrajeDTO kilometraje = kilometrajeService.ListadoKilometrajexCodigo(rs.getString(18));
				au.setKilometraje(kilometraje);
				
				auto = au;
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

		return auto;
	}
	
	/*------------------------------------------------------------------*/
	
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
	/* ------------------------------------------------ ------------------ */
	

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
