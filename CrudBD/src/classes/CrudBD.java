package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import util.Conexao;
import util.MostrarTudo;
import util.OrientadorArq;
import util.OrientadorDB;

public class CrudBD {
	public static String FILE = "produtos.txt";
	
	public static void main(String[] args) {
		Conexao.criarArquivo();
		
		OrientadorDB orientador = new OrientadorDB();
		OrientadorArq arqv = new OrientadorArq();
		
		ArrayList<Produto> listaDB = orientador.todosDados();
		//ArrayList<Produto> listaArqv = arqv.listar();
		
		
		String nextv = "s";
		
		while (nextv != "n") {
			System.out.println("Para mostrar a lista presione 1");
			System.out.println("Para inserir item na lista presione 2");
			System.out.println("para alterar digite 3");
			System.out.println("Para excluir digite 4");
			System.out.println("Para mostrar unicamente um produto digite 5");
			System.out.println("Para sair digite qualquer outro numero");
			
			int opcao = new Scanner(System.in).nextInt();
			
			switch (opcao) {
			case 1:
				listaDB = orientador.todosDados();
				MostrarTudo.mostrarTudo(listaDB);
				try {
					FileWriter writer = new FileWriter(FILE);
					for(Produto p : listaDB) {
						writer.write(p.toString() + "\n\n");
					}
					writer.close();
					System.out.println("Feito!");
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Insira uma descrição para o produto:");
				String descricao = new Scanner(System.in).next();
				
				System.out.println("Insira o valor unitário para o produto:");
				double valorUnitario = new Scanner(System.in).nextDouble();
				
				Produto produto = new Produto(descricao, valorUnitario);
				orientador.salvar(produto);
				//arqv.salvar(produto);
				
				try {
					FileWriter writer = new FileWriter(FILE);
					for(Produto p : listaDB) {
						writer.write(p.toString() + "\n\n");
					}
					writer.close();
					System.out.println("Feito!");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 3:
				 System.out.println("Digite o código do produto a ser alterado: ");
                 int id = new Scanner(System.in).nextInt();
                 System.out.println("Digite a descrição do produto: ");
                 descricao = new Scanner(System.in).nextLine();
                 System.out.println("Digite o valor unitário do produto");
                 valorUnitario = new Scanner(System.in).nextDouble();
                 
 				Produto p = new Produto(id, descricao, valorUnitario);

                 orientador.alterar(id, p);
                 arqv.alterar(id, p);
                 break;
            case 4:
            	System.out.println("Serviço ainda não criado. Aguarde as próximas atualizações!");
            	break;
            case 5:
            	System.out.println("Serviço ainda não criado. Aguarde as próximas atualizações!");
            	break;
			default:
				System.out.println("Fim do programa");
				Conexao.fecharConexao();
				nextv = "n";
			}
		
		}
	}

}
