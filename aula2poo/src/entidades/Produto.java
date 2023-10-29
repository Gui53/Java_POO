package entidades;

public class Produto {
	/*atributos*/
	String descricao;
	double valorUnitario;
	int estoque;
	
	public Produto() {
		//
	}
	/*metodo construtor sobrecarregado*/
	public Produto(String descricao, double valorUnitario, int estoque) {
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.estoque = estoque;
	}
	
	public void mostrar(){
		System.out.println(" | " + descricao + "       |  R$" + valorUnitario + "        |" + estoque );
		
	}
}
