package com.example.checknumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNum;
    Button CHECK;
    TextView Ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                etNum=findViewById(R.id.etNum);
                CHECK=findViewById(R.id.check);
                Ans=findViewById(R.id.Ans);

                CHECK.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String n;

                        n = etNum.getText().toString();


                        int num;

                        num = Integer.parseInt(n);

                        if(num>0)
                        {
                            Ans.setText("ENTERED NUMBER IS POSITIVE");
                            Toast.makeText(MainActivity.this,"POSITIVE NUMBER",Toast.LENGTH_SHORT).show();

                        }
                        else if(num<0)
                        {
                            Ans.setText( "ENTERED NUMBER IS NEGATIVE");
                            Toast.makeText(MainActivity.this,"NEGATIVE NUMBER",Toast.LENGTH_SHORT).show();
                        }
                        else if (num==0)

                        {
                            Ans.setText("ENTERED NUMBER IS ZERO");
                            Toast.makeText(MainActivity.this,"THIS IS ZERO",Toast.LENGTH_SHORT).show();

                        }
                        else
                        {
                            Ans.setText("NOT VALID");
                        }

                    }

                });

            }

}