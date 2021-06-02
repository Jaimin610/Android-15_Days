package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class Gridview extends AppCompatActivity {
    GridView gv1;

    String course[]={"Android","PHP","IOS","C","ICONIC JS","WORD PRESS","JAVA","C#","DOT NET","ADV JAVA","HTML","FIREBASE","BOOTSTRAP","PYTHON"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        gv1=findViewById(R.id.gv1);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(Gridview.this, android.R.layout.simple_list_item_1,course);

        gv1.setAdapter(arrayAdapter);

        gv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int Position, long l) {

                Toast.makeText(Gridview.this, "You Select "+course[Position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}