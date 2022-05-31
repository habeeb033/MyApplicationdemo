 package com.example.myapplicationdemo;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

 public class LoginPage extends AppCompatActivity implements View.OnClickListener {

     String username;
     String password;
     EditText un;
     EditText pw;
     int count=3;
     Button login;
     TextView text4;
     Button reg;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_login_page);
         login=(Button) findViewById(R.id.b);
         reg=(Button) findViewById(R.id.reg) ;
          un=(EditText) findViewById(R.id.username) ;
          pw=(EditText) findViewById(R.id.password) ;
          text4 = (TextView) findViewById(R.id.text4) ;

         login.setOnClickListener(this);
         reg.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent j=new Intent(getApplicationContext(),Register.class);
                 startActivity(j);
             }
         });


     }

     @Override
     public void onClick(View v){
       Intent  k = getIntent();
       username = k.getStringExtra("user");
       password=k.getStringExtra("pass");


         String uname=un.getText().toString();
         String pname=pw.getText().toString();
     if(username.equals(uname)  && password.equals(pname)) {

         Intent i = new Intent(getApplicationContext(), home_page.class);
         i.putExtra("user",uname);
         startActivity(i);
     }else {
         Toast.makeText(getApplicationContext(),"invalid usernnme and password",Toast.LENGTH_LONG).show();
         count--;
         if(count == 0){
             login.setEnabled(false );
             text4.setText("LOGIN BLOCKED");
             text4.setTextColor(Color.RED );
         }
     }


     }
 }
//using xml
     //  1.public void Logined(View view) {
     //     Toast.makeText(getApplicationContext(),"login success",Toast.LENGTH_LONG).show();
// }
     //using inner class
     //2. login.setOnClickListener(new View.OnClickListener() {-
     //   @Override
     //   public void onClick(View v) {
     //    Intent i= new Intent(getApplicationContext(), home_page.class);
     //    startActivity(i);
     //  }
     //  });

