package com.knowlege.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Bloodgrouplist extends AppCompatActivity {
ListView list;
String []bloodgroup={"A+","A-","B+","B-","AB+","AB-","O+","O-"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodgrouplist);
        list=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,bloodgroup);
        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(Bloodgrouplist.this,"click on"+bloodgroup[position],Toast.LENGTH_SHORT).show();
             //   Intent i=new Intent(Bloodgrouplist.this,read_blood_group.class);
               // i.putExtra("key",bloodgroup[position]);
               // startActivity(i);
            }
        });
    }
}