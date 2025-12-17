package Desafio2;

public class Produto {
    private String nome;
    private double preco;
    public double desconto;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double calculo(){
         return preco - (preco *(desconto / 100));
    }

    public void exibirTabela(){
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(calculo());
    }
}
