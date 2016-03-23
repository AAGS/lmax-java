package co.edu.uniandes.arquiagil.modelo;

public class Mascota extends Entidad {
	
	private String nombre;
	
	/**
	 * @param id
	 * @param nombre
	 * @param dueño
	 */
	public Mascota(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public void setId(Long id){
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
