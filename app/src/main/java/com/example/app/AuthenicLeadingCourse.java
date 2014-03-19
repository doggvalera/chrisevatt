package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by valerijszemlanikins on 17.03.14.
 */
public class AuthenicLeadingCourse extends Activity {


    
    String moreInf  = "http://www.chrisevatt.com/services/authentic-leading";



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.authentic_leading_course);


        ExpandableListView listView = (ExpandableListView)findViewById(R.id.expandableAutLeading);

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



        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                int findLayout =  20+childPosition;

                Intent i = new Intent(getBaseContext(), NewInforForPoints.class);
//                i.putExtra("NameOfPage",numberpage);
                i.putExtra("NameOfPage",findLayout);

                startActivity(i);

                return false;
            }
        });

        Button btnMoreInf4 = (Button) findViewById(R.id.autLeadingMore);


        btnMoreInf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(moreInf));
               startActivity(browserIntent);

            }


            });


    }
}
