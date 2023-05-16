package com.homework.homework.listeners;

import com.homework.homework.events.AppleEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AppleListener {

    @EventListener
    public void usualListener(AppleEvent createAppleEvent)
    {
        log.info(createAppleEvent.getColor() + " apple");
    }
}
