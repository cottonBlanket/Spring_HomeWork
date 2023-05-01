package com.homework.homework.api.controllers.publics;

import com.homework.homework.api.annotation.PublicApi;
import com.homework.homework.api.controllers.publics.dto.request.RegisterRequest;
import com.homework.homework.api.controllers.publics.dto.request.RoleUpdateRequest;
import com.homework.homework.dal.person.Person;
import com.homework.homework.dal.person.repo.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    PersonRepository personRepository;
    PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        Person person = RegisterRequest.RegisterProfile.MapPersonFrom(request);
        person.setPassword(passwordEncoder.encode(request.getPassword()));
        var a = personRepository.save(person);
        return a.getId().toString();
    }

    @PatchMapping("/role")
    public void changeRole(@RequestBody RoleUpdateRequest request) {
        Person person = personRepository.getReferenceById(request.getUserId());
        person.setRole(request.getRole());
        personRepository.save(person);
    }

    @GetMapping("/check")
    public ResponseEntity<String> checkPublicApi() {
        return new ResponseEntity<>("I'm Halk", HttpStatus.OK);
    }
}
