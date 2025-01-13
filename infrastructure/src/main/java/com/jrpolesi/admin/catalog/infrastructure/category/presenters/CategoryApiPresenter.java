package com.jrpolesi.admin.catalog.infrastructure.category.presenters;

import com.jrpolesi.admin.catalog.application.category.retrieve.get.CategoryOutput;
import com.jrpolesi.admin.catalog.application.category.retrieve.list.CategoryListOutput;
import com.jrpolesi.admin.catalog.infrastructure.category.models.CategoryListResponse;
import com.jrpolesi.admin.catalog.infrastructure.category.models.CategoryResponse;

public interface CategoryApiPresenter {

    static CategoryResponse present(final CategoryOutput output) {
        return new CategoryResponse(
                output.id().getValue(),
                output.name(),
                output.description(),
                output.isActive(),
                output.createdAt(),
                output.updatedAt(),
                output.deletedAt()
        );
    }

    static CategoryListResponse present(final CategoryListOutput output) {
        return new CategoryListResponse(
                output.id().getValue(),
                output.name(),
                output.description(),
                output.isActive(),
                output.createdAt(),
                output.deletedAt()
        );
    }
}