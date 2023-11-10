package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Connection con = null;
	public static Connection getConexao() {
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/entra21java", "root", "1234");
			 System.out.println("Conectado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
		/*if(con != null) {
			con = null;
		}*/
	}
}
