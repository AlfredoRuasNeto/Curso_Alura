package Desafio3;

import Desafio3.cachorro_e_gato.Cachorro;
import Desafio3.cachorro_e_gato.Gato;
import Desafio3.conta_bancaria.ContaBancaria;
import Desafio3.conta_bancaria.ContaCorrente;
import Desafio3.numeros_primos.GeradorPrimo;
import Desafio3.numeros_primos.NumerosPrimos;
import Desafio3.numeros_primos.VerificadorPrimo;

public class Principal extends NumerosPrimos{
    public static void main(String[] args) {
        // 1- Classe Carro!
        Carro carroModelo = new Carro();

        carroModelo.modeloCarro("Hylux");
        carroModelo.precos(235590, 309590, 372890);
        carroModelo.exibir();

        //2- Classe Animal!
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        cachorro.abanarORabo();

        gato.emitirSom();
        gato.aranharMoveis();

        // 3- Classe ContaBancaria
        ContaBancaria contaBancaria = new ContaBancaria();
        ContaCorrente contaCorrente = new ContaCorrente();

        contaBancaria.setSaldo(1000);
        contaBancaria.setSacar(200);
        contaBancaria.setDepositar(1000);

        contaBancaria.exibir();

        contaCorrente.setCobrarTarifaMensal(1000);

        System.out.println(contaBancaria.getConsultarSaldo() - contaCorrente.getCobrarTarifaMensal());

        //4- NumerosPrimos
        VerificadorPrimo verificador = new VerificadorPrimo();
        NumerosPrimos numerosPrimos = new NumerosPrimos();
        GeradorPrimo geradorPrimo = new GeradorPrimo();

        verificador.verificarPrimalidade(10);

        numerosPrimos.listarPrimos(30);

        int proximo = geradorPrimo.gerarProximoPrimo(20);
        System.out.println("O proximo numero é: " + proximo);

    }
}
