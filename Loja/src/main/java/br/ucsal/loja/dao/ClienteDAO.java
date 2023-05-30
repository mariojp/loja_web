package br.ucsal.loja.dao;

import java.util.List;

import br.ucsal.loja.model.Cliente;

public class ClienteDAO {

	private ClienteMYSQLComando comando;
	public ClienteDAO() {
		this.comando =  new ClienteMYSQLComando ();
	}

	public void inserir(Cliente cliente) {
		this.comando.inserir (cliente);
	}

	public Cliente getCliente(Long id) {
		return this.comando.getCliente(id);
	}
	public List<Cliente> getLista() {
		return this.comando.getLista();
		
	}

	public void altera(Cliente cliente) {
		this.comando.altera(cliente);
	}
	public void remove(Long id) {
		this.comando.remove(id);
	
	}
	}
	

