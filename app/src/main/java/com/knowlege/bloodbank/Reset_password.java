package com.knowlege.bloodbank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Reset_password extends AppCompatActivity {
EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        email=(EditText)findViewById(R.id.email);


    }

    public void resetpass(View view) {
        String s=email.getText().toString();
        if(TextUtils.isEmpty(s))
        {
            Toast.makeText(Reset_password.this,"please enter the email",Toast.LENGTH_SHORT).show();
            return;
        }
        FirebaseAuth.getInstance().sendPasswordResetEmail(s).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
              if(task.isSuccessful()) {
                  Toast.makeText(Reset_password.this, "succefully sent on email", Toast.LENGTH_SHORT).show();
                  startActivity(new Intent(Reset_password.this,login.class));
              }
            }
        });
    }
}