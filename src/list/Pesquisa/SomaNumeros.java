package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;

    public SomaNumeros () {
        this.numeroList = new ArrayList<>();
    }
    public void adicionarNumero(int numero) {
        numeroList.add(numero);
    }
    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeroList)
            soma += numero;
        return soma;
    }
    public int encontrarMaiorNumero() {
        int maiorNumeroList = Integer.MIN_VALUE;
        if (!numeroList.isEmpty()) {
            for (Integer numero : numeroList) {
                if (numero > maiorNumeroList) {
                    maiorNumeroList = numero;
                }
            }
        } else {
            System.out.println("A lista está vazia!");
        }
        return maiorNumeroList;
    }

    public int encontrarMenorNumero() {
        int menorNumeroList = Integer.MAX_VALUE;
        if(!numeroList.isEmpty()) {
            for (Integer numero : numeroList) {
                if (numero <= menorNumeroList) {
                    menorNumeroList = numero;

                }
            }

        } else {
            System.out.println("A lsita está vazia!");
        }
        return menorNumeroList;
    }
    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println("Lista: " + numeroList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(-1);

        somaNumeros.exibirNumeros();

        System.out.println("A soma dos números da lista é: " + somaNumeros.calcularSoma());

        System.out.println("O maior número da lista é: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("O menor número da lista é: " + somaNumeros.encontrarMenorNumero());

    }
}
