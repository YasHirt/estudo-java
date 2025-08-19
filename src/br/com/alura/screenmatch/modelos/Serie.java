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



}