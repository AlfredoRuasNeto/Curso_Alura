package Desafio3.numeros_primos;

public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int primo) {
        int proximo = primo + 1;
        while (verificarPrimalidade(primo)) {
            proximo++;
        }
        return proximo;
    }
}
