package br.ufrpe.sistema_de_entrega_de_comida_negocio;

import java.util.ArrayList;
import java.util.Scanner;
import br.ufrpe.sistema_de_entrega_de_comida_dados.RepositorioNomes;

public class Busca 
{
	Scanner scanner = new Scanner(System.in);
	private int busca;
	RepositorioNomes repositorio = new RepositorioNomes();
	
	public Busca()
	{
		busca=0;
	}
	public void BuscaCEP(int numBusca)
	{
		System.out.println("\nDigite seu CEP com 8 numeros para sabermos sua localidade: ");
		numBusca = scanner.nextInt();
		busca = numBusca;
		if(busca>=0 && busca<99999999)
		{
			System.out.println("Esta certo seu CEP!");
			ListRestaurante();
		}
		else
		{
			int numero=0;
			BuscaCEP(numero);
		}
	}
	public void ListRestaurante()
	{
		ArrayList <String> nomesRestaurante = new ArrayList();
	        nomesRestaurante.add("RestauranteZe");
	        nomesRestaurante.add("RestauranteGoodPrice");
	        nomesRestaurante.add("ComedoriaJoaquina");
	        
	        System.out.println("Mostrando nomes de restaurantes cadastrados: ");
	        for(String nome: nomesRestaurante )
	        {
	            System.out.println(nome);
	            
	        }
	        System.out.print("\n");
	        System.out.println("Escolha o restaurante que quer o cardapio");
	        
	        String nomeRestaurante = scanner.next();
	        for(int i=0; i<nomesRestaurante.size();i++){
	            if(nomeRestaurante.equals(nomesRestaurante.get(i)))
	            {
	                System.out.println("O nome do restaurante eh " +nomeRestaurante);
	                System.out.println("Fim do programa!\n\n");
	        		repositorio.repositorioNomes();
	            }
	            
	        }int num=0;
        	System.out.println("\n\nFalha no nome do restaurante!!!\n");
        	BuscaCEP(num);
	        
	        
	        
	}
}
