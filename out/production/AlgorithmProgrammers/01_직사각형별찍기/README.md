# 문제1 직사각형 별 찍기 

## 1. 문제 설명
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

## 2. 제한 조건
n과 m은 각각 1000 이하인 자연수입니다.

## 3. 예시
* 입력
```
5 3
```

* 출력
```
*****
*****
*****
```

## 4. 사용한 함수
* repeat : 문자열을 반복한다.
```java
String star = "*"
String repstar = star.repeat(a);
```
