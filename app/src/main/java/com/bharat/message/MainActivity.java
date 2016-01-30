package com.bharat.message;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout relativeLayout;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout  = (RelativeLayout)findViewById(R.id.relative);

        webView = new WebView(this);

        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("https://damp-caverns-20382.herokuapp.com/chat/");



    }

    public void login(View v){
        relativeLayout.setVisibility(View.GONE);
        setContentView(webView);
    }
}
