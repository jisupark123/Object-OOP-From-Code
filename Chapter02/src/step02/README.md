## 기존 코드의 문제점

[NoneDiscountPolicy 클래스의 getDiscountAmount 메소드](https://github.com/jisupark123/Object-OOP-From-Code/blob/main/Chapter02/src/step01/pricing/NoneDiscountPolicy.java)
에서 어떤 값을 반환하더라도 결과에 영향을 미치지 않는다.

이는 부모 클래스인 `DiscountPolicy`에서 할인 조건이 없을 경우 `getDiscountAmount` 메소드를 호출하지 않기 때문.

## 해결 방법

1. `DiscountPolicy`를 `DefaultDiscountPolicy`로 변경
2. `DiscountPolicy` 인터페이스를 만들어 `DefaultDiscountPolicy`가 구현하도록 함
3. `NoneDiscountPolicy`가 `DefaultDiscountPolicy`를 상속하는 것이 아닌 `DiscountPolicy`를 구현

(기존의 `AmountDiscountPolicy`와 `PercentDiscountPolicy`는 그대로 `DefaultDiscountPolicy`를 상속)
