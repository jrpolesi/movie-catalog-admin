package com.jrpolesi.admin.catalog.application.castmember.retrieve.get;

import com.jrpolesi.admin.catalog.domain.castmember.CastMember;
import com.jrpolesi.admin.catalog.domain.castmember.CastMemberGateway;
import com.jrpolesi.admin.catalog.domain.castmember.CastMemberID;
import com.jrpolesi.admin.catalog.domain.exceptions.NotFoundException;

import java.util.Objects;

public non-sealed class DefaultGetCastMemberByIdUseCase extends GetCastMemberByIdUseCase {

    private final CastMemberGateway castMemberGateway;

    public DefaultGetCastMemberByIdUseCase(final CastMemberGateway castMemberGateway) {
        this.castMemberGateway = Objects.requireNonNull(castMemberGateway);
    }

    @Override
    public CastMemberOutput execute(final String anIn) {
        final var aMemberId = CastMemberID.from(anIn);
        return this.castMemberGateway.findById(aMemberId)
                .map(CastMemberOutput::from)
                .orElseThrow(() -> NotFoundException.with(CastMember.class, aMemberId));
    }
}
