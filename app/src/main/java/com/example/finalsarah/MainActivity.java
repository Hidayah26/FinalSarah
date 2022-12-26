package com.example.finalsarah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.os.Bundle;
import android.content.Intent;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, LoginPage.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}