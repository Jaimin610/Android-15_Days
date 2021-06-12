package com.example.message;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etMobile,etMsg;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMobile=findViewById(R.id.etMobile);
        etMsg=findViewById(R.id.etMsg);
        btnSend=findViewById(R.id.btnSend);


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String no = etMobile.getText().toString();
                String msg = etMsg.getText().toString();

              

                //create SmsManager instance and call the sendTextMessage method to send message

                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(no,null,msg,null,null);
                Toast.makeText(getApplicationContext(),"Message sent Successfully",Toast.LENGTH_LONG).show();

            }
        });
    }
}