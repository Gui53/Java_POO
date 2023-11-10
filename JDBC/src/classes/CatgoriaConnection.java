package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utils.Conexao;

public class CatgoriaConnection {
	static Connection categoria = Conexao.getConexao();
		
	public void inserir(Categoria categ) {
		String sql = "insert into tb_categorias(nome)values(?)";
		try {
			PreparedStatement stm = categoria.prepareStatement(sql);
			stm.setString(1, categ.getNome());

			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Categoria>Selecionar(){
		ArrayList<Categoria>lista = new ArrayList<Categoria>();
		String sql = "select * from tb_categorias";
		
		try {
			PreparedStatement stm = categoria.prepareStatement(sql);
			ResultSet result = stm.executeQuery();
			while(result.next()) {
				Categoria categ = new Categoria();
				categ.setId(result.getInt("id"));
				categ.setNome(result.getString("nome"));
				lista.add(categ);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			return lista;
			
		}
	}

}
