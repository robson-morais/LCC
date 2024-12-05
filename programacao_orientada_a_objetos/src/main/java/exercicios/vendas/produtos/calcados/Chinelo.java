package exercicios.vendas.produtos.calcados;
public class Chinelo extends Calcado {
    
    public Chinelo (String descricao, String categoria, String tamanho, double preco) {
        super(descricao, categoria, tamanho, preco);
    }

    public Chinelo() {
        super("","","",0.0);
    }
}
