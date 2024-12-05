package exercicios.vendas.produtos.roupas;

public class Bermuda extends Roupa {
    
    public Bermuda (String descricao, String categoria, String tamanho, double valor) {
        super(descricao, categoria, tamanho, valor);
    }

    public Bermuda () {
        super("","","",0);
    }
}
