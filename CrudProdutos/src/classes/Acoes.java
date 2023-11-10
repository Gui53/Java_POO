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
	public void mostrarSeparado(int posicao) {
		Produto pSelecionado = lista.get(posicao);
		System.out.println("Descrição: " + pSelecionado.descricao);
		System.out.println("Valor Unitário: " + pSelecionado.valorUnit);
		System.out.println("Estoque: " + pSelecionado.estoque);
		System.out.println();
	}
	
	public void menu() {
		System.out.println("Para mostrar a lista presione 1");
		System.out.println("Para inserir item na lista presione 2");
		System.out.println("Para excluir digite 3");
		System.out.println("para alterar digite 4");
		System.out.println("Para mostrar unicamente um produto digite 5");

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
