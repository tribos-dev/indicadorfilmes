package academy.wakanda.indicadorfilmes.filme.infra;

import academy.wakanda.indicadorfilmes.filme.application.service.FilmeCategoriaRepository;
import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Log4j2
public class FilmeCategoriaInfraRepository implements FilmeCategoriaRepository {
    private final FilmeCategoriaSpringDataJPARepository dataJPARepository;

    @Override
    public FilmeCategoria buscaAtravesTemperatura(Double temperatura) {
        log.info("[start] FilmeCategoriaInfraRepository - buscaAtravesTemperatura");
        List<FilmeCategoria> categorias = dataJPARepository.findByTemperaturaMinimaLessThanEqualAndTemperaturaMaximaGreaterThanEqual(temperatura, temperatura);
        log.info("[finish] FilmeCategoriaInfraRepository - buscaAtravesTemperatura");
        return categorias.stream().findFirst().orElseThrow(() -> new RuntimeException("Categoria Não Encontrada!"));
    }
}
