package com.jrpolesi.admin.catalog.application.category;

import com.jrpolesi.admin.catalog.IntegrationTest;
import com.jrpolesi.admin.catalog.application.category.create.CreateCategoryUseCase;
import com.jrpolesi.admin.catalog.infrastructure.category.persistence.CategoryRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@IntegrationTest
public class SampleIT {

    @Autowired
    private CreateCategoryUseCase useCase;

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void testInjects() {
        Assertions.assertNotNull(useCase);
        Assertions.assertNotNull(categoryRepository);
    }
}
