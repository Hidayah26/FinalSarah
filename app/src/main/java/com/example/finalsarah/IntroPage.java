package com.example.finalsarah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class IntroPage extends AppCompatActivity {

    TextView tvUsername;

    public final static String USERNAME="com.example.finalsarah.USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_page);

        Intent intent=getIntent();
        String strUsername=intent.getStringExtra("USERNAME");
        tvUsername=(TextView)findViewById(R.id.tvUsername);
        tvUsername.setText(strUsername);
    }
}