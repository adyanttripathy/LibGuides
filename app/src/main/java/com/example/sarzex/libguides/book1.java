package com.example.sarzex.libguides;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class book1 extends AppCompatActivity {
    private static int count=5;
    TextView txtCount;
    Button buttonInc;
    Button buttonDec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);
        openit();
        txtCount.setText(String.valueOf(count));
        gobackClick();
    }

    Button b3;

    public void gobackClick(){

        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(book1.this,"Signing Out",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public void openit() {
        txtCount = (TextView) findViewById(R.id.txt);
        buttonInc = (Button) findViewById(R.id.button2);
        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                txtCount.setText(String.valueOf(count));
                if (count > 5) {
                    Toast.makeText(getApplicationContext(), "Not From Our Library", Toast.LENGTH_SHORT).show();
                    count = 5;
                    txtCount.setText("FULL");
                }

            }
        });
        buttonDec = (Button) findViewById(R.id.button1);
        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                txtCount.setText(String.valueOf(count));
                if (count <= 0) {
                    Toast.makeText(getApplicationContext(), "No Book Available.......You Can Not ISSUE this BOOK", Toast.LENGTH_SHORT).show();
                    count = 0;
                    txtCount.setText("NOT AVAILABLE");
                }

            }
        });

    }
}