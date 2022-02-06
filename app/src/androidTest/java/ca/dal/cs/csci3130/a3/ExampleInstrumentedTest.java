package ca.dal.cs.csci3130.a3;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> myRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("ca.dal.cs.csci3130.a3", appContext.getPackageName());
    }

    @Test
    public void testFactorialOperation() {
        onView(withId(R.id.numberBox)).perform(typeText("8"));
        onView(withId(R.id.factorialButton)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("40320")));
    }

    @Test
    public void testCubeRootOperation() {
        onView(withId(R.id.numberBox)).perform(typeText("8"));
        onView(withId(R.id.cubeRootButton)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("2")));
    }
}