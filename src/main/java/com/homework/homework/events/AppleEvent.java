package com.homework.homework.events;

import org.springframework.context.ApplicationEvent;

public class AppleEvent extends ApplicationEvent {
    String color;
    public AppleEvent(Object source, String color) {
        super(source);
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
