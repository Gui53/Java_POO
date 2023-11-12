package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Connection con = null;
	public static Connection getConnection() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/entra21java", "root", "1234");
			System.out.println("conectado");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
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
