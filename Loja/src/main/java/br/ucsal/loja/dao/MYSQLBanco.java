package br.ucsal.loja.dao;

import org.hsqldb.Server;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MYSQLBanco {
    private static final String URL = "jdbc:mysql://localhost:3306/nome_do_banco_de_dados";
    private static final String USERNAME = "seu_nome_de_usuario";
    private static final String PASSWORD = "sua_senha";

    private Connection connection;

    public MYSQLBanco() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexão estabelecida com o banco de dados.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void fecharConexao() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexão fechada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MYSQLBanco banco = new MYSQLBanco();
        // Use a conexão para executar operações no banco de dados
        // ...	
        banco.fecharConexao();
    }
}

