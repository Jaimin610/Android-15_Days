package com.example.signupactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.prefs.Preferences;

public class LoginActivity extends AppCompatActivity {
    EditText etEmail,etPassword;
    Button btnSignup,btnSignin;

    public static final String main_key="myPref";
    public static final String name_key="nameKey";

    public static final String email_key="emailKey";
    public static final String password_key="passwordKey";
    public static final String contact_key="contactKey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        btnSignin=findViewById(R.id.btnSignin);
        btnSignup=findViewById(R.id.btnSignup);


        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userEmail,userPassword;
                userEmail=etEmail.getText().toString();
                userPassword=etPassword.getText().toString();

                SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);
                String email=preferences.getString(email_key,"");
                String password=preferences.getString(password_key,"");
                String name=preferences.getString(name_key,"");
                String contact=preferences.getString(contact_key,"");

                if(userEmail.equals(email) && userPassword.equals(password)) {
                  Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                  intent.putExtra(name_key,name);
                  intent.putExtra(email_key,email);
                  intent.putExtra(password_key,password);
                  intent.putExtra(contact_key,contact);

                  startActivity(intent);

              }
              else {
                  Toast.makeText(LoginActivity.this,"INVALID LOG IN DETAILS.",Toast.LENGTH_SHORT).show();

              }

            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}