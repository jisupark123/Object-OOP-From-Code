package step01.pricing;

import step01.DiscountCondition;
import step01.DiscountPolicy;
import step01.Money;
import step01.Screening;

// 할인 정책 (일정한 금액 할인)
public class AmountDiscountPolicy extends DiscountPolicy {
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
