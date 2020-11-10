package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.beans.TipoAutoDTO;

public interface TipoAutoDAO {
	
	
	public ArrayList<TipoAutoDTO> ListadoTipoAuto();

	/*----------------------Alvaro------------------------*/

	public TipoAutoDTO ListadoTipoAutoxCodigo(String codigo);

}
