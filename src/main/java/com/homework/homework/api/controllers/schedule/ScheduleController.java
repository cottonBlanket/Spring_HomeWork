package com.homework.homework.api.controllers.schedule;

import com.homework.homework.api.controllers.schedule.dto.request.CreateScheduleRequest;
import com.homework.homework.api.controllers.schedule.dto.response.CreateScheduleResponse;
import com.homework.homework.api.controllers.schedule.dto.response.ScheduleResponse;
import com.homework.homework.dal.event.Event;
import com.homework.homework.dal.schedule.Schedule;
import com.homework.homework.dal.schedule.repo.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static lombok.AccessLevel.PRIVATE;
import static org.apache.tomcat.util.IntrospectionUtils.convert;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping(value = "/schedule", produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class ScheduleController {

    ScheduleRepository scheduleRepository;

    @PostMapping("/create")
    public ResponseEntity<CreateScheduleResponse> createSchedule(@RequestBody CreateScheduleRequest request)
    {
        Schedule entity = Schedule.builder()
                .name(request.getName())
                .build();
        List<Event> events = request.getEvents().stream().map(x -> Event.builder().name(x).schedule(entity).build()).collect(Collectors.toList());
        entity.setEvents(events);
        var result = scheduleRepository.save(entity);
        return new ResponseEntity<>(CreateScheduleResponse
                .builder()
                .id(result.getId())
                .name(result.getName())
                .build()
                , HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ScheduleResponse>> getAllSchedules()
    {
        List<Schedule> schedules = scheduleRepository.findAll();
        List<ScheduleResponse> response = schedules
                        .stream()
                        .map(x -> ScheduleResponse
                                        .builder()
                                        .name(x.getName())
                                        .events(x.getEvents()
                                                .stream()
                                                .map(Event::getName)
                                                .collect(Collectors.toList()))
                                        .build())
                        .collect(Collectors.toList());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
