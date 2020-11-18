package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
					
			String sql= "call SPAL_ListarAutos()";

			pst = con.prepareStatement(sql);
				
			rs = pst.executeQuery();

			while(rs.next()){
				lista.add(parsingToAutoDTO(rs));
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

				auto = parsingToAutoDTO(rs);
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

			String sql= "a";

			pst = con.prepareStatement(sql);

			pst.setString(1, CodTipoAuto);

			rs = pst.executeQuery();


			while(rs.next()){
				lista.add(parsingToAutoDTO(rs));
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

	/* ------------------------------------------------------------------ */

	@Override
	public ArrayList<AutoDTO> ListadoAutoPorCodigoMarcaAuto(String CodMarcaAuto) {

		ArrayList<AutoDTO> lista = new ArrayList<AutoDTO>();

		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pst = null;

		try{

			con = MySQLConexion.getConexion();

			String sql= "b";

			pst = con.prepareStatement(sql);

			pst.setString(1, CodMarcaAuto);

			rs = pst.executeQuery();


			while(rs.next()){
				lista.add(parsingToAutoDTO(rs));
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

			String sql= "c";

			pst = con.prepareStatement(sql);

			pst.setString(1, CodCarroceria);

			rs = pst.executeQuery();


			while(rs.next()){
				lista.add(parsingToAutoDTO(rs));
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

			String sql= "d";

			pst = con.prepareStatement(sql);

			pst.setString(1, CodTipoTransmision);

			rs = pst.executeQuery();


			while(rs.next()){
				lista.add(parsingToAutoDTO(rs));
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

			String sql= "e";

			pst = con.prepareStatement(sql);

			pst.setString(1, CodCombustible);

			rs = pst.executeQuery();


			while(rs.next()){
				lista.add(parsingToAutoDTO(rs));
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

			String sql= "f";

			pst = con.prepareStatement(sql);

			pst.setString(1, CodKilometraje);

			rs = pst.executeQuery();


			while(rs.next()){

				lista.add(parsingToAutoDTO(rs));
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

	private AutoDTO parsingToAutoDTO(ResultSet rs) throws SQLException {

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

		TipoAutoDTO tipoAuto = new TipoAutoDTO();
		tipoAuto.setCodigoTipoAuto(rs.getString(13));
		tipoAuto.setNombreTipoAuto(rs.getString(14));
		au.setTipoAuto(tipoAuto);

		MarcaAutoDTO marcaAuto = new MarcaAutoDTO();
		marcaAuto.setCodigoMarcaAuto(rs.getString(15));
		marcaAuto.setNombreMarcaAuto(rs.getString(16));
		au.setMarcaAuto(marcaAuto);

		CarroceriaDTO carroceria = new CarroceriaDTO();
		carroceria.setCodigoCarroceria(rs.getString(17));
		carroceria.setNombreCarroceria(rs.getString(18));
		au.setCarroceria(carroceria);

		TipoTransmisionDTO tipoTransmision = new TipoTransmisionDTO();
		tipoTransmision.setCodigoTipoTransmision(rs.getString(19));
		tipoTransmision.setNombreTipoTransmision(rs.getString(20));
		au.setTipoTransmision(tipoTransmision);

		CombustibleDTO combustible = new CombustibleDTO();
		combustible.setCodigoCombustible(rs.getString(21));
		combustible.setNombreCombustible(rs.getString(22));
		au.setCombustible(combustible);

		KilometrajeDTO kilometraje = new KilometrajeDTO();
		kilometraje.setCodigoKilometraje(rs.getString(23));
		kilometraje.setNombreKilometraje(rs.getString(24));
		au.setKilometraje(kilometraje);

		return au;
	}

}
