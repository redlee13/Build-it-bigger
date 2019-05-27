package com.example.android.joketellinglibrary;

import java.util.Random;

public class MyClass {

    private String jokes[] = {
            "Joke 1",
            "Joke 2",
            "joke 3",
            "joke 4"
    };

    public String getJoke(){

        Random random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }
}
