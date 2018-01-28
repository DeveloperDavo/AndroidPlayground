package com.example.androidplayground.home;

import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.androidplayground.R;
import com.example.androidplayground.dogs.DogsActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class HomeScreenTest {

    @Rule
    public IntentsTestRule<HomeActivity> homeActivityRule =
            new IntentsTestRule<>(HomeActivity.class);

    @Test
    public void shouldOpenDogsScreenOnClick() {
        onView(withId(R.id.btn_dogs)).check(matches(withText("Dogs")));

        onView(withId(R.id.btn_dogs))
                .perform(click());

        intended(hasComponent("com.example.androidplayground.dogs.DogsActivity"));
    }

}
