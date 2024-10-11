package Projeto;

import java.util.List;

public interface AnimeInterface {

    public void cadastrarAnime(Anime anime)throws AnimeNaoExisteException;
    void pesquisarAnime(String titulo);
    List<Anime> pesquisarAnimePorGenero(String genero) throws AnimeNaoExisteException;
    List<Anime> pesquisarAnimePorAno(String ano) throws AnimeNaoExisteException;
    List<Anime> getAnime();
    boolean apagarAnime(String titulo, String ano);
    void atualizarAnime(String tituloAtual, String anoAtual, String novoTitulo, String novoAno, String novoGenero) throws AnimeNaoExisteException;
}

