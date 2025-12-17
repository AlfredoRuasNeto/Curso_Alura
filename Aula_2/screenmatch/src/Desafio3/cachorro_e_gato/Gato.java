package Desafio3.cachorro_e_gato;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("miau miau");
    }

    public void aranharMoveis() {
        System.out.println("Arranhando");
    }
}
