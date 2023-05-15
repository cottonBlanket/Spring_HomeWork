package com.homework.homework.api.controllers.support;

import com.homework.homework.api.annotation.SupportApi;
import com.homework.homework.api.controllers.publics.dto.response.CheckApiResponse;
import com.homework.homework.logic.managers.person.PersonManager;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;

@SupportApi
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class SupportController {
    PersonManager personManager;

    @GetMapping("check")
    public ResponseEntity<CheckApiResponse> checkSupportApi(Authentication auth) {
        return new ResponseEntity<>(personManager.checkApi(auth.getName()), HttpStatus.OK);
    }
}
