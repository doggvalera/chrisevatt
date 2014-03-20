package com.example.app;

import   android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

/**
 * Created by VIO on 3/20/14.
 */
public class FamilyModuleClass extends Activity implements
        ExpandableListView.OnChildClickListener {

        String videoURL = "http://www.youtube.com/embed/bgaLeCaiy_Y";
    WebView mWebView = null;




    int numberpage = 1;

    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.family_business_info);


        super.onCreate(savedInstanceState);
        ExpandableListView expandbleLis = (ExpandableListView)findViewById(R.id.FamilyExpandable);
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
        mWebView = (WebView) findViewById(R.id.webView);

        /** unfortunately, we have to check sdk version ***/
        if (Build.VERSION.SDK_INT < 8) {
            mWebView.getSettings().setPluginState(WebSettings.PluginState.OFF);
        } else {
            mWebView.getSettings().setPluginState(WebSettings.PluginState.ON);
        }
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebChromeClient(new MyChromeClient());
        mWebView.loadUrl(videoURL);
    }

    class MyChromeClient extends WebChromeClient {

        @Override
        public void onShowCustomView(View view, CustomViewCallback callback) {
            /** Remove super function, it stucks to play youtube video if you click fullscreen icon **/
            // super.onShowCustomView(view, callback);
            Intent intent = new Intent(FamilyModuleClass.this, LandVideoAct.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("video", videoURL);
            startActivity(intent);

        }

    }

    public void setGroupData() {
        groupItem.add("A family business");
        groupItem.add("Purpose");
        groupItem.add("Succession planning");
        groupItem.add("A sound succession plan");
    }

    ArrayList<String> groupItem = new ArrayList<String>();
    ArrayList<Object> childItem = new ArrayList<Object>();

    public void setChildGroupData() {

        ArrayList<String> child = new ArrayList<String>();
        child.add("An enterprise that is owned and run for the benefit of a family or families.\n" +
                " It may be a farm or farms; an investment company; a shop or shops; a service or manufacturing enterprise.");
        childItem.add(child);

        child = new ArrayList<String>();
        child.add("To enable family businesses to successfully pass to the next generation.");
        childItem.add(child);

        child = new ArrayList<String>();
        child.add("Succession planning is needed to prepare the generation that is handing over and the generation that is taking over the responsibility of the family business.\n" +
                "The generation taking over the responsibility of the family business needs to understand the responsibility they are taking over and be willing and ready to take on those responsibilities.");
        childItem.add(child);

        child = new ArrayList<String>();
        child.add("Is made well before the business is to be handed over.\n" +
                "Meets the needs of the business, the generation handing over and the generation taking over.\n" +
                "Ensures both generations are adequately prepared.\n");
        childItem.add(child);
    }

    @Override
    public boolean onChildClick(ExpandableListView parent, View v,
                                int groupPosition, int childPosition, long id) {
        Toast.makeText(FamilyModuleClass.this, "Clicked On Child",
                Toast.LENGTH_SHORT).show();
        return true;
    }
}

