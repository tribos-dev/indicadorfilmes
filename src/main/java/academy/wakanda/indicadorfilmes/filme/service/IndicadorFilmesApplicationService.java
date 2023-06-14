package academy.wakanda.indicadorfilmes.filme.service;

import academy.wakanda.indicadorfilmes.filme.api.FilmeResponse;
import academy.wakanda.indicadorfilmes.filme.api.LocalizacaoDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class IndicadorFilmesApplicationService implements IndicadorFilmesService {
    @Override
    public List<FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao) {
        log.info("[start] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        log.info("[localizacao] {}",localizacao);

        log.info("[finish] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        return null;
    }
}
