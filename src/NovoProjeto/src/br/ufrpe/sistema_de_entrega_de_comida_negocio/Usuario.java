package br.ufrpe.sistema_de_entrega_de_comida_negocio;

public class Usuario {
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String password;
	private int pontos;
	private String endereco;
	
	
	public Usuario(){
		
	}
	
	
	public Usuario(String nome, String cpf, String telefone, String email, 
						String password, int pontos, String endereco){
		
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.password = password;
		this.pontos = pontos;
		this.endereco = endereco;
		
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}
	
	public void setPassword(String password){
		
		this.password = password;
	}

	public int getPontos() {
		return pontos;
		
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String toString(){
		
		return "Nome: " + this.nome + "\nPontos: " + this.pontos + "\nEnderešo: " + this.endereco
				+ "\nEmail: " + this.email + "\nTelefone: " + this.telefone;
		
	}

}

