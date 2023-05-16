package com.homework.homework.events;

import org.springframework.context.ApplicationEvent;

public class OrangeEvent extends ApplicationEvent {

    Integer weight;
    public OrangeEvent(Object source, Integer weight) {
        super(source);
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }
}
