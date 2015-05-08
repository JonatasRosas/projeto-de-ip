package br.ufrpe.sistema_de_entrega_de_comida_dados;

import java.util.ArrayList;
import java.util.Scanner;

import br.ufrpe.sistema_de_entrega_de_comida_negocio.Busca;
import br.ufrpe.sistema_de_entrega_de_comida_negocio.Lojista;
import br.ufrpe.sistema_de_entrega_de_comida_negocio.Usuario;

public class RepositorioNomes {
	public static void repositorioNomes(){
		int var=0;
		
		System.out.println("\tAEE! COMIDA\n");
		System.out.println("1- Cadastrar usu�rio");
		System.out.println("2- Cadastrar Lojista");
		System.out.println("3- Logar");
		
		Scanner sc = new Scanner(System.in);
		var = sc.nextInt();
	
		switch(var){
	
		case 1 :
			
			cadastra();
			break;
	
		case 2:
		
			cadastraLojista();
			break;
			
		//case 3:
			// logar(null);
			
	}
	
	sc.close();	
	
	}
public static void cadastra(){
		
		Usuario usuario = new Usuario();
		Busca buscar = new Busca();
		int numero=0;
		
		String a;

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		a = sc.nextLine();
		usuario.setNome(a);
		System.out.println("Informe seu cpf: ");
		a = sc.nextLine();
		usuario.setCpf(a);
		System.out.println("Crie uma senha: ");
		a = sc.nextLine();
		usuario.setPassword(a);
		System.out.println("Informe seu endere�o: ");
		a = sc.nextLine();
		usuario.setEndereco(a);
		System.out.println("Informe seu email: ");
		a = sc.nextLine();
		usuario.setEmail(a);
		System.out.println("Informe o seu telefone: ");
		a = sc.nextLine();
		usuario.setTelefone(a);
		
		
		System.out.println(usuario);
		
		ArrayList<Usuario> array = new ArrayList<Usuario>();
		
		array.add(usuario);
		
		buscar.BuscaCEP(numero);
		
		sc.close();
	}
	
	public static void cadastraLojista(){
		
		ArrayList<Lojista> loj = new ArrayList<Lojista>(); 
		
		String a;
		System.out.println("Informe o seu CNPJ: ");
		Lojista dono = new Lojista();
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		dono.setCnpj(a);
		System.out.println("Informe o nome do restaurante: ");
		a = sc.nextLine();
		dono.setNome(a);
		
		
		if(dono.getSaldo()> 50){
			System.out.println("Teje cadastrado!");
			System.out.print("Crie sua senha: ");
			a = sc.nextLine();
			dono.setSenha(a);
			loj.add(dono);
			logar(loj);
		}
		else{
			System.out.println("Saldo menor que a constante do servi�o!!");
			
		}
		sc.close();
	}
	
	public static void logar(ArrayList<Lojista> arr){
		
		String a;
		String b;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Acesse o sistema: \n");
		System.out.println("Digite o Nome Do Restaurante para logar: ");
		a = scan.nextLine();
		System.out.println("Senha: ");
		b = scan.nextLine(); 
		
		for(int i=0; i< arr.size(); i++){
			
			if(a.equals(arr.get(i).getNome()) && b.equals(arr.get(i).getSenha())){
				System.out.println("Bem-vindo! *logado como " + arr.get(i).getNome() + "*");
			}
			else{
				System.out.println("Dados incorretos");
				logar(arr);
			}
			
		}
		scan.close();
	}
	
}
