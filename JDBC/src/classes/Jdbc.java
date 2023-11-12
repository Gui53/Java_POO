package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

import utils.Conexao;

public class Jdbc {
	public static void main(String[] args) {
		Conexao con = new Conexao();
		Categoria categ = new Categoria();
		//categ.setNome("Material ");
		
		CatgoriaConnection catCon = new CatgoriaConnection();
		catCon.inserir(categ);
		for(Categoria c : catCon.Selecionar()) {
			System.out.println(c.getId() + "\nCategoria: " + c.getNome());
		}
		con.fecharConexao();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*if(Conexao.getConexao() != null) {
			System.out.println("Conected");
		}*/
		//salvar();
		//consultar();
	/*}
	static void salvar() {
		Connection con = Conexao.getConexao();
		/*String sql = "insert into tb_categorias(nome)values(?)";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, "Bebidas");
			stm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*String sql = "insert into tb_produtos(descricao, valorUnitario, id_categoria)values(?, ?, ?)";
		PreparedStatement stm;
		try {
			stm = con.prepareStatement(sql);
			stm.setString(1, "Arroz");
			stm.setString(2, "13.50");
			stm.setString(3, "2");

			stm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Conexao.fecharConexao();
		}
	}*/
	/*static void consultar() { 
		Connection con = Conexao.getConexao();
		String sql = "select * from tb_categorias";
		
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("nome"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Conexao.fecharConexao();
		}
	}*/
	}
}
