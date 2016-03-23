package co.edu.uniandes.arquiagil.businnes;

import co.edu.uniandes.arquiagil.api.UbicacionRitmoDTO;
import co.edu.uniandes.arquiagil.dao.GeneralDAO;
import co.edu.uniandes.arquiagil.modelo.AlertaRitmo;
import co.edu.uniandes.arquiagil.modelo.ZonaSegura;
import co.edu.uniandes.arquiagil.util.BussinessLogic;
import co.edu.uniandes.arquiagil.util.GeoZonaUtil;
import co.edu.uniandes.arquiagil.util.MailUtil;

public class ProcesarTramaLogica implements BussinessLogic<UbicacionRitmoDTO>{

	public void procesar(UbicacionRitmoDTO ubicacionRitmo) {
		GeneralDAO dao = new GeneralDAO();
		
		ZonaSegura zona = dao.obtenerZonaSegura(ubicacionRitmo.getIdMascota());
		if (!GeoZonaUtil.estaEnZona(zona.getLongitud(), zona.getLatitud(), 
				zona.getDistancia(), ubicacionRitmo.getLongitud(), ubicacionRitmo.getLatitud())){
			MailUtil.enviarEmail("Salida zona segura", "Señor usuario, su mascota ha salido de la zona segura");
		}

		AlertaRitmo alerta = dao.obtenerAlerta(ubicacionRitmo.getIdMascota());	
		
		if (alerta.getMaximo()<ubicacionRitmo.getRitmo()){
			MailUtil.enviarEmail("Alerta Ritmo Cardiaco", "Señor usuario, su mascota genero una alerta por ritmo cardiaco");
		}
			
	}
}
