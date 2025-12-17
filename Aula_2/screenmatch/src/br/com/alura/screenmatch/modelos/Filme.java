package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String Diretor;

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
}
