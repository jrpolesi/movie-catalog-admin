package com.jrpolesi.admin.catalog.infrastructure.genre;

import com.jrpolesi.admin.catalog.domain.genre.Genre;
import com.jrpolesi.admin.catalog.domain.genre.GenreGateway;
import com.jrpolesi.admin.catalog.domain.genre.GenreID;
import com.jrpolesi.admin.catalog.domain.pagination.Pagination;
import com.jrpolesi.admin.catalog.domain.pagination.SearchQuery;
import com.jrpolesi.admin.catalog.infrastructure.genre.persistence.GenreJpaEntity;
import com.jrpolesi.admin.catalog.infrastructure.genre.persistence.GenreRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class GenreMySQLGateway implements GenreGateway {

    private final GenreRepository genreRepository;

    public GenreMySQLGateway(final GenreRepository genreRepository) {
        this.genreRepository = Objects.requireNonNull(genreRepository);
    }

    @Override
    public Genre create(final Genre aGenre) {
        return save(aGenre);
    }

    @Override
    public void deleteById(final GenreID anId) {
        final var aGenreId = anId.getValue();
        if (this.genreRepository.existsById(aGenreId)) {
            this.genreRepository.deleteById(aGenreId);
        }
    }

    @Override
    public Optional<Genre> findById(GenreID anId) {
        return Optional.empty();
    }

    @Override
    public Genre update(final Genre aGenre) {
        return save(aGenre);
    }

    @Override
    public Pagination<Genre> findAll(SearchQuery aQuery) {
        return null;
    }

    @Override
    public List<GenreID> existsByIds(Iterable<GenreID> ids) {
        return List.of();
    }

    private Genre save(final Genre aGenre) {
        return this.genreRepository.save(GenreJpaEntity.from(aGenre))
                .toAggregate();
    }
}
