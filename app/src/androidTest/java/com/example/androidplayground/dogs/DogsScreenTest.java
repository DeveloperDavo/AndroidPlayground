package com.example.androidplayground.dogs;

import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;

import com.example.androidplayground.R;
import com.example.androidplayground.home.HomeActivity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
public class DogsScreenTest {

    @Rule
    public ActivityTestRule<DogsActivity> dogsActivityRule =
            new ActivityTestRule<>(DogsActivity.class);

    @Test
    public void shouldScrollToItem() throws Exception {
        int position = 1;
        onView(withId(R.id.rv_dogs))
                .perform(RecyclerViewActions.scrollToPosition(position));

        onView(withText("dog" + position)).check(matches(isDisplayed()));
    }
}
