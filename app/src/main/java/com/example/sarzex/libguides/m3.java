package com.example.sarzex.libguides;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class m3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m3);
        gobackClick();
    }

    Button b3;

    public void gobackClick(){

        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(m3.this,"Signing Out",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public class Book {

        private String Title;
        private String Category ;
        private String Description ;
        private int Thumbnail ;

        public Book() {
        }

        public Book(String title, String category, String description, int thumbnail) {
            Title = title;
            Category = category;
            Description = description;
            Thumbnail = thumbnail;
        }


        public String getTitle() {
            return Title;
        }

        public String getCategory() {
            return Category;
        }

        public String getDescription() {
            return Description;
        }

        public int getThumbnail() {
            return Thumbnail;
        }


        public void setTitle(String title) {
            Title = title;
        }

        public void setCategory(String category) {
            Category = category;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public void setThumbnail(int thumbnail) {
            Thumbnail = thumbnail;
        }
    }
}
