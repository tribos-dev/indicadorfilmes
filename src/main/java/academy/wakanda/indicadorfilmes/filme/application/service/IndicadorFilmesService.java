package academy.wakanda.indicadorfilmes.filme.application.service;

import academy.wakanda.indicadorfilmes.filme.application.api.FilmeResponse;
import academy.wakanda.indicadorfilmes.filme.application.api.LocalizacaoDTO;

import java.util.List;

public interface IndicadorFilmesService {
    List<FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao);
}
