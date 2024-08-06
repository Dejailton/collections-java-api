package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa c : tarefaSet) {
                if (c.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = c;
                    break;
                } else {
                    System.out.println("A tarefa não foi encontrada!");
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("A lista de tarefas está vazia!");
        }
    }
    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("A lista de tarefas está vazia!");
        }
    }
    public int contarTarefas() {
            return tarefaSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.tarefaConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes() {
       Set<Tarefa> tarefasPendentes = new HashSet<>();
       for (Tarefa t : tarefaSet) {
           if (!t.tarefaConcluida()) {
               tarefasPendentes.add(t);
           }
       }
       return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao) {
        for( Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setEstado(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarPendente != null) {
            if (tarefaParaMarcarPendente.tarefaConcluida()) {
                tarefaParaMarcarPendente.setEstado(false);
            }
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }
    public void limparListaTarefas() {
        if (tarefaSet.isEmpty()) {
            System.out.println("A lista de tarefas já está vazia!");
        } else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Estudar mais Python");
        listaTarefas.adicionarTarefa("Estudar mais Java");
        listaTarefas.adicionarTarefa("Estudar mais POO");
        listaTarefas.adicionarTarefa("Estudar mais Collections Framework API Java");

        listaTarefas.exibirTarefas();
        listaTarefas.removerTarefa("Estudar mais Collections Framework API Java");
        listaTarefas.exibirTarefas();

        System.out.println("Total de tarefa(s):" + listaTarefas.contarTarefas());
        listaTarefas.marcarTarefaConcluida("Estudar mais POO");
        System.out.println("Tarefa(s) concluida(s): " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefa(s) pendente(s): " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Estudar mais POO");
        listaTarefas.exibirTarefas();
        System.out.println("Tarefa(s) pendente(s): " + listaTarefas.obterTarefasPendentes());

        //limpando a lista de tarefas:
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
