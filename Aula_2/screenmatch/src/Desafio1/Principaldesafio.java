package Desafio1;

import java.util.Scanner;

public class Principaldesafio {
    public static void main(String[] args) {
        /*Crie uma classe Pessoa com um metodo
        que exibe "Olá, mundo!" no console.*/
        Pessoa essapessoa = new Pessoa();
        essapessoa.pessoa = "Olá, mundo!";

        essapessoa.Exibir();

        /*Crie uma classe Calculadora com um
        metodo que recebe um número como parâmetro
        e retorna o dobro desse número.*/
        Calculadora calculo = new Calculadora();
        Scanner exibir = new Scanner(System.in);

        System.out.println("Escolha o valor: ");
        calculo.numero = exibir.nextInt();
        int resposta = calculo.calcular(calculo.numero);

        System.out.println("O Dobro é: " + resposta);

        /*Crie uma classe Musica com atributos titulo,
        artista, anoLancamento, avaliacao e numAvaliacoes, e
        métodos para exibir a ficha técnica, avaliar a música
        e calcular a média de avaliações.*/
        Musica nMusica = new Musica();
        Scanner exibir2 = new Scanner(System.in);

        System.out.println("Titulo da musica: ");
        nMusica.titulo = exibir2.nextLine();

        System.out.println("Nome do artista: ");
        nMusica.nomeArtista = exibir2.nextLine();

        System.out.println("Qual o ano de lançamento: ");
        nMusica.anoLancamento = exibir2.nextInt();

        System.out.println("Qual a sua nota para essa musica: ");
        nMusica.avaliacao = exibir2.nextDouble();

        System.out.println("Me informe outra nota: ");
        nMusica.numeroAvaliacoes = exibir2.nextDouble();
        double nAvaliacoes = nMusica.mediaAvaliacoes(nMusica.numeroAvaliacoes);

        System.out.println("A media é: " + nAvaliacoes);
        nMusica.quadro();

        /*Crie uma classe Carro com atributos modelo,
        ano, cor e métodos para exibir a ficha técnica
        e calcular a idade do carro.*/
        Carro nCarro = new Carro();
        Scanner exibir3 = new Scanner(System.in);

        System.out.println("Modelo do Carro: ");
        nCarro.modelo = exibir3.nextLine();

        System.out.println("Qual a cor do Carro: ");
        nCarro.cor = exibir3.nextLine();

        System.out.println("Qual o ano do Carro: ");
        nCarro.ano = exibir3.nextInt();
        int nidade = nCarro.getAno(nCarro.ano);

        nCarro.quadro2();
        System.out.println("O carro tem essa idade: " + nidade);
        System.out.println("**************************");

        /*Crie uma classe Aluno com atributos nome, idade, e um
        metodo para exibir informações. Crie uma instância da
        classe Aluno, atribua valores aos seus atributos e utilize o
        metodo para exibir as informações.*/
        Aluno nAluno = new Aluno();
        Scanner exibir4 = new Scanner(System.in);

        System.out.println("Qual o nome do aluno: ");
        nAluno.nomeAluno = exibir4.nextLine();

        System.out.println("Idade do aluno: ");
        nAluno.idadeAluno = exibir4.nextInt();

        nAluno.info();

    }
}
