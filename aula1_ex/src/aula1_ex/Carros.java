package aula1_ex;

public class Carros {

	public static void main(String[] args) {
		Atributos atr = new Atributos();
		
		atr.placa = "ART-123";
		atr.marca = "Chevrolet";
		atr.modelo = "S10";
		atr.cor = "Branca";
		
		atr.display();
		
		atr.placa = "ART-321";
		atr.marca = "Wolksvagen";
		atr.modelo = "Nivus";
		atr.cor = "vermelho";
		
		atr.display();

	}

}
