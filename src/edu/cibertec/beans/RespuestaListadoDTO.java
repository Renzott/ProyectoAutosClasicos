package edu.cibertec.beans;


import java.io.Serializable;
import java.util.List;

public class RespuestaListadoDTO implements Serializable {
	
	private List<CotizarAutoDTO> lstCotizaAuto;
	private List<EventosDTO> lstEventos;
	private List<UsuarioEventoDTO> lstUsuarioEvento;
	
	public RespuestaListadoDTO() {
		
	}
	

	public RespuestaListadoDTO(List<CotizarAutoDTO> lstCotizaAuto, List<EventosDTO> lstEventos,
			List<UsuarioEventoDTO> lstUsuarioEvento) {
		super();
		this.lstCotizaAuto = lstCotizaAuto;
		this.lstEventos = lstEventos;
		this.lstUsuarioEvento = lstUsuarioEvento;
	}


	public List<EventosDTO> getLstEventos() {
		return lstEventos;
	}

	public void setLstEventos(List<EventosDTO> lstEventos) {
		this.lstEventos = lstEventos;
	}

	public List<UsuarioEventoDTO> getLstUsuarioEvento() {
		return lstUsuarioEvento;
	}

	public void setLstUsuarioEvento(List<UsuarioEventoDTO> lstUsuarioEvento) {
		this.lstUsuarioEvento = lstUsuarioEvento;
	}


public List<CotizarAutoDTO> getLstCotizaAuto() {
	return lstCotizaAuto;
}

public void setLstCotizaAuto(List<CotizarAutoDTO> lstCotizaAuto) {
	this.lstCotizaAuto = lstCotizaAuto;
}


}
