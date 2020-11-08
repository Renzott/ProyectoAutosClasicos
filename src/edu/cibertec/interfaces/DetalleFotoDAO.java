package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.beans.DetalleFotoDTO;


public interface DetalleFotoDAO {
	
	
	public ArrayList<DetalleFotoDTO> ListadoDetalleFoto();
	
	
	public ArrayList<DetalleFotoDTO> ListadoDetalleFotoPorCodigoFoto(String CodFoto);
	
	

}
