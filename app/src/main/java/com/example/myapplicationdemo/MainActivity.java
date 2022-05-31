package com.example.myapplicationdemo;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Handler obj=new Handler();
        //obj.postDelayed(new Runnable() {
          //  @Override
          //  public void run() {
           //     Intent Intent=new Intent(getApplicationContext(),LoginPage.class);
           //     startActivity(Intent);
    //}},5000);

        Thread obj=new Thread(){
       @Override
               public void run() {
           try {
               sleep(4000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           Intent Intent=new Intent(getApplicationContext(),LoginPage.class);
              startActivity(Intent);

       }
        };
        obj.start();
    }
}