package exercicios.produtos;

public class Produto { 

    private String nome; 
    private double preco; 
    private int codigo;

    public Produto(String nome, double preco, int codigo) { 
        this.nome = nome; 
        this.preco = preco; 
        this.codigo = codigo;
        } 
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Produto() { 
    this("",0.0,0); 
    } 

    public String getNome() { 
    return nome; 
    } 

    public void setNome(String nome) { 
    this.nome = nome; 
    }

    public double getPreco() { 
    return preco; 
    } 

    public void setPreco(double preco) { 
    this.preco = preco; 
    } 

    public String toString(){
        return " Produto: "+this.nome+"\n Preço: R$ "+this.preco+"\n Código do produto: "+this.codigo+"\n Fim do programa!";

    }
}