package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra) {
        palavraSet.add(palavra);
    }
    public void removerPalavra(String palavra) {
        if (!palavraSet.isEmpty()) {
            if (palavraSet.contains(palavra)) {
                palavraSet.remove(palavra);
            } else {
                System.out.println("A palavra não está no conjunto!");
            }
        } else {
            System.out.println("O conjunto de palavras está vazio!");
        }
    }
    public boolean verificarPalavra(String palavra) {
        return palavraSet.contains(palavra);
    }
    public void exibirPalavra() {
        if (!palavraSet.isEmpty()) {
            System.out.println(palavraSet);
        } else {
            System.out.println("O conjunto de palavras está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Nome");
        conjuntoPalavrasUnicas.adicionarPalavra("Português");
        conjuntoPalavrasUnicas.adicionarPalavra("Programação");

        conjuntoPalavrasUnicas.exibirPalavra();
        System.out.println("A palavra Português está no conjunto de palavras? " + conjuntoPalavrasUnicas.verificarPalavra("Português"));
        conjuntoPalavrasUnicas.removerPalavra("Português");
        conjuntoPalavrasUnicas.exibirPalavra();
        System.out.println("A palavra Português está no conjunto de palavras? " + conjuntoPalavrasUnicas.verificarPalavra("Português"));
    }
}
