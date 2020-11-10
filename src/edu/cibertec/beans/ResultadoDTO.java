package edu.cibertec.beans;

import java.io.Serializable;

public class ResultadoDTO implements Serializable{
 private int estado ;
 private String mensaje ;
 
 public ResultadoDTO() {
	// TODO Auto-generated constructor stub
}
 

public ResultadoDTO(int estado, String mensaje) {
	super();
	this.estado = estado;
	this.mensaje = mensaje;
}


public int getEstado() {
	return estado;
}

public void setEstado(int estado) {
	this.estado = estado;
}

public String getMensaje() {
	return mensaje;
}

public void setMensaje(String mensaje) {
	this.mensaje = mensaje;
}


}
