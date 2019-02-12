package com.example.sarzex.libguides;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //onClickButtonListener();
        signupClick();
        LoginClick();
    }

    public void signupClick(){
        ed1=(EditText)findViewById(R.id.editText1);
        ed2=(EditText)findViewById(R.id.editText2);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Signing In",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent("com.example.sarzex.libguides.Main2Activity");
                startActivity(intent);
            }
        });
    }
    public void LoginClick(){
        ed1=(EditText)findViewById(R.id.editText1);
        ed2=(EditText)findViewById(R.id.editText2);
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("wercool@gmail.com")&& ed2.getText().toString().equals("Pass123")) {
                    Toast.makeText(MainActivity.this,"Logging In",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent("com.example.sarzex.libguides.Main2Activity");
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Incorrect Login Details",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}