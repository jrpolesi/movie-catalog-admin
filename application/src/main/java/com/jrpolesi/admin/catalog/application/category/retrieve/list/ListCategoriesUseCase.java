package com.jrpolesi.admin.catalog.application.category.retrieve.list;

import com.jrpolesi.admin.catalog.application.UseCase;
import com.jrpolesi.admin.catalog.domain.pagination.SearchQuery;
import com.jrpolesi.admin.catalog.domain.pagination.Pagination;

public abstract class ListCategoriesUseCase
        extends UseCase<SearchQuery, Pagination<CategoryListOutput>> {
}
