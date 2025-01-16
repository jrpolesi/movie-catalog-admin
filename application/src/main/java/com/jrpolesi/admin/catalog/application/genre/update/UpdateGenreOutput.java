package com.jrpolesi.admin.catalog.application.genre.update;

import com.jrpolesi.admin.catalog.domain.genre.Genre;

public record UpdateGenreOutput(String id) {

    public static UpdateGenreOutput from(final Genre aGenre) {
        return new UpdateGenreOutput(aGenre.getId().getValue());
    }
}