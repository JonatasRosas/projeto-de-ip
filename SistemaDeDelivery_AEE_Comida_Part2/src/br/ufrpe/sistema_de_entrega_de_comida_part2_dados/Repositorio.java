package br.ufrpe.sistema_de_entrega_de_comida_part2_dados;

import java.util.ArrayList;

import br.ufrpe.sistema_de_entrega_de_comida_part2_negocio.Usuario;
import br.ufrpe.sistema_de_entrega_de_comida_part2_dados.*;

public class Repositorio {
	
	//private ArrayList<Usuario> array = new ArrayList<Usuario>();
	Usuario[] array = new Usuario[4];
	
	public Repositorio(){
		
	}
	Usuario user = new Usuario();
	int n=0;
	public void salvarCadastroUsuario(Usuario usuario)
	{
		for(int i=0; i<array.length; i++)
		{
			array[n] = usuario;
			n=n+1;
			array[n+1] = array[n];
			System.out.println("\nTamanho da lista: " + array.length);
			listarUsuarios();
			System.out.println("\n\n");
			user.cadastrarUsuario();
			System.out.println("\n\n");
		}
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
