package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalListas {
    public static void main(String[] args) {
        Serie minhaSerie = new Serie("The office", 2010, 30);
        Filme filmeDaYas = new Filme("Coraline", 2009, 80);
        Filme outroFilmeDaYas = new Filme("Mean Girls", 2004, 180);

        filmeDaYas.avalia(10);
        outroFilmeDaYas.avalia(8);
        minhaSerie.avalia(10);

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>(); //Parametrização da lista
        listaDeTitulos.add(minhaSerie);
        listaDeTitulos.add(filmeDaYas);
        listaDeTitulos.add(outroFilmeDaYas);
        
        
       
        System.out.println("Primeiro elemento da lista: " + listaDeTitulos.get(0).getNome());

        for (Titulo titulo : listaDeTitulos) { //para cada variavel titulo em listaDeTitulos
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme) {
                 System.out.println("Classificacao: " + ((Filme)titulo).getClassificado());
            }
            else if (titulo instanceof Serie) {
                System.out.println("Classificacao: " + ((Serie)titulo).getClassificado());
            }
           
        }
         ArrayList<String> BuscaPorArtista = new ArrayList<>();
         BuscaPorArtista.add("Adam Sandler");
         BuscaPorArtista.add("Yasmin Hirt");
         BuscaPorArtista.add("Alex Turner");
         BuscaPorArtista.add("Harry Potter");

         System.out.println(BuscaPorArtista);
         Collections.sort(BuscaPorArtista);
         System.out.println("Depois da ordenação: " + BuscaPorArtista);

        System.out.println("Antes da ordenação: ");
        System.out.println(listaDeTitulos);

        Collections.sort(listaDeTitulos); //ordenando com base nos meus critérios

        System.out.println("Depois da ordenação: ");
        System.out.println(listaDeTitulos);

        

    }
}
