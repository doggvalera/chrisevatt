package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by valerijszemlanikins on 17.03.14.
 */
public class NewInforForPoints extends Activity {


    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    String nameOfCourse;


    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.new_layout_for_information);

        int vasa = getIntent().getExtras().getInt("NameOfPage", 1);

        if (vasa == 0) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);

        } else if (vasa == 1) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg1));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);

        } else if (vasa == 2) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg2));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);


        } else if (vasa == 3) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg3));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);


        } else if (vasa == 4) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg4));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);

        } else if (vasa == 5) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg5));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);

        } else if (vasa == 6) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg6));

            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);
        } else if (vasa == 7) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));

//
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);
        } else if (vasa == 10) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);
        } else if (vasa == 11) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);

        } else if (vasa == 12) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);

        } else if (vasa == 13) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);

        } else if (vasa == 14) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);

        } else if (vasa == 15) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);

        } else if (vasa == 16) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);

        } else if (vasa == 17) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);

        } else if (vasa == 18) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);

        } else if (vasa == 19) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);

        } else if (vasa == 20) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        } else if (vasa == 21) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        } else if (vasa == 22) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        } else if (vasa == 23) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        } else if (vasa == 24) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        } else if (vasa == 25) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        } else if (vasa == 26) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        } else if (vasa == 27) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));

            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);
        } else if (vasa == 28) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        } else if (vasa == 29) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        } else if (vasa == 30) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.sales_people);

        } else if (vasa == 31) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.sales_people);

        } else if (vasa == 32) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.sales_people);

        } else if (vasa == 33) {
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.sales_people);

        }
        {

        }

    }


}
