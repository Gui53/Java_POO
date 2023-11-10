package classes;

public class Produto {
	String descricao;
	double valorUnit;
	int estoque;
	
	public Produto() {
		
	}

	public Produto(String descricao, double valorUnit, int estoque) {
		this.descricao = descricao;
		this.valorUnit = valorUnit;
		this.estoque = estoque;
	}
	public String toString()	{
		return"Descrição: " + descricao + "\nValor unitário: " + valorUnit + 
				"\nEstoque: " + estoque + "\n ---------------"; 
	}
}
