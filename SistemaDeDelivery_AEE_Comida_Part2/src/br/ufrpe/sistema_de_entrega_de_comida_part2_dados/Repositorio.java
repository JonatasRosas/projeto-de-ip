package br.ufrpe.sistema_de_entrega_de_comida_part2_dados;

import java.util.ArrayList;

import br.ufrpe.sistema_de_entrega_de_comida_part2_negocio.Usuario;
import br.ufrpe.sistema_de_entrega_de_comida_part2_dados.*;

public class Repositorio {
	
	//private ArrayList<Usuario> array = new ArrayList<Usuario>();
	Usuario[] array = new Usuario[5];
	
	public Repositorio(){
		
	}
	Usuario user = new Usuario();
	int n=0;
	public void salvarCadastroUsuario(Usuario usuario)
	{
			if(n>0){
		    array[n] = usuario;
		    array[n+1] = array[n-1];
			array[n-1] = array[n];
			array[n]= array[n+1];
			
			System.out.println("\nTamanho da lista: " + array.length);
			array[n] = null;
			listarUsuarios();
			System.out.println("\n\n");
			//user.cadastrarUsuario();
			//System.out.println("\n\n");
			}
			else
			{
				System.out.println("N�o!\n");
				array[n] = usuario;
				System.out.println("\nTamanho da lista: " + array.length);
				listarUsuarios();
				System.out.println("\n\n");
				
			}
			n=n+1;
			user.cadastrarUsuario();
     }
	public void listarUsuarios()
	{
		for (Usuario usuario : array) 
		{
			System.out.println(usuario);
		}
		
	}
	//public
	
}
