package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
	static String FILE = "produtos.txt";
	static  Acoes acoes = new Acoes();
	public static void main(String[] args) {
		File file = new File(FILE);
		
		try {
			if (file.createNewFile()) {
				System.out.println("Arquivo '" + FILE + "' Criado");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Produto> lista = acoes.listar();
		
		System.out.println("---------------");
		System.out.println("---Bem-Vindo---");
		System.out.println("---------------");
		
		int entrada = 1;
		String volta = "";
		int posicao = 0;
		
		

		while(entrada < 6 && entrada >= 0) {
			acoes.menu();
			entrada = new Scanner(System.in).nextInt();
			switch(entrada) {
			case 1 :
				
				try {
					Scanner ler = new Scanner(file);
					while(ler.hasNextLine()) {
						String linha = ler.nextLine();
						System.out.println(linha);
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			case 2:
				System.out.println("Insira uma descrição para o produto:");
				String descricao = new Scanner(System.in).next();
				
				System.out.println("Insira o valor unitário para o produto:");
				double valorUnit = new Scanner(System.in).nextDouble();
				
				System.out.println("Insira a quantidade de estoque do produto:");
				int estoque = new Scanner(System.in).nextInt();
				
				
				Produto produto = new Produto(descricao.toLowerCase(), valorUnit, estoque);
				volta = acoes.inserir(produto);
				try {
					FileWriter writer = new FileWriter(FILE);
					for(Produto p : lista ) {
						writer.write(p.toString() + "\n\n");						
					}
					
					writer.close();
					
					System.out.println("Feito");
				}catch(IOException err) {
					err.printStackTrace();
				}
				
				 acoes.volta(volta);
				 break;
			case 3:
				System.out.println("Selecione a posição que deseja excluir");
				posicao = new Scanner(System.in).nextInt();
				
				volta = acoes.excluir(posicao);
				try {
					FileWriter writer = new FileWriter(FILE);
					for(Produto p : lista ) {
						writer.write(p.toString() + "\n\n");						
					}
					System.out.println("Excluido com sucesso!");
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				acoes.volta(volta);
				break;
			case 4:
				System.out.println("Digite a Posição que deseja editar");
				posicao = new Scanner(System.in).nextInt();
				
				System.out.println("Digite a novq posição para o produto:");
				String newDescription = new Scanner(System.in).next();
				
				System.out.println("Digite novo valor Unitario:");
				double newValorUnit =  new Scanner(System.in).nextDouble();
				
				System.out.println("Digite novo estoque para " + newDescription );
				int newEstoque =  new Scanner(System.in).nextInt();
				
				Produto newProduto = new Produto(newDescription, newValorUnit, newEstoque);
				
				volta = acoes.alterar(posicao, newProduto);
				acoes.volta(volta);
				break;
			case 5:
				System.out.println("Digite a Posição que quer vizualizar unicamente:");
				posicao = new Scanner(System.in).nextInt();	
				
				acoes.mostrarSeparado(posicao);
				break;
			}
		}
		


	}

}
