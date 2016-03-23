package co.edu.uniandes.arquiagil.modelo;

public class Mensaje extends Entidad{

	private String mensaje;

	/**
	 * @param mensaje
	 */
	public Mensaje(String mensaje) {
		super();
		this.mensaje = mensaje;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public void setId(Long id){
		this.id = id;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
