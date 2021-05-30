package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    EditText etNum1,etNum2;
    Button plus,minus,divide,multiply;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        etNum1=findViewById(R.id.etNum1);
        etNum2=findViewById(R.id.etNum2);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);
        ans=findViewById(R.id.ans);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1,n2;
                n1=etNum1.getText().toString();
                n2=etNum2.getText().toString();

                int num1,num2,sum;

                num1=Integer.parseInt(n1);
                num2=Integer.parseInt(n2);

                sum= num1+num2;

                ans.setText("ADDITION OF "+num1+" + "+num2+" = "+sum);
                Toast.makeText(Calculator.this, "ADDITION is "+sum, Toast.LENGTH_SHORT).show();




            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n1,n2;
                n1=etNum1.getText().toString();
                n2=etNum2.getText().toString();

                int num1,num2,sub;

                num1=Integer.parseInt(n1);
                num2=Integer.parseInt(n2);

                sub= num1-num2;

                ans.setText("SUBTRACTION OF "+num1+" - "+num2+" = "+sub);
                Toast.makeText(Calculator.this, "SUBTRACTION is "+sub, Toast.LENGTH_SHORT).show();


            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1,n2;
                n1=etNum1.getText().toString();
                n2=etNum2.getText().toString();

                int num1,num2,mul;

                num1=Integer.parseInt(n1);
                num2=Integer.parseInt(n2);

                mul= num1*num2;

                ans.setText("MULTIPLICATION OF "+num1+" * "+num2+" = "+mul);
                Toast.makeText(Calculator.this, "MULTIPLICATION is "+mul, Toast.LENGTH_SHORT).show();

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1,n2;
                n1=etNum1.getText().toString();
                n2=etNum2.getText().toString();

                int num1,num2,div;

                num1=Integer.parseInt(n1);
                num2=Integer.parseInt(n2);

                div= num1/num2;

                ans.setText("DIVISION OF "+num1+" + "+num2+" = "+div);
                Toast.makeText(Calculator.this, "DIVISION is "+div, Toast.LENGTH_SHORT).show();

            }
        });
    }
    }
