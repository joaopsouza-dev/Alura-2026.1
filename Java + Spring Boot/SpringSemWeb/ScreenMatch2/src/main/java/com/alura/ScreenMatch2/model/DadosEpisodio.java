package com.alura.ScreenMatch2.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias("Title") String titulo,
                            @JsonAlias("Episode") int numEp,
                            @JsonAlias("ImdbRating") String avaliacao,
                            @JsonAlias("Released") String dataLanc) {
}
