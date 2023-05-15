package com.homework.homework.api.controllers.publics;

import com.homework.homework.api.annotation.PublicApi;
import com.homework.homework.api.controllers.publics.dto.request.RegisterRequest;
import com.homework.homework.api.controllers.publics.dto.request.RoleUpdateRequest;
import com.homework.homework.api.controllers.publics.dto.response.ChangePersonRoleResponse;
import com.homework.homework.api.controllers.publics.dto.response.CheckApiResponse;
import com.homework.homework.api.controllers.publics.dto.response.RegisterResponse;
import com.homework.homework.dal.person.Person;
import com.homework.homework.dal.person.repo.PersonRepository;
import com.homework.homework.logic.managers.person.PersonManager;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static lombok.AccessLevel.PRIVATE;

@PublicApi
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class PublicController {

    PersonManager personManager;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest request) {
        return new ResponseEntity<>(personManager.registerPerson(request), HttpStatus.OK);
    }

    @PatchMapping("/role")
    public ResponseEntity<ChangePersonRoleResponse> changeRole(@RequestBody RoleUpdateRequest request) {
        return new ResponseEntity<>(personManager.ChangePersonRole(request), HttpStatus.OK);
    }

    @GetMapping("/check")
    public ResponseEntity<CheckApiResponse> checkPublicApi(Authentication auth) {

        return new ResponseEntity<>(personManager.checkApi(auth.getName()), HttpStatus.OK);
    }
}
