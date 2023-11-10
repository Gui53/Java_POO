package classes;

import java.util.ArrayList;
import java.util.HashSet;


public class Acoes {
	ArrayList<Produto> lista = new ArrayList<Produto>();
	
	public String inserir(Produto produto) {

		try {
			lista.add(produto);
			return "Sucesso ao Adicionar";
		}catch(Exception erro) {
			return "Erro ao tentar Adicionar Produto";
		}
	}
	public String alterar(int posicao, Produto produto) {
		try {
			lista.set(posicao, produto);
			return"Edição concluída!";
		}catch (Exception e) {
			// TODO: handle exception
			return "Erro";
		}
	}
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
	public ArrayList<Produto> listar() {
		return lista;
	}
}
