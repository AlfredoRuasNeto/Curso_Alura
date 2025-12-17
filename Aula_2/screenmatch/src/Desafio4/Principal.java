package Desafio4;

import Desafio4.conversor_temperatura.ConversorTemperaturaPadrao;
import Desafio4.geometria.CalculadoraSalaRetangular;
import Desafio4.moeda.ConversorDeMoeda;
import Desafio4.tabuada.TabuadaMultiplicacao;

public class Principal {
    public static void main(String[] args) {
        //1-
        ConversorDeMoeda conversorDeMoeda = new ConversorDeMoeda();

        conversorDeMoeda.setDolar(100);
        System.out.println(conversorDeMoeda.getConversaoFinanceira());

        //2-
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();

        calculadoraSalaRetangular.setAltura(5);
        calculadoraSalaRetangular.setLargura(5);
        calculadoraSalaRetangular.exibir();

        //3-
        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();

        tabuadaMultiplicacao.setNumero(5);
        tabuadaMultiplicacao.exibir();

        //4-
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();

        conversorTemperaturaPadrao.setCelsius(32);
        conversorTemperaturaPadrao.setFahrenheit(64);
        conversorTemperaturaPadrao.exibir();


    }
}
