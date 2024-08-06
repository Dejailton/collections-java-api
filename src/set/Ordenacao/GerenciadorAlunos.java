package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }
    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for(Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
    public void exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        if(!alunoSet.isEmpty()) {
            System.out.println(alunoPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
    public void exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunoSet.isEmpty()) {
            alunoPorNota.addAll(alunoSet);
            System.out.println(alunoPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
    public void exibirAlunos() {
        if(!alunoSet.isEmpty()) {
            System.out.println(alunoSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("dejailton", 2L, 10);
        gerenciadorAlunos.adicionarAluno("rafael", 5L, 9.5);
        gerenciadorAlunos.adicionarAluno("josé", 2L, 9.5);
        gerenciadorAlunos.adicionarAluno("josé", 9L, 6.5);

        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(9L);
        System.out.println("Aluno josé foi removido!");

        System.out.println("Exibindo alunos por nome:");
        gerenciadorAlunos.exibirAlunosPorNome();

        System.out.println("Exibindo alunos por nome:");
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
