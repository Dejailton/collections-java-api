package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itemList;

    public CarrinhoCompras () {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    public double calcularValorTotal() {
            double valorTotal = 0d;
            if (!itemList.isEmpty()) {
                for (Item item : itemList) {
                    double valorItens = item.getPreco() * item.getQuantidade();
                    valorTotal += valorItens;
                }
                return valorTotal;
            } else {
                throw new RuntimeException("A lista está vazia!");
            }
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        carrinhoCompras.adicionarItem("melancia", 1.5, 2);
        carrinhoCompras.adicionarItem("cafe", 8.5, 1);
        carrinhoCompras.adicionarItem("leite", 5.60, 1);
        carrinhoCompras.removerItem("melancia");
        carrinhoCompras.exibirItens();
        System.out.println("O valor total dos itens é: " + carrinhoCompras.calcularValorTotal());
    }
}
