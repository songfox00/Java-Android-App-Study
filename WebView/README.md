## AndroidManifest.xml에 인터넷 권한 추가
```java
<uses-permission android:name="android.permission.INTERNET"/>
<application
    android:usesCleartextTraffic="true" //버전 업데이트 이후로 추가해야 함
>
```

## WebView
웹을 불러올 때 사용
```java
web.getSettings().setJavaScriptEnabled(true);   //웹뷰 세팅, 자바스크립트 허용
web.loadUrl(url);   //특정 url 불러오기
web.setWebChromeClient(new WebChromeClient());  //chrome 세팅
web.setWebViewClient(new WebViewClientClass());  //일반적인 웹뷰 클라이언트
```
</br>

## WebViewClient
일반적인 웹뷰 클라이언트
```java
private class WebViewClientClass extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
```

## onKeyDown
특정 키 입력시 동작
```java
public boolean onKeyDown(int keyCode, KeyEvent event) { 
    if((keyCode==KeyEvent.KEYCODE_BACK) && web.canGoBack()){
        web.goBack();
        return true;
    }
    return super.onKeyDown(keyCode, event);
}
```


