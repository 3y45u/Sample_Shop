package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window w = getWindow();
        w.setTitle("Sign Up");
        e1=findViewById(R.id.name);
        e2=findViewById(R.id.email);
        e3=findViewById(R.id.phone);
        e4=findViewById(R.id.pass);
        e5=findViewById(R.id.pass2);
        b=findViewById(R.id.but);
    }
    public void sign_up(View v)
    {
        String name = e1.getText().toString();
        String mail = e2.getText().toString();
        String phone = e3.getText().toString();
        String pass = e4.getText().toString();
        String pass2 = e5.getText().toString();
        Boolean a = pass.contains("@")||pass.contains("#")||pass.contains("&")||pass.contains("%")||pass.contains("*")||pass.contains("$");
        Boolean uc = false;
        int at_pos = mail.indexOf("@");
        int dot_pos = mail.indexOf(".");
        int l = dot_pos - at_pos;
        Boolean pass_match = pass.equals(pass2);
        for(int i=0;i<pass.length();i++)
        {
            Character ch = pass.charAt(i);
            if(Character.isUpperCase(ch))
            {
                uc = true;
            }
        }
        if(name==null)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"User Name can't be empty", Toast.LENGTH_SHORT);
            toast.show();
        }
        if(mail==null)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"E-mail can't be empty", Toast.LENGTH_SHORT);
            toast.show();
        }
        if(l<3)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Invalid Email", Toast.LENGTH_SHORT);
            toast.show();
        }
        if(phone==null)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Please enter Phone Number", Toast.LENGTH_SHORT);
            toast.show();
        }
        if(phone.length()<10)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Enter the correct Phone Number", Toast.LENGTH_SHORT);
            toast.show();
        }
        if(pass==null)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Please enter a password", Toast.LENGTH_SHORT);
            toast.show();
        }
        if(!a)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Password must contain atleast one special character i.e. '@,#,$,%,&,*'", Toast.LENGTH_SHORT);
            toast.show();
        }
        if(!uc)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Password must contain atleast one upper case letter", Toast.LENGTH_SHORT);
            toast.show();
        }
        if(pass.length()<8)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Password can't be less than 8 characters!", Toast.LENGTH_SHORT);
            toast.show();
        }
        if(pass2==null)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Please re-enter the password!", Toast.LENGTH_SHORT);
            toast.show();
        }
        if(!pass_match)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Password do not match!", Toast.LENGTH_SHORT);
            toast.show();
        }
        if(name!=null && pass_match && pass2!=null && pass.length()>=8 && uc && a && phone.length()>=10 && l>=3)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Sign Up Successfull!", Toast.LENGTH_SHORT);
            toast.show();
            Intent i = new Intent(getApplicationContext(),welcome.class);
            startActivity(i);
        }


    }
}