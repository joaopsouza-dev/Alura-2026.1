import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um título para buscar: ");
        String nome = sc.nextLine();

        String url = "https://www.omdbapi.com/?t=" + nome.replace(" ", "+") + "&apikey=68b46e45";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String resposta = response.body();
            System.out.println("\n");
            System.out.println(resposta);
            System.out.println("\n");

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOMDB titulo = gson.fromJson(resposta, TituloOMDB.class);

            Titulo novoTitulo = new Titulo(titulo);
            System.out.println(novoTitulo);
            FileWriter arquivo = new FileWriter("buscas.txt");
            arquivo.write(novoTitulo.toString());
            arquivo.close();

        } catch (Exception e) {

            System.out.println("Erro ao buscar titulo: ");
            System.out.println(e.getMessage());
        }
    }
}
