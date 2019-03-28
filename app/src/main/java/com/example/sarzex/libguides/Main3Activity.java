package com.example.sarzex.libguides;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //onClickButtonListener();
        cardClick();
    }

    public void cardClick(){

        c1 = (Button) findViewById(R.id.card_view);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this,"Opening....",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Main7Activity.class);
                startActivity(intent);
            }
        });

    }
}
