package util;

import java.util.ArrayList;

import Interfaces.ModArqv;
import Interfaces.PersistenciaProduto;
import classes.Produto;

public class OrientadorArq implements PersistenciaProduto<Produto>, ModArqv<Produto> {
	ArrayList<Produto> lista = new ArrayList<Produto>();

	@Override
	public void salvar(Produto produto) {
		try {
			lista.add(produto);
			System.out.println("Produto adicionado");
		}catch(Exception erro) {
			System.out.println("Erro ao tentar Adicionar Produto");
		}		
	}

	@Override
	public void alterar(int id, Produto produto) {
		try {
			lista.set(id, produto);
			System.out.println("Edição concluída!");
		}catch (Exception e) {
			System.out.println("Erro ao editar");
			System.out.println(e.getMessage());
		}		
	}

	@Override
	public void excluir(int id) {
		try {
			lista.remove(id);
			System.out.println("Exclusão realizada");;
		}
		catch(Exception e) {
			System.out.println("erro ao excluir!");
			e.printStackTrace();
		}	
	}

	@Override
	public void mostrarSeparado(int id) {
		Produto pSelecionado = lista.get(id);
		System.out.println("Descrição: " + pSelecionado.getDescricao());
		System.out.println("Valor Unitário: " + pSelecionado.getValorUnit());
		System.out.println();		
	}

	@Override
	public ArrayList<Produto> listar() {
		return lista;
	}
}
