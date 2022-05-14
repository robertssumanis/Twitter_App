package com.example.twit_app;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "TimeLineActivity";

    private static final String baseURl = "http://twitter.com";

    private static final String widgetInfo = "<a class=\"twitter-timeline\" data-theme=\"dark\" href=\"https://twitter.com/CBSNews?ref_src=twsrc%5Etfw\">Tweets by CBSNews</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script></a> ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load_background_color();

        WebView webView = (WebView) findViewById(R.id.timeline_webview);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadDataWithBaseURL(baseURl, widgetInfo, "text/html", "UTF-8", null);
    }


    private void load_background_color() {
        WebView webView = (WebView) findViewById(R.id.timeline_webview);
        webView.setBackgroundColor(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return true;
    }
}