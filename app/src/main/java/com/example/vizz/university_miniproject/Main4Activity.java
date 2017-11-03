package com.example.vizz.university_miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {
    Button button1,button2,button3,button4;
    ImageView imageView1,imagesearch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button1= (Button) findViewById(R.id.button7);
        button2= (Button) findViewById(R.id.button8);
        button3= (Button) findViewById(R.id.button9);
        button4= (Button) findViewById(R.id.button10);
        imageView1= (ImageView) findViewById(R.id.imageView1);
        imagesearch= (ImageView) findViewById(R.id.imageSearch);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main4Activity.this,Main6Activity.class);
                intent.putExtra("subject","PHD");
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main4Activity.this,Main6Activity.class);
                intent.putExtra("subject","MPHIL");
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main4Activity.this,Main6Activity.class);
                intent.putExtra("subject","BTECH");
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main4Activity.this,Main6Activity.class);
                intent.putExtra("subject","MCA");
                startActivity(intent);

            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(intent);
            }
        });
        imagesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(intent);
            }
        });
    }
}
