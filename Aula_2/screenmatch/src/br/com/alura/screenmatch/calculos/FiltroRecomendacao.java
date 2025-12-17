package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Esse filme esta entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2 ) {
            System.out.println("Esse filme é muito bem avaliado");
        } else {
            System.out.println("Esse filme pode ser colocado na sua lista");
        }
    }
}
