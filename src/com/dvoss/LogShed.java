package com.dvoss;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Created by Dan on 10/25/16.
 */
public class LogShed {

    private static final Logger l = Logger.getLogger(LogShed.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();
        l.info("Test");
    }
}
