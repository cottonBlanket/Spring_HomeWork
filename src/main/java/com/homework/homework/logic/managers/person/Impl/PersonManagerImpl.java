package com.homework.homework.logic.managers.person.Impl;

import com.homework.homework.api.controllers.publics.dto.request.RegisterRequest;
import com.homework.homework.api.controllers.publics.dto.request.RoleUpdateRequest;
import com.homework.homework.api.controllers.publics.dto.response.ChangePersonRoleResponse;
import com.homework.homework.api.controllers.publics.dto.response.CheckApiResponse;
import com.homework.homework.api.controllers.publics.dto.response.RegisterResponse;
import com.homework.homework.dal.person.Person;
import com.homework.homework.dal.person.repo.PersonRepository;
import com.homework.homework.logic.factory.PersonFactory;
import com.homework.homework.logic.managers.person.PersonManager;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class PersonManagerImpl implements PersonManager {

    PersonRepository personRepository;
    PersonFactory personFactory;


    @Override
    public RegisterResponse registerPerson(RegisterRequest request) {
        Person person = personFactory.createPersonFrom(request);
        person = personRepository.save(person);
        return personFactory.createRegisterResponseFrom(person);
    }

    @Override
    public ChangePersonRoleResponse ChangePersonRole(RoleUpdateRequest request) {
        Person person = personRepository.findById(request.getUserId()).orElseThrow();
        person.setRole("ROLE_" + request.getRole());
        personRepository.save(person);
        return personFactory.createChangePersonRoleResponse(person);
    }

    @Override
    public CheckApiResponse checkApi(String username) {
        Person person = personRepository.findPersonByUsername(username);
        return personFactory.createCheckApiResponse(person);
    }
}
