import br.com.alura.screenmatch.calculos.Calculadora;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();
        Calculadora calculadora = new Calculadora();

        minhaSerie.setNome("Modern Family");
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodioPorTemporada(15);
        minhaSerie.setMinutosPorEpisodio(30);
        calculadora.inclui(minhaSerie);
        minhaSerie.exibeFichaTecnica();
        System.out.println("Tempo para maratonar: " + minhaSerie.getDuracaoEmMinutos());
        System.out.println("Tempo calculado: " + calculadora.getTempoTotal());
        // meuFilme.setNome("Poderoso Chefão");
        // meuFilme.setAnoDeLancamento(1940); 
        // meuFilme.setDuracaoEmMinutos(180);
        // meuFilme.setIncluidoNoPlano(true);

        // meuFilme.exibeFichaTecnica();
        // meuFilme.avalia(8);
        // meuFilme.avalia(5);
        // meuFilme.avalia(10);
       
        // System.out.println(meuFilme.pegaMedia());
        // String mensagem = String.format("O filme %s teve %d avaliações", meuFilme.getNome(), meuFilme.getTotalDeAvaliacoes());

        // System.out.println(mensagem);
    }
}