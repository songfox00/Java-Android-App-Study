## SharedPreferences
데이터를 파일로 저장, 앱을 껐다 켜도 데이터가 남아있음
```java
SharedPreferences sharedPreferences=getSharedPreferences(shared, 0);
String value=sharedPreferences.getString("hong", "");   //꺼내오기
```
</br>

## onDestroy 함수
앱 종료시 실행

```java
protected void onDestroy() {  
    super.onDestroy();

    SharedPreferences sharedPreferences=getSharedPreferences(shared, 0);
    SharedPreferences.Editor editor = sharedPreferences.edit();
    String value=et_save.getText().toString();
    editor.putString("Song", value);    //별명, 값
    editor.commit();   //save를 완료
    }
```