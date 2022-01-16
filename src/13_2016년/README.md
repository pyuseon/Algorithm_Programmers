# 문제 13 2016년

## 1. 문제 설명
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?   
두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.   
요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다.   
예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.  

## 2. 제한 조건
* 2016년은 윤년입니다.
* 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)  

## 3. 예시
* 입력
  
|a|b|result|
|------|---|---|
| 5 | 24 | "TUE" |


## 4. 추가 답안

``` java
<!-- 추가로 볼만한 답안 -->
    class Solution {
        public static String solution(int a, int b) {
            return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
        }
    }
```



## 5. 추가 답안

``` java
<!--  2016년 , a월, b일의 날짜를 반환한다.  -->
LocalDate.of(2016, a, b)
<!-- a라는 일자의 요일을 반환한다. ex) TUESDAY  -->
a.getDayOfWeek()
<!-- 문자열의 앞의 세자리만 슬라이싱한다.  -->
toString().substring(0,3)
```
