package entidades;
import java.util.ArrayList;
import java.util.Scanner; 

public class aula2poo {
	public static void main(String[] args) {
		ArrayList<Produto> lista = new ArrayList<Produto>();
		Produto p = new Produto();
		
		for(int i = 0; i < lista.size(); i++) {
			lista.get(i).mostrar();
		}
		
		if(lista.size() == 0) {			
			
		}
		for(int i = 0; i < lista.size(); i++) {
			lista.get(i).mostrar();
		}

	}
}