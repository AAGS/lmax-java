package co.edu.uniandes.arquiagil.util;

public interface Replicator<E> {

	BussinessLogic<E> replicate(E e);
}
