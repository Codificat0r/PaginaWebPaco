package com.example.paginaweb;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;

public class VisorWeb extends AppCompatActivity {

    private WebView wvWeb;
    private Bundle bundle;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_web);

        wvWeb = (WebView)findViewById(R.id.wvWeb);
        bundle = getIntent().getExtras();
        url = bundle.getString("url");
        wvWeb.loadUrl(url);
    }
}
