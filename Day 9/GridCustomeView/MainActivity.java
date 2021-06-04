package com.example.customegrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gvName;
    int[] image={R.drawable.c1,R.drawable.c2,R.drawable.c3};
    String[] name={"This is Canon","This is Sony","This is Nikon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvName=findViewById(R.id.gvName);

        MyAdapter1 myAdapter1 = new MyAdapter1(image,name,MainActivity.this);
        gvName.setAdapter(myAdapter1);

        gvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,CustomGridData.class);
                intent.putExtra("T1",name[position]);
                intent.putExtra("I1",image[position]);
                startActivity(intent);
            }
        });
    }
}