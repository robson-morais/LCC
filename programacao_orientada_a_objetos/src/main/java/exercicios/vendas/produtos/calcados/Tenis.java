package exercicios.vendas.produtos.calcados;
public class Tenis extends Calcado {
    
    public Tenis (String descricao, String categoria, String tamanho, double preco){
        super(descricao, categoria, tamanho, preco);
    }

    public Tenis (){
        super("","","",0.0);
    }
}
