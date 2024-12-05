package exercicios.titureco;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProgramaTitureco {
    public static void main (String [] args){

        //Iniciando a lista de atrativos;
        List<AtrativoTuristico> listaDeAtrativos = new ArrayList<>();
        TiturecoList lista = new TiturecoList(listaDeAtrativos);

        //Instanciando um novo objeto do tipo AtrativoTuristico de diferentes formas:
        AtrativoTuristico atrativo1 = new AtrativoTuristico("Paróquia Santa Rita de Cássia",-01.234567,-89.012345,"Praça João Pessoa, Centro, 15","Rio Tinto","Paraíba");

        String nome2 = "Cataratas do Iguaçu";
        double latitude2 = -25.69527;
        double longitude2 = -54.43667;
        String comoChegar2 = "Avenida das Cataratas";
        String cidade2 =  "Foz do Iguaçu";
        String esado2 = "Paraná";
        AtrativoTuristico atrativo2 = new AtrativoTuristico(nome2,latitude2,longitude2,comoChegar2,cidade2,esado2);

        //Objetos do tipo Praia:
        AtrativoTuristico praia1 = new Praia("Praia do Futuro", -3.73270, -38.47153, "Avenida Zezé Diogo", "Fortaleza", "Ceará", true, false, "Orla2");
        String nome3 = "Praia de Ipanema";
        double latitude3 = -22.98356;
        double longitude3 = -43.20473;
        String comoChegar3 = "Avenida Vieira Souto";
        String cidade3 = "Rio de Janeiro";
        String estado3 = "Rio de Janeiro";
        boolean ehPropriaParaBanho = false;
        boolean temTubarao = true;
        String orla3 = "Orla2";
        Praia praia3 = new Praia(nome3, latitude3, longitude3, comoChegar3, cidade3, estado3,ehPropriaParaBanho,temTubarao,orla3);


        // Cadastrar um atrativo turístico:
        lista.cadastrarAtrativo(atrativo1);
        lista.cadastrarAtrativo(atrativo2);
        lista.cadastrarAtrativo(new AtrativoTuristico("Cristo Redentor", -22.95191, -43.21049, "Rua Cosme Velho", "Rio de Janeiro", "Rio de Janeiro"));
        lista.cadastrarAtrativo(praia1);
        lista.cadastrarAtrativo(praia3);
        lista.cadastrarAtrativo(new Praia("Praia do Sancho", -3.85442, -32.42306, "Baía do Sancho", "Fernando de Noronha", "Pernambuco",true,false,"Orla4"));
        lista.cadastrarAtrativo(new AtrativoTuristico("Pão de Açúcar", -22.94837, -43.15648, "Avenida Pasteur", "Rio de Janeiro", "Rio de Janeiro"));


        // Mostrando a lista de atrativos:
        JOptionPane.showMessageDialog(null,lista.getAtrativos());

        //Apagando um atrativo da lista:
        lista.apagarAtrativo("Cristo Redentor","Rio de Janeiro", "Rio de Janeiro");

        //Mostrando a lista sem o item apagado:
        JOptionPane.showMessageDialog(null, lista.getAtrativos());

        List<AtrativoTuristico> atrativosDaCidade = lista.pesquisarAtrativosDaCidade("Rio de janeiro", "rio de janeiro");
        JOptionPane.showMessageDialog(null,atrativosDaCidade);


    }
}