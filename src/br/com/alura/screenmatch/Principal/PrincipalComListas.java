package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(7.5);
        Filme filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avalia(8.5);
        Serie lost = new Serie("Lost",2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);

        for (Titulo item : lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação : " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Tom Hanks");
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Leonardo DiCaprio");

        System.out.println("Antes da ordenação:");
        System.out.println(buscarPorArtista);

        System.out.println("Depois da ordenação:");
        Collections.sort(buscarPorArtista);
        System.out.println(buscarPorArtista);

        System.out.println("Lista de títulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista ordenada por Ano de Lançamento: ");
        System.out.println(lista);
    }
}
