package com.netmind.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

import com.netmind.models.UsuarioB;

public final class UsuarioDAOImpl extends UsuarioDAO {
	private static Logger logger = Logger.getLogger("UsuarioBBDAOImpl");
	
	private static UsuarioDAOImpl instance = null;

	public static UsuarioDAOImpl getInstance() {
		if (instance == null) {
			instance = new UsuarioDAOImpl();
		}
		return instance;
	}
	
	@Override
	public UsuarioB getUsuario(String email, String password) {
		UsuarioB UsuarioBADevolver = null;

		try {
			Connection conn = datasource.getConnection();
		
			String sql = "SELECT u.* FROM usuariob u WHERE u.email=? AND password=? LIMIT 1";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, email);
			pstm.setString(2, password);

			ResultSet rs = pstm.executeQuery();

			if (rs.next()) {

				UsuarioBADevolver = new UsuarioB(rs.getInt("uid"),
						rs.getString("nombre"),
						rs.getString("apellido"),
						rs.getString("email"),
						rs.getString("password"),
						rs.getInt("activo"));
			}

			pstm.close();
			conn.close();

			logger.info("Conexi�n exitosa");

		} catch (Exception e) {
			logger.severe("Error en la conexi�n de BBDD:" + e);
			UsuarioBADevolver = null;
		}

		return UsuarioBADevolver;
	}


	@Override
	public UsuarioB getUsuario(int uid) {
		UsuarioB UsuarioBADevolver = null;

		try {
			Connection conn = datasource.getConnection();
		
			String sql = "SELECT u.* FROM usuariob u WHERE u.uid=?LIMIT 1";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, uid);

			ResultSet rs = pstm.executeQuery();

			if (rs.next()) {

				UsuarioBADevolver = new UsuarioB(rs.getInt("uid"), 
						rs.getString("nombre"), 
						rs.getString("apellido"),
						rs.getString("email"), 
						rs.getString("password"),
						rs.getInt("activo"));
			}

			pstm.close();
			conn.close();

			logger.info("Conexi�n exitosa");

		} catch (Exception e) {
			logger.severe("Error en la conexi�n de BBDD:" + e);
			UsuarioBADevolver = null;
		}

		return UsuarioBADevolver;
	}

}
