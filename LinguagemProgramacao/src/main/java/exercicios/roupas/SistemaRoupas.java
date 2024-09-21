package exercicios.roupas;

import java.util.List;

public interface SistemaRoupas {
    public void cadastrarRoupa(String descricao, String tipo,
                               String cor, String tamanho);
    public List<Roupa> pesquisarRoupasPorCor(String cor);
    public Roupa pesquisarRoupaPorDescricao(String descricao);
    public boolean existeRoupaDaCor(String cor);
    public int contaRoupasDoTipo(String tipo);

    // POLIMORFISMO: funcionalidade que permite que cada método
    // implemente a interface de forma diferente.
}
