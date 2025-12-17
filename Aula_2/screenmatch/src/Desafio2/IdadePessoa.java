package Desafio2;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void verificar(){
        if (idade >= 18) {
            System.out.println("Essa pessoa é maior de idade!");
        } else {
            System.out.println("Essa pessoa é menor de idade!");
        }
    }
}
