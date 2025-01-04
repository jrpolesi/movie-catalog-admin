package com.jrpolesi.admin.catalog.infrastructure.category;

import com.jrpolesi.admin.catalog.domain.category.Category;
import com.jrpolesi.admin.catalog.domain.category.CategoryGateway;
import com.jrpolesi.admin.catalog.domain.category.CategoryID;
import com.jrpolesi.admin.catalog.domain.category.CategorySearchQuery;
import com.jrpolesi.admin.catalog.domain.pagination.Pagination;
import com.jrpolesi.admin.catalog.infrastructure.category.persistence.CategoryRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CategoryMySQLGateway implements CategoryGateway {

    private final CategoryRepository repository;

    public CategoryMySQLGateway(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Category create(Category aCategory) {
        return null;
    }

    @Override
    public void deleteById(CategoryID anId) {

    }

    @Override
    public Optional<Category> findById(CategoryID anId) {
        return Optional.empty();
    }

    @Override
    public Category update(Category aCategory) {
        return null;
    }

    @Override
    public Pagination<Category> findAll(CategorySearchQuery aQuery) {
        return null;
    }
}
