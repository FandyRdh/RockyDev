package com.exampel.uas_pm1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class t1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Hide Status Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_t1);


    }

    public void btn_next(View view) {
        Intent i = new Intent(t1.this,t2.class);
        startActivity(i);
    }
    public void btn_skip(View view) {
        Intent i = new Intent(t1.this,MainActivity.class);
        startActivity(i);
    }
}