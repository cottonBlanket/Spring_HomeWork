package com.homework.homework.managers;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ChocolateService {

    MeterRegistry meterRegistry;

    private void countChocolateIncrement(String chocolateName) {
        Counter counter = meterRegistry.counter(chocolateName);
        counter.increment();
    }

    public String snickers() {
        countChocolateIncrement("snickers");
        return "Snickers";
    }

    public String twix() {
        countChocolateIncrement("twix");
        return "Twix";
    }

    public String kitKat() {
        countChocolateIncrement("kitKat");
        return "KitKat";
    }
}
