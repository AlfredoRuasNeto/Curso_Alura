package Desafio4.moeda;

public class ConversorDeMoeda implements ConversaoFinanceira{
    private double dolar;

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    @Override
    public double getConversaoFinanceira() {
        double conversao = dolar * 5.45;

        System.out.println("O valor em reais é: " + conversao);
        return 0;
    }
}
