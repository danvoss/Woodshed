package com.dvoss;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by Dan on 11/30/16.
 */
public class PrintWrite {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> lines = new ArrayList<>();
        lines.add("1. one");
        lines.add("2. two");
        lines.add("3. three");

        PrintWriter out = new PrintWriter("output.txt");
        for (String line : lines) {
            out.println(line.toUpperCase());
        }
        out.close();

        System.out.println("Finished.");
    }
}
