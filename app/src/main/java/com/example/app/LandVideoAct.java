    package com.example.app;

    import android.annotation.TargetApi;
    import android.app.Activity;
    import android.content.pm.ActivityInfo;
    import android.os.Build;
    import android.os.Bundle;
    import android.view.View;
    import android.view.Window;
    import android.webkit.WebChromeClient;
    import android.webkit.WebSettings;
    import android.webkit.WebView;

    /**
     * Created by Laisu on 20.3.2014.
     */
    public class LandVideoAct extends Activity {
        WebView mWebView, fullweb;
        String videoURL = "";

        @TargetApi(Build.VERSION_CODES.FROYO)
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            setTheme(android.R.style.Theme_Light_NoTitleBar_Fullscreen);
            setContentView(R.layout.landfull);
            videoURL = getIntent().getStringExtra("video") + "?fs=1";
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            mWebView = (WebView) findViewById(R.id.fullwebview);

            if (Build.VERSION.SDK_INT < 8) {
                mWebView.getSettings().setPluginState(WebSettings.PluginState.OFF);
            } else {
                mWebView.getSettings().setPluginState(WebSettings.PluginState.ON);

            }
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.setWebChromeClient(new WebChromeClient() {
                @Override
                public void onShowCustomView(View view, CustomViewCallback callback) {
                    LandVideoAct.this.finish();
                }
            });
            mWebView.loadUrl(videoURL);
        }
    }