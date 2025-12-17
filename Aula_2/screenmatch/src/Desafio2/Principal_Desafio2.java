package Desafio2;

public class Principal_Desafio2 {
    public static void main(String[] args) {
        /*Crie uma classe ContaBancaria com os seguintes
        atributos: numeroConta (privado), saldo (privado)
        e titular (publico). Implemente métodos getters e
        setters para os atributos privados.*/
        ContaBancaria banco = new ContaBancaria();

        banco.setNumeroConta(1234);
        banco.setSaudoConta(1000);
        banco.titular = "Alfredo";

        banco.exibir();

        /*Crie uma classe IdadePessoa com os atributos
        privados nome e idade. Utilize métodos getters
        e setters para acessar e modificar esses
        atributos. Adicione um metodo verificarIdade
        que imprime se a pessoa é maior de idade ou não.*/
        IdadePessoa idadePessoa1 = new IdadePessoa();
        IdadePessoa idadePessoa2 = new IdadePessoa();

        idadePessoa1.setNome("Rafael");
        idadePessoa1.setIdade(18);

        System.out.println("O " + idadePessoa1.getNome() + " tem " + idadePessoa1.getIdade());
        idadePessoa1.verificar();

        idadePessoa2.setNome("Eduarda");
        idadePessoa2.setIdade(15);
        System.out.println("A " + idadePessoa2.getNome() + " tem " + idadePessoa2.getIdade());
        idadePessoa2.verificar();

        /*Desenvolva uma classe Produto com os atributos
        privados nome e preco. Utilize métodos getters
        e setters para acessar e modificar esses atributos.
        Adicione um metodo aplicarDesconto que recebe um
        valor percentual e reduz o preço do produto.*/
        Produto produto = new Produto();

        produto.setNome("Pão");
        produto.setPreco(5.0);
        produto.desconto = 10;

        produto.exibirTabela();

        /*Desenvolva uma classe Aluno com os atributos privados
        nome e notas. Utilize métodos getters e setters para
        acessar e modificar esses atributos. Adicione um
        metodo calcularMedia que retorna a média das notas
        do aluno.*/
        Aluno alunos = new Aluno();
        Aluno alunos1 = new Aluno();
        Aluno alunos2 = new Aluno();
        Aluno alunos3 = new Aluno();

        alunos1.setNome("Alfredo");
        alunos.setNota1(8);
        System.out.println("O " + alunos1.getNome() + " tirou nota " + alunos.getNota1());

        alunos2.setNome("João");
        alunos.setNota2(10);
        System.out.println("O " + alunos2.getNome() + " tirou nota " + alunos.getNota2());

        alunos3.setNome("Marcelo");
        alunos.setNota3(5);
        System.out.println("O " + alunos3.getNome() + " tirou nota " + alunos.getNota3());

        alunos.calcularMedia();

        /*Desenvolva uma classe Livro com os atributos privados
        titulo e autor. Utilize métodos getters e setters para
        acessar e modificar esses atributos. Adicione um metodo
        exibirDetalhes que imprime o título e o autor do livro.*/
        Livro escritor = new Livro();

        escritor.setTitulo("Pequeno Principe");
        escritor.setAutor("Antoine de Saint-Exupéry");

        escritor.exibir();

    }
}
