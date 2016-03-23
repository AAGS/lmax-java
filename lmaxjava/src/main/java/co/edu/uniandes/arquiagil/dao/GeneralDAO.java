package co.edu.uniandes.arquiagil.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.edu.uniandes.arquiagil.modelo.AlertaRitmo;
import co.edu.uniandes.arquiagil.modelo.Mascota;
import co.edu.uniandes.arquiagil.modelo.ZonaSegura;
import co.edu.uniandes.arquiagil.util.CronometroUtil;
import co.edu.uniandes.arquiagil.util.Journaler;

public class GeneralDAO implements Journaler<String>{

	private static final Logger log = LoggerFactory.getLogger(GeneralDAO.class);

	private Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/negocio",
				"root",
				"Asdf1234$");
		
		return con;
	}

	public void persistirMensaje(String mensaje) {
		try{
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement("insert into MENSAJE (mensaje) values (?)");
				pstmt.setString(1, mensaje);
				pstmt.executeUpdate();
			}
			finally {
				if (pstmt != null) pstmt.close();
				
				if(conn != null) conn.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			log.info(""+CronometroUtil.parcial());
			CronometroUtil.inicial = new Date();
		}
	}

	public AlertaRitmo obtenerAlerta(Long idMascota){
		try{
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement
						("select a.id, a.maximo, m.id, m.nombre "
								+ "from AlertaRitmo a "
								+ "join Mascota m on a.mascota_id=m.id "
								+ "where m.id = ?");
				pstmt.setLong(1, idMascota);
				ResultSet rs = pstmt.executeQuery();
				
				AlertaRitmo alertaRitmo = null;
				while(rs.next()){
					alertaRitmo = new AlertaRitmo(rs.getLong(1),
							rs.getInt(2),
							new Mascota(rs.getLong(3), rs.getString(4)));
				}
				
				return alertaRitmo;
				
			}finally {
				if (pstmt != null) pstmt.close();
				
				if(conn != null) conn.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return null;
	}

	public ZonaSegura obtenerZonaSegura(Long idMascota){
		try{
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				conn = getConnection();
				pstmt = conn.prepareStatement
						("select z.id, z.longitud, z.latitud, z.distancia,"
								+ "m.id, m.nombre "
								+ "from ZonaSegura z "
								+ "join Mascota m on z.mascota_id=m.id "
								+ "where m.id = ?");
				pstmt.setLong(1, idMascota);
				ResultSet rs = pstmt.executeQuery();
				
				ZonaSegura zonaSegura = null;
				while(rs.next()){
					zonaSegura = new ZonaSegura(rs.getLong(1),
							rs.getDouble(2), rs.getDouble(3), rs.getInt(4),
							new Mascota(rs.getLong(5), rs.getString(6)));
				}
				
				return zonaSegura;
				
			}finally {
				if (pstmt != null) pstmt.close();
				
				if(conn != null) conn.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return null;
	}
}
