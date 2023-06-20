package academy.wakanda.indicadorfilmes.filme.application.service;

import academy.wakanda.indicadorfilmes.filme.application.api.FilmeResponseData;
import academy.wakanda.indicadorfilmes.filme.application.api.LocalizacaoDTO;

import java.util.List;

public interface IndicadorFilmesService {
    List<FilmeResponseData.FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao);
}
