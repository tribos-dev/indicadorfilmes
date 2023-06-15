package academy.wakanda.indicadorfilmes.filme.domain;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class FilmeCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idIntegrationLog", updatable = false, unique = true, nullable = false)
    @EqualsAndHashCode.Exclude
    private UUID id;

    @Enumerated(EnumType.STRING)
    private FilmeCategoriaEnum categoria;

    private Double temperaturaMinima;
    private Double temperaturaMaxima;
}