package exercicios.titureco;

import java.util.Objects;

public class AtrativoTuristico {
    private String nome;
    private String latitude;
    private String longitude;
    private String comoChegar;
    private String cidade;
    private String estado;

    public AtrativoTuristico(){
        this("","","","","","");
    }
    public AtrativoTuristico(String nome, String latitude, String longitude, String comoChegar, String cidade, String estado){
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.comoChegar = comoChegar;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtrativoTuristico that)) return false;
        return Objects.equals(getNome(), that.getNome()) && Objects.equals(getLatitude(), that.getLatitude()) && Objects.equals(getLongitude(), that.getLongitude()) && Objects.equals(getComoChegar(), that.getComoChegar()) && Objects.equals(getCidade(), that.getCidade()) && Objects.equals(getEstado(), that.getEstado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getLatitude(), getLongitude(), getComoChegar(), getCidade(), getEstado());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getComoChegar() {
        return comoChegar;
    }

    public void setComoChegar(String comoChegar) {
        this.comoChegar = comoChegar;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
