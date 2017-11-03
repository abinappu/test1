package com.example.vizz.university_miniproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main6Activity extends AppCompatActivity {
    EditText editText1,editText2,editText3,editText4,editText6;
    Button button1,button2;
    TextView editText5;
    String subject;
    DataBase dataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        editText1= (EditText) findViewById(R.id.editText10);
        editText2= (EditText) findViewById(R.id.editText11);
        editText3= (EditText) findViewById(R.id.editText12);
        editText4= (EditText) findViewById(R.id.editText13);
        editText5= (TextView) findViewById(R.id.editText14);
        editText6= (EditText) findViewById(R.id.editText15);
        button1= (Button) findViewById(R.id.button11);
        button2= (Button) findViewById(R.id.button12);
        dataBase=new DataBase(this);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        subject=bundle.getString("subject");
        editText5.setText(subject);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Student student=new Student(editText1.getText().toString(),editText2.getText().toString(),editText3.getText().toString(),editText4.getText().toString(),subject,editText6.getText().toString());
                dataBase.add(student);
                Toast.makeText(Main6Activity.this, "Data Saved ", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main6Activity.this,Main4Activity.class);
                startActivity(intent);

            }
        });
    }
}
