package Desafio11;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal_Desafio11 {
    public static void main(String[] args) {
        //1-

        String json = """
                {
                "nome" : "Joao",
                "idade" : 40,
                "cidade" : "Salvador"
                }
                """;

        Gson gson = new Gson();

        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);

        //2-

        String jsonPessoa = """
                {
                "nome" : "Joao",
                "idade" : 40,
                "cidade" : "Rio de Janeiro"
                }
                """;
        Gson gson1 = new GsonBuilder()
                .setLenient()
                .create();
        Pessoa pessoa1 = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println(pessoa1);

        //3-

        String jsonL = """
                {
                "titulo" : "Pequeno Principe",
                "autor" : " Antoine de Saint-Exupéry"
                }
                """;

        Gson gson2 = new Gson();
        Livro livro1 = gson2.fromJson(jsonL, Livro.class);
        System.out.println(livro1);
    }
}
