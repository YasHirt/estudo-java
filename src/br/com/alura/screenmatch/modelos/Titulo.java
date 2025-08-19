package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public void setNome(String nome) //retorna void, setters são diferentes de construtores 
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }
    public void setAnoDeLancamento(int ano)
    {
        this.anoDeLancamento = ano;
    }
    public void setDuracaoEmMinutos(int minutos)
    {
        this.duracaoEmMinutos = minutos;
    }
    public void setIncluidoNoPlano(boolean plano)
    {
        this.incluidoNoPlano = plano;
    }
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes()
    {
        return totalDeAvaliacoes;
    }
}

