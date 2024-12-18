package exercicios.amigoSecreto;

import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {

    private List<Mensagem> mensagens;
    private List<Amigo> amigos;

    public SistemaAmigo (List<Mensagem> mensagens, List<Amigo> amigos) {
        this.mensagens = mensagens;
        this.amigos = amigos;
    }

    public SistemaAmigo() {
        //TODO Auto-generated constructor stub
    }


    public void cadastraAmigo (String nomeAmigo, String emailAmigo) throws AmigoJaExisteException {
        if (amigoExiste(emailAmigo)) {
            throw new AmigoJaExisteException("Amigo já existe na lista");
        } else {
            this.amigos.add(new Amigo(nomeAmigo, emailAmigo, ""));
        }
    }


    public Amigo pesquisaAmigo (String email) throws AmigoInexistenteException {
        if (amigoExiste(email)) {
            Amigo amigoEncontrado = null;
            for (Amigo amigo: this.amigos) {
                if (amigo.getEmail().equalsIgnoreCase(email)) {
                    amigoEncontrado = amigo;
                    break;
                }
            } return amigoEncontrado;
        } else {
            throw new AmigoInexistenteException("Amigo inexistente");
        }
    }


    public void enviarMensagemParaTodos (String texto, String emailRemetente, boolean ehAnonima) {
        if (ehAnonima){
            System.out.println("De: " + emailRemetente + "\nPara @Todos\n" + texto);
        }
    }


    public void enviarMensagemParaAlguem (String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima) {
        if (ehAnonima){
            System.out.println("De: " + emailRemetente + "\nPara: " + emailDestinatario + "\n" + texto);
        }
    }


    public List<Mensagem> pesquisaMensagensAnonimas () {
        List<Mensagem> mensagensAnonimas = new ArrayList<>();
        for (Mensagem mensagem: this.mensagens) {
            if (mensagem.ehAnonima()) {
                mensagensAnonimas.add(mensagem);
            }
        } return mensagensAnonimas;
    }


    public List<Mensagem> pesquisaTodasAsMensagens () {
        return this.mensagens;
    }


    public void configuraAmigoSecretoDe (String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
        if (amigoExiste(emailDaPessoa)) {
            
            for (Amigo amigo: this.amigos) {

                if (amigo.getEmail().equalsIgnoreCase(emailDaPessoa)) {
                    amigo.setEmailAmigoSorteado(emailAmigoSorteado);
                }
                break;
            }
        } else {
            throw new AmigoInexistenteException("Amigo não encontrado na lista");
        }

    }


    public String pesquisaAmigoSecretoDe (String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException {

        // As informações desejadas serão impressas na seguinte String:
        String amigoSecreto = "";

        // Verifica se o amigo procurado está na lista:
        if (amigoExiste(emailDaPessoa)) {

            for (Amigo amigo: this.amigos) {

                if (amigo.getEmailAmigoSorteado() == null) {
                    throw new AmigoNaoSorteadoException("Amigo sorteado não encontrado");
                } else if (amigo.getEmail().equalsIgnoreCase(emailDaPessoa)) {
                    amigoSecreto = "Email do amigo secreto de {" + amigo.getNome() + "} = {" + amigo.getEmailAmigoSorteado() + "}\n";
                } break;

            } return amigoSecreto;
            
        // Se o amigo não está na lista:
        } else {
            throw new AmigoInexistenteException("Amigo não econtrado na lista");
        }
    }


    public boolean amigoExiste(String emailAmigo) {
        boolean estaNaLista = false; 
        for (Amigo amigo: this.amigos) {
            if (amigo.getEmail().equalsIgnoreCase(emailAmigo)) {
                estaNaLista = true;
            }
        } return estaNaLista;
    }
}
