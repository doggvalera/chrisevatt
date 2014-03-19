package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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

//            someView.setBackgroundColor(R.color.backGroundOlive);


        }else if (vasa==4){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg4));
//
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);

//            someView.setBackgroundColor(R.color.backGroundOlive);
        }else if (vasa==5){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg5));
//
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);



           // View someView = findViewById(R.id.firstlayout);


//                someView.setBackgroundColor(getResources().getColor(android.R.color.background_dark));
//            someView.refreshDrawableState();
           // someView.setAlpha(0.5f);
//            View root = someView.getRootView();
            textView1.setTextColor(getResources().getColor(android.R.color.background_dark));

//            someView.setBackgroundColor(R.color.backGroundOlive);

        }else if (vasa==6){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg6));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.family);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);

//            View someView = (View) findViewById(R.id.relativelayoutforme);

     ;

//

        }else if (vasa==7){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.familyfirst);
//            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.layout.new_layout_for_information);
//
//            relativeLayout.setBackgroundColor(R.color.backGroundOlive);
//            relativeLayout.setBackground(R.color.backGroundOlive);
            //relativeLayout.setBackground(R.color.backGroundOlive);
            //  relativeLayout.setBackgroundColor(R.color.backGroundOlive);



//            View root = someView.getRootView();
//            someView.setBackgroundColor(R.color.backGroundOlive);


          //  someView.setBackgroundColor(R.color.backGroundOlive);

//            View view = this.getWindow().getDecorView();
//            view.setBackgroundColor(R.color.backGroundOlive);
        }
        else if (vasa==10){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));

            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);

        }
        else if (vasa==11){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.sales_people);

//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);

        }
        else if (vasa==12){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.sales_people);
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
        }
        else if (vasa==13){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.sales_people);
        }
        else if (vasa==14){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.sales_people);

        }
        else if (vasa==15){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.sales_people);

        }  else if (vasa==20){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);

        }
        else if (vasa==21){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);

        }
        else if (vasa==22){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);
        }
        else if (vasa==23){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);
        }
        else if (vasa==24){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);
        }
        else if (vasa==25){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);
        }
        else if (vasa==26){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);
        }
        else if (vasa==27){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);
        }
        else if (vasa==28){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);
        }
        else if (vasa==29){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.corpo);
        }
        else if (vasa==30){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        }  else if (vasa==31){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);


        }  else if (vasa==32){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        }  else if (vasa==33){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);


        }  else if (vasa==33){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        }  else if (vasa==34){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        }  else if (vasa==35){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        }  else if (vasa==36){
            TextView textView1 = (TextView) findViewById(R.id.textView);
            textView1.setText(getString(R.string.thelivingorg7));
//            ImageView imageView = (ImageView) findViewById(R.id.imageView);
//            imageView.setImageResource(R.drawable.man1);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.girl);

        }
        {

        }

     }



}
