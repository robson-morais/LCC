package segundaunidade;
import java.util.List;
import java.util.ArrayList;
public interface SistemaTarefas {

    ArrayList<Tarefa> pesquisarTarefasPorMes(int mes, int ano);
    void cadastrarTarefa(Tarefa tarefa);
}
