package Desafios_Alura.Java_Primeira_aplicação;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        double celsio = 32;

        double formula = (celsio * 1.8) + 32;

        String msg = String.format("A temperatura em Celsio é %.2f e a temperatura em Fahrenheit é %.2f", celsio, formula);
        System.out.println(msg);

    }
}
