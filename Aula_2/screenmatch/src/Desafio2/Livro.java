package Desafio2;

public class Livro {
    private String titulo;
    private String autor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void exibir(){
        System.out.println("O nome do livro é: " + titulo);
        System.out.println("O nome do autor é: " + autor);
    }
}
