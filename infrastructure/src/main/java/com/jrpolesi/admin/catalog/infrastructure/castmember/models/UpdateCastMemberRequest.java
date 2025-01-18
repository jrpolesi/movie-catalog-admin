package com.jrpolesi.admin.catalog.infrastructure.castmember.models;

import com.jrpolesi.admin.catalog.domain.castmember.CastMemberType;

public record UpdateCastMemberRequest(String name, CastMemberType type) {
}
