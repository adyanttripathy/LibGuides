package com.example.sarzex.libguides;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main7Activity extends AppCompatActivity {
    Button c1,c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        //onClickButtonListener();
        cardClick();
    }

    public void cardClick(){

        c2 = (Button) findViewById(R.id.card_view);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main7Activity.this,"Opening....",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Main8Activity.class);
                startActivity(intent);
            }
        });

        c1 = (Button) findViewById(R.id.card_view3);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main7Activity.this,"Opening....",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Main5Activity.class);
                startActivity(intent);
            }
        });

    }
}
