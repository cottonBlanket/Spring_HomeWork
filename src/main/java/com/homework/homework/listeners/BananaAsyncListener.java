package com.homework.homework.listeners;

import com.homework.homework.events.BananaEvent;
import com.homework.homework.events.OrangeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
@Slf4j
public class BananaAsyncListener {

    @EventListener
    @Async
    public void asyncListener(BananaEvent bananaEvent) {
        log.info(bananaEvent.getProperty() + " banana");
    }

}
