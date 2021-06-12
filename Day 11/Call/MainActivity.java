package com.example.call;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    Button btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editText1);
        btnCall=findViewById(R.id.btnCall);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String number=editText1.getText().toString();
                //use implicit intent
                Intent intent= new Intent(Intent.ACTION_CALL);
                //to make a phone call u need to specify tel: as URI using setData() method
                intent.setData(Uri.parse("tel:"+number));
                startActivity(intent);
            }
        });

    }

}