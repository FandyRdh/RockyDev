package com.exampel.uas_pm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class konten extends AppCompatActivity {

    private WebView wv_konten;
    private TextView txt_judul,txt_deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        Hide Status Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_konten);

        txt_judul = findViewById(R.id.txt_judul);
        txt_deskripsi = findViewById(R.id.txt_deskripsi);
        wv_konten = (WebView) findViewById(R.id.wv_konten);



        // setting
        wv_konten.setWebViewClient(new WebViewClient());
        wv_konten.setWebChromeClient(new WebChromeClient());
        wv_konten.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wv_konten.getSettings().setJavaScriptEnabled(true);
        wv_konten.getSettings().setPluginState(WebSettings.PluginState.ON);
        wv_konten.getSettings().setDefaultFontSize(18);

        Intent result = getIntent();
        String kode_youtube = result.getStringExtra("TOKEN");
        txt_judul.setText(result.getStringExtra("JUDUL"));
        txt_deskripsi.setText(result.getStringExtra("DES"));

        String kodeHTML = "<head></head><body>" +
                "<iframe width=\" 401\" height=\"220\" src=\"https://www.youtube.com/embed/" +
                kode_youtube +
                "\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>" +
                "</body>";
        wv_konten.loadData(kodeHTML,"text/html; charset=utf-8",null);
    }
}