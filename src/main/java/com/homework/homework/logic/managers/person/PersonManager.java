package com.homework.homework.logic.managers.person;

import com.homework.homework.api.controllers.publics.dto.request.RegisterRequest;
import com.homework.homework.api.controllers.publics.dto.request.RoleUpdateRequest;
import com.homework.homework.api.controllers.publics.dto.response.ChangePersonRoleResponse;
import com.homework.homework.api.controllers.publics.dto.response.CheckApiResponse;
import com.homework.homework.api.controllers.publics.dto.response.RegisterResponse;

public interface PersonManager {
    RegisterResponse registerPerson(RegisterRequest request);
    ChangePersonRoleResponse ChangePersonRole(RoleUpdateRequest request);
    CheckApiResponse checkApi(String username);
}
