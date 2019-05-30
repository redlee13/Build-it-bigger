package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {


    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testGetJoke() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();
        asyncTask.execute(activityTestRule.getActivity());

        String jokeTest = asyncTask.get();
        assertEquals("Joke 1", jokeTest);
    }
}
