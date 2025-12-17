package Desafio3.numeros_primos;

public class VerificadorPrimo extends NumerosPrimos{
    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println("Esse numero é primo: " + numero );
        } else {
            System.out.println("Esse numero não é primo: " + numero);
        }
    }
}
