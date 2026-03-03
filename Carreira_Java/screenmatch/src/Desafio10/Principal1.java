package Desafio10;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Escolha um livro: ");
        var busca = scan1.nextLine();

        String ler = "https://www.googleapis.com/books/v1/volumes?q=" + busca +"&key=AIzaSyCDf6-HCSsm-D83c1UJK4irgZEEuAJwzZ0";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(ler))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response);
    }
}
