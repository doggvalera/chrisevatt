package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;

/**
 * Created by valerijszemlanikins on 16.03.14.
 */
public class StartPlus extends Activity {


    String name1 = "1.sdsfs";
    String name2 = "2.fffff";
    String name3 = "3.ffffff";
    String name4 = "4.Cffffff";
    String name5 = "5.ffff";
    String name6 = "6.fffff";
    String name7 = "7.ffffff";
    String name8 = "8.fffff";
    String name9 = "9.ffffff";


    String moreInf2 = "http://www.chrisevatt.com/services/startupplus/";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.startup_plus_course);


        ExpandableListView listView = (ExpandableListView) findViewById(R.id.expandableStartPlus);

        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();
        ArrayList<String> children2 = new ArrayList<String>();

        children2.add(name1);
        children2.add(name2);
        children2.add(name3);
        children2.add(name4);
        children2.add(name5);
        children2.add(name6);
        children2.add(name7);


        groups.add(children2);
        //Создаем адаптер и передаем context и список с данными
        ExpListAdapter adapter = new ExpListAdapter(getApplicationContext(), groups);
        listView.setAdapter(adapter);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                int findLayout = 10 + childPosition;

                Intent i = new Intent(getBaseContext(), NewInforForPoints.class);
//                i.putExtra("NameOfPage",numberpage);
                i.putExtra("NameOfPage", findLayout);

                startActivity(i);

                return false;
            }
        });


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
