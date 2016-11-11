package com.dvoss;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by Dan on 11/11/16.
 */
public class JacksonShed {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        String personJson = "{ \"name\" : \"Alice\", \"age\" : 25 }";

        Person p1 = objectMapper.readValue(personJson, Person.class);
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }
}
