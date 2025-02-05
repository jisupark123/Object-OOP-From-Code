package step02.pricing;

import step02.DiscountCondition;
import step02.DefaultDiscountPolicy;
import step02.Money;
import step02.Screening;

// 할인 정책 (일정한 금액 할인)
public class AmountDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount; // 할인액

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
