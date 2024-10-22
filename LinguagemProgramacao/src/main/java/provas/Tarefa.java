package provas;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private String tipo;
    private DataSimples dataLimite;
    private String status;

    public Tarefa(String descricao, String tipo, DataSimples dataLimite, String status) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.dataLimite = dataLimite;
        this.status = status;
    }

    public Tarefa() {
        this("","",new DataSimples(0,0,0),"");
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

    public DataSimples getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(DataSimples dataLimite) {
        this.dataLimite = dataLimite;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override // Compara a descricao e a data limite dos objetos;
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao()) && Objects.equals(getDataLimite(), tarefa.getDataLimite());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao(), getDataLimite());
    }

    @Override
    public String toString() {
        return "Tarefa "+this.descricao+" da categoria "+this.tipo+" com status "+this.status;
    }

}
