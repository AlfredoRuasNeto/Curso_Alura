package Desafio2;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    public double valor;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota) {
        this.nota1 = nota;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void calcularMedia(){
        valor = (nota1 + nota2 + nota3) / 3;

        String formatado = String.format("A media entre essas 3 é: %.2f", valor);
        System.out.println(formatado);
    }
}
