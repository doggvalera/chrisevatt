package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;

/**
 * Created by valerijszemlanikins on 16.03.14.
 */
public class FamilyCourseClass extends Activity {


    String name1 = "1.Developing a living organisation model";
    String name2 = "2.Developing collaborative relationships with all stakeholders";
    String name3 = "3.Collaborative relationship skills:";
    String name4 = "4.Creating a collaborative and empowering culture:";
    String name5 = "5.Leading the living organisation";
    String name6 = "6.Managing the living organisation";
    String name7 = "7.Measures:";
    String name8 = "8.Developing a living organisation model";
    String name9 = "9.Developing a living organisation model";


    String moreInf3  = "http://www.chrisevatt.com/services/family-businesses-succession";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family_business_course);


        ExpandableListView listView = (ExpandableListView)findViewById(R.id.expandableFamBusiness);

        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();
        // ArrayList<String> children1 = new ArrayList<String>();
        ArrayList<String> children2 = new ArrayList<String>();
        //children1.add("Training modules:");
//        children1.add("Child_2");
        // groups.add(children1);
        children2.add(name1);
        children2.add(name2);
        children2.add(name3);
        children2.add(name4);
        children2.add(name5);
        children2.add(name6);
        children2.add(name7);
//        children2.add(name);
        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {


                Intent i = new Intent(getBaseContext(), NewInforForPoints.class);
//                i.putExtra("NameOfPage",numberpage);
                i.putExtra("NameOfPage",childPosition);

                startActivity(i);

                return false;
            }
        });
//        children2.add("Child_2");
//        children2.add("Child_3");
        groups.add(children2);
        //Создаем адаптер и передаем context и список с данными
        ExpListAdapter adapter = new ExpListAdapter(getApplicationContext(), groups);
        listView.setAdapter(adapter);

        Button btnMoreInf3 = (Button) findViewById(R.id.startupFamily);


        btnMoreInf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(moreInf3));
                startActivity(browserIntent);
//
            }


        });

    }

}

