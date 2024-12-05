package exercicios.vendas.produtos;

import exercicios.vendas.produtos.roupas.Roupa;

public class Produto {
    protected String descricao;
    protected String categoria;
    protected String tamanho;
    protected double preco;
    protected int id;

    public Produto (String descricao, String categoria, String tamanho, double preco) {
        this.descricao = descricao;
        this.categoria = categoria;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public Produto () {
        this("","","",0.0);
    }

    private int geradorID (){
        int num = (int) (Math.random()*10000);
        return num;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getId() {
        return geradorID();
    }
    
    @Override //TODO: pesquisar finalidade do hashCode.
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Roupa other = (Roupa) obj;
        if (categoria == null) {
            if (other.categoria != null)
                return false;
        } else if (!categoria.equals(other.categoria))
            return false;
        if (id != other.id)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Dados do produto:\nDescrição: " + descricao 
        + "\nCategoria: " + categoria 
        + "\nTamanho: " + tamanho 
        + "\nPreço unitário: R$ " + preco 
        + "\nID: " + getId();
    }
}
