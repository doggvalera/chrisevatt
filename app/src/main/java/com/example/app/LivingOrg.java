package com.example.app;

import android.app.Activity;
import android.app.ExpandableListActivity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import java.util.ArrayList;

/**
 * Created by VIO on 3/18/14.
 */
public class LivingOrg extends Activity implements
        ExpandableListView.OnChildClickListener {

    private static final String path ="http://www.boisestatefootball.com/sites/default/files/videos/original/01%20-%20coach%20pete%20bio_4.mp4";
    private VideoView video;
    private MediaController ctlr;


    int numberpage = 1;

    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.living_org_info);
//        mVideoURL = getIntent().getStringExtra("EXT_URL");
//        Log.i("VIDEO URL", " " + mVideoURL);

        MediaController mc = new MediaController(this);

        VideoView mWebView = (VideoView) findViewById(R.id.videoLivingInfo);


        mWebView.setVideoURI(Uri.parse("https://www.youtube.com/watch?v=bgaLeCaiy_Y&feature=youtube_gdata"));


        super.onCreate(savedInstanceState);
        ExpandableListView expandbleLis = (ExpandableListView)findViewById(R.id.LivingExpandable);
        expandbleLis.setDividerHeight(2);
        expandbleLis.setGroupIndicator(null);
        expandbleLis.setClickable(true);

        video = (VideoView) findViewById(R.id.videoLivingInfo);
        video.setVideoPath(path);

        ctlr = new MediaController(this);
        ctlr.setMediaPlayer(video);
        video.setMediaController(ctlr);
        //video.start();
        setGroupData();
        setChildGroupData();

        NewAdapter mNewAdapter = new NewAdapter(groupItem, childItem);
        mNewAdapter
                .setInflater(
                        (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE),
                        this);
        expandbleLis.setAdapter(mNewAdapter);
        expandbleLis.setOnChildClickListener(this);
    }
    public void setGroupData() {
        groupItem.add("The Living Organisation");
        groupItem.add("Purpose");
        groupItem.add("The operating principles");
        groupItem.add("Benefits");
    }

    ArrayList<String> groupItem = new ArrayList<String>();
    ArrayList<Object> childItem = new ArrayList<Object>();

    public void setChildGroupData() {

        ArrayList<String> child = new ArrayList<String>();
        child.add("It is any grouping of people working together for a common good of all stakeholders.\n" +
                "These groups maybe communities, cities and social and business enterprises.\n" +
                "Stakeholders generally include: employees; customers, members and users; suppliers;\n" +
                "financial investors; the natural environment; the societies the groups work in.\n");
        childItem.add(child);

        child = new ArrayList<String>();
        child.add("To give the principles and practices for creating and running an organisation\n" +
                "that supports and is supported by all its stakeholders for their sustainable longevity.\n");
        childItem.add(child);

        child = new ArrayList<String>();
        child.add("All stakeholders work or support what is their individual and collective best interests.\n" +
                "Best interests is what supports and enhances their life as exemplified by how the human body functions.\n" +
                "Operating motto: Leave everyone and everything better than when you found them.\n");
        childItem.add(child);

        child = new ArrayList<String>();
        child.add("Because living organisations support and are supported by their stakeholders they are:\n" +
                "stronger; more adaptable; can more quickly take advantage of change; are more creative;\n" +
                "more innovative; evolve in relationship with their stakeholders and can co-create greater value with their stakeholders than they could alone.\n");
        childItem.add(child);
    }

    @Override
    public boolean onChildClick(ExpandableListView parent, View v,
                                int groupPosition, int childPosition, long id) {
        Toast.makeText(LivingOrg.this, "Clicked On Child",
                Toast.LENGTH_SHORT).show();
        return true;
    }
}


