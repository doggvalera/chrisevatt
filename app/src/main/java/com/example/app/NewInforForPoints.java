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
        setContentView(R.layout.new_layout_for_information);

        int vasa = getIntent().getExtras().getInt("NameOfPage",1);

        if(vasa==0){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText("1");
            textView1.setText(getString(R.string.thelivingorg));

        } else if (vasa==1){
            TextView textView1 = (TextView) findViewById(R.id.textView);
                       textView1.setText(getString(R.string.thelivingorg1));

        }
        else if (vasa==2){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg2));

        }else if (vasa==3){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg3));

        }else if (vasa==4){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg4));

        }else if (vasa==5){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg5));

        }else if (vasa==6){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg6));

        }else if (vasa==7){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));

        }
        {

        }

     }



}
