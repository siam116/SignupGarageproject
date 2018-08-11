package com.example.siam.signupgarageproj;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;


public class SignUp_Garage extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_main);
    }


    public void login(View view) {
        EditText e = (EditText) findViewById(R.id.name);
        String name = e.getText().toString().trim();
        name = name.replace(" ", "%20");

        EditText f = (EditText) findViewById(R.id.add);
        String address = f.getText().toString().trim();

        EditText g = (EditText) findViewById(R.id.email);
        String mail = g.getText().toString().trim();

        EditText h = (EditText) findViewById(R.id.pass);
        String password = h.getText().toString().trim();

        EditText i = (EditText) findViewById(R.id.mob);
        String mob = i.getText().toString().trim();

        EditText j = (EditText) findViewById(R.id.ONtime);
        String opentime = j.getText().toString().trim();

        EditText k = (EditText) findViewById(R.id.offtime);
        String offtme = k.getText().toString().trim();

        EditText l = (EditText) findViewById(R.id.costperhour);
        String costperhour = l.getText().toString().trim();
    }

mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this,new OnCompleteListener<AuthResult>() {
           @Override
          public void onComplete (@NonNull Task < AuthResult > task) {
             // Log.d(TAG, "createUserWithEmail:onComplete:" + task.isSuccessful());

              // If sign in fails, display a message to the user. If sign in succeeds
              // the auth state listener will be notified and logic to handle the
              // signed in user can be handled in the listener.
              if (!task.isSuccessful()) {
                  System.out.println("Sign-in Failed: " + task.getException().getMessage());
                  
                Toast.makeText(MainActivity.this, "registration Failed", Toast.LENGTH_SHORT).show();
              }
              else{
                  
                Toast.makeText(MainActivity.this, "Successfully registered", Toast.LENGTH_LONG).show();
              }

              // ...
          }
      }  );


}


