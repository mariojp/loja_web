package br.ucsal.loja.model;

/**
 * @autor1 Caio Júlio César de Jesus D'Almeida caio.dalmeida@ucsal.edu.br
 * @autor2 Luiz Alberto Pereira Borges Junior luiz.junior@ucsal.edu.br
 */
public class Cliente {

	private Long id;
	private String name;
	private String cpf;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;

	public Cliente() {
		super();
	}

	public Cliente(Long id, String name, String cpf, String logradouro, String numero, String bairro, String cidade,
			String estado) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", name=" + name + ", cpf=" + cpf + ", logradouro=" + logradouro + ", numero="
				+ numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
