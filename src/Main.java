//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Apresentação
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
        //Informações dos Filmes
        int anoDoLancamento = 2022;
        System.out.println("O ano de Lançamento é: " + anoDoLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Calculo da media
        double mediaFilme = (9.8 + 8.1 + 5.0) /3;
        System.out.println("A media do filme é: " + mediaFilme);
        //Snopse dos filmes
        String sinopse;
        sinopse = """
                Filme To Gun Maverick
                Filme com galã dos anos 80
                Data de lançamento
                """ + anoDoLancamento ;
        System.out.println(sinopse);

        int classificacao = (int) (mediaFilme /2);
        System.out.println(classificacao);

    }
}