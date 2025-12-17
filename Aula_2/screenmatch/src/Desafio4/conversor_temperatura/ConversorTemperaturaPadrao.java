package Desafio4.conversor_temperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private double celsius;
    private double Fahrenheit;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return Fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        Fahrenheit = fahrenheit;
    }

    @Override
    public double getCelsiusParaFahrenheit() {
        double calculo = getCelsius() * 1.8 + 32;
        System.out.println(calculo);
        return 0;
    }

    @Override
    public double getFahrenheitParaCelsius() {
        double calculo = (getFahrenheit() - 32) / 1.8;
        System.out.println(calculo);
        return 0;
    }

    public void exibir() {
        System.out.println(getFahrenheitParaCelsius());
        System.out.println(getCelsiusParaFahrenheit());
    }
}
