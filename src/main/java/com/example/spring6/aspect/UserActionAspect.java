package com.example.spring6.aspect;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
@RequiredArgsConstructor
public class UserActionAspect {

    @Around("@annotation(com.example.spring6.aspect.TrackUserAction)")
    public Object trackUserAction(ProceedingJoinPoint joinPoint) throws Throwable {
        // Получение информации о вызываемом методе
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getSimpleName();
        Object[] args = joinPoint.getArgs();
        Logger logger = Logger.getLogger(getClass().getName());

        // Логирование вызываемого метода
        logger.info("Вызван класс {" + className + "} метод {" + methodName
                + "} с аргументами: {" + Arrays.toString(args) + "}");

        return joinPoint.proceed();
    }
}
