package br.ufrpe.sistema_de_entrega_de_comida_part2_negocio;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscaCep {
	Scanner scanner = new Scanner(System.in);
	private int busca;
	public BuscaCep()
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
			System.out.println("CEP localizado com sucesso!");
			ListRestaurante();
		}
		else
		{
			BuscaCEP(busca);
		}
	}
	public void ListRestaurante()
	{
		ArrayList <String> nomesRestaurante = new ArrayList();
	        nomesRestaurante.add("RestauranteZe");
	        nomesRestaurante.add("RestauranteGoodPrice");
	        nomesRestaurante.add("ComedoriaJoaquina");
	        
	        for(String nome: nomesRestaurante )
	        {
	            System.out.println(nome);
	            
	        }
	        System.out.print("\n");
	        System.out.println("Escolha o restaurante que quer o cardapio");
	        
	        String nomeRestaurante = scanner.next();
	        for(int i=0; i<nomesRestaurante.size();i++)
	        {
	            if(nomeRestaurante.equals(nomesRestaurante.get(i)))
	            {
	                System.out.println("O nome do restaurante eh " +nomeRestaurante);
	                BuscaCEP(busca);
	            }
	            
	        }
	        ListRestaurante();
	        
	        
	        
	}
}
