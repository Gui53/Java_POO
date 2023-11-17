package classes;

import classes.singleResponsability.DAOProduto;
import classes.singleResponsability.Produto;

public class Solid {

	public static void main(String[] args) {
		Produto p = new Produto(1, "Milho", 10.50);
		//p.salvar(); removifdo e transferido para dao produto
		DAOProduto.salvar(p);
	}

}
