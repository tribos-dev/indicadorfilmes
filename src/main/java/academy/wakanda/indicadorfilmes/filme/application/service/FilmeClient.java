package academy.wakanda.indicadorfilmes.filme.application.service;

import academy.wakanda.indicadorfilmes.filme.application.api.FilmeResponse;
import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;

import java.util.List;

public interface FilmeClient {
    List<FilmeResponse> buscaAtravesCategoria(FilmeCategoria categoria);
}
