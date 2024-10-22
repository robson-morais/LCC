package Projeto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AnimeLista implements AnimeInterface {

    private List<Anime> animes;

    public AnimeLista(){
        this.animes = new ArrayList<>();
    }

    public AnimeLista(List<Anime> listaInicial) {
        this.animes = listaInicial;
    }

    public void cadastrarAnime(Anime anime) throws AnimeNaoExisteException {

        if(this.animes.contains(anime)){
            throw new AnimeNaoExisteException("Anime já existe");
        }else{
            this.animes.add(anime);
        }

    }
    public void pesquisarAnime(String titulo){
        ArrayList<Anime> anime = new ArrayList<>();
        boolean encontrou = false;
        for(Anime anim: this.animes){
            if(titulo.equalsIgnoreCase(anim.getTitulo()) ){
                anime.add(anim);
                encontrou = true;
                break;
            }
        }
        if(encontrou){
            JOptionPane.showMessageDialog(null, anime.toString());
        }else {
            JOptionPane.showMessageDialog(null, "Anime não encontrado!");
        }

    }

    public List<Anime> getAnime(){
        return this.animes;
    }

    public List<Anime> pesquisarAnimePorGenero(String genero) throws AnimeNaoExisteException{
        List<Anime> todosAnimes = new ArrayList<>();
        boolean achou = false;
        for(Anime anime: this.animes){
            if(anime.getGenero().toLowerCase().startsWith(genero) || anime.getGenero().toUpperCase().startsWith(genero)){
                todosAnimes.add(anime);
                achou = true;
            }
        }
        if(achou) {
            return todosAnimes;
        }
        throw new AnimeNaoExisteException("Nenhum Anime encontrado com esse gênero");
    }

    public List<Anime> pesquisarAnimePorAno(String ano) throws AnimeNaoExisteException{
        List<Anime> animesFound = new ArrayList<>();
        boolean found = false;
        for (Anime anime: this.animes){
            if (anime.getAno().equals(ano)){
                animesFound.add(anime);
                found = true;
            }
        }
        if (found){
            return animesFound;
        } throw new AnimeNaoExisteException("Nenhum anime lançado nesse ano foi encontrado.");
    }

    public boolean apagarAnime(String titulo, String ano){
        for(Anime ani: this.animes){
            if( titulo.equalsIgnoreCase(ani.getTitulo()) && ano.equals(ani.getAno()) ){
                this.animes.remove(ani);
                return true;
            }
        }
        return false;
    }

    @Override
    public void atualizarAnime(String tituloAtual, String novoTitulo, String novoAno, String novoGenero, String novoEps) throws AnimeNaoExisteException {
        boolean ok = false;
        for(Anime anime: this.animes){
            if(tituloAtual.equalsIgnoreCase(anime.getTitulo())){
                anime.setTitulo(novoTitulo);
                anime.setAno(novoAno);
                anime.setGenero(novoGenero);
                anime.setEpisodios(novoEps);
                ok = true;
                break;
            }
        }
        if(!ok){
            throw new AnimeNaoExisteException("Não foi possivel atualizar o Anime '"+tituloAtual+ "', pois não foi encontrado");
        }
    }

}//Fim da classe