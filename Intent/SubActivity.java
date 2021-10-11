package com.cookandroid.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        text=findViewById(R.id.text);

        Intent intent=getIntent();
        String str=intent.getStringExtra("str");    //변수 넘겨받기
        text.setText(str);
    }
}