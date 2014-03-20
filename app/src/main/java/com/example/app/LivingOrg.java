package com.example.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ExpandableListActivity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
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

    String videoURL1 = "http://www.youtube.com/embed/bgaLeCaiy_Y";
    WebView mWebView1 = null;




    int numberpage = 1;

    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.living_org_info);





        super.onCreate(savedInstanceState);
        ExpandableListView expandbleLis = (ExpandableListView)findViewById(R.id.LivingExpandable);
        expandbleLis.setDividerHeight(2);
        expandbleLis.setGroupIndicator(null);
        expandbleLis.setClickable(true);


        setGroupData();
        setChildGroupData();

        NewAdapter mNewAdapter = new NewAdapter(groupItem, childItem);
        mNewAdapter
                .setInflater(
                        (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE),
                        this);
        expandbleLis.setAdapter(mNewAdapter);
        expandbleLis.setOnChildClickListener(this);






        initwebView();
    }

    @TargetApi(Build.VERSION_CODES.FROYO)
    private void initwebView() {
        mWebView1 = (WebView) findViewById(R.id.webViewLiv);

        /** unfortunately, we have to check sdk version ***/
        if (Build.VERSION.SDK_INT < 8) {
            mWebView1.getSettings().setPluginState(WebSettings.PluginState.OFF);
        } else {
            mWebView1.getSettings().setPluginState(WebSettings.PluginState.ON);
        }
        mWebView1.getSettings().setJavaScriptEnabled(true);
        mWebView1.setWebChromeClient(new MyChromeClient());
        mWebView1.loadUrl(videoURL1);
    }

    class MyChromeClient extends WebChromeClient {

        @Override
        public void onShowCustomView(View view, CustomViewCallback callback) {
            /** Remove super function, it stucks to play youtube video if you click fullscreen icon **/
            // super.onShowCustomView(view, callback);
            Intent intent = new Intent(LivingOrg.this, LandVideoAct.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("video", videoURL1);
            startActivity(intent);

        }

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


