package com.homework.homework.api.controllers.schedule.dto.request;

import lombok.Value;

import java.util.List;

@Value
public class   CreateScheduleRequest {

    String name;

    List<String> events;

    public String getName() {
        return name;
    }

    public List<String> getEvents() {
        return events;
    }
}
