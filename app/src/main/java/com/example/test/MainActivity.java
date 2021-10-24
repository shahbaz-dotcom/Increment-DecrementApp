package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void display(int num)
    {
        TextView content=  findViewById(R.id.textView);
        content.setText(""+num);
    }
    public void increment(View view)
    {
        count++;
        display(count);
    }
    public void decrement(View view)
    {
        count--;
        if(count<0)
            count=0;
        display(count);
    }
    public void reset()
    {
        count=0;
        display(count);
    }
}