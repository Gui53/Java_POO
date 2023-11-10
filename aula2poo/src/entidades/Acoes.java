package entidades;

import java.util.ArrayList;
  public class Acoes {

	ArrayList<Produto> lista = new ArrayList<Produto>();

	
	public String inserir(Produto produto) {

		try {
			lista.add(produto);
			return "Sucesso ao Adicionar";
		}catch(Exception erro) {
			return "Erro ao tentar Adicionar Produto";
		}
		
	}
	
	public String alterar(int posicao, Produto produto) {
		
		try {		
			lista.set(posicao, produto);
			return "Ok!";
		}catch(Exception erro ) {
			return"Erro";
		}
			
	}
	
	public void mostrarSeparado(int posicao) {
		Produto pSelecionado = lista.get(posicao);
		System.out.println("Descrição: " + pSelecionado.descricao);
		System.out.println("Valor Unitário: " + pSelecionado.valorUnitario);
		System.out.println("Estoque: " + pSelecionado.estoque);
		System.out.println();
	}
	
	public String excluir(int posicao) {
		try {
			lista.remove(posicao);
			return"Exclusão realizada com sucesso!";
		}catch(Exception err) {
			return"Erro ao Excluir!";
		}
		
	}
	public void fechaPrograma() {
		System.out.println("====================");
		System.out.println("  Fim do Programa");
		System.out.println("====================");
	}
	
	public void menu() {
		System.out.println(" ^^^^^^AÇÕES^^^^^^");
		System.out.println("---------------------");
		System.out.println("---Mostrar-Lista = 1-");
		System.out.println("-Inserir-Produto = 2-");
		System.out.println("-Alterar-Produto = 3-");
		System.out.println("--Listar-Produto = 4-");
		System.out.println("-Excluir-Produto = 5-");
		System.out.println("Qualquer Outro P Sair");
		System.out.println("---------------------");

	}
	
	public void volta(String volta) {
		System.out.println(volta);
		System.out.println("--------------------------");
		System.out.println();
	}
	
	public ArrayList<Produto> listar(){
		return lista;
	}

}
