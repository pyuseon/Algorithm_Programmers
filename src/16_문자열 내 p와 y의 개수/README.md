# 문제16 문자열 내 p와 y의 개수
https://programmers.co.kr/learn/courses/30/lessons/12916

## 1. 문제 설명
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

## 2. 제한 조건
* 문자열 s의 길이 : 50 이하의 자연수
* 문자열 s는 알파벳으로만 이루어져 있습니다.

## 3. 입출력 예시
|s|answer|
|---|-----|
|"pPoooyY"|true|
|"Pyy"|false|

## 4. == 연산자와 eqauls 함수의 차이
### 1) 형태의 차이
* equals()는 메소드 이며, 객체끼리 내용을 비교할 수 있도록 한다. 
* == 은 비교를 위한 **연산자** 이다. 

### 2) 주소값 비교와 내용 비교
* equals메소드는 비교하고자 하는 **대상의 내용 자체**를 비교한다. 
* == 연산자는 비교하고자 하는 대상의 **주소값을 비교**한다.
 
 ### 3) 예시
```java
String a = "aaa";
String b = a;
String c = new String("aaa")
```
위에 선언된 a, b, c 중 a와 b는 값은 주소값을 할당 받지만, c는 new String("aaa")를 통해 다른 주소값을 할당받게 된다.

a -> 주소값 100 (임의)  
b -> 주소값 100 (임의)  
c -> 주소값 200 (임의)  

아래는 a, b, c의 값을 각각 equals와 ==을 이용해 비교 후 출력하는 코드이다. 
```java
System.out.println(a.equals(b));
System.out.println(a==b);
System.out.println(b==c);
System.out.println(a.equals(c));
```

* 첫번째 코드는 a와 b의 내용을 비교하므로 **true**  
* 두번째 코드는 a와 b의 주소값을 비교하므로 **true**  
* 세번째 코드는 b와 c의 주소값을 비교하므로 **false**  
* 네번째 코드는 b와 c의 내용을 비교하므로 **true**  

추가공부사항 : call by reference, call by value

### 참고블로그 
https://ojava.tistory.com/15
