package co.edu.uniandes.arquiagil.util;

public interface Journaler<E> {
	
	void persistirMensaje(E e);
}
