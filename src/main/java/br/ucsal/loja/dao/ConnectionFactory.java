package br.ucsal.loja.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static ConnectionFactory connectionFactory = null;

	private static Connection connection = null;

	private String conStr = "jdbc:hsqldb:hsql://localhost/loja";
	private String usuario = "sa";
	private String senha = "";

	private ConnectionFactory() {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			connection = DriverManager.getConnection(conStr, usuario, senha);
			connection.createStatement()
					.execute("CREATE TABLE IF NOT EXISTS PRODUTO  ( " + "  ID BIGINT IDENTITY PRIMARY KEY,"
							+ "  NAME VARCHAR(255), STATUS VARCHAR(255), EMAIL VARCHAR(255), DESCRIPTION VARCHAR(255) "
							+ ");");
			connection.createStatement()
					.execute("CREATE TABLE IF NOT EXISTS CLIENTE  ( " + "  ID BIGINT IDENTITY PRIMARY KEY,"
							+ "  NAME VARCHAR(255), CPF VARCHAR(11), LOGRADOURO VARCHAR(30), NUMERO INTEGER,BAIRRO VARCHAR(30),CIDADE VARCHAR(30),ESTADO VARCHAR(30) "
							+ ");");

		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}

	}

	public static Connection getConnection() {
		if (connectionFactory == null) {
			connectionFactory = new ConnectionFactory();
		}
		return connection;
	}

}
