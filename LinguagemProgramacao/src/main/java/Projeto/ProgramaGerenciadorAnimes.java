package Projeto;
import Projeto.*;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class ProgramaGerenciadorAnimes {
    public static void main(String [] args) throws AnimeNaoExisteException {
        
        AnimeInterface sistemaAnime = null;
        GravadorAnimes gravador = new GravadorAnimes();
        try {
            List<Anime> AnimesRecuperados = gravador.lerAnimes();
            //JOptionPane.showMessageDialog(null, "Animes recuperados");
            sistemaAnime = new AnimeLista(AnimesRecuperados);
        }catch (IOException e){
            sistemaAnime = new AnimeLista();
            //JOptionPane.showMessageDialog(null, "Sistema iniciado, Animes não recuperados\n\ndetalhe do erro: "+ e.getMessage());

        }

        AnimeLista animeLista = new AnimeLista();
        int rodando = 1;
        while(rodando != 6 ){
            rodando = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1) - Cadastrar anime\n2) - Pesquisar anime\n3) - Atualizar anime\n4) - Buscar todos animes do sistema\n5) - Apagar Anime do sistema\n6) - Sair"));
            if(rodando == 1){
                String titulo = JOptionPane.showInputDialog("Digite Titulo do Anime: ");
                String ano = JOptionPane.showInputDialog("Ano de lançamento do anime: ");
                String genero = JOptionPane.showInputDialog("Genero: ");
                String episodios = JOptionPane.showInputDialog("Quantos episodios possui o anime? ");
                Anime anime = new Anime(titulo,ano,genero, episodios);
                try {
                    sistemaAnime.cadastrarAnime(anime);
                    JOptionPane.showMessageDialog(null, "Anime cadastrado com sucesso!");
                }catch (AnimeNaoExisteException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else if (rodando == 2){
                //rodando = 4
                int pesquisar = 1;
                while (pesquisar != 4){
                    pesquisar = Integer.parseInt(JOptionPane.showInputDialog("1) Pesquisar por título\n2) Pesquisar por Gênero\n3) Pequisar por ano de lançamento\n4) Voltar"));
                    if (pesquisar == 1){
                        String titulo = JOptionPane.showInputDialog("Titulo do Anime: ");
                        sistemaAnime.pesquisarAnime(titulo);
                    } else if(pesquisar == 2){
                        String genero1 = JOptionPane.showInputDialog("Digite gênero do Anime: ");
                        try {
                            JOptionPane.showMessageDialog(null, sistemaAnime.pesquisarAnimePorGenero(genero1));
                        }catch (AnimeNaoExisteException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    } else if (pesquisar == 3){
                        String ano1 = JOptionPane.showInputDialog("Digite o ano de lançamento do anime: ");
                        try {
                            JOptionPane.showMessageDialog(null, sistemaAnime.pesquisarAnimePorAno(ano1));
                        } catch (AnimeNaoExisteException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                }
                
            } else if(rodando == 3){
                String titulo = JOptionPane.showInputDialog("Qual o Titulo do anime: ");
                String novoTitulo = JOptionPane.showInputDialog("Atualizando...\nNovo Titulo: ");
                String  novoAno = JOptionPane.showInputDialog("Novo ano de Lançamento: ");
                String  novoGenero = JOptionPane.showInputDialog("Novo Genero: ");
                String  novoEPs = JOptionPane.showInputDialog("Quantidade de epidosodios: ");
                try {
                    sistemaAnime.atualizarAnime(titulo, novoTitulo, novoAno, novoGenero, novoEPs);
                    JOptionPane.showMessageDialog(null, "Anime Atualizado com sucesso!");
                } catch (AnimeNaoExisteException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }

            } else if(rodando == 4){
                JOptionPane.showMessageDialog(null, sistemaAnime.getAnime().toString());
            } else if(rodando == 5){
                String titulo = JOptionPane.showInputDialog("Titulo do Anime: ");
                String ano = JOptionPane.showInputDialog("Ano de lançamento do anime: ");
                boolean apagou = sistemaAnime.apagarAnime(titulo,ano);
                if(apagou){
                    JOptionPane.showMessageDialog(null, "Anime apagado do sistema!");
                }else{
                    JOptionPane.showMessageDialog(null, "Anime nao encotrado no sistema! tente de novo");
                }

            } try {
                gravador.gravaAnimes(sistemaAnime.getAnime());
                //JOptionPane.showMessageDialog(null, "Animes salvos com sucesso!");
            } catch (IOException e){
                JOptionPane.showMessageDialog(null, "Houve um problema ao salva Animes. Detalhe do erro: "+ e.getMessage());
            }
        }
    }
}