package co.edu.uniandes.arquiagil.businnes;

import co.edu.uniandes.arquiagil.api.UbicacionRitmoDTO;
import co.edu.uniandes.arquiagil.util.BussinessLogic;
import co.edu.uniandes.arquiagil.util.Replicator;

public class MensajeReplicator implements Replicator<String,UbicacionRitmoDTO>{

	public BussinessLogic<UbicacionRitmoDTO> replicate(String e) {
		return new ProcesarTramaLogica();
	}
}
