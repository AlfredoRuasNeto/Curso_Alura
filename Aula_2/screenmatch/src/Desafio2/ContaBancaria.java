package Desafio2;

public class ContaBancaria {
    private int numeroConta;
    private double saudoConta;
    public String titular;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaudoConta(double saudoConta) {
        this.saudoConta = saudoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaudoConta() {
        return saudoConta;
    }

    public void exibir(){
        System.out.println("O numero da conta é: " + numeroConta);
        System.out.println("O saudo da conta é: " + saudoConta);
        System.out.println("O titular da conta é: " + titular);
    }
}
