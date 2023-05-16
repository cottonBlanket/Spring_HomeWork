package com.homework.homework.events;

import org.springframework.context.ApplicationEvent;

public class BananaEvent extends ApplicationEvent {
    String property;

    public BananaEvent(Object source, String property) {
        super(source);
        this.property = property;
    }
    public String getProperty() {
        return property;
    }
}
