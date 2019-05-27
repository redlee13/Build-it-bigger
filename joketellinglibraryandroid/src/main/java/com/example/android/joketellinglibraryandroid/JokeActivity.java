package com.example.android.joketellinglibraryandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeTextView = findViewById(R.id.tv_joke);
        String joke = "Joke should be here";

        if (getIntent().hasExtra("joke")){
            joke = getIntent().getStringExtra("joke");
        }
        jokeTextView.setText(joke);
    }
}
