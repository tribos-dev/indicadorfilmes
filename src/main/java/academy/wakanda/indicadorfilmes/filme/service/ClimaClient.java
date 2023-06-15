package academy.wakanda.indicadorfilmes.filme.service;

import academy.wakanda.indicadorfilmes.filme.api.LocalizacaoDTO;

public interface ClimaClient {
    ClimaDTO buscaClima(LocalizacaoDTO localizacao);
}
