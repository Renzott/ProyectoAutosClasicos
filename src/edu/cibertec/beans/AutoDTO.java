package edu.cibertec.beans;

import java.io.Serializable;
import java.util.List;

public class AutoDTO implements Serializable{
	
	private String CodigoAuto;
	private String ModelooAuto;
	private String DescripcionAuto;
	private String AnoAuto;
	private String PesoAuto;
	private String PlacaAuto;
	private String ColorAuto;
	private int PuertasAuto;
	private String CilindradaAuto;
	private double PrecioAuto;
	private Boolean EstadoAuto;
	private String FotoAuto;
	
	
	private String CodigoTipoAuto;
	private String CodigoMarcaAuto;
	private String CodigoCarroceria;
	private String CodigoTipoTransmision;
	private String CodigoCombustible;
	private String CodigoKilometraje;
	
	
	
	public AutoDTO() {}
	


	public AutoDTO(String codigoAuto, String modelooAuto, String descripcionAuto, String anoAuto, String pesoAuto,
			String placaAuto, String colorAuto, int puertasAuto, String cilindradaAuto, double precioAuto,
			Boolean estadoAuto, String fotoAuto, String codigoTipoAuto, String codigoMarcaAuto, String codigoCarroceria,
			String codigoTipoTransmision, String codigoCombustible, String codigoKilometraje) {
		super();
		CodigoAuto = codigoAuto;
		ModelooAuto = modelooAuto;
		DescripcionAuto = descripcionAuto;
		AnoAuto = anoAuto;
		PesoAuto = pesoAuto;
		PlacaAuto = placaAuto;
		ColorAuto = colorAuto;
		PuertasAuto = puertasAuto;
		CilindradaAuto = cilindradaAuto;
		PrecioAuto = precioAuto;
		EstadoAuto = estadoAuto;
		FotoAuto = fotoAuto;
		CodigoTipoAuto = codigoTipoAuto;
		CodigoMarcaAuto = codigoMarcaAuto;
		CodigoCarroceria = codigoCarroceria;
		CodigoTipoTransmision = codigoTipoTransmision;
		CodigoCombustible = codigoCombustible;
		CodigoKilometraje = codigoKilometraje;
	}

	public String getCodigoAuto() {
		return CodigoAuto;
	}
	public void setCodigoAuto(String codigoAuto) {
		CodigoAuto = codigoAuto;
	}
	
	
	public String getModelooAuto() {
		return ModelooAuto;
	}
	public void setModelooAuto(String modelooAuto) {
		ModelooAuto = modelooAuto;
	}
	
	
	public String getDescripcionAuto() {
		return DescripcionAuto;
	}
	public void setDescripcionAuto(String descripcionAuto) {
		DescripcionAuto = descripcionAuto;
	}
	
	
	public String getAnoAuto() {
		return AnoAuto;
	}
	public void setAnoAuto(String anoAuto) {
		AnoAuto = anoAuto;
	}
	
	
	public String getPesoAuto() {
		return PesoAuto;
	}
	public void setPesoAuto(String pesoAuto) {
		PesoAuto = pesoAuto;
	}
	
	
	public String getPlacaAuto() {
		return PlacaAuto;
	}
	public void setPlacaAuto(String placaAuto) {
		PlacaAuto = placaAuto;
	}
	
	
	public String getColorAuto() {
		return ColorAuto;
	}
	public void setColorAuto(String colorAuto) {
		ColorAuto = colorAuto;
	}
	
	
	public int getPuertasAuto() {
		return PuertasAuto;
	}
	public void setPuertasAuto(int puertasAuto) {
		PuertasAuto = puertasAuto;
	}
	
	
	public String getCilindradaAuto() {
		return CilindradaAuto;
	}
	public void setCilindradaAuto(String cilindradaAuto) {
		CilindradaAuto = cilindradaAuto;
	}
	
	
	public double getPrecioAuto() {
		return PrecioAuto;
	}
	public void setPrecioAuto(double precioAuto) {
		PrecioAuto = precioAuto;
	}
	
	
	public Boolean getEstadoAuto() {
		return EstadoAuto;
	}
	public void setEstadoAuto(Boolean estadoAuto) {
		EstadoAuto = estadoAuto;
	}
	
	
	public String getFotoAuto() {
		return FotoAuto;
	}
	public void setFotoAuto(String fotoAuto) {
		FotoAuto = fotoAuto;
	}
	
	
	public String getCodigoTipoAuto() {
		return CodigoTipoAuto;
	}
	public void setCodigoTipoAuto(String codigoTipoAuto) {
		CodigoTipoAuto = codigoTipoAuto;
	}
	
	
	public String getCodigoMarcaAuto() {
		return CodigoMarcaAuto;
	}
	public void setCodigoMarcaAuto(String codigoMarcaAuto) {
		CodigoMarcaAuto = codigoMarcaAuto;
	}
	
	
	public String getCodigoCarroceria() {
		return CodigoCarroceria;
	}
	public void setCodigoCarroceria(String codigoCarroceria) {
		CodigoCarroceria = codigoCarroceria;
	}
	
	
	public String getCodigoTipoTransmision() {
		return CodigoTipoTransmision;
	}
	public void setCodigoTipoTransmision(String codigoTipoTransmision) {
		CodigoTipoTransmision = codigoTipoTransmision;
	}
	
	
	public String getCodigoCombustible() {
		return CodigoCombustible;
	}
	public void setCodigoCombustible(String codigoCombustible) {
		CodigoCombustible = codigoCombustible;
	}
	
	
	public String getCodigoKilometraje() {
		return CodigoKilometraje;
	}
	public void setCodigoKilometraje(String codigoKilometraje) {
		CodigoKilometraje = codigoKilometraje;
	}

	/*----------------------Alvaro------------------------*/
	
	private TipoAutoDTO tipoAuto;
	private MarcaAutoDTO marcaAuto;
	private CarroceriaDTO carroceria;
	private TipoTransmisionDTO TipoTransmision;
	private CombustibleDTO Combustible;
	private KilometrajeDTO Kilometraje;

	public AutoDTO(String codigoAuto, String modelooAuto, String descripcionAuto, String anoAuto, String pesoAuto,
			String placaAuto, String colorAuto, int puertasAuto, String cilindradaAuto, double precioAuto,
			Boolean estadoAuto, String fotoAuto, TipoAutoDTO tipoAuto, MarcaAutoDTO marcaAuto, CarroceriaDTO carroceria,
			TipoTransmisionDTO tipoTransmision, CombustibleDTO combustible, KilometrajeDTO kilometraje) {
		super();
		CodigoAuto = codigoAuto;
		ModelooAuto = modelooAuto;
		DescripcionAuto = descripcionAuto;
		AnoAuto = anoAuto;
		PesoAuto = pesoAuto;
		PlacaAuto = placaAuto;
		ColorAuto = colorAuto;
		PuertasAuto = puertasAuto;
		CilindradaAuto = cilindradaAuto;
		PrecioAuto = precioAuto;
		EstadoAuto = estadoAuto;
		FotoAuto = fotoAuto;
		this.tipoAuto = tipoAuto;
		this.marcaAuto = marcaAuto;
		this.carroceria = carroceria;
		TipoTransmision = tipoTransmision;
		Combustible = combustible;
		Kilometraje = kilometraje;
	}
	
	public TipoAutoDTO getTipoAuto() {
		return tipoAuto;
	}
	public void setTipoAuto(TipoAutoDTO tipoAuto) {
		this.tipoAuto = tipoAuto;
	}

	public MarcaAutoDTO getMarcaAuto() {
		return marcaAuto;
	}
	public void setMarcaAuto(MarcaAutoDTO marcaAuto) {
		this.marcaAuto = marcaAuto;
	}

	public CarroceriaDTO getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(CarroceriaDTO carroceria) {
		this.carroceria = carroceria;
	}

	public TipoTransmisionDTO getTipoTransmision() {
		return TipoTransmision;
	}
	public void setTipoTransmision(TipoTransmisionDTO tipoTransmision) {
		TipoTransmision = tipoTransmision;
	}

	public CombustibleDTO getCombustible() {
		return Combustible;
	}
	public void setCombustible(CombustibleDTO combustible) {
		Combustible = combustible;
	}

	public KilometrajeDTO getKilometraje() {
		return Kilometraje;
	}
	public void setKilometraje(KilometrajeDTO kilometraje) {
		Kilometraje = kilometraje;
	}
}
