package list.pesquisa;

import java.util.ArrayList;
import java.util.List;


public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros () {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloAnos.add(l);
                }
            }
        }
        return livroPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }

            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Java: como programar","Paul Deitel, Harvey Deitel", 1996);
        catalogoLivros.adicionarLivro("Java: como programar","Paul Deitel, Harvey Deitel", 1998); //anoPublicacao falso
        catalogoLivros.adicionarLivro("Java: como programar","Paul Deitel, Harvey Deitel", 2000); //anoPublicacao falso
        catalogoLivros.adicionarLivro("Fundamentos de Programação em JAVA","Antonio José Mendes, Maria José Marcelino", 2012);
        catalogoLivros.adicionarLivro("Java para Iniciantes: Crie, Compile e Execute Programas Java Rapidamente","Herbert Schildt", 2015);
        System.out.println("Pesquisa por autor:");
        System.out.println(catalogoLivros.pesquisarPorAutor("Paul Deitel, Harvey Deitel"));

        System.out.println("Pesquisa por título:");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java: como programar"));

        System.out.println("Pesquisa por ano:");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1996, 2015));
    }
}
