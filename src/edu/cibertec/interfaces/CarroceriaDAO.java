package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.beans.CarroceriaDTO;



public interface CarroceriaDAO {
	
	
	public ArrayList<CarroceriaDTO> ListadoCarroceria();

	/*----------------------Alvaro------------------------*/

	public CarroceriaDTO ListadoCarroceriaxCodigo(String codigo);
}
