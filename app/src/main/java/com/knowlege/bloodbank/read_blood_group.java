package com.knowlege.bloodbank;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.knowlege.bloodbank.adapter.BloodListAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class read_blood_group extends AppCompatActivity {
    DatabaseReference ref;
ListView listView;
userinfo info;
TextView text1;
private List<user> userList;
private BloodListAdapter adpter;
private RecyclerView recyclerView;
private String text,bloodgroups,states,citys;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_blood_group);
  recyclerView=findViewById(R.id.recycler_view);

        Bundle bundle=getIntent().getExtras();
          bloodgroups=bundle.getString("bloodgroup");
          states=bundle.getString("state");
          citys=bundle.getString("city");

         //text=bundle.getString("key");
        userList=new ArrayList<>();
        ref=FirebaseDatabase.getInstance().getReference();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adpter=new BloodListAdapter(this,userList);
        recyclerView.setAdapter(adpter);
//        listView=(ListView)findViewById(R.id.listview);
//       final ArrayList<String>arrayList;
//      arrayList=new ArrayList<String>();
//      final ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
//
//         // info=new userinfo();
//        listView.setAdapter(arrayAdapter);
//        Query query =ref.orderByChild("bloodgroup").equalTo(text);
//
//        query.addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
//
//
//               //String value=snapshot.getValue(String.class).toString();
//                 for(DataSnapshot dataSnapshot:snapshot.getChildren()) {
//                     Map<String, String> map = (Map<String, String>) dataSnapshot.getValue();
//                     String s = String.valueOf(map.get("fullname"));
//                     arrayList.add(s);
//                 }
//
//
//
//
//
//
//
//           arrayAdapter.notifyAll();
//            }
//
//            @Override
//            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
//
//            }
//
//            @Override
//            public void onChildRemoved(@NonNull DataSnapshot snapshot) {
//
//            }
//
//            @Override
//            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//         });
//
//
//
//



        //Toast.makeText(read_blood_group.this,text,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        show();
    }
    private void show()
    {

        ref.child("user").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                userList.clear();
                int f=0;
                for(DataSnapshot snapshot1:snapshot.getChildren())
                {
                    user user=snapshot1.getValue(user.class);
                    if(bloodgroups.equals(user.getBloodgroup()) && states.equals(user.getState()) && citys.equals(user.getCity()))
                    {   f=1;
                        userList.add(user);
                    }

                }
                adpter.notifyDataSetChanged();
               /* if(f==0)
                {
                    Toast.makeText(read_blood_group.this,"Do not have any donar",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(read_blood_group.this,MainActivity.class));
                }*/
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}