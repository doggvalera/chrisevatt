package com.example.app;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;

/**
 * Created by Laisu on 18.3.2014.
 */
public class living_organizon_info extends Activity{
    String name1 = "1.Developing a living organisation model";
    String name2 = "2.Developing collaborative relationships with all stakeholders";
    String name3 = "3.Collaborative relationship skills:";
    String name4 = "4.Creating a collaborative and empowering culture:";
    String name5 = "5.Leading the living organisation";
    String name6 = "6.Managing the living organisation";
    String name7 = "7.Measures:";
    String name8 = "8.Developing a living organisation model";
    String name9 = "9.Developing a living organisation model";



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.living_org_info);


        ExpandableListView listView = (ExpandableListView)findViewById(R.id.livingCourseInfoExpandable);

        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();
        // ArrayList<String> children1 = new ArrayList<String>();
        ArrayList<String> children2 = new ArrayList<String>();
        //children1.add("Training modules:");
//        children1.add("Child_2");
        // groups.add(children1);
        //if (lang=="eng"){
        children2.add(getString(R.string.authenicLeadingCourse1));
        children2.add(getString(R.string.authenicLeadingCourse2));
        children2.add(getString(R.string.authenicLeadingCourse3));
        children2.add(getString(R.string.authenicLeadingCourse4));
        children2.add(getString(R.string.authenicLeadingCourse5));
        children2.add(getString(R.string.authenicLeadingCourse6));
        children2.add(getString(R.string.authenicLeadingCourse7));
//        children2.add(name);

//        children2.add("Child_2");
//        children2.add("Child_3");
        groups.add(children2);
        //Создаем адаптер и передаем context и список с данными
        ExpListAdapter adapter = new ExpListAdapter(getApplicationContext(), groups);
        listView.setAdapter(adapter);





//

    }


}

