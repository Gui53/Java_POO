package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Interfaces.ModDB;
import Interfaces.PersistenciaProduto;
import classes.Produto;

public class OrientadorDB implements PersistenciaProduto<Produto>, ModDB<Produto> {
	public  ArrayList<Produto> todosDados(){
		ArrayList<Produto> lista = new ArrayList<Produto>();
		Connection connect = Conexao.getConnection();
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
	public void salvar (Produto produto) {
		Connection connect = Conexao.getConnection();
		String sql = "INSERT INTO tb_produtos(descricao, valorUnitario)values(?,?)";
		
		try {
			PreparedStatement stm = connect.prepareStatement(sql);
			stm.setString(1, produto.getDescricao());
			stm.setDouble(2, produto.getValorUnit());
			stm.execute();
		} catch (SQLException e) {
			throw new RuntimeException();
		}finally {
			Conexao.fecharConexao();
		}
	}
	public void alterar(int id, Produto p) {
		Connection connect = Conexao.getConnection();
		String sql = "UPDATE tb_produtos SET DESCRICAO = ?, VALORUNITARIO = ? WHERE ID = ?";
		
		try {
			PreparedStatement stm = connect.prepareStatement(sql);
			stm.setString(1, p.getDescricao());
			stm.setDouble(2, p.getValorUnit());
			stm.setInt(3, id);
			stm.execute();
		} catch (SQLException e) {
			throw new RuntimeException();

		}finally {
			Conexao.fecharConexao();
		}
	}
	@Override
	public void excluir(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mostrarSeparado(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
