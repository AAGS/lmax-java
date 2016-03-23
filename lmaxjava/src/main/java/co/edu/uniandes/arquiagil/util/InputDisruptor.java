package co.edu.uniandes.arquiagil.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import co.edu.uniandes.arquiagil.api.UbicacionRitmoDTO;
import co.edu.uniandes.arquiagil.businnes.MensajeReplicator;
import co.edu.uniandes.arquiagil.dao.GeneralDAO;

public class InputDisruptor {
	
	private Queue<Object> cola;
	
	private Journaler<String> journaler;
	
	private Replicator<String,UbicacionRitmoDTO> replicator;
	
	private Transformator<String,UbicacionRitmoDTO> transformator;
	
	public InputDisruptor(){
		this.cola = new ConcurrentLinkedQueue<Object>();
		this.journaler = new GeneralDAO();
		this.replicator = new MensajeReplicator();
		this.transformator = new MensajeTransformator();
	}
	
	public void encolar(String trama){
		this.cola.add(trama);
		this.journaler.persistirMensaje(trama);
		BussinessLogic<UbicacionRitmoDTO> bl = this.replicator.replicate(trama);
		bl.procesar(this.transformator.transform(trama));
		this.cola.remove();
	}
}
