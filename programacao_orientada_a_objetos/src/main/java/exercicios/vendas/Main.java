package exercicios.vendas;

import javax.swing.JOptionPane;

import exercicios.vendas.produtos.Produto;
import exercicios.vendas.produtos.calcados.Calcado;
import exercicios.vendas.produtos.calcados.Chinelo;
import exercicios.vendas.produtos.calcados.Tenis;
import exercicios.vendas.produtos.roupas.Bermuda;
import exercicios.vendas.produtos.roupas.Camisa;
import exercicios.vendas.produtos.roupas.Roupa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) {

        Produto a = new Produto("A", "Roupas", "M", 100);
        Produto b = new Roupa("B", "Roupas", "G", 10);
        Produto c = new Bermuda("C", "Roupas", "P", 111);
        Produto d = new Camisa("D", "Roupas", "GG", 110);

        Produto e = new Calcado("E", "Calcados", "40", 200);
        Produto f = new Tenis("F", "Calcados", "42", 250);
        Produto g = new Chinelo("G", "Calcados", "40", 20);

        List<Produto> produtosList = new ArrayList<>();
        Vendas produtos = new Vendas(produtosList);

        // Adicionando os produtosList à lista
        produtosList.add(a); produtosList.add(b); produtosList.add(c); produtosList.add(d); produtosList.add(e); produtosList.add(f); produtosList.add(g);

        for (Produto produto: produtosList) {
            System.out.println(produto.toString() + "\n==========\n");
        }

        boolean start = false;
        int input = 0;

        while (!start) {

            input = Integer.parseInt(JOptionPane.showInputDialog("Gerenciamento de produtosList da loja:\n\n(1) Cadastrar produto\n(2) Consultar Inventario\n(3) Sair "));

            switch (input) {
                case 1:
                    String descricao = JOptionPane.showInputDialog("Descrição: ");
                    String categoria = JOptionPane.showInputDialog("Categoria: ");
                    String tamanho = JOptionPane.showInputDialog("Tamanho: ");
                    double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço unitário: "));
                    try {
                        Produto produtoCriado = new Produto(descricao, categoria, tamanho, preco);
                        produtos.cadastrarProduto(produtoCriado);
                        JOptionPane.showMessageDialog(null, "Produto cadastrado no sistema.\n" + produtoCriado.toString());
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    break;
            }
        }
    }
}
