package com.example.demointerview.intercepter;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Logging {
    /**
     * @return Request log type
     */
    LogType request() default LogType.REQUEST;

    /**
     * @return Response log type
     */
    LogType response() default LogType.RESPONSE;
}