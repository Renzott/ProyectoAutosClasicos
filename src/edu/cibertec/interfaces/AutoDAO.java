package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.beans.AutoDTO;


public interface AutoDAO {
	
	
	public ArrayList<AutoDTO> ListadoAuto();

	public AutoDTO ListadoAutoPorCodigo(String codigo);
	
	public ArrayList<AutoDTO> ListadoAutoPorCodigoTipoAuto(String CodTipoAuto);
	
	public ArrayList<AutoDTO> ListadoAutoPorCodigoMarcaAuto(String CodMarcaAuto);
	
	public ArrayList<AutoDTO> ListadoAutoPorCodigoCarroceria(String CodCarroceria);
	
	public ArrayList<AutoDTO> ListadoAutoPorCodigoTipoTransmision(String CodTipoTransmision);
	
	public ArrayList<AutoDTO> ListadoAutoPorCodigoCombustible(String CodCombustible);
	
	public ArrayList<AutoDTO> ListadoAutoPorCodigoKilometraje(String CodKilometraje);
	
	
	
	
	
	

}
