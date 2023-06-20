package academy.wakanda.indicadorfilmes.filme.infra;

import academy.wakanda.indicadorfilmes.filme.application.api.FilmeResponseData;
import academy.wakanda.indicadorfilmes.filme.application.service.FilmeClient;
import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Log4j2
public class FilmeInfraClient implements FilmeClient {
    private final FilmeClientFeign filmeClientFeing;

    @Override
    public List<FilmeResponseData.FilmeResponse> buscaAtravesCategoria(FilmeCategoria categoria) {
        log.info("[start] FilmeInfraClient - buscaAtravesCategoria");
        log.info("[categoria] {}", categoria);
        FilmeResponseData filmeData = filmeClientFeing.buscaFilmeAtravesCategoriaId(BEARER_TOKEN, categoria.getCategoria().getIdTheMovieDb());
        log.info("[finish] FilmeInfraClient - buscaAtravesCategoria");
        return filmeData.getResults();
    }

    private static final String BEARER_TOKEN = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJhZjM3ZGUzMzQ2YjM0ZmEyZjU1OWIyNzUxYTU1MWU3ZiIsInN1YiI6IjY0OTIyYTlkODUwMDVkMDBlODc3Njc0MiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.E2VBsqmW7FLpDlWxO7KBJtxUS_fBfGMUojSGNToqK4I";
}
