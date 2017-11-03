package com.example.vizz.university_miniproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {
ArrayList<Student> arrayList;
    EditText editText;
    TextView textView1,textView2,textView3,textView4,textView5,textView6;
    Button button;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        DataBase dataBase=new DataBase(this);
        arrayList=dataBase.getArrayList();
        editText= (EditText) findViewById(R.id.editSearch);
        textView1= (TextView) findViewById(R.id.textView1);
        textView2= (TextView) findViewById(R.id.textView2);
        textView3= (TextView) findViewById(R.id.textView3);
        textView4= (TextView) findViewById(R.id.textView4);
        textView5= (TextView) findViewById(R.id.textView5);
        textView6= (TextView) findViewById(R.id.textView6);

        button= (Button) findViewById(R.id.buttonSearch);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(Student student:arrayList)
                {
                    if(student.getNo().equals(editText.getText().toString()))
                    {
                       textView1.setText("NO :"+student.getNo());
                        textView2.setText("NAME :"+student.getName());
                        textView3.setText("SUBJECT :"+student.getSubject());
                        textView4.setText("EMAIL :"+student.getEmail());
                        textView5.setText("MOBILE :"+student.getMobile());
                        textView6.setText("DESCRIPTION :"+student.getDescription());
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                {
                    Toast.makeText(Main7Activity.this, "Sorry invalid Student no", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
