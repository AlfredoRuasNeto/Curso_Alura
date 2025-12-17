import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Vigadores: Guerra Infinita");
        meuFilme.setAnoDeLancamento(2018);
        meuFilme.setDuracaoEmMinutos(149);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("A duração do filme é: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(1);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.calculoMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.calculoMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios(50);
        System.out.println("Duração em minutos de todos os episodios da serie: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2009);
        outroFilme.setDuracaoEmMinutos(162);
        outroFilme.setIncluidoNoPlano(true);
        System.out.println("A duração do filme é: " + outroFilme.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();

        filtroRecomendacao.filtra(meuFilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(lost);
        episodios.setTotalVisulizacoes(300);

        filtroRecomendacao.filtra(episodios);

    }
}
