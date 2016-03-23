package co.edu.uniandes.arquiagil.modelo;

public class ZonaSegura extends Entidad{
	
	private Double latitud;
	
	private Double longitud;
	
	private Integer distancia;
	
	private Mascota mascota;
	
	/**
	 * @param latitud
	 * @param longitud
	 * @param metrosCuadrados
	 * @param mascota
	 */
	public ZonaSegura(Long id, Double latitud, Double longitud, Integer distancia, Mascota mascota) {
		super();
		this.id = id;
		this.latitud = latitud;
		this.longitud = longitud;
		this.distancia = distancia;
		this.mascota = mascota;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public void setId(Long id){
		this.id = id;
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
	 * @return the distancia
	 */
	public Integer getDistancia() {
		return distancia;
	}

	/**
	 * @param distancia the distancia to set
	 */
	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
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
