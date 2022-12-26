package com.example.finalsarah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity {

    EditText etUsername;
    EditText etPassword;
    Button btnLogin;

    public final static String USERNAME="com.example.finalsarah.USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etUsername = findViewById(R.id.etUsername);
                etPassword = findViewById(R.id.etPassword);
                btnLogin = findViewById(R.id.btnLogin);

                String Username=etUsername.getText().toString();
                String Password=etPassword.getText().toString();

                if (Username.equals("Siti Sarah") && Password.equals("Sarah1309")){
                    Intent intent = new Intent(LoginPage.this, IntroPage.class);
                    intent.putExtra("USERNAME",Username);
                    startActivity(intent);
                } else {
                    ShowAlertDialogButton();
                }
            }
        });
    }

    public void ShowAlertDialogButton(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Authentication Failed");
        builder.setMessage("The username or password you key in are incorrect. Please fill it again.");
        builder.setPositiveButton("OK",null);
        AlertDialog dialog= builder.create();
        dialog.show();
    }
}