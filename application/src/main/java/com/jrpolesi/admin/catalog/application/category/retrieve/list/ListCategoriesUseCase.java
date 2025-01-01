package com.jrpolesi.admin.catalog.application.category.retrieve.list;

import com.jrpolesi.admin.catalog.application.UseCase;
import com.jrpolesi.admin.catalog.domain.category.CategorySearchQuery;
import com.jrpolesi.admin.catalog.domain.pagination.Pagination;

public abstract class ListCategoriesUseCase
        extends UseCase<CategorySearchQuery, Pagination<CategoryListOutput>> {
}
