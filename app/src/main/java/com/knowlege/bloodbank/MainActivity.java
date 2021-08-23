package com.knowlege.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView requestforblood,blooddonate;
//Databasehelper mydb;
    ImageView donar,acceptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // mydb=new Databasehelper(this);
         requestforblood=(TextView)findViewById(R.id.textView);

         blooddonate=(TextView)findViewById(R.id.textView2);
         donar=(ImageView)findViewById(R.id.donar);
         acceptor=(ImageView)findViewById(R.id.acceptor);

         requestforblood.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 acceptorfunc();


             }
         });

         blooddonate.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
             donarfunc();
             }
         });



        acceptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               acceptorfunc();

            }
        });

        donar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               donarfunc();
            }
        });
    }
    public void acceptorfunc()
    {
        startActivity(new Intent(MainActivity.this,Search.class));
    }
    public void donarfunc()
    {
        startActivity(new Intent(MainActivity.this,ResisterUpdate.class));
    }
}