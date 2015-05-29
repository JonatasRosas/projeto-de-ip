package br.ufrpe.sistema_de_entrega_de_comida_part2_negocio;

import java.util.Scanner;

public class Menu {
	public Menu(){
		
	}
	public void meuMenu(){
		Usuario user = new Usuario();
		Lojista loj = new Lojista();
		BuscaCep cep = new BuscaCep();
		LogarSistema logar = new LogarSistema();
		Exit saida = new Exit();
		System.out.println("\tAEE! COMIDA\n");
		System.out.println("1- Cadastrar usuário");
		System.out.println("2- Cadastrar Lojista");
		System.out.println("3- Buscar por CEP");
		System.out.println("4- Logar no sistema");
		System.out.println("5- Exit do sistema");
		
		int var;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite sua opção: ");
		var = input.nextInt();
		
		while(var < 1 || var > 5)
		{
			System.out.println("Numero invalido!");
			System.out.println("Digite o numero novamente: ");
			var = input.nextInt();
		}
		switch(var)
		{
		
		case 1 :
			user.cadastrarUsuario();
			break;
	
		case 2:
		
			loj.cadastraLojista();
			break;
			
		case 3:
			cep.BuscaCEP(var);
			break;
			
		case 4:
			logar.logarAcesso();
			break;
		
		case 5:
			saida.ExitSaida();
	    }
		
		input.close();
	}
}
