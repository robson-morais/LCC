package provas.segunda;
import java.util.ArrayList;
import java.util.List;

public interface SistemaTarefas {

    public void cadastrarTarefa(String descricao, String categoria, DataSimples prazoEstimado,String status);
    public List<Tarefa> pesquisarTarefasDaCategoria(String categoria);
    public List<Tarefa> pesquisarTarefasParaOMes(int mes, int ano);
    public List<Tarefa> pesquisarTarefasPorStatus(String statusTarefa);
    public void atualizarStatusDeTarefa(String descricao, String novoStatusTarefa);
    public Tarefa pesquisarTarefaPorDescricao(String descricao);
}