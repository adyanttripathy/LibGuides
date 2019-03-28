package com.example.sarzex.libguides;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity{
    String[] SUBS = {"MATHEMATICS BOOK-1","MATHEMATICS BOOK-2","DATABASE MANAGEMENT SYSTEMS BOOK","DIGITAL LOGIC DESIGN BOOK","COMPUTER ORGANISATION AND ARCHITECTURE BOOK","THEORETICAL COMPUTER SCIENCE BOOK","DATA STRUCTURES BOOK","DISCRETE STRUCTURES BOOK","DISCRETE STRUCTURES BOOK","ANALOG AND DIGITAL COMMUNICATION BOOK","OPERATING SYSTEMS BOOK"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        clickopen();
    }

    public void clickopen(){
        ListAdapter ls = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,SUBS);
        ListView lv =(ListView)findViewById(R.id.listView);

        lv.setAdapter(ls);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String subject=String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(Main8Activity.this,subject,Toast.LENGTH_LONG).show();
                if(position==0){
                    Intent i1 = new Intent(Main8Activity.this, book1.class);
                    startActivity(i1);
                }
                if(position==1){
                    Intent i2=new Intent(Main8Activity.this,book2.class);
                    startActivity(i2);
                }
                if(position==2){
                    Intent i3=new Intent(Main8Activity.this,book3.class);
                    startActivity(i3);
                }
                if(position==3){
                    Intent i4=new Intent(Main8Activity.this,book4.class);
                    startActivity(i4);
                }
            }});
    }
}
