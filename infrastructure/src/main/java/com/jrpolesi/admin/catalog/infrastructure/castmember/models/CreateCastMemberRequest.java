package com.jrpolesi.admin.catalog.infrastructure.castmember.models;

import com.jrpolesi.admin.catalog.domain.castmember.CastMemberType;

public record CreateCastMemberRequest(String name, CastMemberType type) {
}
