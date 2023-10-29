package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Acoes {

	ArrayList<Produto> lista = new ArrayList<Produto>();

	
	public String inserir(Produto produto) {

		try {
			return "Sucesso ao Adicionar";
		}catch(Exception erro) {
			return "Erro ao tentar Adicionar Produto";
		}
		
		//lista.add(p);
	}
	
	public String alterar(int posicao, Produto produto) {
		try {
			lista.set(posicao, produto);
			return "Alteração Realizada!";
		}catch(Exception erro) {
			return"Erro ao Adicionar";
		}
	}
	
	public void excluir() {
		
	}
	
	public void menu() {
		System.out.println(" ^^^^^^AÇÕES^^^^^^");
		System.out.println("---------------------");
		System.out.println("---Mostrar-Lista = 1-");
		System.out.println("-Inserir-Produto = 2-");
		System.out.println("-Alterar-Produto = 3-");
		System.out.println("--Listar-Produto = 4-");
		System.out.println("-Excluir-Produto = 5-");
		System.out.println(" ---Para-Sair = 6---");
		System.out.println("---------------------");

	}
	
	public void volta(String volta) {
		System.out.println(volta);
		System.out.println("''''''''''''''''''''''''''");
		System.out.println();
	}

}
