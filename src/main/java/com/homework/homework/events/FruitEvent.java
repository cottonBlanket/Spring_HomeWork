package com.homework.homework.events;

import org.springframework.context.ApplicationEvent;

public class FruitEvent extends ApplicationEvent {
    String isAll;
    public FruitEvent(Object source, String isAll) {
        super(source);
        this.isAll = isAll;
    }

    public String getIsAll() {
        return isAll;
    }
}
