package com.homework.homework.api.controllers.admin;

import com.homework.homework.api.annotation.AdminApi;
import com.homework.homework.api.controllers.publics.dto.response.CheckApiResponse;
import com.homework.homework.logic.managers.person.PersonManager;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;

@AdminApi
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AdminController {
    PersonManager personManager;

    @GetMapping("/check")
    public ResponseEntity<CheckApiResponse> CheckAdminApi(Authentication auth) {

        return new ResponseEntity<>(personManager.checkApi(auth.getName()), HttpStatus.OK);
    }

}
