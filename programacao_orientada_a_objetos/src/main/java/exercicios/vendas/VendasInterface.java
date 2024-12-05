package exercicios.vendas;

import exercicios.vendas.produtos.Produto;

import java.io.IOException;

public interface VendasInterface {

    void cadastrarProduto (Produto produto) throws IOException;
    String pesquisarProduto(int id) throws IOException;
}
