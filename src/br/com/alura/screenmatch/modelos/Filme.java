package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{ //O extends chama os atributos e métodos da classe Titulo

    private String diretor;
    
    public Filme(String nome, int anoDeLancamento,  int duracaoEmMinutos) //Alterando o construtor padrão  da classe
    {
        super(nome, anoDeLancamento, duracaoEmMinutos); //Chama o construtor do pai e passa os devidos parâmetros
    }

    public void setDiretor(String diretor)
    {
        this.diretor = diretor;
    }

    public String getDiretor()
    {
        return diretor;
    }

    @Override
    public float getClassificado() {
       return  (int) pegaMedia() / 2;
    }

    public String toString()
    {
        return "Filme: " + this.getNome() + " Ano de Lançamento: " + this.getAnoDeLancamento();
    }
}