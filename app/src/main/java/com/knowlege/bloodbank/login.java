package com.knowlege.bloodbank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {
EditText email,password;
Button login,forgotpass;

private FirebaseAuth myauth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=(EditText)findViewById(R.id.email);

        myauth=FirebaseAuth.getInstance();
        password=(EditText)findViewById(R.id.pass);

       // login=(Button)findViewById(R.id.login);
      //  forgotpass=(Button)findViewById(R.id.forgotpass);

    }


    public void login(View view) {
           final String  email_string=email.getText().toString();
       String     password_string=password.getText().toString();
        if(TextUtils.isEmpty(email_string ))
        {
            Toast.makeText(login.this,"plaese enter email",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password_string) )
        {
            Toast.makeText(login.this,"plaese enter password",Toast.LENGTH_SHORT).show();
            return;
        }

        myauth.signInWithEmailAndPassword(email_string, password_string)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                             Intent i=new Intent(login.this,update.class);
                             i.putExtra("key",email_string);
                            startActivity(i);
                        } else {
                            // If sign in fails, display a message to the user.
                           Toast.makeText(login.this,"please enter thr correct email and password",Toast.LENGTH_SHORT).show();
                           return;
                        }

                        // ...
                    }
                });


    }

    public void forgotpass(View view) {
  startActivity(new Intent(login.this,Reset_password.class));
    }


}