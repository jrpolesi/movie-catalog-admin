package com.jrpolesi.admin.catalog.application.castmember.delete;

import com.jrpolesi.admin.catalog.application.UnitUseCase;

public sealed abstract class DeleteCastMemberUseCase
        extends UnitUseCase<String>
        permits DefaultDeleteCastMemberUseCase {
}
