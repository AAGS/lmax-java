package co.edu.uniandes.arquiagil.util;

public interface Replicator<E,T> {

	BussinessLogic<T> replicate(E e);
}
