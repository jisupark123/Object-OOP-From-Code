package step02.pricing;

import step02.DefaultDiscountPolicy;
import step02.DiscountPolicy;
import step02.Money;
import step02.Screening;

// 할인 정책이 없을 경우
public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
