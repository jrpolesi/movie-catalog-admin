package com.jrpolesi.admin.catalog.application.genre.retrieve.get;

import com.jrpolesi.admin.catalog.domain.exceptions.NotFoundException;
import com.jrpolesi.admin.catalog.domain.genre.Genre;
import com.jrpolesi.admin.catalog.domain.genre.GenreGateway;
import com.jrpolesi.admin.catalog.domain.genre.GenreID;

import java.util.Objects;

public class DefaultGetGenreByIdUseCase extends GetGenreByIdUseCase {

    private final GenreGateway genreGateway;

    public DefaultGetGenreByIdUseCase(final GenreGateway genreGateway) {
        this.genreGateway = Objects.requireNonNull(genreGateway);
    }

    @Override
    public GenreOutput execute(final String anIn) {
        final var aGenreId = GenreID.from(anIn);
        return this.genreGateway.findById(aGenreId)
                .map(GenreOutput::from)
                .orElseThrow(() -> NotFoundException.with(Genre.class, aGenreId));
    }
}
