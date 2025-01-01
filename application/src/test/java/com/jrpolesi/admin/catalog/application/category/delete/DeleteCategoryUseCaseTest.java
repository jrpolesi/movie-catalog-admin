package com.jrpolesi.admin.catalog.application.category.delete;

import com.jrpolesi.admin.catalog.domain.category.Category;
import com.jrpolesi.admin.catalog.domain.category.CategoryGateway;
import com.jrpolesi.admin.catalog.domain.category.CategoryID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DeleteCategoryUseCaseTest {
    @InjectMocks
    private DefaultDeleteCategoryUseCase useCase;

    @Mock
    private CategoryGateway categoryGateway;

    @BeforeEach
    void cleanUp() {
        Mockito.reset(categoryGateway);
    }

    @Test
    public void givenAValidID_whenCallsDeleteCategory_shouldBeOK() {
        final var aCategory = Category.newCategory("Filmes", "A categoria mais assistida", true);
        final var expectedId = aCategory.getId();

        doNothing()
                .when(categoryGateway).deleteById(expectedId);

        Assertions.assertDoesNotThrow(() -> useCase.execute(expectedId.getValue()));

        Mockito.verify(categoryGateway, times(1)).deleteById(eq(expectedId));
    }

    @Test
    public void givenAInvalidID_whenCallsDeleteCategory_shouldBeOK() {
        final var expectedId = CategoryID.from("123");

        doNothing()
                .when(categoryGateway).deleteById(expectedId);

        Assertions.assertDoesNotThrow(() -> useCase.execute(expectedId.getValue()));

        Mockito.verify(categoryGateway, times(1)).deleteById(eq(expectedId));
    }

    @Test
    public void givenAValidID_whenGatewayThrowsException_shouldReturnException() {
        final var aCategory = Category.newCategory("Filmes", "A categoria mais assistida", true);
        final var expectedId = aCategory.getId();

        doThrow(new IllegalStateException("Gateway error"))
                .when(categoryGateway).deleteById(expectedId);

        Assertions.assertThrows(
                IllegalStateException.class,
                () -> useCase.execute(expectedId.getValue())
        );

        Mockito.verify(categoryGateway, times(1)).deleteById(eq(expectedId));
    }
}
