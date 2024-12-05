package exercicios.titureco;

import java.util.ArrayList;
import java.util.List;

public class TiturecoList {
    private List<AtrativoTuristico> atrativos;

    public TiturecoList(List<AtrativoTuristico> atrativos) {
        this.atrativos = atrativos;
    }
    public TiturecoList(){
        this.atrativos = new ArrayList<>();
    }

    public boolean cadastrarAtrativo(AtrativoTuristico atrativo){
        // TODO AtrativoJáExisteEsception;
        this.atrativos.add(atrativo);
        return true;
    }

    public boolean apagarAtrativo(String nome, String cidade, String estado){
        boolean achouAtrativoNaLista = false;
        for (AtrativoTuristico atrativo: this.atrativos){
            if (atrativo.getNome().equalsIgnoreCase(nome) && atrativo.getCidade().equalsIgnoreCase(cidade) && atrativo.getEstado().equalsIgnoreCase(estado)){
                this.atrativos.remove(atrativo);
                achouAtrativoNaLista = true;
                break;
            }
        }
        return achouAtrativoNaLista;
    }

    public List<AtrativoTuristico> getAtrativos(){
        return this.atrativos;
    }

    public List<AtrativoTuristico> pesquisarAtrativosDaCidade(String cidade, String estado){
        List<AtrativoTuristico> listaDeAtrativosDaCidade = new ArrayList<>();
        for (AtrativoTuristico atrativo: this.atrativos){
            if (atrativo.getCidade().equalsIgnoreCase(cidade) && atrativo.getEstado().equalsIgnoreCase(estado)){
                listaDeAtrativosDaCidade.add(atrativo);
            }
        }
        return listaDeAtrativosDaCidade;
    }
}
