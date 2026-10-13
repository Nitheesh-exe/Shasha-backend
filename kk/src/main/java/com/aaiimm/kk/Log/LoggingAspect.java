package com.aaiimm.kk.Log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.aaiimm.kk.controller.*.*(..))")
    public Object logMethod(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().getName();

        long start = System.currentTimeMillis();
        log.info("Started: {}", methodName);
        Object result = joinPoint.proceed();
        log.info("Finished: {} in {} ms",
                methodName,
                System.currentTimeMillis() - start);

        return result;
    }
}