package com.knowlege.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResisterUpdate extends AppCompatActivity {
Button newblooddonar,oldblooddonar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resister_update);
        newblooddonar=(Button)findViewById(R.id.button);
        oldblooddonar=(Button)findViewById(R.id.button2);

        newblooddonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  startActivity(new Intent(ResisterUpdate.this,Blooddonarresister.class));
                startActivity(new Intent(ResisterUpdate.this,newresisteractivity.class));
            }
        });

        oldblooddonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  startActivity(new Intent(ResisterUpdate.this,Blooddonarresister.class));
                startActivity(new Intent(ResisterUpdate.this,login.class));
            }
        });


    }

    public void onclick_notice(View view) {
     startActivity(new Intent(ResisterUpdate.this,notice2.class));
    }
}