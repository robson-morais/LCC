package provas;

import java.util.Objects;

public class DataSimples {
    private int dia;
    private int mes;
    private int ano;

    public DataSimples(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "DataSimples {" + this.dia + "/" + this.mes + "/" + this.ano+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataSimples that)) return false;
        return getDia() == that.getDia() && getMes() == that.getMes() && getAno() == that.getAno();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDia(), getMes(), getAno());
    }
}