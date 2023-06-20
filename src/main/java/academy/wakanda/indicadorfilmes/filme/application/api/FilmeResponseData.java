package academy.wakanda.indicadorfilmes.filme.application.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@ToString
public class FilmeResponseData {
    private List<FilmeResponse> results;

    @Getter
    @ToString
    public static class FilmeResponse {
        private int id;
        @JsonProperty("original_title")
        private String originalTitle;
        private String title;
        private String overview;
        @JsonProperty("release_date")
        private String releaseDate;
        @JsonProperty("vote_average")
        private double voteAverage;
        @JsonProperty("vote_count")
        private int voteCount;
    }
}
