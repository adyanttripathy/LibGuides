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

public class Main5Activity extends AppCompatActivity{
    String[] SUBS = {"PROGRAMMING LABORATORY-II","COMPUTER ORGANISATION AND ARCHITECTURE","DATABASE MANAGEMENT SYSTEMS","OPERATING SYSTEM","MATHEMATICS-III","THEORETICAL COMPUTER SCIENCE","MATHEMATICS-IV","DATA STRUCTURES","DISCRETE STRUCTURES","DIGITAL LOGIC DESIGN","PROGRAMMING LABORATORY-I","NUMERICAL TECHNIQUES","COMPUTER NETWORKS","ANALOG AND DIGITAL COMMUNICATION","ENVIRONMENTAL STUDIES","PROFESSIONAL ETHICS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
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
                Toast.makeText(Main5Activity.this,subject,Toast.LENGTH_LONG).show();
                if(position==0){
                    Intent i1 = new Intent(Main5Activity.this, pl2.class);
                    startActivity(i1);
                }
                if(position==1){
                    Intent i2=new Intent(Main5Activity.this,coa.class);
                    startActivity(i2);
                }
                if(position==2){
                    Intent i3=new Intent(Main5Activity.this,dbms.class);
                    startActivity(i3);
                }
                if(position==3){
                    Intent i4=new Intent(Main5Activity.this,os.class);
                    startActivity(i4);
                }
                if(position==4){
                    Intent i5=new Intent(Main5Activity.this,m3.class);
                    startActivity(i5);
                }
                if(position==5){
                    Intent i6=new Intent(Main5Activity.this,tcs.class);
                    startActivity(i6);
                }
                if(position==6){
                    Intent i7=new Intent(Main5Activity.this,m4.class);
                    startActivity(i7);
                }
                if(position==7){
                    Intent i8=new Intent(Main5Activity.this,ds.class);
                    startActivity(i8);
                }
                if(position==8){
                    Intent i9=new Intent(Main5Activity.this,ds2.class);
                    startActivity(i9);
                }
                if(position==9){
                    Intent i10=new Intent(Main5Activity.this,dld.class);
                    startActivity(i10);
                }
                if(position==10){
                    Intent i11=new Intent(Main5Activity.this,pl1.class);
                    startActivity(i11);
                }
                if(position==11){
                    Intent i12=new Intent(Main5Activity.this,nt.class);
                    startActivity(i12);
                }
                if(position==12){
                    Intent i13=new Intent(Main5Activity.this,cn.class);
                    startActivity(i13);
                }
                if(position==13){
                    Intent i14=new Intent(Main5Activity.this,adc.class);
                    startActivity(i14);
                }
                if(position==14){
                    Intent i15=new Intent(Main5Activity.this,es.class);
                    startActivity(i15);
                }
                if(position==15){
                    Intent i16=new Intent(Main5Activity.this,pe.class);
                    startActivity(i16);
                }
            }});
    }
}
