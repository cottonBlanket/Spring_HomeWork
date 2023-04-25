package com.homework.homework.controllers.dto.response;

import com.homework.homework.controllers.dto.request.CreateMiRequest;
import lombok.Value;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;

@Value
public class IoResponse {

    public int id;

    public String name;

    public int age;

    public String phrase;

    public IoResponse(CreateMiRequest model) {
        this.id = model.hashCode();
        this.name = model.getName();
        this.phrase = model.getPhrase();
        this.age = model.getAge();
    }
}
