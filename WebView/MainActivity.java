package com.cookandroid.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView web;
    private String url="https://www.naver.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web=(WebView)findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);   //웹뷰 세팅, 자바스크립트 허용
        web.loadUrl(url);   //특정 url 불러오기
        web.setWebChromeClient(new WebChromeClient());  //chrome 세팅
        web.setWebViewClient(new WebViewClientClass());  //일반적인 웹뷰 클라이언트

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) { //특정 키 입력시 동작
        if((keyCode==KeyEvent.KEYCODE_BACK) && web.canGoBack()){
            web.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    private class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}