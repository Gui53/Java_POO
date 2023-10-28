package entidades;

public class Produto {
	/*atributos*/
	String descricao;
	double valorUnitario;
	double estoque;
	
	public Produto() {
		//
	}
	/*metodo construtor sobrecarregado*/
	public Produto(String descricao, double valorUnitario, double estoque) {
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.estoque = estoque;
	}
	
	public void mostrar(){
		System.out.println(descricao);
		System.out.println("R$" + valorUnitario);
		System.out.println(estoque);
		System.out.println();

	}
}
