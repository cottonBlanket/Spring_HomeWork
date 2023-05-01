package com.homework.homework.api.annotation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.annotation.*;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Documented
@RestController
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@RequestMapping(value = "/api/admin", produces = APPLICATION_JSON_VALUE)
public @interface AdminApi {
}
