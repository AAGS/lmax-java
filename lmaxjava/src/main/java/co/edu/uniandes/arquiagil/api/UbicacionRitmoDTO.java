package co.edu.uniandes.arquiagil.api;

import java.util.Date;

public class UbicacionRitmoDTO {
	
	private Long idMascota;
	
	private Double longitud;
	
	private Double latitud;
	
	private Integer ritmo;
	
	private Date fecha;
	
	/**
	 * @param idMascota
	 * @param longitud
	 * @param latitud
	 * @param ritmo
	 * @param fecha
	 */
	public UbicacionRitmoDTO(Long idMascota, Double longitud, Double latitud, Integer ritmo, Date fecha) {
		super();
		this.idMascota = idMascota;
		this.longitud = longitud;
		this.latitud = latitud;
		this.ritmo = ritmo;
		this.fecha = fecha;
	}

	/**
	 * @return the idMascota
	 */
	public Long getIdMascota() {
		return idMascota;
	}

	/**
	 * @param idMascota the idMascota to set
	 */
	public void setIdMascota(Long idMascota) {
		this.idMascota = idMascota;
	}

	/**
	 * @return the longitud
	 */
	public Double getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the latitud
	 */
	public Double getLatitud() {
		return latitud;
	}

	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	/**
	 * @return the ritmo
	 */
	public Integer getRitmo() {
		return ritmo;
	}

	/**
	 * @param ritmo the ritmo to set
	 */
	public void setRitmo(Integer ritmo) {
		this.ritmo = ritmo;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
