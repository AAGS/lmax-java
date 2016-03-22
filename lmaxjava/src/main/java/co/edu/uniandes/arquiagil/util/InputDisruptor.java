package co.edu.uniandes.arquiagil.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import co.edu.uniandes.arquiagil.api.Mensaje;
import co.edu.uniandes.arquiagil.businnes.MensajeReplicator;
import co.edu.uniandes.arquiagil.dao.MensajeDAO;

public class InputDisruptor {
	
	private Queue<Object> cola;
	
	private Journaler<Mensaje> journaler;
	
	private Replicator<Mensaje> replicator;
	
	private Transformator<Mensaje,Object> transformator;
	
	public InputDisruptor(){
		this.cola = new ConcurrentLinkedQueue<Object>();
		this.journaler = new MensajeDAO();
		this.replicator = new MensajeReplicator();
		this.transformator = new MensajeTransformator();
	}
	
	public void encolar(Mensaje mensaje){
		
	}

}
