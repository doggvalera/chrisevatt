package com.example.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.EventListener;

/**
 * Created by valerijszemlanikins on 13.03.14.
 */
public class Informations extends Activity {

    int numberpage = 1;
    private Context context;

    String moreInf1  = "http://www.chrisevatt.com/services/the-living-organisation";
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.informationtext);

      //  final String vasa="1";
        ExpandableListView listView = (ExpandableListView)findViewById(R.id.expandableListView);

        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();
       // ArrayList<String> children1 = new ArrayList<String>();
        ArrayList<String> children2 = new ArrayList<String>();
        //children1.add("Training modules:");
//        children1.add("Child_2");
       // groups.add(children1);
        children2.add(getString(R.string.familyCousesesPoint1));
        children2.add(getString(R.string.familyCousesesPoint2));
        children2.add(getString(R.string.familyCousesesPoint3));
        children2.add(getString(R.string.familyCousesesPoint4));
        children2.add(getString(R.string.familyCousesesPoint5));
        children2.add(getString(R.string.familyCousesesPoint6));
        children2.add(getString(R.string.familyCousesesPoint7));
//        children2.add(name);

//        children2.add("Child_2");
//        children2.add("Child_3");
        groups.add(children2);
        //Создаем адаптер и передаем context и список с данными
        ExpListAdapter adapter = new ExpListAdapter(getApplicationContext(), groups);
        listView.setAdapter(adapter);

        Button btnMoreInf1 = (Button) findViewById(R.id.livingOrgMore);
        adapter.setmContext(getBaseContext());





        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                int findLayout =  0+childPosition;

                Intent i = new Intent(getBaseContext(), NewInforForPoints.class);
//                i.putExtra("NameOfPage",numberpage);
                i.putExtra("NameOfPage",findLayout);

                startActivity(i);

                return false;
            }
        });

//        adapter.isChildSelectable(new ExpandableListView.OnChildClickListener() {
//            @Override
//            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
//                // Handle clicks on the children here...
//                return false;
//            }
//        });



        btnMoreInf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NewInforForPoints newInforForPoints = new NewInforForPoints();
                Intent i = new Intent(getBaseContext(), NewInforForPoints.class);
//                i.putExtra("NameOfPage",numberpage);
                i.putExtra("NameOfPage" ,numberpage);

                startActivity(i);




//                NewInforForPoints newInforForPoints = new NewInforForPoints("name");
//            new NewInforForPoints("vasa");
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(moreInf1));
//                startActivity(browserIntent);
//
            }


        });

    }

}
