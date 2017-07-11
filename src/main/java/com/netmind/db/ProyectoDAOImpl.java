package com.netmind.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.netmind.models.ProyectoB;

public final class ProyectoDAOImpl extends ProyectoDAO {
	private static Logger logger = Logger.getLogger("ProyectoDaoImpl");

	private static ProyectoDAOImpl instance = null;

	public static ProyectoDAOImpl getInstance() {
		if (instance == null) {
			instance = new ProyectoDAOImpl();
		}
		return instance;
	}

	@Override
	public ProyectoB getProyecto(int idProyecto) {
		ProyectoB proyectoADevolver = null;

		try {
			Connection conn = this.datasource.getConnection();

			String sql = "SELECT p.* FROM proyectob p WHERE p.idProyecto=? LIMIT 1";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idProyecto);

			ResultSet rs = pstm.executeQuery();

			if (rs.next()) {

				proyectoADevolver = new ProyectoB(rs.getInt("idProyecto"), 
						rs.getString("nombreProyecto"),
						rs.getString("descProyecto"), 
						rs.getString("fechaFinProyecto"), 
						rs.getBoolean("estado"), 
						rs.getString("Usuariob_uid"),
						null);
			}

			pstm.close();
			conn.close();

			logger.info("Conexión exitosa");

		} catch (Exception e) {
			logger.severe("Error en la conexión de BBDD:" + e);
			proyectoADevolver = null;
		}

		return proyectoADevolver;
	}

	@Override
	public List<ProyectoB> getUserProyecto(int uid) {
		List<ProyectoB> listADevolver = new ArrayList<ProyectoB>();

		try {
			Connection conn = this.datasource.getConnection();

			String sql = "SELECT p.* FROM proyectob p INNER JOIN tareab t ON t.idTarea=p.idProyecto WHERE t.Usuariob_uid=?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, uid);

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				listADevolver.add(new ProyectoB(rs.getInt("idProyecto"),
						rs.getString("nombreProyecto"),
						rs.getString("descProyecto"), 
						rs.getString("fechaFinProyecto"), 
						rs.getBoolean("estado"), 
						rs.getString("Usuariob_uid"), 
						null));
			}

			pstm.close();

			conn.close();

			logger.info("Conexión exitosa:" + listADevolver);

		} catch (Exception e) {
			logger.severe("Error en la conexión de BBDD:" + e);
			listADevolver = null;
		}

		return listADevolver;
	}

	@Override
	public List<ProyectoB> getProyectoList() {
		List<ProyectoB> listADevolver = new ArrayList<ProyectoB>();

		try {
			Connection conn = this.datasource.getConnection();

			String sql = "SELECT p.* FROM proyectoB p WHERE 1";
			PreparedStatement pstm = conn.prepareStatement(sql);

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				listADevolver.add(new ProyectoB(rs.getInt("idProyecto"), 
						rs.getString("nombreProyecto"),
						rs.getString("descProyecto"), 
						rs.getString("fechaFinProyecto"), 
						rs.getBoolean("estado"), 
						rs.getString("Usuariob_uid"),
						null));
			}

			pstm.close();

			conn.close();

			logger.info("Conexión exitosa");

		} catch (Exception e) {
			logger.severe("Error en la conexión de BBDD:" + e);
			listADevolver = null;
		}

		return listADevolver;
	}

	// INSERTAR PROYECTO:
	@Override
	public boolean insertProyecto(ProyectoB elProyecto) {

		try {
			Connection conn = this.datasource.getConnection();

			String sql = "Insert into proyectob"
					+ " (idProyecto, nombreProyecto, descProyecto, fechaFinProyecto, estado, UsuarioB_uid) "
					+ "VALUES (null, ?, ?, ?, ?, ?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(2, elProyecto.getNombreProyecto());
			pstm.setString(3, elProyecto.getDescProyecto());
			pstm.setString(4, elProyecto.getFechaFinProyecto());
			pstm.setBoolean(5, elProyecto.isEstado());
			pstm.setString(6, elProyecto.getUid());

			ResultSet rs = pstm.executeQuery();

			pstm.close();

			conn.close();

			logger.info("Conexión exitosa");
			return true;

		} catch (Exception e) {
			logger.severe("Error en la conexión de BBDD:" + e);
			return false;
		}

	}

}
