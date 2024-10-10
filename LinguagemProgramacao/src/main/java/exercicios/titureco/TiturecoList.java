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

}
