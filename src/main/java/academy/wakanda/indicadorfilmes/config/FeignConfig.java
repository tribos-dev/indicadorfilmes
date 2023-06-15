package academy.wakanda.indicadorfilmes.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "academy.wakanda.indicadorfilmes")
public class FeignConfig {
    // Configurações adicionais do Feign, se necessário
}
