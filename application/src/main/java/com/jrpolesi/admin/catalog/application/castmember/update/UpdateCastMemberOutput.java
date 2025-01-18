package com.jrpolesi.admin.catalog.application.castmember.update;

import com.jrpolesi.admin.catalog.domain.castmember.CastMember;
import com.jrpolesi.admin.catalog.domain.castmember.CastMemberID;

public record UpdateCastMemberOutput(String id) {

    public static UpdateCastMemberOutput from(final CastMemberID anId) {
        return new UpdateCastMemberOutput(anId.getValue());
    }

    public static UpdateCastMemberOutput from(final CastMember aMember) {
        return from(aMember.getId());
    }
}
