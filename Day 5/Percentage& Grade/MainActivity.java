package com.example.percentagevisegrade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNum1,etNum2,etNum3,etNum4,etNum5;
    Button per;
    TextView tvPer,tvGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1=findViewById(R.id.etNum1);
        etNum2=findViewById(R.id.etNum2);
        etNum3=findViewById(R.id.etNum3);
        etNum4=findViewById(R.id.etNum4);
        etNum5=findViewById(R.id.etNum5);
        per=findViewById(R.id.per);
        tvPer=findViewById(R.id.tvPer);
        tvGrade=findViewById(R.id.tvGrade);

        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n1,n2,n3,n4,n5;

                n1 = etNum1.getText().toString();
                n2 = etNum2.getText().toString();
                n3 = etNum3.getText().toString();
                n4= etNum4.getText().toString();
                n5 = etNum5.getText().toString();


                int num1,num2,num3,num4,num5,total;
                float per;

                num1 = Integer.parseInt(n1);
                num2 = Integer.parseInt(n2);
                num3 = Integer.parseInt(n3);
                num4 = Integer.parseInt(n4);
                num5 = Integer.parseInt(n5);
                total=num1+num2+num3+num4+num5;
                per=(float)total/5;

                tvPer.setText("Percentage is"+per);

                if(per>=90 && per<100)
                {
                    tvGrade.setText("Grade is A+");

                    Toast.makeText(MainActivity.this, "Grade is A+", Toast.LENGTH_SHORT).show();
                }
                else if(per>=80 && per<90)
                {
                    tvGrade.setText("Grade is A");

                    Toast.makeText(MainActivity.this, "Grade is A", Toast.LENGTH_SHORT).show();
                }
                else if(per>=75 && per<80)
                {
                    tvGrade.setText("Grade is B+");

                    Toast.makeText(MainActivity.this, "Grade is B+", Toast.LENGTH_SHORT).show();
                }
                else if(per>=70 && per<75)
                {
                    tvGrade.setText("Grade is B");

                    Toast.makeText(MainActivity.this, "Grade is B", Toast.LENGTH_SHORT).show();
                }
                else if(per>=65 && per<70)
                {
                    tvGrade.setText("Grade is C+");

                    Toast.makeText(MainActivity.this, "Grade is C+", Toast.LENGTH_SHORT).show();
                }
                else if(per>=60 && per<65)
                {
                    tvGrade.setText("Grade is C");

                    Toast.makeText(MainActivity.this, "Grade is C", Toast.LENGTH_SHORT).show();
                }
                else if(per>=55 && per<60)
                {
                    tvGrade.setText("Grade is D+");

                    Toast.makeText(MainActivity.this, "Grade is D+", Toast.LENGTH_SHORT).show();
                }
                else if(per>=50 && per<55)
                {
                    tvGrade.setText("Grade is D");

                    Toast.makeText(MainActivity.this, "Grade is D", Toast.LENGTH_SHORT).show();
                }
                else if(per>=45 && per<50)
                {
                    tvGrade.setText("Grade is E+");

                    Toast.makeText(MainActivity.this, "Grade is E+", Toast.LENGTH_SHORT).show();
                }
                else if(per>=40 && per<45)
                {
                    tvGrade.setText("Grade is E");

                    Toast.makeText(MainActivity.this, "Grade is E", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    tvGrade.setText("Grade is F(Fail)");

                    Toast.makeText(MainActivity.this, "Grade is F(Fail)", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}