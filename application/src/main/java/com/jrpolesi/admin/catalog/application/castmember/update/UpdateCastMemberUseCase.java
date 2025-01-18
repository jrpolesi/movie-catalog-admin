package com.jrpolesi.admin.catalog.application.castmember.update;

import com.jrpolesi.admin.catalog.application.UseCase;

public sealed abstract class UpdateCastMemberUseCase
        extends UseCase<UpdateCastMemberCommand, UpdateCastMemberOutput>
        permits DefaultUpdateCastMemberUseCase {
}
