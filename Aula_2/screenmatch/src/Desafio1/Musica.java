package Desafio1;

public class Musica {
    String titulo;
    String nomeArtista;
    int anoLancamento;
    double avaliacao;
    double numeroAvaliacoes;

    public double mediaAvaliacoes(double numAvaliacoes) {
        return (numeroAvaliacoes + avaliacao) / 2;
    }

    public void quadro() {
        System.out.println("**************************");
        System.out.println("Nome da Musica: " + titulo);
        System.out.println("Nome do Artista: " + nomeArtista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Nota da Musica: " + avaliacao);
        System.out.println("Media da nota: " + numeroAvaliacoes);
        System.out.println("**************************");
    }
}