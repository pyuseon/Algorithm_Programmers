# 문제4 두정수사이의합

## 1. 문제 설명
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

## 2. 제한 조건
* a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.  
* a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.  
* a와 b의 대소관계는 정해져있지 않습니다.  

## 3. 예시
* 입력
  
|a|b|return|
|------|---|---|
| 3 | 5 | 12|
| 3 | 3 | 3|
| 5 | 3 | 12|

## 4. 사용한 함수

 
``` java
<!-- a부터 b까지 범위의 숫자들을 생성한다.  --> 
int[] range = IntStream.rangeClosed(a, b).toArray();
```

## 참고블로그 
https://knight76.tistory.com/entry/IntStream-LongStream%EC%9D%98-%EB%B2%94%EC%9C%84-range-rangeClose-%EC%B0%A8%EC%9D%B4-%EB%B0%8F-%EC%98%88%EC%A0%9C
