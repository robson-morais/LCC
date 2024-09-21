package provas.segunda;

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

    @Override
    public ArrayList<Tarefa> pesquisarTarefasPorMes(int mes, int ano) {
        ArrayList<Tarefa> tarefasMes = new ArrayList<>();
        for (Tarefa tarefa: this.tarefas){
            if (tarefa.getDataLimite().getMes()==mes && tarefa.getDataLimite().getAno()==ano){
                tarefasMes.add(tarefa);
            }
        }
        return tarefasMes;
    }

    @Override
    public void cadastrarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }
}
