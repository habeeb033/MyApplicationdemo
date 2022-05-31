package com.example.myapplicationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {
    Button Regbut;
    EditText Reguser;
    EditText Regpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Regbut = (Button) findViewById(R.id.regbut);
        Regbut.setOnClickListener(this);
        Reguser = (EditText) findViewById(R.id.reguser);
        Regpass =(EditText)  findViewById(R.id.regpass);


    }

    @Override
    public void onClick(View v) {
        String username1= Reguser.getText().toString();
        String passw1=Regpass.getText().toString();
        Intent k=new Intent(getApplicationContext(),LoginPage.class);
        k.putExtra("user",username1);
        k.putExtra("pass",passw1);
        startActivity(k);

    }
}