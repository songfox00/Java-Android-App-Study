## EditText
---
```java
<EditText
    android:id="@+id/edit"  //id 값
    android:layout_width="300dp"
    android:layout_height="wrap_content"
    android:hint="이메일을 적어주세요"/>    //회색 글씨
```
```java
setText("Hello World!");    //텍스트 수정
```
</br>

## Button
---
```java
<Button
    android:id="@+id/btn"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="버튼" />
```
### 클릭시 함수 실행
```java
setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
    }
});
```