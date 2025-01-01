package com.jrpolesi.admin.catalog.application.category.create;

import com.jrpolesi.admin.catalog.application.UseCase;
import com.jrpolesi.admin.catalog.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase
        extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {

}
