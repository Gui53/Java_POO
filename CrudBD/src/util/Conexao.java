package util;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import classes.CrudBD;

public class Conexao {
	private static Connection con = null;
	public static Connection getConnection() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/entra21java", "root", "1234");
			System.out.println("Conectado");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	public static void criarArquivo() {
		File file = new File(CrudBD.FILE);
		try {
			if(file.createNewFile()) {
				System.out.println("Arquivo Criado!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void fecharConexao() {
		try {
			con.close();
			System.out.println("Desconectado");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
