package entidades;
import java.util.ArrayList;
import java.util.Scanner; 

public class aula2poo {
	static Acoes acoes = new Acoes();
	
	public static void main(String[] args) {
		
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		int entrada = 0;
		int posicao;
		String volta = "";
		
		System.out.println();
		System.out.println("	|¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|");
		System.out.println("	|--CRUD---PRODUTOS--|");
		System.out.println("	'¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨'");
		System.out.println();


		
		for(int i = 0; i < lista.size(); i++) {
		}
		
		/*if(lista.size() == 0) {			
			System.out.println("Insira uma descrição para o produto:");
			String descricao = new Scanner(System.in).next();
			
			System.out.println("Insira o valor unitário para o produto:");
			double valorUnit = new Scanner(System.in).nextDouble();
			
			System.out.println("Insira a quantidade de estoque do produto:");
			int estoque = new Scanner(System.in).nextInt();

			 p = new Produto(descricao, valorUnit, estoque);
			
			lista.add(p);
		}*/
		while(entrada < 4) {
			acoes.menu();	
			entrada = new Scanner(System.in).nextInt();

			switch(entrada) {
			case 1:
					System.out.println(" | Descrição" + " | ValorUnitário" + " | Estoque |");
					for(int i = 0; i < lista.size(); i++) {
						lista.get(i).mostrar();
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
				
					lista.add(produto);

				 
				 volta = acoes.inserir(produto);
				 acoes.volta(volta);
				 break;
			case 3:
				System.out.println("Digite a posição que deseja alterar:");
				posicao = new Scanner(System.in).nextInt();		
				
				System.out.println("Digite a nova Descrição do Produto:");
				String novaDescricao = new Scanner(System.in).next();
				
				System.out.println("Digite o novo valor do Produto:");
				double novoValor = new Scanner(System.in).nextDouble();
				
				System.out.println("Digite o novo estoque do Produto:");
				int novoEstoque = new Scanner(System.in).nextInt();
				
				Produto newProduto = new Produto(novaDescricao, novoValor, novoEstoque);

				volta = acoes.alterar(posicao, newProduto);
				acoes.volta(volta);
				break;
			}
		}
		
		
		
		
		

	}
}