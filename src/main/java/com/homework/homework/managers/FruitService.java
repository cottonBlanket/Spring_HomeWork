package com.homework.homework.managers;

import com.homework.homework.events.AppleEvent;
import com.homework.homework.events.BananaEvent;
import com.homework.homework.events.OrangeEvent;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class FruitService {

    ApplicationEventPublisher applicationEventPublisher;

    public String apple(String color) {
        applicationEventPublisher.publishEvent(new AppleEvent(this, color));
        return color + " apple";
    }

    public String banana(String property) {
        applicationEventPublisher.publishEvent(new BananaEvent(this, property));
        return property + " banana";
    }

    @Transactional
    public String orange(Integer weight) {
        applicationEventPublisher.publishEvent(new OrangeEvent(this, weight));
        return "orange weight: " + weight;
    }
}
