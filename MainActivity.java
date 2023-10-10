package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText t1,t2,t3,t4;
        Button b1;
        t1=findViewById(R.id.editTextText);
        t2=findViewById(R.id.editTextText2);
        t3=findViewById(R.id.editTextText3);
        t4= findViewById(R.id.editTextText4);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double h=Double.parseDouble(t1.getText().toString());
                double w=Double.parseDouble(t2.getText().toString());
                h=h/100;
                double bmi=w/(h*h);
                t3.setText(Double.toString(bmi));

                if (bmi<=18.5){
                    t4.setText("Under Weight ");
                }
                else if (bmi>18.5 && bmi<24.5) {
                    t4.setText("Normal");
                }
                else if (bmi>24.5 && bmi<29.9) {
                     t4.setText("Over Weight");
                } else if (bmi>30 && bmi<43.5 ) {
                    t4.setText("Extemely Obese");

                }

            }
        });



    }
}
