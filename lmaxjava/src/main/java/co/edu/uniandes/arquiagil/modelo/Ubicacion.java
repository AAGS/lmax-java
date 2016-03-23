package co.edu.uniandes.arquiagil.modelo;

import java.util.Date;

public class Ubicacion extends Entidad{
	
	private Double longitud;
	
	private Double latitud;
	
	private Date fecha;
	
	private Mascota mascota;
	
	/**
	 * @param mascota
	 * @param longitud
	 * @param latitud
	 * @param fecha
	 */
	public Ubicacion(Mascota mascota, Double longitud, Double latitud, Date fecha) {
		super();
		this.mascota = mascota;
		this.longitud = longitud;
		this.latitud = latitud;
		this.fecha = fecha;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public void setId(Long id){
		this.id = id;
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

	/**
	 * @return the mascota
	 */
	public Mascota getMascota() {
		return mascota;
	}

	/**
	 * @param mascota the mascota to set
	 */
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
}
