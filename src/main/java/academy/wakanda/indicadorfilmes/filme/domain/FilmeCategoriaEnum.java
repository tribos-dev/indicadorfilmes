package academy.wakanda.indicadorfilmes.filme.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FilmeCategoriaEnum {
    ACAO(28),
    COMEDIA(35),
    ANIMACAO(16),
    SUSPENSE(53),
    DOCUMENTARIO(99);

    private Integer idTheMovieDb;
}
