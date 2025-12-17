package Desafio3;

import java.security.PrivateKey;

public class Carro {
    private String modelo;
    private double valorAno1;
    private double valorAno2;
    private double valorAno3;

    public void modeloCarro (String modelo) {
        this.modelo = modelo;
    }

    public void precos (double valorAno1, double valorAno2, double valorAno3){
        this.valorAno1 = valorAno1;
        this.valorAno2 = valorAno2;
        this.valorAno3 = valorAno3;
    }

    public void exibir () {
        System.out.println("O modelo é: " + modelo);
        System.out.println("Preço do primeiro ano: " + valorAno1);
        System.out.println("Preço do segundo ano: " + valorAno2);
        System.out.println("Preço do terceiro ano: " + valorAno3);
        System.out.println("O menor preço entre eles é: " + menorPreco());
        System.out.println("O menor preço entre eles é: " + maiorPreco());
    }

    private double menorPreco () {
        double menorPreco = valorAno1;

        if (menorPreco > valorAno2) {
            menorPreco = valorAno2;
        }
        if (menorPreco > valorAno3) {
            menorPreco = valorAno3;
        }
        return menorPreco;
    }
    private double maiorPreco () {
        double maiorPreco = valorAno1;

        if (maiorPreco < valorAno2) {
            maiorPreco = valorAno2;
        }
        if (maiorPreco < valorAno3) {
            maiorPreco = valorAno3;
        }
        return maiorPreco;
    }
}
