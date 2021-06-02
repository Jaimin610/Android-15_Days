package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv1;

    String name[]={"Demo 1","Demo 2","Demo 3","Demo 4","Demo 5","Demo 6","Demo 7","Demo 8","Demo 9","Demo 10",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1=findViewById(R.id.lv1);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,name);

        lv1.setAdapter(arrayAdapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int Position, long l) {

                Toast.makeText(MainActivity.this, "You Select "+name[Position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}