package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contadorPalavras;

    public ContagemPalavras() {
        this.contadorPalavras = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem) {
        contadorPalavras.put(palavra, contagem);
    }
    public void removerPalavra(String palavra) {
        if(!contadorPalavras.isEmpty()) {
            contadorPalavras.remove(palavra);
        } else {
            System.out.println("O map está vazio!");
        }
    }
    //proposta inicial do método
    public void exibirContagemPalavras() {
        if(!contadorPalavras.isEmpty()) {
            System.out.println(contadorPalavras);
        } else {
            System.out.println("O map está vazio!");
        }
    }
    //proposta alterada do método
    public int exibirContagemTotalPalavras() {
        int contagemTotal = 0;
        for( int contagem : contadorPalavras.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }
    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrenquente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : contadorPalavras.entrySet()) {
            if(entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrenquente = entry.getKey();
            }
        }
        return palavraMaisFrenquente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Café", 2);
        contagemPalavras.adicionarPalavra("Monitor", 8);
        contagemPalavras.adicionarPalavra("Teclado", 1);
        contagemPalavras.adicionarPalavra("Lanterna", 6);
        contagemPalavras.exibirContagemPalavras();
        System.out.println("Existem " + contagemPalavras.exibirContagemTotalPalavras() + " palavras!");
        String palavraMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("A palavra mais frequente é: " + palavraMaisFrequente);
    }
}
