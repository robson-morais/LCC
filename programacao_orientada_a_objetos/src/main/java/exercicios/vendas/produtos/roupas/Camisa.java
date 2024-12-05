package exercicios.vendas.produtos.roupas;

public class Camisa extends Roupa {
    
    public Camisa (String descricao, String categoria, String tamanho, double preco) {
        super(descricao, categoria, tamanho, preco);
    }

    public Camisa () {
        super("","","",0);
    }
}
