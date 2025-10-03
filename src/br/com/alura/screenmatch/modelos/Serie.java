 package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel
{
    private int minutosPorEpisodio;
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;


    public Serie(String nomeDaSerie, int anoDeLancamento, int duracaoEmMinutos) {
        super(nomeDaSerie, anoDeLancamento, duracaoEmMinutos); //Chama o construtor da classe pai
    }
    public void setMinutosPorEpisodio(int minutosEpisodio)
    {
        this.minutosPorEpisodio = minutosEpisodio;
    }
    public int getMinutosPorEpisodio()
    {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas)
    {
        this.temporadas = temporadas;
    }
    public int getTemporadas()
    {
        return temporadas;
    }
    public void setEpisodioPorTemporada(int episodio)
    {
        this.episodiosPorTemporada = episodio;
    }
    public int getEpisodioPorTemporada()
    {
        return episodiosPorTemporada;
    }

    @Override
    public int getDuracaoEmMinutos()
    {
        return temporadas * minutosPorEpisodio * episodiosPorTemporada; //nao deveria ser possivel fazer o set
    }
    @Override
    public float getClassificado() {
        return 6;
    }

    @Override
     public void exibeFichaTecnica(){
        System.out.println("Nome da serie: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
    }
}