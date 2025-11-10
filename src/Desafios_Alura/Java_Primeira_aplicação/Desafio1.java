package Desafios_Alura.Java_Primeira_aplicação;

public class Desafio1 {
    public static void main(String[] args) {
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double Aluno1 = 7.0;
        double Aluno2 = 10.0;

        double media = (Aluno1 + Aluno2) /2;

        System.out.println("A media das 2 notas é: " + media);

        /*Declare uma variável do tipo double e uma variável do
        tipo int. Faça o casting da variável double para int e imprima o resultado.*/
        double num1 = 10;
        int num2 = (int) num1;

        System.out.println(num1);
        System.out.println(num2);

        /*Declare uma variável do tipo char (letra) e uma variável do
        tipo String (palavra). Atribua valores a essas variáveis e
        concatene-as em uma mensagem.*/
        char letra = 'A';
        String palavra = "legal";

        String msg = String.format("a letra que eu ecolhi é: %c, e esse curso é %s", letra, palavra);
        System.out.println(msg);

        /*Declare uma variável do tipo double precoProduto e uma variável do
        tipo int (quantidade). Calcule o valor total multiplicando o preço
        do produto pela quantidade e apresente o resultado em uma mensagem.*/
        double precoproduto = 10;
        int quantidade = 5;

        double valor = precoproduto * quantidade;

        System.out.println("Valor total a pagar é: " + valor);

        /*Declare uma variável do tipo double valorEmDolares. Atribua um
        valor em dólares a essa variável. Considere que o valor de 1 dólar
        é equivalente a 4.94 reais. Realize a conversão do valor em dólares
        para reais e imprima o resultado formatado.*/
        double dolar = 100;
        double real = 4.94;

        double valor2 = dolar * real;
        String msg1 = String.format("O valor em reais é: %.2f", valor2);
        System.out.println(msg1);

        /*Declare uma variável do tipo double precoOriginal. Atribua um
        valor em reais a essa variável, representando o preço original
        de um produto. Em seguida, declare uma variável do tipo double
        percentualDesconto e atribua um valor percentual de desconto ao
        produto (por exemplo, 10 para 10%). Calcule o valor do desconto
        em reais, aplique-o ao preço original e imprima o novo preço com
        desconto.*/
        double precoOriginal = 133;
        double percentualDesconto = 33;

        double valor3 = (percentualDesconto /100) * precoOriginal;
        String msg2 = String.format("O valor sem desconto fica: %.2f, mas com o desconto de 33 porcento com o cartão da loja fica: %.2f", precoOriginal, valor3);
        System.out.println(msg2);
    }
}
