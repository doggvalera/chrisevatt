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
public class StartPlus extends Activity
{


    String name1 = "1.Developing a living organisation model";
    String name2 = "2.Developing collaborative relationships with all stakeholders";
    String name3 = "3.Collaborative relationship skills:";
    String name4 = "4.Creating a collaborative and empowering culture:";
    String name5 = "5.Leading the living organisation";
    String name6 = "6.Managing the living organisation";
    String name7 = "7.Measures:";
    String name8 = "8.Developing a living organisation model";
    String name9 = "9.Developing a living organisation model";


    String moreInf2  = "http://www.chrisevatt.com/services/startupplus/";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup_plus_course);


        ExpandableListView listView = (ExpandableListView)findViewById(R.id.expandableStartPlus);

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

//        children2.add("Child_2");
//        children2.add("Child_3");
        groups.add(children2);
        //Создаем адаптер и передаем context и список с данными
        ExpListAdapter adapter = new ExpListAdapter(getApplicationContext(), groups);
        listView.setAdapter(adapter);

        Button btnMoreInf2 = (Button) findViewById(R.id.startupMoreInfo);


        btnMoreInf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(moreInf2));
                startActivity(browserIntent);
//
            }


        });

    }
}
