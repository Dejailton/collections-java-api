package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordernarPorAltura () {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Rafael", 34, 1.98);
        ordenacaoPessoas.adicionarPessoa("Pedro", 28, 1.73);
        ordenacaoPessoas.adicionarPessoa("Luan", 23, 2.10);

        System.out.println("A ordem por idade é:");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println("A ordem por altura é:");
        System.out.println(ordenacaoPessoas.ordernarPorAltura());

    }
}
