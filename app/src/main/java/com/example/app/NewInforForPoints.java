package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by valerijszemlanikins on 17.03.14.
 */
public class NewInforForPoints extends Activity{


    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    String nameOfCourse;



//
//public NewInforForPoints(String nameof){
//
//    nameOfCourse=nameof;
//
//
//}



    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.newlayoutforinformations);

        int vasa = getIntent().getExtras().getInt("NameOfPage",1);

        if(vasa==1){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText("1");

        } else if (vasa==2){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText("2");
        }
        {

        }

     }



}
