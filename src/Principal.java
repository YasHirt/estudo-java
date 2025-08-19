import br.com.alura.screenmatch.modelos.Filme;
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1940); 
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
       
        System.out.println(meuFilme.pegaMedia());
        String mensagem = String.format("O filme %s teve %d avaliações", meuFilme.getNome(), meuFilme.getTotalDeAvaliacoes());

        System.out.println(mensagem);
    }
}