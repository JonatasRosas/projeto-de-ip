package br.ufrpe.sistema_de_entrega_de_comida_part2;

import java.util.Scanner;

import br.ufrpe.sistema_de_entrega_de_comida_part2_negocio.*;
import br.ufrpe.sistema_de_entrega_de_comida_part2_dados.Repositorio;

public class Principal {

	public static void main(String[] args) {
		System.out.println("\tHello People!\n");
		Usuario user = new Usuario();
		Repositorio rep = new Repositorio();
		Lojista loj = new Lojista();
		BuscaCep cep = new BuscaCep();
		System.out.println("\tAEE! COMIDA\n");
		System.out.println("1- Cadastrar usu�rio");
		System.out.println("2- Cadastrar Lojista");
		System.out.println("3- Buscar por CEP");
		//System.out.println("3- Logar");
		
		int var;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite sua op��o: ");
		var = input.nextInt();
		
		while(var < 1 || var > 3)
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
			
		//case 3:
			// logar();
			
	    }
		
		rep.listarUsuarios();
		
		
		
		
		input.close();
	}

}
