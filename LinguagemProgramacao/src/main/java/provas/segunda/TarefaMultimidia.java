package provas.segunda;

public class TarefaMultimidia {
    private String urlVideo;

    public TarefaMultimidia(String descricao, String categoria, String urlVideo, DataSimples prazo) {
        this(descricao, categoria, urlVideo, prazo);
        this.urlVideo = urlVideo;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }
}
