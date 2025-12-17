package Desafio3.conta_bancaria;

public class ContaBancaria {
    private double saldo;
    private double depositar;
    private double sacar;
    private double consultarSaldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public double getConsultarSaldo() {
        return saldo - sacar + depositar;
    }

    public void setConsultarSaldo(double consultarSaldo) {
        this.consultarSaldo = consultarSaldo;
    }

    public void exibir() {
        System.out.println(getConsultarSaldo());
    }
}
