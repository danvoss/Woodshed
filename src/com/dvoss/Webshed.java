package com.dvoss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Dan on 9/15/16.
 */

public class WebShed {

    public static void main(String[] args) throws IOException {

        /* uses InputStreamReader to read html with URL object
           from Niemeyer and Leuck */

        URL u = new URL("https://danvoss.github.io/index.html");
        BufferedReader b = new BufferedReader(new InputStreamReader(u.openStream()));

        String l;
        while ((l = b.readLine()) != null) {
            System.out.println(l);
        }
        b.close();
    }
}
