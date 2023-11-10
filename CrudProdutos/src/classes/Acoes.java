package classes;

import java.util.HashSet;


public class Acoes {
	HashSet<Produto> lista = new HashSet<Produto>();
	
	public String inserir(Produto produto) {

		try {
			lista.add(produto);
			return "Sucesso ao Adicionar";
		}catch(Exception erro) {
			return "Erro ao tentar Adicionar Produto";
		}
	}
	@SuppressWarnings("unlikely-arg-type")
	public String excluir(int posicao) {
		try {
			lista.remove(posicao);
			return "Exclusão realizada";
		}
		catch(Exception e) {
			return "Um erro aconteceu!";
		}
	}
	
	public void menu() {
		System.out.println("Para mostrar a lista presione 1");
		System.out.println("Para inserir item na lista presione 2");

	}
	public void volta(String volta) {
		System.out.println(volta);
		System.out.println("--------------------------");
		System.out.println();
	}
	public HashSet<Produto> listar() {
		return lista;
	}
}
