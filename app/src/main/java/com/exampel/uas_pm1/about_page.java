package com.exampel.uas_pm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class about_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        Hide Status Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_about_page);
    }

    public void btn_back(View view) {
        Intent i = new Intent(about_page.this,MainActivity.class);
        startActivity(i);
    }
    public void btn_fb(View view) {
        //Deklarasi Intent yang mengarah ke halaman lain (yang lepas dari project android)
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://id-id.facebook.com/"));
        startActivity(implicit);
    }
    public void btn_ig(View view) {
        //Deklarasi Intent yang mengarah ke halaman lain (yang lepas dari project android)
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
        startActivity(implicit);
    }
    public void btn_twitter(View view) {
        //Deklarasi Intent yang mengarah ke halaman lain (yang lepas dari project android)
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://twitter.com/"));
        startActivity(implicit);
    }
}
