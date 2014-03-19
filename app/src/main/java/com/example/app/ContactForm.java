package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by valerijszemlanikins on 19.03.14.
 */
public class ContactForm extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.contactform);



        Button mBtnFeedback = (Button) findViewById(R.id.button);
        mBtnFeedback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText);
                EditText editText2 = (EditText) findViewById(R.id.editText2);

                EditText editText3 = (EditText) findViewById(R.id.editText3);

//                EditText editText4 = (EditText) findViewById(R.id.editText);

                String to = editText1.getText().toString();
                String message = editText2.getText().toString();
                String subject = editText3.getText().toString();

                Intent mEmail = new Intent(Intent.ACTION_SEND);
                mEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                mEmail.putExtra(Intent.EXTRA_SUBJECT, subject);
                mEmail.putExtra(Intent.EXTRA_TEXT, message);

                // prompts to choose email client
                mEmail.setType("message/rfc822");

                startActivity(Intent.createChooser(mEmail, "Choose an email client to send your feedback!"));

            }
        });
    }
}
//    public void sendFeedback(View button) {
////        Button mBtnFeedback = (Button) findViewById(R.id.button);
////        mBtnFeedback.setOnClickListener(new View.OnClickListener() {
////
////            @Override
////            public void onClick(View v) {
////                EditText editText1 = (EditText) findViewById(R.id.editText);
////                EditText editText2 = (EditText) findViewById(R.id.editText2);
////
////                EditText editText3 = (EditText) findViewById(R.id.editText3);
////
//////                EditText editText4 = (EditText) findViewById(R.id.editText);
////
////                String to = editText1.getText().toString();
////                String message = editText2.getText().toString();
////                String subject = editText3.getText().toString();
////
////                Intent mEmail = new Intent(Intent.ACTION_SEND);
////                mEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
////                mEmail.putExtra(Intent.EXTRA_SUBJECT, subject);
////                mEmail.putExtra(Intent.EXTRA_TEXT, message);
////
////                // prompts to choose email client
////                mEmail.setType("message/rfc822");
////
////                startActivity(Intent.createChooser(mEmail, "Choose an email client to send your feedback!"));
////
////            }
////        });
//    }
//}

//    }}
