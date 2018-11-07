package br.ucsal.loja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.loja.model.Cliente;

public class ClienteDAO {
	private Connection connection;

	public ClienteDAO() {
		this.connection = ConnectionFactory.getConnection();
	}

	public void inserir(Cliente produto) {
		String sql = "insert into cliente (id,cpf,nome,logradouro,numero,bairro,cidade,estado) values (?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getId());
			stmt.setString(2, produto.getCpf());
			stmt.setString(3, produto.getNome());
			stmt.setString(4, produto.getLogradouro());
			stmt.setString(5, produto.getNumero());
			stmt.setString(6, produto.getBairro());
			stmt.setString(7, produto.getCidade());
			stmt.setString(8, produto.getEstado());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Cliente> getLista() {
		try {
			List<Cliente> clienteList = new ArrayList<>();
			String sql = "select * from cliente";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente(rs.getString("id"), rs.getString("cpf"), rs.getString("nome"),
						rs.getString("logradouro"), rs.getString("numero"), rs.getString("bairro"),
						rs.getString("cidade"), rs.getString("estado"));
				clienteList.add(cliente);
			}
			rs.close();
			stmt.close();
			return clienteList;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Cliente cliente) {
		String sql = "update cliente set cpf=? nome=? logradouro =? numero =? bairro =? cidade=? estado=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getCpf());
			stmt.setString(1, cliente.getNome());
			stmt.setString(1, cliente.getLogradouro());
			stmt.setString(1, cliente.getNumero());
			stmt.setString(1, cliente.getBairro());
			stmt.setString(1, cliente.getCidade());
			stmt.setString(1, cliente.getEstado());
			stmt.setString(5, cliente.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Cliente cliente) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from cliente where id=?");
			stmt.setString(1, cliente.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
