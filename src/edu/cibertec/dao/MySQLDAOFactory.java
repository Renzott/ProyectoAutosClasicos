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

public class MySQLDAOFactory extends DAOFactory {

	
	@Override
	public TipoAutoDAO getTipoAutoDAO() {
		
		return new MySQLTipoAutoDAO();//Esta clase contien todo el Mantenimiento(Gestion);
	}
	

	@Override
	public MarcaAutoDAO getMarcaAutoDAO() {
		
		return new MySQLMarcaAutoDAO();
	}
	

	@Override
	public CarroceriaDAO getCarroceriaDAO() {
		
		return new MySQLCarroceriaDAO();
	}
	

	@Override
	public TipoTransmisionDAO getTipoTransmisionDAO() {
		
		return new MySQLTipoTransmisionDAO();
	}
	

	@Override
	public CombustibleDAO getCombustibleDAO() {
		
		return new MySQLCombustibleDAO();
	}
	

	@Override
	public KilometrajeDAO getKilometrajeDAO() {
		
		return new MySQLKilometrajeDAO();
	}
	

	@Override
	public FotoDAO getFotoDAO() {
		
		return new MySQLFotoDAO();
	}
	

	@Override
	public DetalleFotoDAO getDetalleFotoDAO() {
		
		return new MySQLDetalleFotoDAO();
	}
	

	@Override
	public AutoDAO getAutoDAO() {
		
		return new MySQLAutoDAO();
	}
	

	@Override
	public ClienteDAO getClienteDAO() {
		
		return new MySQLClienteDAO();
	}
	

	@Override
	public CotizarAutoDAO getCotizarAutoDAO() {
		
		return new MySQLCotizarAutoDAO();
	}
	

	@Override
	public EventosDAO getEventosDAO() {
		
		return new MySQLEventosDAO();
	}
	

	@Override
	public UsuarioEventoDAO getUsuarioEventoDAO() {
		
		return new MySQLUsuarioEventoDAO();
	}
	

	@Override
	public FacturaDAO getFacturaDAO() {
		
		return new MySQLFacturaDAO();
	}
	

	@Override
	public DetalleClienteAutoFacturaDAO getDetalleClienteAutoFacturaDAO() {
		
		return new MySQLDetalleClienteAutoFacturaDAO();
	}

}
