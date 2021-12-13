package com.exampel.uas_pm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        Hide Status Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

       
    }


    public void btn_html(View view) {
        Intent Primitif = new Intent( MainActivity.this,sub_menu.class);
        Primitif.putExtra("BHS","HTML");
        startActivity(Primitif);
    }
    public void btn_css(View view) {
        Intent Primitif = new Intent( MainActivity.this,sub_menu.class);
        Primitif.putExtra("BHS","CSS");
        startActivity(Primitif);
    }
    public void btn_js(View view) {
        Intent Primitif = new Intent( MainActivity.this,sub_menu.class);
        Primitif.putExtra("BHS","JS");
        startActivity(Primitif);
    }
    public void btn_about(View view) {
        Intent i = new Intent(MainActivity.this,about_page.class);
        startActivity(i);
    }
}
