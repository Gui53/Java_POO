package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static String FILE = "produtos.txt";
	static  Acoes acoes = new Acoes();
	public static void main(String[] args) {
		File file = new File(FILE);
		
		try {
			if (file.createNewFile()) {
				System.out.println("Arquivo '" + FILE + "' Criado");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ArrayList<Produto> lista = acoes.listar();
		
		Visual.boasVindas();
		
		int entrada = 1;
		String volta = "";
		int posicao = 0;
		
		

		while(entrada < 6 && entrada >= 0) {
			Visual.menu();
			entrada = new Scanner(System.in).nextInt();
			switch(entrada) {
			case 1 :
				try {
					if(lista.size() == 0) {
						System.out.println("Até o momento, nenhum item na lista");
						System.out.println();
					}else {
						System.out.println("Exibindo a lista diretamente do Arquivo...");
						Scanner ler = new Scanner(file);
						while(ler.hasNextLine()) {
							String linha = ler.nextLine();
							System.out.println(linha);
						}
					}
					
				} catch (FileNotFoundException e) {
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
				
				
				Produto produto = new Produto(descricao, valorUnit, estoque);
				/*volta =*/ acoes.salvar(produto);
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
				
				 /*acoes.volta(volta);*/
				 break;
			case 3:
				System.out.println("Selecione a posição que deseja excluir");
				posicao = new Scanner(System.in).nextInt();
				
				/*volta =*/ acoes.excluir(posicao);
				acoes.volta(volta);
				try {
					FileWriter writer = new FileWriter(FILE);
					for(Produto p : lista ) {
						writer.write(p.toString() + "\n\n");						
					}
					writer.close();
				} catch (IOException e) {
					System.out.println("Erro ao excluir do documento!");
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("Digite a Posição que deseja editar");
				posicao = new Scanner(System.in).nextInt();
				
				System.out.println("Digite a nova descrição para o produto:");
				String newDescription = new Scanner(System.in).next();
				
				System.out.println("Digite novo valor Unitario:");
				double newValorUnit =  new Scanner(System.in).nextDouble();
				
				System.out.println("Digite novo estoque para " + newDescription );
				int newEstoque =  new Scanner(System.in).nextInt();
				
				Produto newProduto = new Produto(newDescription, newValorUnit, newEstoque);
				
				/*volta =*/ acoes.alterar(posicao, newProduto);
				/*acoes.volta(volta);*/
				
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
				
				break;
			case 5:
				System.out.println("Digite a Posição que quer vizualizar unicamente:");
				posicao = new Scanner(System.in).nextInt();	
				
				acoes.mostrarSeparado(posicao);
				
				try {
					FileWriter writer = new FileWriter(FILE);
					for(Produto p : lista) {
						writer.write(p.toString() + "\n\n");
					}
					writer.close();
				}catch(IOException err){
					System.out.println("Erro ao editar arquivo!");
					err.printStackTrace();
				}
				break;
			case 6:
				acoes.apagarTudo();
				try {
					FileWriter writer = new FileWriter(FILE);
					for(Produto p : lista) {
						writer.write(p.toString());
					}
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			default:
				Visual.fechaPrograma();		
			}
		}
		


	}

}
