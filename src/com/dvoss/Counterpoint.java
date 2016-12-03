package com.dvoss;

import java.util.ArrayList;

/**
 * Created by Dan on 12/3/16.
 */

/* a class to fiddle with generating species counterpoint on a given cantus */

public class Counterpoint {

    static int[] cantus = new int[] {1,2,3,4,5,4,3,2,1};
    static ArrayList<Integer> arrayList = new ArrayList();

    public static void main(String[] args) {

        for (int i = 0; i < cantus.length; i++) {
            arrayList.add(cantus[i] + 4);
        }

        System.out.println(arrayList.toString());
    }
}
