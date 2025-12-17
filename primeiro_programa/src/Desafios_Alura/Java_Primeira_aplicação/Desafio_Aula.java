package Desafios_Alura.Java_Primeira_aplicação;

import java.util.Scanner;

public class Desafio_Aula {
    public static void main(String[] args) {
        //Variaveis
        Scanner leitura = new Scanner(System.in);
        String nome;
        String tipoConta;
        int operaçoes = 0;
        double saldo = 0;
        //Informações
        System.out.println("Qual o seu nome: ");
        nome = leitura.nextLine();
        System.out.println("Qual o tipo da sua conta bancaria: ");
        tipoConta = leitura.nextLine();
        System.out.println("Quanto de saldo vc tem na sua conta: ");
        saldo = leitura.nextInt();
        //Leitura de Dados do cliente
        System.out.println("**************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("**************************");
        //Escolha de opções
        do {
            System.out.println("Operações");

            System.out.println("1- Consultar saldos\n" + "2- Receber Valor\n" + "3- Transferir Valor\n" + "4- Sair");
            operaçoes = leitura.nextInt();
            switch (operaçoes) {
                case 1:
                    System.out.println("Seu saldo é: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a receber: ");
                    double recebe = leitura.nextDouble();
                    saldo += recebe;
                    System.out.println("Você tem: " + saldo);
                    break;
                case 3:
                    System.out.println("Quanto é o valor que vc quer transferir: ");
                    double trans = leitura.nextDouble();
                    if (saldo > trans) {
                        saldo -= trans;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Você não tem saldo suficiente!!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo.....");
                    break;

                default:
                    System.out.println("Opção Invalida!!");
            }
        } while (operaçoes != 4);
    }
}
