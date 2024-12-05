package exercicios.vendas;

import exercicios.vendas.produtos.Produto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Vendas implements VendasInterface {

    private List<Produto> produtos = new ArrayList<>();

    public Vendas (List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public void cadastrarProduto(Produto produto) throws IOException {
        if (this.produtos.contains(produto)){
            throw new IOException("O produto já esta cadastrado na lista.");
        } else {
            this.produtos.add(produto);
        }
    }

    @Override
    public String pesquisarProduto(int id) throws IOException {

        String produto ="";
        for (Produto p: this.produtos) {
            if (p.getId() == id) {
                produto = p.toString();
                break;
            } else {
                throw new IOException("Produto não encontrado.");
            }
        }
        return produto;
    }
}
