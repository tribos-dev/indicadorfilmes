package academy.wakanda.indicadorfilmes.filme.infra;

import academy.wakanda.indicadorfilmes.filme.application.api.FilmeResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "filmeClientFeign", url = "${indicadorfilmes.filme.server}", configuration = FilmeClientConfiguration.class)
public interface FilmeClientFeign {

    @GetMapping("/3/discover/movie?include_adult=false&include_video=false&language=pt-BR&sort_by=popularity.desc")
    FilmeResponseData buscaFilmeAtravesCategoriaId(@RequestParam("with_genres") Integer categoriaId);
}
