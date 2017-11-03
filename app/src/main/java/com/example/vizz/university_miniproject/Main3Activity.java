package com.example.vizz.university_miniproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText editText1,editText2,editText3,editText4,editText5,editText6;
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editText1= (EditText) findViewById(R.id.editText4);//e no
        editText2= (EditText) findViewById(R.id.editText5);//e name
        editText3= (EditText) findViewById(R.id.editText6);//email
        editText4= (EditText) findViewById(R.id.editText7);//password
        editText5= (EditText) findViewById(R.id.editText8);//password confirm
        editText6= (EditText) findViewById(R.id.editText9);//hint
        button1= (Button) findViewById(R.id.button5);
        button2= (Button) findViewById(R.id.button6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText4.getText().toString().equals(editText5.getText().toString()))
                {
                    SharedPreferences sharedPreferences = getSharedPreferences("login",0);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt("count",1);
                    editor.putString("num", editText1.getText().toString());
                    editor.putString("name", editText2.getText().toString());
                    editor.putString("email", editText3.getText().toString());
                    editor.putString("password", editText4.getText().toString());
                    editor.putString("hint", editText6.getText().toString());
                    editor.commit();
                    Toast.makeText(Main3Activity.this, "Successfully Registered ", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Main3Activity.this,Main2Activity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Main3Activity.this, "Password Mismatch", Toast.LENGTH_SHORT).show();
                }
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(intent);

            }
        });

    }
}
