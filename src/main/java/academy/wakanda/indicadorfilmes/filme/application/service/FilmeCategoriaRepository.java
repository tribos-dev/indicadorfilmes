package academy.wakanda.indicadorfilmes.filme.application.service;

import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;

import java.util.Optional;

public interface FilmeCategoriaRepository {
    Optional<FilmeCategoria> buscaAtravesTemperatura(Double temperatura);
}
