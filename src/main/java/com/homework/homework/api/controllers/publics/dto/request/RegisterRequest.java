package com.homework.homework.api.controllers.publics.dto.request;

import com.homework.homework.dal.person.Person;
import lombok.Builder;
import lombok.Value;

@Value
public class RegisterRequest {

    String username;

    String password;

    String role;

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public static class RegisterProfile {
        public static Person MapPersonFrom(RegisterRequest model) {
            return Person
                    .builder()
                    .username(model.getUsername())
                    .role("ROLE_" + model.getRole().toUpperCase())
                    .enabled(true)
                    .build();
        }
    }
}
