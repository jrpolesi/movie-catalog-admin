package com.jrpolesi.admin.catalog.application.castmember.retrieve.get;

import com.jrpolesi.admin.catalog.application.UseCase;

public sealed abstract class GetCastMemberByIdUseCase
        extends UseCase<String, CastMemberOutput>
        permits DefaultGetCastMemberByIdUseCase {
}
