package step01.pricing;

import step01.DiscountPolicy;
import step01.Money;
import step01.Screening;

// 할인 정책이 없을 경우
public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
