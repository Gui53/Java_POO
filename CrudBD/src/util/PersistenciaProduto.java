package util;

import classes.Produto;

interface PersistenciaProduto {
	
	public void salvar(Produto produto);
	
	public void alterar(int id, Produto produto);
	
}
