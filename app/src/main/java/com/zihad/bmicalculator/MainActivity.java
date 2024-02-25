package com.zihad.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2, ed3;
    Button button;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sweight = ed1.getText().toString();
                String sfeet = ed2.getText().toString();
                String sinch = ed3.getText().toString();
                float weight = Float.parseFloat(sweight);
                float feet = Float.parseFloat(sfeet);
                float inch= Float.parseFloat(sinch);


                float height = (float) (feet*0.3048 +inch*0.0254);
                float bmi= weight/(height*height);
                if(18 >= bmi){
                    Toast.makeText(MainActivity.this,"you are underweight",Toast.LENGTH_SHORT).show();
                    textView2.setText("your bmi is "+bmi+"\nciknaaaaa tumi");

                }
                else if(24 <= bmi){
                    Toast.makeText(MainActivity.this,"you are overweight",Toast.LENGTH_SHORT).show();
                    textView2.setText("your bmi is "+bmi+"\nmottaaaaaaa tumi");

                }else {Toast.makeText(MainActivity.this,"you are fit" ,Toast.LENGTH_SHORT).show();
                    textView2.setText("your bmi is "+bmi+"\nsei vai sei tumi");


                }





            }
        });

    }
}