package segundaunidade;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    private String descricao;
    private String tipo;
    private DataSimples dataLimite;
    private String Status;

    public Tarefa(String descricao, String tipo, DataSimples dataLimite, String status) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.dataLimite = dataLimite;
        Status = status;
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
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", dataLimite=" + dataLimite +
                ", Status='" + Status + '\'' +
                '}';
    }

}
