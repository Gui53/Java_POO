package classes;


import java.util.ArrayList;

public class Acoes implements PersistenciaProduto {
	ArrayList<Produto> lista = new ArrayList<Produto>();
	
	public void salvar(Produto produto) {
		try {
			lista.add(produto);
			System.out.println("Produto adicionado");
		}catch(Exception erro) {
			System.out.println("Erro ao tentar Adicionar Produto");
		}
	}
	public void alterar(int posicao, Produto produto) {
		try {
			lista.set(posicao, produto);
			System.out.println("Edição concluída!");
		}catch (Exception e) {
			System.out.println("Erro ao editar");
		}
	}
	public void excluir(int posicao) {
		try {
			lista.remove(posicao);
			System.out.println("Exclusão realizada");;
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("erro ao excluir!");
		}
	}
	public void mostrarSeparado(int posicao) {
		Produto pSelecionado = lista.get(posicao);
		System.out.println("Descrição: " + pSelecionado.descricao);
		System.out.println("Valor Unitário: " + pSelecionado.valorUnit);
		System.out.println("Estoque: " + pSelecionado.estoque);
		System.out.println();
	}
	
	public void apagarTudo() {
		System.out.println("Excluindo dados do arquivo . . . ");
		try {
			lista.clear();
			System.out.println("Lista Excluída");
		}catch (Exception e) {
			System.out.println("Erro ao apagar tudo!");
		}
	}
	/*public void menu() {
		System.out.println("Para mostrar a lista presione 1");
		System.out.println("Para inserir item na lista presione 2");
		System.out.println("Para excluir digite 3");
		System.out.println("para alterar digite 4");
		System.out.println("Para mostrar unicamente um produto digite 5");
		System.out.println("Para Excluir tudo pressione 6");
		System.out.println("Para sair digite qualquer outro numero");
	}
	public void fechaPrograma() {
		
		System.out.println("====================");
		System.out.println("  Fim do Programa");
		System.out.println("====================");
	}*/
	
	public void volta(String volta) {
		System.out.println(volta);
		System.out.println("--------------------------");
		System.out.println();
	}
	public ArrayList<Produto> listar() {
		return lista;
	}
}
