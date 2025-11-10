package Desafios_Alura.Java_Primeira_aplicação;

import java.util.Random;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        int numero = new Random().nextInt(100);
        Scanner receber = new Scanner(System.in);
        int chute = 0;
        int numeroEscolhido = 0;


        System.out.println("Este é o jogo da advinhação!");
        System.out.println("Vai ser sorteado um numero de 1 a 100!");
        System.out.println("Voce vai ter 5 tesntativas!!");

        while (chute < 5){
            System.out.println("Chute um numero de 1 a 100: ");
            numeroEscolhido = receber.nextInt();
            chute++;

            if (numeroEscolhido == numero) {
                System.out.println("Parabend vc acertou!!");
                break;
            } else if (numeroEscolhido < numero) {
                System.out.println("O numero é maior!!");
            } else {
                System.out.println("O numero é menor");
            }
        }
        if (chute == 5) {
            System.out.println("Voce não consegui acerta!!");
        }
    }
}
