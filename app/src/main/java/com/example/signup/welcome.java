package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class welcome extends AppCompatActivity {
Button b1,b2,b3,b4;
EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        b1=findViewById(R.id.but1);
        b2=findViewById(R.id.but2);
        b3=findViewById(R.id.but3);
        b4=findViewById(R.id.but4);
        e=findViewById(R.id.items_display);
        Toast toast=Toast.makeText(getApplicationContext(),"Welcome!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void shopping(View v)
    {
        Intent i= new Intent(getApplicationContext(),products.class);
        startActivity(i);
    }
    public void count_items(View v)
    {
        String c = "0";
        Intent i = getIntent();
        if(i.hasExtra("Total_items"))
        {
            c = i.getStringExtra("Total_items");
        }
        String i2 = "Total Number of items selected : ";
        String items =i2+c;
        e.setText(items);
    }
    public void dailing(View v)
    {
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:8006210211"));
        startActivity(i);
    }
    public void go_to_home(View v)
    {
        Intent i= new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}