package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.beans.MarcaAutoDTO;



public interface MarcaAutoDAO {
	
	
	public ArrayList<MarcaAutoDTO> ListadoMarcaAuto();

	/*----------------------Alvaro------------------------*/

	public MarcaAutoDTO ListadoMarcaAutoxCodigo(String codigo);
}
