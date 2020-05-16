package com.example.tddtutorial;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.test.core.app.ActivityScenario;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.junit.Assert.*;

public class MainActivityTest {

    MainActivity mainActivity;
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule(MainActivity.class);
    private ListView listView;

    @Before
    public void setUp() throws Exception {
        mainActivity = activityTestRule.getActivity();
    }

    @Test
    public void checkIfUsersListViewIsNotNull() throws Exception {
        listView = mainActivity.findViewById(R.id.listView);
        assertThat(listView, notNullValue());
        assertThat(listView.getAdapter(), instanceOf(ArrayAdapter.class));
        assertNotNull(listView);
        checkIfUsersListViewAdapterIsNotNull();
        assertThat(listView.getAdapter().getCount(), greaterThan(5));
    }

    @Test
    public void checkIfUsersListViewAdapterIsNotNull() throws Exception {
        assertNotNull(listView.getAdapter());
    }

}
