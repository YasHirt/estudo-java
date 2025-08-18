import br.com.alura.screenmatch.modelos.Filme;
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        String mensagem = String.format("O filme %s teve %d avaliações", meuFilme.nome, meuFilme.getTotalDeAvaliacoes());
        System.out.println(mensagem);
        System.out.println(meuFilme.pegaMedia());

    }
}