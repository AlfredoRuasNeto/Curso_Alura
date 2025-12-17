package Desafio1;

public class Carro {
    String modelo;
    int ano;
    String cor;

    public int getAno(int idade) {
        return 2025 - idade;
    }
    void quadro2(){
        System.out.println("**************************");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
}
