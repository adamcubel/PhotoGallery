package com.bignerdranch.android.photogallery;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Toolbar;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by adamc on 3/9/2018.
 */

@RunWith(AndroidJUnit4.class)
public class PhotoGalleryTest {

    @Rule
    public ActivityTestRule<PhotoGalleryActivity> mPhotoGalleryActivity =
            new ActivityTestRule<PhotoGalleryActivity>(PhotoGalleryActivity.class);

    @Test
    public void verifyCanClickSearch() {
        Espresso.onView(withId(R.id.menu_item_search)).perform(click());
    }
}
