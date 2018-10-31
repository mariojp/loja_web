package br.ucsal.loja.model;

public class Produto {

	private Long id;
	private String name;
	private String status;
	private String email;
	private String description;

	public Produto(String name, String status, String email, String description) {
		super();
		this.name = name;
		this.status = status;
		this.email = email;
		this.description = description;
	}

	public Produto(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Produto() {
		
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
