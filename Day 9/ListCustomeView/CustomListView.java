package com.example.listactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CustomListView extends AppCompatActivity {
    ListView lv1;
    int[] image ={R.drawable.i1,R.drawable.i3,R.drawable.i4};
    String[] name={"This is 1","This is 3","This is 4",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        lv1=findViewById(R.id.lv1);

        Myadapter myadapter=new Myadapter(image,name,CustomListView.this);
        lv1.setAdapter(myadapter);


       lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CustomListView.this,ListDataActivity.class);
                intent.putExtra("T1",name[position]);
                intent.putExtra("I1",image[position]);
                startActivity(intent);
            }
        });

    }
}