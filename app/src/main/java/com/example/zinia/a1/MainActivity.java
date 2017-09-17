package com.example.zinia.a1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    TextView feet, cm;
    Button convert;

    String a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        feet = (TextView) findViewById(R.id.feet);
        cm = (TextView) findViewById(R.id.cm);
        convert = (Button) findViewById(R.id.convert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=feet.getText().toString();
                Double x = Double.parseDouble(a);

                x = x*30;
                b= Double.toString(x);
                /*Toast toast = Toast.makeText(getApplicationContext(), a + " feet = " +x+ " cm" , LENGTH_SHORT);
                toast.show();*/

                cm.setText(a + " feet = " + b + " cm");
            }
        });

    }
}
