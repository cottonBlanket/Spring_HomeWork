package com.homework.homework.api.controllers.publics.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.FieldDefaults;

@Value
@Builder
@FieldDefaults(level = AccessLevel.PUBLIC)
public class ChangePersonRoleResponse {
    Long id;
    String username;
    String role;
}
