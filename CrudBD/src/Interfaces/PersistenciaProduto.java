package Interfaces;

import java.util.ArrayList;

import classes.Produto;

public interface PersistenciaProduto<T> {
	ArrayList<Produto> lista = new ArrayList<Produto>();
	
	public void salvar(T t);
	
	public void alterar(int id, T t);
	
	public void excluir(int id);
	
	public void mostrarSeparado(int id);
	
}
