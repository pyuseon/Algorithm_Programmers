# 문제 23 자연수 뒤집어 배열로 만들기 
https://programmers.co.kr/learn/courses/30/lessons/12932

## 1. 문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

## 2. 제한 조건
* n은 10,000,000,000이하인 자연수입니다.

## 3. 예시
* 입력
  
|n|return|
|------|---|
| 12345 | [5,4,3,2,1] |

## 4. 자료형 : StringBuffer  
StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형이다.
StringBuffer는 append를 사용해서 문자열을 추가할 수 있다. 
``` java
StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
sb.append("hello");
sb.append(" ");
sb.append("jump to java");
String result = sb.toString();
System.out.println(result);

> hello jump to java
```

위 예제를 String 자료형만 가지고 표현하면 다음과 같다. 

```java
String result = "";
result += "hello";
result += " ";
result += "jump to java";
System.out.println(result);

> hello jump to java
```


### 참고자료  
https://wikidocs.net/276
