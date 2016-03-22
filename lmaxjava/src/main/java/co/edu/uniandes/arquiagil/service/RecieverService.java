package co.edu.uniandes.arquiagil.service;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import co.edu.uniandes.arquiagil.api.Mensaje;

public class RecieverService {

	public void obtenerMensaje(Mensaje mensaje){
		Queue<Object> cola = new ConcurrentLinkedQueue<Object>();
		cola.add(mensaje);
	}
}
