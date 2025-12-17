package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodios extends Titulo implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;

    public int getTotalVisulizacoes() {
        return totalVisulizacoes;
    }

    public void setTotalVisulizacoes(int totalVisulizacoes) {
        this.totalVisulizacoes = totalVisulizacoes;
    }

    private int totalVisulizacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisulizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
