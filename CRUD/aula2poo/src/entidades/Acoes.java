package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Acoes {
	
	public void inserir(Produto produto) {
		ArrayList<Produto> lista = new ArrayList<Produto>();

		System.out.println("Insira uma descrição para o produto:");
		String descricao = new Scanner(System.in).next();
		
		System.out.println("Insira o valor unitário para o produto:");
		double valorUnit = new Scanner(System.in).nextDouble();
		
		System.out.println("Insira a quantidade de estoque do produto:");
		double estoque = new Scanner(System.in).nextDouble();

		Produto p = new Produto(descricao, valorUnit, estoque);
		
		lista.add(p);
	}
	
	public void alterar() {
		
	}
	
	public void excluir() {
		
	}

}
