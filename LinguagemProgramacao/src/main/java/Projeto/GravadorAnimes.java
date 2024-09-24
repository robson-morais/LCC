package Projeto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GravadorAnimes {

    private String arquivosAnimes;

    public GravadorAnimes(String arquivosAnimes){
        this.arquivosAnimes = arquivosAnimes;
    }
    public GravadorAnimes(){
        this("Animes.txt");
    }

    public void gravaAnimes(List<Anime> animes) throws IOException{
        BufferedWriter escritor = null;
        try {
            escritor = new BufferedWriter(new FileWriter(this.arquivosAnimes));
            for(Anime a: animes){
                String linhaDoAnime = a.getTitulo()+"#"+a.getAno()+"#"+a.getGenero()+"#"+a.getEpisodios();
                escritor.write(linhaDoAnime+"\n");
            }
        }finally {
            if (escritor!= null){
                escritor.close();
            }
        }
    }//Fim do gravaAnimes

    public List<Anime> lerAnimes () throws IOException{
        BufferedReader leitor = null;
        try {
            leitor = new BufferedReader(new FileReader(this.arquivosAnimes));
            List<Anime> lista = new ArrayList<>();
            String linhaLida = null;

            do{
                linhaLida = leitor.readLine();
                if(linhaLida != null) {
                    String[] dados = linhaLida.split("#");
                    Anime anime1 = new Anime(dados[0], dados[1], dados[2], dados[3]);
                    lista.add(anime1);
                }
            }while (linhaLida != null);
                return lista;
        }finally{
            if (leitor!=null){
                leitor.close();
            }
        }
    }

}//Fim da class
