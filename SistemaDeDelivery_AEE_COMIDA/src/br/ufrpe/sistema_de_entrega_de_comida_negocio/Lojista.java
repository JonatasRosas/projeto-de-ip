package br.ufrpe.sistema_de_entrega_de_comida_negocio;

import java.util.Random;

public class Lojista {
	private String cnpj;
	private String nome;
	private String senha;
	private Restaurante[] restaurantes;
	private int saldo;
	
	
	public Lojista(){
		
	}
	
	public Lojista(String cnpj, String nome, int tam){
		
		this.cnpj = cnpj;
		this.nome = nome;
		this.restaurantes = new Restaurante[tam];
		
		
	}
	
	
	public String getCnpj() {
		return cnpj;
	}
	
	public int getSaldo() {
	
		Random g = new Random();
		return g.nextInt(1001);
		
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}
	
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	

}
