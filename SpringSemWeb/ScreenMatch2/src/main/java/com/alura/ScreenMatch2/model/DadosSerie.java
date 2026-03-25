package com.alura.ScreenMatch2.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // IGNORA TUDO QUE NAO FOI MAPEADO

public record DadosSerie
            (@JsonAlias("Title") String title,
             @JsonAlias("imdbRating") String rating,
             @JsonAlias("totalSeasons") Integer seasons)
{

}
