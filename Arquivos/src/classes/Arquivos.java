package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivos {
	static String FILE = "eufile.txt";

	public static void main(String[] args) {
		escreverArquivo();
		try {
			lerArquivo();
		} catch (FileNotFoundException e) {
			System.out.println("Houve algum erro"); 
			e.printStackTrace();
		}
		
	}
	
	static void lerArquivo() throws FileNotFoundException {
		File file = new File(FILE);
		Scanner ler = new Scanner(file);
		while(ler.hasNextLine()) {
			String linha = ler.nextLine();
			System.out.println(linha);
		}
	}
	
	static void escreverArquivo() {
		String pao = "pão";
		try {
			FileWriter writer = new FileWriter(FILE);
			writer.write("Olá Mundo " + pao);
			writer.write("\nHello word");
			writer.write("\nwhats app?");


			writer.close();
			System.out.println("FEITO!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	static void criarArquivo() {
		File file = new File(FILE);
		try {
			if(file.createNewFile()) {
				System.out.println("Arquivo criado");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
