package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.ExpandableListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

/**
 * Created by VIO on 3/18/14.
 */
public class LivingOrg extends Activity {

    int numberpage = 1;

    protected void onCreate(Bundle savedInstanceState) {





//        mVideoURL = getIntent().getStringExtra("EXT_URL");
//        Log.i("VIDEO URL", " " + mVideoURL);

        MediaController mc = new MediaController(this);

        VideoView mWebView = (VideoView) findViewById(R.id.videoLivingInfo);


        mWebView.setVideoURI(Uri.parse("https://www.youtube.com/watch?v=bgaLeCaiy_Y&feature=youtube_gdata"));


        super.onCreate(savedInstanceState);
        setContentView(R.layout.living_org_info);

        ExpandableListView listView = (ExpandableListView)findViewById(R.id.LivingExpandable);

        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();

        ArrayList<String> children2 = new ArrayList<String>();

        children2.add(getString(R.string.familyCousesesPoint1));
        children2.add(getString(R.string.familyCousesesPoint2));
        children2.add(getString(R.string.familyCousesesPoint3));
        children2.add(getString(R.string.familyCousesesPoint4));
        children2.add(getString(R.string.familyCousesesPoint5));
        children2.add(getString(R.string.familyCousesesPoint6));
        children2.add(getString(R.string.familyCousesesPoint7));

        groups.add(children2);

        ExpListAdapter adapter = new ExpListAdapter(getApplicationContext(), groups);
        listView.setAdapter(adapter);


        String path1="http://www.boisestatefootball.com/sites/default/files/videos/original/01%20-%20coach%20pete%20bio_4.mp4";
        Uri uri=Uri.parse(path1);

        VideoView video=(VideoView)findViewById(R.id.videoLivingInfo);
        video.setVideoURI(uri);
        video.start();

    }

}