package com.homework.homework.api.controllers.publics.dto.request;

import lombok.Value;

@Value
public class RoleUpdateRequest {

    Long userId;

    String role;

    public String getRole() {
        return role;
    }

    public Long getUserId() {
        return userId;
    }
}
