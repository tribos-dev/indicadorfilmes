package academy.wakanda.indicadorfilmes.filme.application.service;

import academy.wakanda.indicadorfilmes.filme.application.api.FilmeResponseData;
import academy.wakanda.indicadorfilmes.filme.application.api.LocalizacaoDTO;
import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class IndicadorFilmesApplicationService implements IndicadorFilmesService {
    private final ClimaClient climaClient;
    private final FilmeCategoriaRepository filmeCategoriaRespository;
    private final FilmeClient filmeClient;

    @Override
    public List<FilmeResponseData.FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao) {
        log.info("[start] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        log.info("[localizacao] {}",localizacao);
        ClimaDTO clima = climaClient.buscaClima(localizacao);
        FilmeCategoria categoria = filmeCategoriaRespository.buscaAtravesTemperatura(clima.getTemperatura());
        List<FilmeResponseData.FilmeResponse> filmes = filmeClient.buscaAtravesCategoria(categoria);
        log.info("[filmes] {}",filmes);
        log.info("[finish] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        return filmes;
    }
}
