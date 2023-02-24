package com.example.demointerview.intercepter;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationUtils;

import java.lang.reflect.Method;

@Aspect
@Slf4j
public class LogAspect {
    @Before("@within(Logging) || @annotation(Logging)")
    public void logBefore(JoinPoint joinPoint) {
        log.info("method: {}, type: {}, {}", getMethodName(joinPoint), getLogType(joinPoint, true), joinPoint.getArgs());
    }

    @AfterReturning(value = "@within(Logging) || @annotation(Logging)", returning = "obj")
    public void afterReturning(JoinPoint joinPoint, Object obj) {
        log.info("method: {}, type: {}, {}", getLogType(joinPoint, false), getMethodName(joinPoint), obj);
    }

    @AfterThrowing(value = "@within(Logging)  || @annotation(Logging)", throwing = "ex")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex) {
        log.error("method: {}, type: {}, {}", getLogType(joinPoint, false), getMethodName(joinPoint), ex.getMessage());
    }

    protected String getMethodName(JoinPoint joinPoint) {
        String method = "";
        if (joinPoint.getSignature() instanceof MethodSignature methodSignature) {
            method = methodSignature.getDeclaringTypeName().concat(".").concat(methodSignature.getName());
        }
        return method;
    }

    protected LogType getLogType(JoinPoint joinPoint, boolean request) {
        if (joinPoint.getSignature() instanceof MethodSignature methodSignature) {
            Method method = methodSignature.getMethod();
            Logging logging = AnnotatedElementUtils.findMergedAnnotation(method, Logging.class);
            if (logging == null) {
                logging = AnnotationUtils.findAnnotation(method.getDeclaringClass(), Logging.class);
            }
            if (logging != null) {
                return request ? logging.request() : logging.response();
            }
        }
        return LogType.TRACING;
    }
}
