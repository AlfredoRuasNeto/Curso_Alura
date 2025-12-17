package Desafio3.numeros_primos;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int parar) {
        System.out.println("Numeros primos " + parar + ": ");
        for (int i = 2; i <= parar; i++) {
            if (verificarPrimalidade(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}


