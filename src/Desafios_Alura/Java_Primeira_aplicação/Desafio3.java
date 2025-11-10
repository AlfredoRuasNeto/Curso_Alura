package Desafios_Alura.Java_Primeira_aplicação;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
                                        /*Crie um programa que solicite ao usuário digitar um número.
        Se o número for positivo, exiba "Número positivo", caso
        contrário, exiba "Número negativo".*/
        Scanner Leitura = new Scanner(System.in);
        int numero = 0;
        System.out.println("escolha um numero, pode ser positivo e negativo: ");
        numero = Leitura.nextInt();
        if (numero >= 1) {
            System.out.println("numero positivo");
        } else {
            System.out.println("numero negativo");
        }
        /*Peça ao usuário para inserir dois números inteiros.
        Compare os números e imprima uma mensagem indicando se
        são iguais, diferentes, o primeiro é maior ou o segundo é maior.*/
        int numero1 = 0;
        int numero2 = 0;
        Scanner leitura2 = new Scanner(System.in);

        System.out.println("Escolha um valor positivo: ");
        numero1 = leitura2.nextInt();
        System.out.println("Escolha outro valor positivo: ");
        numero2 = leitura2.nextInt();

        if (numero1 == numero2) {
            System.out.println("Esses 2 numero são iguais");
        } else if (numero1 < numero2) {
            System.out.println("o primeiro numero é menor que o segundo numero!!");
        } else {
            System.out.println("O primeiro numero é maior que o segundo numero!!");
        }
        /*Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado"
        e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o
        cálculo da área com base na opção selecionada.*/
        double a = 0;
        double b = 0;
        double r = 0;
        int nome = 0;
        Scanner leitura3 = new Scanner(System.in);

        System.out.println("Se vc quer calcular a area do quadrado digite 1 se quiser a area do circulo digite 2: ");
        nome = leitura3.nextInt();

        if (nome == 1) {
            System.out.println("Escolha o valor de A: ");
            a = leitura3.nextDouble();
            System.out.println("Escolha o valor de B: ");
            b = leitura3.nextDouble();
            double formula = a * b;

            System.out.println("O valor da area do quadrado é: " + formula);
        } else {
            System.out.println("Escolha o valor do Raio: ");
            r = leitura3.nextDouble();

            double formula2 = (r * r) * 3.14;

            System.out.println("O valor da area do circulo é: " + formula2);
        }

        /* Crie um programa que solicite ao usuário um número e exiba a tabuada
        desse número de 1 a 10.*/
        Scanner leitura4 = new Scanner(System.in);
        int numero3 = 0;
        int tabuada = 0;

        System.out.println("Escolha o numero da tabuada: ");
        numero3 = leitura4.nextInt();

        for (int i = 0; i < 10; i++) {
            tabuada++;
            int formula = numero3 * tabuada;
            System.out.println(formula);
        }

        /*Crie um programa que solicite ao usuário a entrada
        de um número inteiro. Verifique se o número é par ou
        ímpar e exiba uma mensagem correspondente.*/
        int num1 = 0;
        Scanner leitura5 = new Scanner(System.in);

        System.out.println("Escolha um numero inteiro: ");
        num1 = leitura5.nextInt();

        int formula2 = num1 % 2;

        if (formula2 == 0) {
            System.out.println("Esse numero é par");
        } else {
            System.out.println("Esse numero é impar");
        }

        /*Crie um programa que solicite ao usuário um número e
        calcule o fatorial desse número.*/
        int num2 = 0;
        Scanner leitura6 = new Scanner(System.in);

        System.out.println("Escolha um numero para fazer o fatorial dele: ");
        num2 = leitura6.nextInt();

        for (int i = 1; i <= 10; i++) {
            num2 *= i;
            System.out.println(num2);
        }

    }
}
