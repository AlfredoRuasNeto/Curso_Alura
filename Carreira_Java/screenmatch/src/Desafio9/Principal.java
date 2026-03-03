package Desafio9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        int carrinho = 0;

        Desafio item1 = new Desafio();
        item1.setItem("Sapato");
        item1.setValorItem(150);

        Desafio item2 = new Desafio();
        item2.setItem("Controle de Ps5");
        item2.setValorItem(500);

        List<Desafio> lista = new ArrayList<>();

        MeuSaldo saldoConta = new MeuSaldo();

        System.out.println("Digite seu saldo inicial: ");
        double saldoInicial = ler.nextDouble();
        saldoConta.definirSaldo(saldoInicial);


        while (opcao != 4) {
            System.out.println("""
                    Digite a opção: 
                    1 - Uma nova Compra
                    2 - Carrinho
                    3 - Meu saldo atual
                    4 - sair
                    """);
            opcao = ler.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("Voce tem a opção 1: " + item1 + " e a opção 2: " + item2);
                    System.out.println("Oque vc quer comprar: ");
                    carrinho = ler.nextInt();
                    if (carrinho == 1) {
                        lista.add(item1);
                        saldoConta.debitar(item1.getValorItem());
                    } else if (carrinho == 2) {
                        lista.add(item2);
                        saldoConta.debitar(item2.getValorItem());
                    } else {
                        System.out.println("Opção invalida");
                    }
                    System.out.println("Quer escolher outra coisa?");
                    System.out.println("sim = 1 e não = 2 ");
                    int leitura = ler.nextInt();
                    if (leitura == 1) {
                        break;
                    } else if (leitura == 2) {
                        break;
                    }
                    break;
                }
                case 2: {
                    if (lista.isEmpty()) {
                        System.out.println("Carrinho Vazio");
                    } else {
                        for (Desafio item : lista) {
                            System.out.println("No carrinho " + item.getItem());
                            System.out.println("Valor " + item.getValorItem());
                        }
                    }
                    break;
                }
                case 3: {
                    saldoConta.exibirGasto();
                    break;
                }
                case 4: {
                    return;
                }

            }

        }
    }
}
