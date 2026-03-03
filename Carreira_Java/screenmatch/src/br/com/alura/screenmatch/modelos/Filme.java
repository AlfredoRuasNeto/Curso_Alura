package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String Diretor;

    public Filme(String nome, int anoDeLancamento) {

        super(nome, anoDeLancamento);
    }

    public void setDiretor(String diretor) {

        Diretor = diretor;
    }

    public String getDiretor() {

        return Diretor;
    }

    @Override
    public int getClassificacao() {

        return (int) calculoMedia() / 2;
    }

    @Override
    public String toString() {

        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}