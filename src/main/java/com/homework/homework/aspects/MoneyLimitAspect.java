package com.homework.homework.aspects;

import com.homework.homework.exceptions.MoneyLimitException;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Aspect
@Component
public class MoneyLimitAspect {
    private Map<String, Integer> apiAccessMap = new ConcurrentHashMap<>();
    @Value("${money.limit}")
    private int apiLimit;

    @Before("@annotation(com.homework.homework.annotation.MoneyLimit)")
    public void  beforeApiLimit(JoinPoint joinPoint) throws MoneyLimitException {
        var methodName = joinPoint.getSignature().getName();
        var count = apiAccessMap.getOrDefault(methodName, 0) + 1;
        apiAccessMap.put(methodName, count);
        if (count > apiLimit) {
            throw new MoneyLimitException("MoneyLimitException");
        }
    }
}
