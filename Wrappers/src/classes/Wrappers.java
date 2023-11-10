package classes;

import java.util.ArrayList;

public class Wrappers {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
	
		/*Integer x = 50;
		System.out.println(x.intValue());
		System.out.println(x.toString());
		System.out.println(x.MIN_VALUE);
		System.out.println(x.MAX_VALUE);
		
		String n1 = "45";
		String n2 = "53";
		int resultado = Integer.parseInt(n1) + Integer.parseInt(n2);
		System.out.println(resultado);
		
		Float qtde = 15f;
		String valor = "50.5";
		float subtotal = qtde * Float.parseFloat(valor);
		System.out.println(subtotal);
		
		String qtdeS = String.valueOf(qtde);
		System.out.println(qtdeS);
		System.out.print(String.valueOf(x));*/
		
		/*Integer myInt = 5;
	    Double myDouble = 5.99;
	    Character myChar = 'A';
	    System.out.println(myInt.intValue());
	    System.out.println(myDouble.doubleValue());
	    System.out.println(myChar.charValue());*/
		
		 Integer myInt = 100;
		 String myString = myInt.toString();
		 System.out.println(myString.length());
		
	}

}
