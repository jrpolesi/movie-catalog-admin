package com.jrpolesi.admin.catalog.application.genre.retrieve.list;

import com.jrpolesi.admin.catalog.domain.genre.GenreGateway;
import com.jrpolesi.admin.catalog.domain.pagination.Pagination;
import com.jrpolesi.admin.catalog.domain.pagination.SearchQuery;

import java.util.Objects;

public class DefaultListGenreUseCase extends ListGenreUseCase {

    private final GenreGateway genreGateway;

    public DefaultListGenreUseCase(final GenreGateway genreGateway) {
        this.genreGateway = Objects.requireNonNull(genreGateway);
    }

    @Override
    public Pagination<GenreListOutput> execute(final SearchQuery aQuery) {
        return this.genreGateway.findAll(aQuery)
                .map(GenreListOutput::from);
    }
}
