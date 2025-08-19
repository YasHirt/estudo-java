 package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo
{
    private int minutosPorEpisodio;
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;

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

}