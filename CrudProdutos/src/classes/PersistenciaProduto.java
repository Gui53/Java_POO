package classes;

interface PersistenciaProduto {
	
	public void salvar(Produto produto);
	
	public void alterar(int id, Produto produto);
	
	public void excluir(int posicao);
	
	public void mostrarSeparado(int posicao);
}
