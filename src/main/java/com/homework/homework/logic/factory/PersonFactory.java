package com.homework.homework.logic.factory;

import com.homework.homework.api.controllers.publics.dto.request.RegisterRequest;
import com.homework.homework.api.controllers.publics.dto.response.ChangePersonRoleResponse;
import com.homework.homework.api.controllers.publics.dto.response.CheckApiResponse;
import com.homework.homework.api.controllers.publics.dto.response.RegisterResponse;
import com.homework.homework.dal.person.Person;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class PersonFactory {
    PasswordEncoder passwordEncoder;

    public Person createPersonFrom(RegisterRequest request) {
        return Person
                .builder()
                .username(request.getUsername())
                .role("ROLE_" + request.getRole().toUpperCase())
                .password(passwordEncoder.encode(request.getPassword()))
                .enabled(true)
                .build();

    }

    public RegisterResponse createRegisterResponseFrom(Person person) {
        return  RegisterResponse
                .builder()
                .id(person.getId())
                .username(person.getUsername())
                .build();
    }

    public ChangePersonRoleResponse createChangePersonRoleResponse(Person person) {
        return ChangePersonRoleResponse
                .builder()
                .id(person.getId())
                .username(person.getUsername())
                .role(person.getRole())
                .build();
    }

    public CheckApiResponse createCheckApiResponse(Person person) {
        return CheckApiResponse
                .builder()
                .username(person.getUsername())
                .role(person.getRole())
                .build();
    }
}
