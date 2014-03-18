package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;

/**
 * Created by VIO on 3/18/14.
 */
public class LivingOrg extends Activity {

    int numberpage = 1;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.living_org_info);

        ExpandableListView listView = (ExpandableListView)findViewById(R.id.LivingExpandable);

        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();

        ArrayList<String> children2 = new ArrayList<String>();

        children2.add(getString(R.string.familyCousesesPoint1));
        children2.add(getString(R.string.familyCousesesPoint2));
        children2.add(getString(R.string.familyCousesesPoint3));
        children2.add(getString(R.string.familyCousesesPoint4));
        children2.add(getString(R.string.familyCousesesPoint5));
        children2.add(getString(R.string.familyCousesesPoint6));
        children2.add(getString(R.string.familyCousesesPoint7));

        groups.add(children2);

        ExpListAdapter adapter = new ExpListAdapter(getApplicationContext(), groups);
        listView.setAdapter(adapter);

    }

}