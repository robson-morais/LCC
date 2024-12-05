package exercicios.roupas;

public class Roupa {
    private String descricao;
    private String tipo;
    private String cor;
    private String tamanho;

    public Roupa(String descricao, String tipo, String cor, String tamanho, double preco, String codigo) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;

    }
    public Roupa() {
        this("","","","",0.0,"");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamamnho() {
        return tamanho;
    }

    public void setTamamnho(String tamamnho) {
        this.tamanho = tamamnho;
    }

    public boolean ehDaCor(String cor){
        if (this.cor.equals(cor)){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "DESCRIÇÃO DO PRODUTO: \n"+this.descricao+"\n"+this.tipo+"\n"+this.cor+"\n"+this.tamanho;
    }

}
