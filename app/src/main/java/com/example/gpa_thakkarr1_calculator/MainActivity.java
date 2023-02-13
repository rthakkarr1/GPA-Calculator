package com.example.gpa_thakkarr1_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button Calculate;
    EditText sub1, sub2, sub3, sub4, sub5, Total, Avg;
    double n1, n2, n3, n4, n5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sub1 = (EditText) findViewById(R.id.s1);
        sub2 = (EditText) findViewById(R.id.s2);
        sub3 = (EditText) findViewById(R.id.s3);
        sub4 = (EditText) findViewById(R.id.s4);
        sub5 = (EditText) findViewById(R.id.s5);
        Total = (EditText) findViewById(R.id.t);
        Avg = (EditText) findViewById(R.id.a);
        Calculate = (Button) findViewById(R.id.btn);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                n1 = Double.parseDouble(sub1.getText().toString());
                n2 = Double.parseDouble(sub2.getText().toString());
                n3 = Double.parseDouble(sub3.getText().toString());
                n4 = Double.parseDouble(sub4.getText().toString());
                n5 = Double.parseDouble(sub5.getText().toString());
                Total.setText(n1 + n2 + n3 + n4 + n5 + "");
                double avg = (n1 + n2 + n3 + n4 + n5) / 5;
                Avg.setText(avg + "");
                if (avg < 61) {
                    Avg.setBackgroundColor(Color.RED);
                } else if (avg >= 61 && avg <= 81) {
                    Avg.setBackgroundColor(Color.YELLOW);
                } else if (avg > 81) {
                    Avg.setBackgroundColor(Color.GREEN);
                }
            }
        });
    }
}