package classes.singleResponsability;

public class DAOProduto {
	public static boolean salvar(Produto produto) {
		System.out.println("salvando " + produto.getDescricao());
		return true; 
	}
}
