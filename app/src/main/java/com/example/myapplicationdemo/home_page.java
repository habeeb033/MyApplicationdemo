package com.example.myapplicationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class home_page extends AppCompatActivity {
    TextView user;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        user =(TextView) findViewById(R.id.user);
         i= getIntent();
        String username= i.getStringExtra("user");
        user.setText("welocome"+username);

    }
}