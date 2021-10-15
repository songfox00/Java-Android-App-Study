package com.cookandroid.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_save;
    String shared="file";   //파일 이름

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_save=(EditText)findViewById(R.id.et_save);

        SharedPreferences sharedPreferences=getSharedPreferences(shared, 0);
        String value=sharedPreferences.getString("hong", "");   //꺼내오기
        et_save.setText(value);
    }

    @Override
    protected void onDestroy() {    //앱 종료시
        super.onDestroy();

        SharedPreferences sharedPreferences=getSharedPreferences(shared, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String value=et_save.getText().toString();
        editor.putString("Song", value);    //별명, 값
        editor.commit();
    }
}