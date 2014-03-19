package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
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
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.new_layout_for_information);

        int vasa = getIntent().getExtras().getInt("NameOfPage",1);

        if(vasa==0){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText("1");
            textView1.setText(getString(R.string.thelivingorg));

        } else if (vasa==1){
            TextView textView1 = (TextView) findViewById(R.id.textView);
                       textView1.setText(getString(R.string.thelivingorg1));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);

        }
        else if (vasa==2){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg2));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);


        }else if (vasa==3){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg3));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);


        }else if (vasa==4){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg4));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.family);

        }else if (vasa==5){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg5));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.family);
//            Image image = (Image) findViewById(R.drawable.family);
//            imageView.setImageDrawable(R.drawable.family);

        }else if (vasa==6){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg6));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.family);

        }else if (vasa==7){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.family);

        }
        else if (vasa==10){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));

        }
        else if (vasa==11){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));

        }
        else if (vasa==12){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));

        }
        else if (vasa==13){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));

        }
        else if (vasa==14){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));

        }
        else if (vasa==15){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));

        }
        {

        }

     }



}
