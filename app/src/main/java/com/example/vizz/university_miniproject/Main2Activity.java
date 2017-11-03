package com.example.vizz.university_miniproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText editText1,editText2,editText3;
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText1= (EditText) findViewById(R.id.editText1);
        editText2= (EditText) findViewById(R.id.editText2);
        editText3= (EditText) findViewById(R.id.editText3);
        button1= (Button) findViewById(R.id.button3);
        button2= (Button) findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences=getSharedPreferences("login",0);
                String userName=sharedPreferences.getString("name",null);
                String password=sharedPreferences.getString("password",null);
                int count=sharedPreferences.getInt("count",0);
                if(count!=0)
                {
                    if (userName.equals(editText1.getText().toString()) && password.equals(editText2.getText().toString())) {
                        Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Main2Activity.this, "Invalid UserName or Password !", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Main2Activity.this, "No users registered ! Please register", Toast.LENGTH_SHORT).show();
                    }
                }
              //  else
               // {
                    //Toast.makeText(Main2Activity.this, "No User Registered ! Please register", Toast.LENGTH_SHORT).show();
               // }

           // }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences=getSharedPreferences("login",0);
                String password=sharedPreferences.getString("password",null);
                String email_id=sharedPreferences.getString("email",null);
                if(email_id.equals(editText3.getText().toString())) {
                    Intent email = new Intent(Intent.ACTION_SEND);
                    email.putExtra(Intent.EXTRA_EMAIL, new String[]{editText3.getText().toString()});
                    email.putExtra(Intent.EXTRA_SUBJECT, "password");
                    email.putExtra(Intent.EXTRA_TEXT, password);
                    email.setType("message/rfc822");
                    startActivity(Intent.createChooser(email, "Choose an Email client :"));
                }
                else
                {
                    Toast.makeText(Main2Activity.this, "email not registered ", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
