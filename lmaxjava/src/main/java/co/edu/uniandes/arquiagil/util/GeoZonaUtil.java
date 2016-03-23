package co.edu.uniandes.arquiagil.util;

public class GeoZonaUtil {

	public static boolean estaEnZona(Double longitudZona, Double latitudZona, 
			Integer distanciaZona, Double longitudUbicacion, Double latitudUbicacion){
		
		if((longitudZona+(distanciaZona*0.01))<longitudUbicacion){
			return false;
		}
		
		if((latitudZona+(distanciaZona*0.01))<latitudUbicacion){
			return false;
		}
		
		return true;
	}
}
