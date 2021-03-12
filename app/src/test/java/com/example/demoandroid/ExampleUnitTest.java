package com.example.demoandroid;

import android.widget.Button;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(RobolectricTestRunner.class)
@Config(sdk=18)
public class ExampleUnitTest {
    private MainActivity activity;
    private Button helloBtn;

    @Before
    public void setUp() throws Exception{
        activity = Robolectric.buildActivity(MainActivity.class).create().resume().get();
        helloBtn = (Button) activity.findViewById(R.id.helloBtn);
    }

    @Test
    public void activityNotNull() {
        assertNotNull(activity);
        assertNotNull(helloBtn);
    }

    @Test
    public void helloButonText() {
        assertEquals(helloBtn.getText(), "Hello world");
    }



    @Test
    public void addition_isCorrect() {

        assertEquals(4, 2 + 2);
    }

    @Test
    public void addition_isWrong() { assertNotEquals(5, 2+2);}
}