package co.edu.uniandes.arquiagil.util;

import java.util.Date;

public class CronometroUtil {
	
	public static Date inicial;
	
	public static Long parcial(){
		Date actual = new Date();
		return actual.getTime()-inicial.getTime();
	}

}
