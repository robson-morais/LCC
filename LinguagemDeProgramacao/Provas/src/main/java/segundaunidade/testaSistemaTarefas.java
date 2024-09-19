package segundaunidade;

import java.util.ArrayList;
import java.util.List;

public class testaSistemaTarefas {
    public static void main(String[] args) {
        ListaTarefas sistema = new ListaTarefas();
        Tarefa t1 = new Tarefa("Estudar LP","Estudo",new DataSimples(9,10,2024),"TO DO");
        Tarefa t2 = new Tarefa("Tarefa 2","Estudo",new DataSimples(9,8,2024),"TO DO");
        Tarefa t3 = new Tarefa("Tarefa 3","Estudo",new DataSimples(9,8,2024),"TO DO");

        sistema.cadastrarTarefa(t1);
        sistema.cadastrarTarefa(t2);
        sistema.cadastrarTarefa(t3);

        ArrayList<Tarefa> tarefasMes = sistema.pesquisarTarefasPorMes(8,2024);
        for(Tarefa tarefa: sistema){

        }
    }
}
