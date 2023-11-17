package classes;

public class Produto {
	private int id;
	private String descricao;
	private double valorUnitario;
	
	public Produto(){
		
	}
	
	public Produto(String descricao, double valorUnitario) {
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}
	
	public Produto(int id, String descricao, double valorUnitario) {
		this.id = id;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorUnit() {
		return valorUnitario;
	}

	public void setValorUnit(double valorUnit) {
		this.valorUnitario = valorUnit;
	}
	
	public String toString() {
		return "ID : " + id + " DESCRIÇÃO: " + descricao + " Valor Unitário: " + valorUnitario;
	}
}
