package exercicios.titureco;

import java.util.List;

public interface TiturecoInterface {
    boolean cadastrarAtrativoTuristico(AtrativoTuristico atrativo);
    boolean ApagarAtrativoTuristico(AtrativoTuristico atrativoTuristico);
    List<AtrativoTuristico> getAtrativos();
    List<AtrativoTuristico> pesquisarAtrativosDaCidade(String cidade, String estado);

}
