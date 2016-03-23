package co.edu.uniandes.arquiagil.service;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.edu.uniandes.arquiagil.util.CronometroUtil;
import co.edu.uniandes.arquiagil.util.InputDisruptor;

@Path("")
public class RecieverService {
	
	private static final Logger log = LoggerFactory.getLogger(RecieverService.class);
	
	private InputDisruptor inputDisuptor = new InputDisruptor();
	
	@GET
	@Path("trama/{trama}")
	@Produces(MediaType.APPLICATION_JSON)
	public void procesarTrama(@PathParam("trama")String trama){
		String[] s = trama.split(",");
		CronometroUtil.inicial = new Date(Long.parseLong(s[4]));
		log.info(""+CronometroUtil.parcial());
		CronometroUtil.inicial = new Date();
		inputDisuptor.encolar(trama);
	}
}
