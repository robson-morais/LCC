package provas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas implements SistemaTarefas {

    private List<Tarefa> tarefas;

    public ListaTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public ListaTarefas() {
        this(new ArrayList<Tarefa>());
    }

    public void cadastrarTarefa(String descricao, String categoria, DataSimples prazoEstimado, String status) {
        this.tarefas.add(new Tarefa(descricao,categoria,prazoEstimado,status));
    }

    public void cadastrarTarefa(){
        this.tarefas.add(new Tarefa("","",new DataSimples(0,0,0),""));
    }

    public ArrayList<Tarefa> pesquisarTarefasParaOMes(int mes, int ano) {
        ArrayList<Tarefa> tarefasMes = new ArrayList<>();
        for (Tarefa tarefa: this.tarefas){
            if (tarefa.getDataLimite().getMes()==mes && tarefa.getDataLimite().getAno()==ano){
                tarefasMes.add(tarefa);
            }
        }
        return tarefasMes;
    }

    @Override
    public List<Tarefa> pesquisarTarefasDaCategoria(String categoria) {
        List<Tarefa> tarefasCategoria = new ArrayList<>();
        for (Tarefa t: this.tarefas){
            if (t.getStatus().equals(categoria)){
                tarefasCategoria.add(t);
            }
        }
        return tarefasCategoria;
    }

    @Override
    public List<Tarefa> pesquisarTarefasPorStatus(String statusTarefa) {
        List<Tarefa> tarefasStatus = new ArrayList<>();
        for (Tarefa t: this.tarefas){
            if (t.getStatus().equals(statusTarefa)){
                tarefasStatus.add(t);
            }
        }
        return tarefasStatus;
    }

    @Override
    public void atualizarStatusDeTarefa(String descricao, String novoStatusTarefa) {
        for (int k=0;k<tarefas.size();k++){
            Tarefa tarefa = this.tarefas.get(k);
            if (tarefa.getDescricao().equals(descricao)){
                tarefa.setStatus(novoStatusTarefa);
            }
        }

    }

    @Override
    public Tarefa pesquisarTarefaPorDescricao(String descricao) {
        return null;
    }

}
