package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.beans.KilometrajeDTO;



public interface KilometrajeDAO {
	
	
	public ArrayList<KilometrajeDTO> ListadoKilometraje();
	
	/*----------------------Alvaro------------------------*/

	public KilometrajeDTO ListadoKilometrajexCodigo(String codigo);
}
