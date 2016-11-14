package com.dvoss;

/**
 * Created by Dan on 11/14/16.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Fog Creek problem:
 * Sort the characters in the following string:
 * abcdefghijklmnopqrstuvwxyz_
 * by the number of times the character appears in stringsort.txt (descending)
 * Now take the sorted string, and drop all the characters after (and including) the _.
 * The remaining word is the answer.
 */

public class StringSortProblem {

    public static void main(String[] args) throws FileNotFoundException {

        String s = "abcdefghijklmnopqrstuvwxyz_";
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(String.valueOf(s.charAt(i)))) {
                map.put(String.valueOf(s.charAt(i)), new ArrayList<>());
            }
        }

        File f = new File("stringsort.txt");
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                ArrayList<String> letters = map.get(String.valueOf(line.charAt(i)));
                letters.add(String.valueOf(line.charAt(i)));
            }
        }
    }
}
