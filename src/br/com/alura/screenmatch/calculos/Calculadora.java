package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Calculadora {
    private int tempoTotal;

    public int getTempoTotal()
    {
        return tempoTotal;
    }
    public void inclui(Titulo f)
    {
        tempoTotal += f.getDuracaoEmMinutos();
    }
}
