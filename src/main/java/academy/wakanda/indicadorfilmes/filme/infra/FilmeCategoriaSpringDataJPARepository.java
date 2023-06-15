package academy.wakanda.indicadorfilmes.filme.infra;

import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface FilmeCategoriaSpringDataJPARepository extends JpaRepository<FilmeCategoria, UUID> {
    List<FilmeCategoria> findByTemperaturaMinimaLessThanEqualAndTemperaturaMaximaGreaterThanEqual(
            Double temperaturaMinima, Double temperaturaMaxima);

    @Query("SELECT COUNT(*) FROM FilmeCategoria")
    Long contarRegistros();
}
