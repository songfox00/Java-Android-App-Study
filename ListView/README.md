## ListView
아이템을 리스트로 보여줌  
</br>

## ArraryList
배열
```java
List<String> data=new ArrayList<>();
data.add(""); //아이템 삽입
```

## ArrayAdapter
ArraryList와 ListVeiw를 이어줌
```java
ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
list.setAdapter(adapter); //연결

adapter.notifyDataSetChanged(); //데이터 삽입 후 저장
```
