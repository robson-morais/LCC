package exercicios.roupas;

import java.util.List;

public class TestaSistemaRoupasDeMaria {

    public static void main(String[] args) {

        SistemaRoupas sistema = new SistemaRoupasDeMaria();
        sistema.cadastrarRoupa("Bermuda Preta Hering", "Bermuda",
                "Preta","GG");
        sistema.cadastrarRoupa("Camiseta Marca", "Camiseta",
                "Azul","GG");
        System.out.println(sistema.contaRoupasDoTipo("Camiseta"));

        List<Roupa> roupasAzuis = sistema.pesquisarRoupasPorCor("Azul");
        for (Roupa r: roupasAzuis){
            System.out.println(r);
        }

        }
    }