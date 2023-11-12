package classes;

import java.util.ArrayList;
import java.util.Scanner;

import util.Orientador;

public class CrudBD {

	public static void main(String[] args) {
		Orientador orientador = new Orientador();
		ArrayList<Produto> lista = orientador.todosDados();
		
		while (true) {
			System.out.println("Para mostrar a lista presione 1");
			System.out.println("Para inserir item na lista presione 2");
			System.out.println("Para excluir digite 3");
			System.out.println("para alterar digite 4");
			System.out.println("Para mostrar unicamente um produto digite 5");
			System.out.println("Para Excluir tudo pressione 6");
			System.out.println("Para sair digite qualquer outro numero");
			
			int opcao = new Scanner(System.in).nextInt();
			
			switch (opcao) {
			case 1:
				lista = orientador.todosDados();
				orientador.mostrarTudo(lista);
				break;
			case 2:
				System.out.println("Insira uma descrição para o produto:");
				String descricao = new Scanner(System.in).next();
				
				System.out.println("Insira o valor unitário para o produto:");
				double valorUnitario = new Scanner(System.in).nextDouble();
				orientador.insert(descricao, valorUnitario);
				break;
			case 3:
				 System.out.println("Digite o código do produto a ser alterado: ");
                 int id = new Scanner(System.in).nextInt();
                 System.out.println("Digite a descrição do produto: ");
                 descricao = new Scanner(System.in).nextLine();
                 System.out.println("Digite o valor unitário do produto");
                 valorUnitario = new Scanner(System.in).nextDouble();
                 
                 orientador.update(id, descricao, valorUnitario);
                 break;
			default:
				break;
			}
		}
	}

}
