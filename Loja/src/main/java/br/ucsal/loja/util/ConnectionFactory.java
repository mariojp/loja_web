package br.ucsal.loja.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		String conStr = "jdbc:hsqldb:hsql://localhost/loja";
		String usuario = "sa";
		String senha = "";
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			return DriverManager.getConnection(conStr, usuario, senha);
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

}
