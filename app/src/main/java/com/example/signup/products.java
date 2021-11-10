package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class products extends AppCompatActivity {
ImageButton i1,i2,i3,i4,i5,i6,i7,i8,i9;
Button b;
    Boolean[] val= new Boolean[9];
    int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        i1=findViewById(R.id.ib1);
        i2=findViewById(R.id.ib2);
        i3=findViewById(R.id.ib3);
        i4=findViewById(R.id.ib4);
        i5=findViewById(R.id.ib5);
        i6=findViewById(R.id.ib6);
        i7=findViewById(R.id.ib7);
        i8=findViewById(R.id.ib8);
        i9=findViewById(R.id.ib9);
        b=findViewById(R.id.but);
        for(int i=0;i<val.length;i++)
        {
            val[i]=false;
        }

    }
    public void add_item1(View v)
    {
        val[1]=true;
        Toast toast=Toast.makeText(getApplicationContext(),"Added item to cart successfully!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void add_item2(View v)
    {
        val[2]=true;
        Toast toast=Toast.makeText(getApplicationContext(),"Added item to cart successfully!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void add_item3(View v)
    {
        val[3]=true;
        Toast toast=Toast.makeText(getApplicationContext(),"Added item to cart successfully!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void add_item4(View v)
    {
        val[4]=true;
        Toast toast=Toast.makeText(getApplicationContext(),"Added item to cart successfully!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void add_item5(View v)
    {
        val[5]=true;
        Toast toast=Toast.makeText(getApplicationContext(),"Added item to cart successfully!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void add_item6(View v)
    {
        val[6]=true;
        Toast toast=Toast.makeText(getApplicationContext(),"Added item to cart successfully!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void add_item7(View v)
    {
        val[7]=true;
        Toast toast=Toast.makeText(getApplicationContext(),"Added item to cart successfully!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void add_item8(View v)
    {
        val[8]=true;
        Toast toast=Toast.makeText(getApplicationContext(),"Added item to cart successfully!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void add_item9(View v)
    {
        val[9]=true;
        Toast toast=Toast.makeText(getApplicationContext(),"Added item to cart successfully!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void function1(View v)
    {
        for(int i=0;i<val.length;i++)
        {
            if(val[i]==true)
                c=c+1;
        }
        String s = Integer.toString(c);
        Intent intent = new Intent(getApplicationContext(),welcome.class);
        intent.putExtra("Total_items",s);
        startActivity(intent);
    }
}