package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListDataActivity extends AppCompatActivity {
    ImageView ivImage;
    TextView tvnamedetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

        ivImage=findViewById(R.id.ivImage);
        tvnamedetail=findViewById(R.id.tvnamedetail);

        Intent intent=getIntent();
        int image=intent.getIntExtra("image",R.drawable.i3);
        ivImage.setImageResource(image);

        String name=intent.getStringExtra("name");
        tvnamedetail.setText(name);
    }
}