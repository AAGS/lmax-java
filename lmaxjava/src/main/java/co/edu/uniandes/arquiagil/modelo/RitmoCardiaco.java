package co.edu.uniandes.arquiagil.modelo;

import java.util.Date;

public class RitmoCardiaco extends Entidad{
	
	private Integer ritmo;
	
	private Date fecha;
	
	private Mascota mascota;

	/**
	 * @param ritmo
	 * @param fecha
	 * @param mascota
	 */
	public RitmoCardiaco(Integer ritmo, Date fecha, Mascota mascota) {
		super();
		this.ritmo = ritmo;
		this.fecha = fecha;
		this.mascota = mascota;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public void setId(Long id){
		this.id = id;
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
