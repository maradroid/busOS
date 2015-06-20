package com.maradroid.busos;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by mara on 18.05.15..
 */
public class RedVoznje extends Activity {

    private WebView myWebView;
    private WebSettings webSettings;
    private String stanica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);

        myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setWebChromeClient(new WebChromeClient());
        webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);

        stanica = getIntent().getStringExtra("stanica");

        //m0 - hrvatske republike sjever
        //m1 - hrvatske republike jug
        //m2 - gajev trg sjever
        //m3 - gajevtrg jug
        //m4 - zagrebačka sjever
        //m5 - zagrebačka jug
        //m6 - drvljanik vukovarska 74
        //m7 - vijenac ivana meštrovića
        //m8 - campus sjever
        //m9 - campus jug
        //m10 - drvara sjever
        //m11 - drvara jug
        //m12 - donji grad sjever
        //m13 - donji grad jug
        //m14 - zeleno polje sjever
        //m15 - zeleno polje jug

        myWebView.loadUrl("file:///android_asset/"+stanica+".html");
    }
}
