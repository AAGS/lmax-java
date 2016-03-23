package co.edu.uniandes.arquiagil.util;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.edu.uniandes.arquiagil.api.UbicacionRitmoDTO;

public class MensajeTransformator implements Transformator<String, UbicacionRitmoDTO>{
	
	private static final Logger log = LoggerFactory.getLogger(MensajeTransformator.class);

	public UbicacionRitmoDTO transform(String mensaje) {
		try{
		String[] trama = mensaje.split(",");
		
		Long idMascota = Long.parseLong(trama[0]);
		Double longitud = Double.parseDouble(trama[1]);
		Double latitud = Double.parseDouble(trama[2]);
		Integer ritmo = Integer.parseInt(trama[3]);
		Date fecha = new Date(Long.parseLong(trama[4]));

		return new UbicacionRitmoDTO(idMascota, longitud, latitud, ritmo, fecha);
		}finally{
			log.info(""+CronometroUtil.parcial());
			CronometroUtil.inicial = new Date();
		}
	}

}
