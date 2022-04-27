package com.chenhao.test.test2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4JDemo {
    private static final Logger logger = LoggerFactory.getLogger(Log4JDemo.class);
    public static void main(String[] args) {
        logger.debug("debug级别的日志");
        logger.info("info级别的日志");
        logger.warn("warn级别的日志");
        logger.error("error级别的日志");
    }
}
