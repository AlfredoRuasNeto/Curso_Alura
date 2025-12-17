package Desafio4.tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getMostrarTabuada() {
        for (int numero = 1; numero <= 10; numero++) {
          int calculo = numero * getNumero();
            System.out.println(calculo);
        }
        return 0;
    }

    public void exibir() {
        System.out.println(getMostrarTabuada());
    }
}
