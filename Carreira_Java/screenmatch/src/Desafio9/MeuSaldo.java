package Desafio9;

import java.util.Scanner;

public class MeuSaldo  extends Desafio{
    private double meuSaldo;

    public void definirSaldo(double valor) {
        this.meuSaldo = valor;
    }

    public double getMeuSaldo() {
        return meuSaldo;
    }

    public void setMeuSaldo(double meuSaldo) {
        this.meuSaldo = meuSaldo;
    }

    public void exibir() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o saldo da sua conta: ");
        ler.nextDouble();
    }

    public void debitar(double valor) {

        if (valor <= meuSaldo) {
            double conta = getMeuSaldo() - valor;
            System.out.println("Compra realizada com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }

    }
    public void exibirGasto() {
        System.out.println("Saldo atual é: " + meuSaldo);
    }
}
