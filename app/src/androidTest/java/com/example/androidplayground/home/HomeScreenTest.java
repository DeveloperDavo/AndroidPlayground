package com.example.androidplayground.home;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.androidplayground.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class HomeScreenTest {

    @Rule
    public ActivityTestRule<HomeActivity> homeActivityRule =
            new ActivityTestRule<>(HomeActivity.class);

    @Test
    public void shouldOpenDogsScreenOnClick() {
        onView(withId(R.id.btn_dogs)).check(matches(withText("Dogs")));

        onView(withId(R.id.btn_dogs))
                .perform(click());

        onView(withId(R.id.tv_placeholder)).check(matches(withText("Dogs")));
    }

}
