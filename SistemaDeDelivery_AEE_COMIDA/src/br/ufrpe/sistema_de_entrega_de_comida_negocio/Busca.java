package br.ufrpe.sistema_de_entrega_de_comida_negocio;

import java.util.ArrayList;
import java.util.Scanner;

public class Busca 
{
	Scanner scanner = new Scanner(System.in);
	private int busca;
	
	
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
	        nomesRestaurante.add("Restaurante do Ze");
	        nomesRestaurante.add("Restaurante Good Price");
	        nomesRestaurante.add("Comedoria e Alimentos Joaquina");
	        
	       // System.out.println("Mostrando nomes de restaurantes cadastrados: ");
	        for(String nome: nomesRestaurante )
	        {
	            System.out.println(nome);
	            
	        }
	        System.out.print("\n");
	        System.out.println("Escolha o restaurante que quer o cardapio");
	        
	        String nomeRestaurante = null;
	        nomeRestaurante = scanner.nextLine();
	        for(int i=0; i<nomesRestaurante.size();i++){
	            if(nomeRestaurante.equals(nomesRestaurante.get(i)))
	            {
	                System.out.println("O nome do restaurante eh" +nomeRestaurante);
	                
	            }
	            else{
	            	int num=0;
	            	System.out.println("\n\nFalha no nome do restaurante!!!\n");
	            	BuscaCEP(num);
	               
	            }
	        }
	        
	        
	}
}