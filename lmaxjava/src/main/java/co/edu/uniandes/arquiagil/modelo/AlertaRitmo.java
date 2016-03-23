package co.edu.uniandes.arquiagil.modelo;

public class AlertaRitmo extends Entidad{
	
	private Integer maximo;
	
	private Mascota mascota;
	
	/**
	 * @param maximo
	 * @param mascota
	 */
	public AlertaRitmo(Long id,Integer maximo, Mascota mascota) {
		super();
		this.id= id;
		this.maximo = maximo;
		this.mascota = mascota;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public void setId(Long id){
		this.id = id;
	}

	/**
	 * @return the maximo
	 */
	public Integer getMaximo() {
		return maximo;
	}

	/**
	 * @param maximo the maximo to set
	 */
	public void setMaximo(Integer maximo) {
		this.maximo = maximo;
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
