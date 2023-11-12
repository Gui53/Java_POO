package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classes.Produto;

public class Orientador {
	public  ArrayList<Produto> todosDados(){
		Connection connect = Conexao.getConnection();
		ArrayList<Produto> lista = new ArrayList<Produto>();
		String sql = "SELECT * FROM tb_produtos";
		
		try {
			PreparedStatement stm = connect.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				lista.add(new Produto(rs.getInt("id"), rs.getString("descricao"), rs.getDouble("valorUnitario")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			return lista;
		}
		
	}
	public void insert(String descricao, double valorUnitario) {
		Connection connect = Conexao.getConnection();
		String sql = "INSERT INTO tb_produtos(descricao, valorUnitario)values(?,?)";
		
		try {
			PreparedStatement stm = connect.prepareStatement(sql);
			stm.setString(1, descricao);
			stm.setDouble(2, valorUnitario);
			stm.execute();
		} catch (SQLException e) {
			throw new RuntimeException();
		}finally {
			Conexao.fecharConexao();
		}
	}
	public void update(int id, String descricao, double valorUnitario) {
		Connection connect = Conexao.getConnection();
		String sql = "UPDATE tb_produtos SET DESCRICAO = ?, VALORUNITARIO = ? WHERE ID = ?";
		
		try {
			PreparedStatement stm = connect.prepareStatement(sql);
			stm.setString(1, descricao);
			stm.setDouble(2, valorUnitario);
			stm.setInt(3, id);
			stm.execute();
		} catch (SQLException e) {
			throw new RuntimeException();

		}finally {
			Conexao.fecharConexao();
		}
	}
	public void mostrarTudo(ArrayList<Produto> lista){
        for(Produto produto : lista){
            System.out.println(produto.toString());
        }
    }
}
