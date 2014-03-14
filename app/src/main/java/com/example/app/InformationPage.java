package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Laisu on 12.3.2014.
 */
public class InformationPage extends Activity {
 String moreInf  = "http://www.chrisevatt.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infopage);


    Button btnMoreInf = (Button) findViewById(R.id.btnMoreInformation);
    Log.v("MyApp", "SetListener");


    btnMoreInf.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
//            Log.v("MyApp", "OnClick");
//            startActivity(new Intent(InformationPage.this, MainActivity.class));

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(moreInf));
                startActivity(browserIntent);

            // startActivity(new Intent(Informations.this, Moduls.class));
//                Intent viewIntent = new Intent("Intent.action.VIEW", Uri.parse("http://www.google.com"));
//                startActivity(viewIntent);
            //final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.google.com"));
            //activity.startActivity(intent);
        }


    });

}
}