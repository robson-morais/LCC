package Projeto;

import java.util.Objects;

public class Anime {
    private String titulo;
    private String ano;
    private String genero; //ex: açao, comedia, artes marciais
    private String episodios;


    public Anime(String titulo, String ano, String genero, String episodios){
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.episodios = episodios;
    }

    public Anime(){
        this("", "0000", "","");
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String novoTitulo){
        this.titulo = novoTitulo;
    }

    public String getAno(){
        return this.ano;
    }
    public void setAno(String novoAno){
        this.ano = novoAno;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String novoGenero){
        this.genero = novoGenero;
    }

    public String getEpisodios(){
        return this.episodios;
    }
    public void setEpisodios(String episodios){
        this.episodios = episodios;
    }


    public String toString(){
        return  "'"+this.getTitulo()+"'"+"   Ano: "+this.getAno()+"   Genero: "+ this.getGenero()+"   Episodios: "+ this.episodios+"\n";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Anime anime = (Anime) o;

        return Objects.equals(titulo, anime.titulo);
    }

    @Override
    public int hashCode() {
        return titulo != null ? titulo.hashCode() : 0;
    }
}
