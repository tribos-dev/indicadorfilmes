package academy.wakanda.indicadorfilmes.filme.infra;

import academy.wakanda.indicadorfilmes.filme.api.LocalizacaoDTO;
import academy.wakanda.indicadorfilmes.filme.service.ClimaClient;
import academy.wakanda.indicadorfilmes.filme.service.ClimaDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@RequiredArgsConstructor
public class ClimaInfraClient implements ClimaClient {
    private final ClimaFeignClient climaFeignClient;
    private String apiKey = "d84295d4cacf008b00d6ab3c95613bce";
    private String units = "metric";

    @Override
    public ClimaDTO buscaClima(LocalizacaoDTO localizacao) {
        log.info("[start] ClimaInfraClient - buscaClima");
        log.info("[localizacao]{}",localizacao);
        ClimaDTO climaDTO = climaFeignClient.buscaClima(localizacao.getLatitude(), localizacao.getLongitude(), apiKey, units);
        log.info("[clima]{}",climaDTO);
        log.info("[finish] ClimaInfraClient - buscaClima");
        return climaDTO;
    }
}
