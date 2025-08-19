package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo { //O extends chama os atributos e métodos da classe Titulo

    private String diretor;

    public void setDiretor(String diretor)
    {
        this.diretor = diretor;
    }

    public String getDiretor()
    {
        return diretor;
    }
}