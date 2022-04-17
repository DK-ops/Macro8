package com.mobilepro.macro8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.security.auth.login.LoginException;


public class SplashScreen1 extends AppCompatActivity {
    Button btntoMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen1);

        btntoMasuk = findViewById(R.id.btntoMasuk);

    }

    public void toLogin(View view){
        Intent intent = new Intent(SplashScreen1.this, LoginP.class);
        startActivity(intent);
        finish();
    }

    public void toGuest(View view){
        Intent intent1 = new Intent(SplashScreen1.this, MainActivity.class);
        startActivity(intent1);
        finish();
    }
}