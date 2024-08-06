package map.OperacaoBasica;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("O dicionário não possui nenhuma palavra.");
        }
    }
    public void exibirPalabras() {
        if(!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("O dicionário não possui nenhuma palavra.");
        }
    }
    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionarioMap.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Linguagem não encontrada no dicionário.";
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Café", "Classe gramatical: adjetivo de dois gêneros e dois números e substantivo masculino\n" +
                "Separação silábica: ca-fé\n" +
                "Plural: cafés");
        dicionario.adicionarPalavra("Teclado", "Classe gramatical: substantivo masculino\n" +
                "Flexão do verbo teclar no: particípio\n" +
                "Separação silábica: te-cla-do\n" +
                "Plural: teclados");
        dicionario.adicionarPalavra("Monitor", "Classe gramatical: substantivo masculino\n" +
                "Separação silábica: mo-ni-tor\n" +
                "Plural: monitores\n" +
                "Feminino: monitora");
        dicionario.exibirPalabras();
        System.out.println("Pesquisar por palavra");
        System.out.println(dicionario.pesquisarPorPalavra("Café"));
        //remover palavra
        dicionario.removerPalavra("Café");
        dicionario.exibirPalabras();

    }
}
