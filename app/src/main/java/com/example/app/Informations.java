package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;

/**
 * Created by valerijszemlanikins on 13.03.14.
 */
public class Informations extends Activity {
    String moreInf  = "http://www.chrisevatt.com/";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informationtext);


        ExpandableListView listView = (ExpandableListView)findViewById(R.id.expandableListView);

        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();
        ArrayList<String> children1 = new ArrayList<String>();
        ArrayList<String> children2 = new ArrayList<String>();
        children1.add("Child_1");
        children1.add("Child_2");
        groups.add(children1);
        children2.add("Child_1");
        children2.add("Child_2");
        children2.add("Child_3");
        groups.add(children2);
        //Создаем адаптер и передаем context и список с данными
        ExpListAdapter adapter = new ExpListAdapter(getApplicationContext(), groups);
        listView.setAdapter(adapter);

        Button btnMoreInf = (Button) findViewById(R.id.button);


        btnMoreInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(moreInf));
                startActivity(browserIntent);
//
            }


        });

    }

}
