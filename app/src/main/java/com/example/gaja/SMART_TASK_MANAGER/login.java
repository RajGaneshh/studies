package com.example.gaja.SMART_TASK_MANAGER;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText a,b;
    Button c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        a=(EditText) findViewById(R.id.roll_no);
        b=(EditText) findViewById(R.id.pass);
        c=(Button) findViewById(R.id.loginn);


    }
    public void loginnn(View v)
    {
        if(a.getText().toString().equals("CB.EN.U4CSE14034")&&b.getText().toString().equals("radhika"))
        {
            Intent i= new Intent(this,calendar.class);
            startActivity(i);
            Toast.makeText( getApplicationContext(), "login successful", Toast.LENGTH_SHORT ).show();
        }
        else
        {
            Toast.makeText( getApplicationContext(), "login unsuccessful", Toast.LENGTH_SHORT ).show();

        }

    }

}
