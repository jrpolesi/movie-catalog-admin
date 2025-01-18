package com.jrpolesi.admin.catalog.application.castmember.create;

import com.jrpolesi.admin.catalog.application.UseCase;


public sealed abstract class CreateCastMemberUseCase
        extends UseCase<CreateCastMemberCommand, CreateCastMemberOutput>
        permits DefaultCreateCastMemberUseCase {
}

