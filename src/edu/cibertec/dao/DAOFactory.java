package edu.cibertec.dao;

import edu.cibertec.interfaces.AutoDAO;
import edu.cibertec.interfaces.CarroceriaDAO;
import edu.cibertec.interfaces.ClienteDAO;
import edu.cibertec.interfaces.CombustibleDAO;
import edu.cibertec.interfaces.CotizarAutoDAO;
import edu.cibertec.interfaces.DetalleClienteAutoFacturaDAO;
import edu.cibertec.interfaces.DetalleFotoDAO;
import edu.cibertec.interfaces.EventosDAO;
import edu.cibertec.interfaces.FacturaDAO;
import edu.cibertec.interfaces.FotoDAO;
import edu.cibertec.interfaces.KilometrajeDAO;
import edu.cibertec.interfaces.MarcaAutoDAO;
import edu.cibertec.interfaces.TipoAutoDAO;
import edu.cibertec.interfaces.TipoTransmisionDAO;
import edu.cibertec.interfaces.UsuarioEventoDAO;

public abstract class DAOFactory {
	
	
	public static final int MYSQL=1;
	public static final int SQL=2;
	
	
	
	//DAOs a implementar
	
	public abstract TipoAutoDAO getTipoAutoDAO();
	public abstract MarcaAutoDAO getMarcaAutoDAO();
	public abstract CarroceriaDAO getCarroceriaDAO();
	public abstract TipoTransmisionDAO getTipoTransmisionDAO();
	public abstract CombustibleDAO getCombustibleDAO();
	public abstract KilometrajeDAO getKilometrajeDAO();
	public abstract FotoDAO getFotoDAO();
	public abstract DetalleFotoDAO getDetalleFotoDAO();
	public abstract AutoDAO getAutoDAO();
	public abstract ClienteDAO getClienteDAO();
	public abstract CotizarAutoDAO getCotizarAutoDAO();
	public abstract EventosDAO getEventosDAO();
	public abstract UsuarioEventoDAO getUsuarioEventoDAO();
	public abstract FacturaDAO getFacturaDAO();
	public abstract DetalleClienteAutoFacturaDAO getDetalleClienteAutoFacturaDAO();
	
	
	
	
	public static DAOFactory getDAOFactory(int qFactory) {
		
		switch(qFactory) {
			
			case MYSQL:
				return new MySQLDAOFactory();//clase q fabrica los "daos" segn el origen(mysql,sql)
			case SQL:
				//return new SQLDAOFactory();
			
			default:
				return null;
		}
	}
	
	

}
