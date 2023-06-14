package academy.wakanda.indicadorfilmes.filme.service;

import academy.wakanda.indicadorfilmes.filme.api.FilmeResponse;
import academy.wakanda.indicadorfilmes.filme.api.LocalizacaoDTO;

import java.util.List;

public interface IndicadorFilmesService {
    List<FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao);
}
