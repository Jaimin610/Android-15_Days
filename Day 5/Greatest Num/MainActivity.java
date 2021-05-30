package com.example.gretestnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNum1,etNum2;
    Button check;
    TextView Ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1=findViewById(R.id.etNum1);
        etNum2=findViewById(R.id.etNum2);
        check=findViewById(R.id.check);
        Ans=findViewById(R.id.Ans);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1,n2;

                n1 = etNum1.getText().toString();
                n2 = etNum2.getText().toString();

                int num1,num2;

                num1 = Integer.parseInt(n1);
                num2 = Integer.parseInt(n2);

                if(num1>num2)
                {
                    Ans.setText("Greatest number is "+num1);
                    Toast.makeText(MainActivity.this, "greatest number is"+num1 ,Toast.LENGTH_SHORT).show();
                }
                else if(num1<num2)
                {
                    Ans.setText("Greatest number is"+num2);
                    Toast.makeText(MainActivity.this, "greatest number is"+num2 ,Toast.LENGTH_SHORT).show();
                }
                else if(num1==num2)
                {
                    Ans.setText("BOTH ARE SAME NO GREATER NUMBER");
                    Toast.makeText(MainActivity.this, "both are same" ,Toast.LENGTH_SHORT).show();
                }




            }
        });




    }
}