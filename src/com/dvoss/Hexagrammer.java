package com.dvoss;

import java.util.Random;

/**
 * Created by Dan on 1/1/17.
 */
public class Hexagrammer {

    static final String YANG = "__________";
    static final String YIN = "____  ____";

    public static void main(String[] args) {

        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            if (r.nextBoolean()) {
                System.out.println(YANG);
            }
            else {
                System.out.println(YIN);
            }
        }
    }
}
