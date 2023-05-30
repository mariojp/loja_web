package br.ucsal.loja.dao;

import java.util.List;

import br.ucsal.loja.model.Cliente;

public interface DBAdapter {
 
	public void inserir(Cliente cliente);

	public Cliente getCliente(Long id);
	
	public List<Cliente> getLista();
	
	public void altera(Cliente cliente);
	
	public void remove(Long id);
}
