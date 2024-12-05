package Projeto;

public class AnimeNaoExisteException extends Exception {
    public AnimeNaoExisteException(String msg){
        super(msg);
    }
    public AnimeNaoExisteException(){
        super();
    }
}
