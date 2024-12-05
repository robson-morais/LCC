package exercicios.agenda;

public class Email {
    
    private String nome;
    private String sobreNome;
    private String dominio;

    public Email(String nome, String sobrenome, String dominio){
        this.nome = nome;
        this.sobreNome = sobrenome;
        this.dominio = dominio;
    }

    public Email(){
        this("","","");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }
    
    public String toString(){
        return this.nome+"."+this.sobreNome+"@"+this.dominio+".com";
    }
}
