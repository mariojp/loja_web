package br.ucsal.loja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import br.ucsal.loja.model.Cliente;

public class ClienteDAO {

	private Connection connection;

	public ClienteDAO() {
		this.connection = ConnectionFactory.getConnection();
	}

	public void inserir(Cliente cliente) {
		String sql = "insert into cliente (cpf, nome, logradouro, numero, bairro, cidade, estado) values (?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getCpf());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getLogradouro());
			stmt.setInt(4, cliente.getNumero());
			stmt.setString(5, cliente.getBairro());
			stmt.setString(6, cliente.getCidade());
			stmt.setString(7, cliente.getEstado());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Cliente> listar() {
		List<Cliente> clientes = new ArrayList<>();
		String sql = "select * from cliente";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setNome(rs.getString("nome"));
				cliente.setLogradouro(rs.getString("logradouro"));
				cliente.setNumero(rs.getInt("numero"));
				cliente.setBairro(rs.getString("bairro"));
				cliente.setCidade(rs.getString("cidade"));
				cliente.setEstado(rs.getString("estado"));
			}
			rs.close();
			stmt.close();
			return clientes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void remover(Cliente cliente) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from cliente where id=?");
			stmt.setInt(1, cliente.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void alterar(Cliente cliente) {
		String  sql = "update cliente set cpf=? nome=? logradouro=? numero=? bairro=? cidade=? estado=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getCpf());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getLogradouro());
			stmt.setInt(4, cliente.getNumero());
			stmt.setString(5, cliente.getBairro());
			stmt.setString(6, cliente.getCidade());
			stmt.setString(7, cliente.getEstado());
			stmt.setInt(8, cliente.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
