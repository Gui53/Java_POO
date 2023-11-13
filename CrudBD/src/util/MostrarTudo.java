package util;

import java.util.ArrayList;

import classes.Produto;

public class MostrarTudo {

	public void mostrarTudo(ArrayList<Produto> lista){
        for(Produto produto : lista){
            System.out.println(produto.toString());
        }
    }
}
