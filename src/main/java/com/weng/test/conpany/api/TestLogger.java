package com.weng.test.conpany.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogger.class);



    public static void main(String[] args) {
        LOGGER.debug("Debug level log: username=zhangsan");
        LOGGER.info("Info level log: username=zhangsan");
        try {
            int a=1/0;
        } catch (Exception e) {
            LOGGER.error("Error level log: username = " + e);
        }
    }
}
