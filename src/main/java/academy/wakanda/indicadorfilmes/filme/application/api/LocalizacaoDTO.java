package academy.wakanda.indicadorfilmes.filme.application.api;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class LocalizacaoDTO {
    private final String longitude;
    private final String latitude;
}
