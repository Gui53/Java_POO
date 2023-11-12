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
	
	/*public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValorUnit() {
		return valorUnit;
	}
	
	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}*/
	public String toString()	{
		return"Descrição: " + descricao + "\nValor unitário: " + valorUnit + 
				"\nEstoque: " + estoque + "\n ---------------"; 
	}
}
