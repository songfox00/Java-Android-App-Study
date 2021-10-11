## Intent: 화면 전환
```java
Intent intent=new Intent(MainActivity.this, SubActivity.class); //현재 activity에서 다른 class로 이동
intent.putExtra("str", str);   // "str"이라는 별명으로 str변수 넘기기 
startActivity(intent);  //액티비티 이동
```
```java
Intent intent=getIntent();  // intent 받아오기
String str=intent.getStringExtra("str"); //intent에 같이 보내진 변수 가져오기
```
</br>

## 입력받은 문자열 저장
```java
getText().toString();   //text를 받아와서 문자열로 저장
```