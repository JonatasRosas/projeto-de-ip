package br.ufrpe.sistema_de_entrega_de_comida_part2_negocio;

import java.util.Scanner;

public class LogarSistema {
	public LogarSistema(){
		
	}
	Scanner input = new Scanner(System.in);
	Menu meuM = new Menu();
	public void logarAcesso(){
		System.out.println("Digite seu login: ");
		String login = input.next();
		System.out.println("Digite sua senha: ");
		String senha = input.next();
		if(senha != null && login !=null && login != ""){
			System.out.println("Logado com sucesso!");
		}
		meuM.meuMenu();
	}
}
