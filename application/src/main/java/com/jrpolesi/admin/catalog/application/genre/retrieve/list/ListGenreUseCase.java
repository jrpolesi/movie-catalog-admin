package com.jrpolesi.admin.catalog.application.genre.retrieve.list;

import com.jrpolesi.admin.catalog.application.UseCase;
import com.jrpolesi.admin.catalog.domain.pagination.Pagination;
import com.jrpolesi.admin.catalog.domain.pagination.SearchQuery;

public abstract class ListGenreUseCase
        extends UseCase<SearchQuery, Pagination<GenreListOutput>> {
}
