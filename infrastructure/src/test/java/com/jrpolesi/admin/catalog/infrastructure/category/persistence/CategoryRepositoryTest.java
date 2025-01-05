package com.jrpolesi.admin.catalog.infrastructure.category.persistence;

import com.jrpolesi.admin.catalog.domain.category.Category;
import com.jrpolesi.admin.catalog.infrastructure.MySQLGatewayTest;
import org.hibernate.PropertyValueException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

@MySQLGatewayTest
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void givenAnInvalidNullName_whenCallsSave_shouldReturnError() {
        final var expectedPropertyName = "name";
        final var expectedMessage = "not-null property references a null or transient value : com.jrpolesi.admin.catalog.infrastructure.category.persistence.CategoryJpaEntity.name";

        final var aCategory = Category.newCategory("Filmes", "A categoria mais assistida", true);

        final var aEntity = CategoryJpaEntity.from(aCategory);
        aEntity.setName(null);

        final var actualException = Assertions
                .assertThrows(DataIntegrityViolationException.class, () -> categoryRepository.save(aEntity));

        final var actualCause = Assertions
                .assertInstanceOf(PropertyValueException.class, actualException.getCause());

        Assertions.assertEquals(expectedPropertyName, actualCause.getPropertyName());
        Assertions.assertEquals(expectedMessage, actualCause.getMessage());
    }

    @Test
    public void givenAnInvalidNullCreatedAt_whenCallsSave_shouldReturnError() {
        final var expectedPropertyName = "createdAt";
        final var expectedMessage = "not-null property references a null or transient value : com.jrpolesi.admin.catalog.infrastructure.category.persistence.CategoryJpaEntity.createdAt";

        final var aCategory = Category.newCategory("Filmes", "A categoria mais assistida", true);

        final var aEntity = CategoryJpaEntity.from(aCategory);
        aEntity.setCreatedAt(null);

        final var actualException = Assertions
                .assertThrows(DataIntegrityViolationException.class, () -> categoryRepository.save(aEntity));

        final var actualCause = Assertions
                .assertInstanceOf(PropertyValueException.class, actualException.getCause());

        Assertions.assertEquals(expectedPropertyName, actualCause.getPropertyName());
        Assertions.assertEquals(expectedMessage, actualCause.getMessage());
    }

    @Test
    public void givenAnInvalidNullUpdatedAt_whenCallsSave_shouldReturnError() {
        final var expectedPropertyName = "updatedAt";
        final var expectedMessage = "not-null property references a null or transient value : com.jrpolesi.admin.catalog.infrastructure.category.persistence.CategoryJpaEntity.updatedAt";

        final var aCategory = Category.newCategory("Filmes", "A categoria mais assistida", true);

        final var aEntity = CategoryJpaEntity.from(aCategory);
        aEntity.setUpdatedAt(null);

        final var actualException = Assertions
                .assertThrows(DataIntegrityViolationException.class, () -> categoryRepository.save(aEntity));

        final var actualCause = Assertions
                .assertInstanceOf(PropertyValueException.class, actualException.getCause());

        Assertions.assertEquals(expectedPropertyName, actualCause.getPropertyName());
        Assertions.assertEquals(expectedMessage, actualCause.getMessage());
    }
}
