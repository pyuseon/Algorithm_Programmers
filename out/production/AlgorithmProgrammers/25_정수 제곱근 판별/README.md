# 문제25 정수 제곱근 판별
https://programmers.co.kr/learn/courses/30/lessons/12934

## 1. 문제 설명
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

## 2. 제한 조건
* n은 1이상, 50000000000000 이하인 양의 정수입니다.

## 3. 입출력 예시
|n|return|
|---|-----|
|121|144|
|3|-1|

## 4. 다른 풀이 
```java
class Solution {
  public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
  }
}
```

## 5. 사용함수
* Math.sqrt(n) : n의 제곱근 구하기
* Math.floor(n) : 소수점 밑의 자리 버리기
* Math.pow(n, m) : n의 m제곱 구하기 
* !Double.isInfinite(n) : n이 무한대 인지 판별 

