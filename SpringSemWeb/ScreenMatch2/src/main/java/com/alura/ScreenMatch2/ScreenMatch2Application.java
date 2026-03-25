package com.alura.ScreenMatch2;

import com.alura.ScreenMatch2.model.DadosSerie;
import com.alura.ScreenMatch2.service.ConsumoApi;
import com.alura.ScreenMatch2.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // INICIALIZACAO DO SPRING BOOT
public class ScreenMatch2Application implements CommandLineRunner { // SEMPRE IMPLEMENTAR ESSE COMMANDLINERUNNER

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatch2Application.class, args);
	}

	// OVERRIDE DO COMMMANDLINERUNNER. ESCREVER A MAIN AQUI DENTRO
	@Override
	public void run(String... args) throws Exception {

		// INSTANCIANDO OBJETOS
		var consumoApi = new ConsumoApi();
		//COLOCANDO A REF DA API DO OMDB PARA TESTAR
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=68b46e45");
		//System.out.println(json);

		ConverteDados converte = new ConverteDados(); // CONVERSOR DE DADOS

		//CONVERTE DE VERDADE OS DADOS DA SERIE DISPONIBILIZADA COM A API
		DadosSerie dados = converte.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}

}
