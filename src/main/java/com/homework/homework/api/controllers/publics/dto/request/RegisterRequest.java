package com.homework.homework.api.controllers.publics.dto.request;

import com.homework.homework.dal.person.Person;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Getter
public class RegisterRequest {

    String username;

    String password;

    String role;
}
