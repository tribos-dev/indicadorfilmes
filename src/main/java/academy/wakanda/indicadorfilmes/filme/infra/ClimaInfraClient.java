package academy.wakanda.indicadorfilmes.filme.infra;

import academy.wakanda.indicadorfilmes.filme.application.api.LocalizacaoDTO;
import academy.wakanda.indicadorfilmes.filme.application.service.ClimaClient;
import academy.wakanda.indicadorfilmes.filme.application.service.ClimaDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@RequiredArgsConstructor
public class ClimaInfraClient implements ClimaClient {
    private final ClimaFeignClient climaFeignClient;
    private String apiKey;
    private String units;

    @Override
    public ClimaDTO buscaClima(LocalizacaoDTO localizacao) {
        log.info("[start] ClimaInfraClient - buscaClima");
        ClimaDTO climaDTO = climaFeignClient.buscaClima(localizacao.getLatitude(), localizacao.getLongitude(), apiKey, units);
        log.info("[clima]{}",climaDTO);
        log.info("[finish] ClimaInfraClient - buscaClima");
        return climaDTO;
    }

    @Autowired
    public void setApiKey(@Value("${indicadorfilmes.clima.apikey}") String apiKey) {
        this.apiKey = apiKey;
    }

    @Autowired
    public void setUnits(@Value("${indicadorfilmes.clima.units}") String units) {
        this.units = units;
    }
}
