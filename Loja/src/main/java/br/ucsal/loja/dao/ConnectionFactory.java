package br.ucsal.loja.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
	
	private static ConnectionFactory connectionFactory = null;
	
	private static Connection connection  = null;


	private String conStr = "jdbc:hsqldb:hsql://localhost/loja";
	private String usuario = "sa";
	private String senha = "";
	
	private ConnectionFactory() {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			connection =  DriverManager.getConnection(conStr, usuario, senha);
			connection.createStatement().execute("CREATE TABLE IF NOT EXISTS PRODUTO  ( " + 
					"  ID BIGINT IDENTITY PRIMARY KEY," + 
					"  NAME VARCHAR(255), STATUS VARCHAR(255), EMAIL VARCHAR(255), DESCRIPTION VARCHAR(255) " + 
					");");
			connection.createStatement().execute("CREATE TABLE IF NOT EXISTS CLIENTE ("
					+ "ID BIGINT IDENTITY PRIMARY KEY, "
					+"CPF VARCHAR(15), NOME VARCHAR(255), LOGRADOURO VARCHAR(255), NUMERO INT, BAIRRO VARCHAR(255), CIDADE VARCHAR(255), "
					+"ESTADO VARCHAR(255) "
					+ ");");

			//Criar a tabela usuario
			//Criar a tabela papel
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	
	}
	
	public static Connection getConnection() {
		if(connectionFactory == null ) {
			connectionFactory = new ConnectionFactory();
		}
		return connection;
	}
	
	
	
	

}
