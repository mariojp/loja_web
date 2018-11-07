package br.ucsal.loja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.loja.model.Cliente;

/**
 * @autor1 Caio Júlio César de Jesus D'Almeida caio.dalmeida@ucsal.edu.br
 * @autor2 Luiz Alberto Pereira Borges Junior luiz.junior@ucsal.edu.br
 * @author Jean Lima de Souza Junior jeanl.junior@ucsal.edu.br
 */
public class ClienteDAO {

	private Connection conexao;

	public ClienteDAO() {
		this.conexao = ConnectionFactory.getConnection();
	}

	public List<Cliente> getLista() {
		Statement stmt;
		List<Cliente> clientes = new ArrayList<>();
		try {
			stmt = ConnectionFactory.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select id,name,cpf,logradouro,numero,bairro,cidade,estado from cliente;");
			while (rs.next()) {
				Cliente c = new Cliente();

				c.setId(rs.getLong("id"));
				c.setName(rs.getString("name"));
				c.setCpf(rs.getString("Cpf"));
				c.setLogradouro(rs.getString("logradouro"));
				c.setNumero(rs.getInt("numero"));
				c.setBairro(rs.getString("bairro"));
				c.setCidade(rs.getString("cidade"));
				c.setEstado(rs.getString("estado"));

				clientes.add(c);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return clientes;
	}

	public void inserir(Cliente cliente) {
		try {

			PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(
					"insert into cliente (name,cpf,logradouro,numero,bairro,cidade,estado) values (?,?,?,?,?,?,?);");

			ps.setString(1, cliente.getName());
			ps.setString(2, cliente.getCpf());
			ps.setString(3, cliente.getLogradouro());
			ps.setInt(4, cliente.getNumero());
			ps.setString(5, cliente.getBairro());
			ps.setString(6, cliente.getCidade());
			ps.setString(7, cliente.getEstado());

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void delete(int id) {
		PreparedStatement ps;
		try {
			ps = ConnectionFactory.getConnection().prepareStatement("delete from cliente where id=?");
			ps.setInt(1, id);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void update(Cliente cliente) {
		try {

			PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(
					"update Cliente set name=?,cpf=?,logradouro=?,numero=?,bairro=?,cidade=?,estado=? where id =?;");
			ps.setString(1, cliente.getName());
			ps.setString(2, cliente.getCpf());
			ps.setString(3, cliente.getLogradouro());
			ps.setInt(4, cliente.getNumero());
			ps.setString(5, cliente.getBairro());
			ps.setString(6, cliente.getCidade());
			ps.setString(7, cliente.getEstado());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
