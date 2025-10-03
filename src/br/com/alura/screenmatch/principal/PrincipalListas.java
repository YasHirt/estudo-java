package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalListas {
    public static void main(String[] args) {
        Serie minhaSerie = new Serie("The office", 2004, 30);
        Filme filmeDaYas = new Filme("Coraline", 2009, 80);
        Filme outroFilmeDaYas = new Filme("Mean Girls", 2004, 180);

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>(); //Parametrização da lista
        listaDeTitulos.add(outroFilmeDaYas);
        listaDeTitulos.add(minhaSerie);
        listaDeTitulos.add(filmeDaYas);
        System.out.println("Primeiro elemento da lista: " + listaDeTitulos.get(0).getNome());

        for (Titulo titulo : listaDeTitulos) {
            System.out.println(titulo.getNome());
        }
        
    }
}
