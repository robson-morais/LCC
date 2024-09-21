package exercicios.roupas;

import java.util.ArrayList;
import java.util.List;

public class SistemaRoupasDeMaria implements SistemaRoupas {

    private List<Roupa> roupas;

    public SistemaRoupasDeMaria() {
        this.roupas = new ArrayList<>();
    }
    public void cadastrarRoupa(String descricao, String tipo, String cor,
                               String tamanho, double preco, String codigo) {
        Roupa roupa = new Roupa(descricao, tipo, cor, tamanho, preco, codigo);
        this.roupas.add(roupa);


    }

    @Override
    public void cadastrarRoupa(String descricao, String tipo, String cor, String tamanho) {

    }

    public List<Roupa> pesquisarRoupasPorCor(String cor) {
        List<Roupa> lista = new ArrayList<>();
        for (Roupa roupa : this.roupas) {
            if (roupa.getCor().equals(cor)) {
                lista.add(roupa);
            }
        }
        return lista;
    }

    @Override
    public Roupa pesquisarRoupaPorDescricao(String descricao) {
        for (Roupa r: this.roupas){
            if (r.getDescricao().equals(descricao)){
                return r;
            }
        }
        return null;
    }

    @Override
    public boolean existeRoupaDaCor(String cor) {
        for (Roupa r: this.roupas){
            if (r.getCor().equals(cor)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int contaRoupasDoTipo(String tipo) {
        int cont = 0;
        for (Roupa r: this.roupas){
            if(r.getTipo().equals(tipo)){
                cont++;
            }
        }
        return cont;
    }



}