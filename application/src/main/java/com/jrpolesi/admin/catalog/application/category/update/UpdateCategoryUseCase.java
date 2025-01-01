package com.jrpolesi.admin.catalog.application.category.update;

import com.jrpolesi.admin.catalog.application.UseCase;
import com.jrpolesi.admin.catalog.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class UpdateCategoryUseCase
        extends UseCase<UpdateCategoryCommand, Either<Notification, UpdateCategoryOutput>> {
}
