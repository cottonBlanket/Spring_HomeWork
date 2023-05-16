package com.homework.homework.listeners;

import com.homework.homework.events.FruitEvent;
import com.homework.homework.events.OrangeEvent;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;


@Component
@Slf4j
public class OrangeTransactionalListener {
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    @SneakyThrows
    public FruitEvent transactionalListener(OrangeEvent orangeEvent)
    {
        log.info("Orange weight: " + orangeEvent.getWeight());
        return new FruitEvent(orangeEvent.getSource(), "yes");
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    @SneakyThrows
    public void transactionalListener(FruitEvent fruitEvent) {
        log.info("All fruits was sent: " + fruitEvent.getIsAll());
    }
}
