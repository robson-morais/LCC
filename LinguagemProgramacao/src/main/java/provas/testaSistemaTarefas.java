package provas;

import java.util.List;

public class testaSistemaTarefas {
    public static void main(String[] args) {
        ListaTarefas sistema = new ListaTarefas();
        sistema.cadastrarTarefa("Estudar LP","Estudo",new DataSimples(9,10,2024),"TO DO");
        sistema.cadastrarTarefa("Tarefa 2","Tipo 1",new DataSimples(9,8,2024),"TO DO");
        sistema.cadastrarTarefa("Tarefa 3","Tipo 2",new DataSimples(9,8,2024),"TO DO");

        List<Tarefa> tarefasMes = sistema.pesquisarTarefasParaOMes(10,2024);
        System.out.println("Tarefas por mês: ");
        for (Tarefa tarefa: tarefasMes){
            System.out.println(tarefa.toString());
        }

        List<Tarefa> tarefasCategoria = sistema.pesquisarTarefasDaCategoria("Estudo");
        System.out.println("Tarefas por categoria: ");
        for (Tarefa tarefa: tarefasCategoria){
            System.out.println(tarefa.toString());
        }
        }
    }