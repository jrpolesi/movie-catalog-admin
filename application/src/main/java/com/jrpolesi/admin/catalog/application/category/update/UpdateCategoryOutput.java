package com.jrpolesi.admin.catalog.application.category.update;

import com.jrpolesi.admin.catalog.domain.category.Category;
import com.jrpolesi.admin.catalog.domain.category.CategoryID;

public record UpdateCategoryOutput(
        CategoryID id
) {
    public static UpdateCategoryOutput from(final Category aCategory) {
        return new UpdateCategoryOutput(aCategory.getId());
    }
}
