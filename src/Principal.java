import br.com.alura.screenmatch.calculos.Calculadora;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
public class Principal {
    public static void main(String[] args) {
        Serie minhaSerie = new Serie();
        Calculadora calculadora = new Calculadora();

        minhaSerie.setNome("Modern Family");
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodioPorTemporada(15);
        minhaSerie.setMinutosPorEpisodio(30);
        calculadora.inclui(minhaSerie);
        minhaSerie.exibeFichaTecnica();
        System.out.println("Tempo para maratonar: " + minhaSerie.getDuracaoEmMinutos());
        
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.Filtra(minhaSerie);
    }
}