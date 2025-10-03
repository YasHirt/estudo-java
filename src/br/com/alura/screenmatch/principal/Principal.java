package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.Calculadora;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Serie minhaSerie = new Serie("The office", 2004, 30);
        Calculadora calculadora = new Calculadora();
        Episodio episodio = new Episodio();
       
        Filme filmeDaYas = new Filme("Coraline", 2009, 80);
        Filme outroFilmeDaYas  = new Filme("Mean Girls", 2004, 180);
       
        filmeDaYas.avalia(10);
        
        
      
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodioPorTemporada(15);
        minhaSerie.setMinutosPorEpisodio(30);

        calculadora.inclui(minhaSerie);
        minhaSerie.exibeFichaTecnica();
        System.out.println("Tempo para maratonar: " + minhaSerie.getDuracaoEmMinutos());
        
        episodio.setNumero(01);
        episodio.setSerie(minhaSerie);
        episodio.setNome("Primeiro episódio");
        episodio.setVisualizacoes(100);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.Filtra(minhaSerie);
        filtro.Filtra(episodio);

       ArrayList<Filme> listaDeFilmes = new ArrayList<>(); //Lista de filmes é uma instancia da classe ArrayList, sendo uma lista que armazena objetos do tipo Filme
       listaDeFilmes.add(filmeDaYas);
       listaDeFilmes.add(outroFilmeDaYas);

       System.out.println(listaDeFilmes.size()); //Quantos elementos foram adcionados
       System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
       System.out.println(listaDeFilmes);
       
    
    }
}