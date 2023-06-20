package academy.wakanda.indicadorfilmes.filme.application.service;

import academy.wakanda.indicadorfilmes.filme.application.api.FilmeResponseData;
import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;

import java.util.List;

public interface FilmeClient {
    List<FilmeResponseData.FilmeResponse> buscaAtravesCategoria(FilmeCategoria categoria);
}
