package edu.cibertec.interfaces;

import java.util.ArrayList;


import edu.cibertec.beans.CotizarAutoDTO;

public interface CotizarAutoDAO {
	
	
	public int RegistrarCotizarAuto(CotizarAutoDTO cot);
	
	public int ActualizarCotizarAuto(CotizarAutoDTO cot);
	
	public int EliminarCotizarAuto(CotizarAutoDTO cot);
	
	
	
	public ArrayList<CotizarAutoDTO> ListadoCotizarAutos();
	
	public ArrayList<CotizarAutoDTO> ListadoCotizarAutosPorCodigoMarcaAuto(String CodMarcaAuto);
	
	public ArrayList<CotizarAutoDTO> ListadoCotizarAutosPorCodigoAuto(String CodAuto);
	
	
	

}
