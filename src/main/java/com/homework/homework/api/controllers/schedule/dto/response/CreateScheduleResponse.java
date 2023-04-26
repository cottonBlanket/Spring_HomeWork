package com.homework.homework.api.controllers.schedule.dto.response;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateScheduleResponse {

    public Long id;

    public String name;
}
