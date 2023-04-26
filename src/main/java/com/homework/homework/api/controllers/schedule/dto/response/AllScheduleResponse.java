package com.homework.homework.api.controllers.schedule.dto.response;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class AllScheduleResponse {
    public List<ScheduleResponse> schedules;
}
